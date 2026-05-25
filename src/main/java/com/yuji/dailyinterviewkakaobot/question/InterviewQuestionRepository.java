package com.yuji.dailyinterviewkakaobot.question;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewQuestionRepository extends JpaRepository<InterviewQuestion, Long> {

	List<InterviewQuestion> findByGeneratedDateOrderByIdAsc(LocalDate generatedDate);

	boolean existsByGeneratedDate(LocalDate generatedDate);
}
