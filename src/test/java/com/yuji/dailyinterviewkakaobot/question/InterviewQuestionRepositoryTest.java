package com.yuji.dailyinterviewkakaobot.question;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

@ActiveProfiles("mysql")
@SpringBootTest
@Transactional
class InterviewQuestionRepositoryTest {

	@Autowired
	private InterviewQuestionRepository interviewQuestionRepository;

	@Test
	void savesInterviewQuestion() {
		LocalDate generatedDate = LocalDate.of(2026, 5, 25);
		InterviewQuestion interviewQuestion = InterviewQuestion.create(
				"Java의 JVM은 어떤 역할을 하나요?",
				"JVM은 Java 바이트코드를 실행하고, 운영체제와 관계없이 Java 프로그램이 동작할 수 있게 도와줍니다.",
				"Java",
				Difficulty.EASY,
				generatedDate
		);

		InterviewQuestion savedQuestion = interviewQuestionRepository.save(interviewQuestion);

		assertThat(savedQuestion.getId()).isNotNull();
		assertThat(savedQuestion.getDeliveryStatus()).isEqualTo(DeliveryStatus.PENDING);
		assertThat(interviewQuestionRepository.existsByGeneratedDate(generatedDate)).isTrue();
	}

	@Test
	void findsQuestionsByGeneratedDate() {
		LocalDate generatedDate = LocalDate.of(2026, 5, 26);
		interviewQuestionRepository.save(InterviewQuestion.create(
				"Spring Bean은 무엇인가요?",
				"Spring Bean은 Spring 컨테이너가 생성하고 관리하는 객체입니다.",
				"Spring",
				Difficulty.EASY,
				generatedDate
		));
		interviewQuestionRepository.save(InterviewQuestion.create(
				"인덱스는 왜 사용하나요?",
				"인덱스는 테이블 조회 속도를 높이기 위해 사용하는 자료구조입니다.",
				"Database",
				Difficulty.MEDIUM,
				generatedDate
		));

		List<InterviewQuestion> questions = interviewQuestionRepository.findByGeneratedDateOrderByIdAsc(generatedDate);

		assertThat(questions).hasSize(2);
		assertThat(questions).extracting(InterviewQuestion::getTopic)
				.containsExactly("Spring", "Database");
	}

	@Test
	void updatesDeliveryStatus() {
		InterviewQuestion interviewQuestion = interviewQuestionRepository.save(InterviewQuestion.create(
				"Docker 컨테이너는 무엇인가요?",
				"컨테이너는 애플리케이션과 실행 환경을 함께 묶어 어디서든 비슷하게 실행할 수 있게 해주는 단위입니다.",
				"Docker",
				Difficulty.MEDIUM,
				LocalDate.of(2026, 5, 27)
		));

		LocalDateTime deliveredAt = LocalDateTime.of(2026, 5, 27, 9, 0);
		interviewQuestion.markDeliverySuccess(deliveredAt);

		assertThat(interviewQuestion.getDeliveryStatus()).isEqualTo(DeliveryStatus.SUCCESS);
		assertThat(interviewQuestion.getDeliveredAt()).isEqualTo(deliveredAt);
		assertThat(interviewQuestion.getErrorMessage()).isNull();
	}
}
