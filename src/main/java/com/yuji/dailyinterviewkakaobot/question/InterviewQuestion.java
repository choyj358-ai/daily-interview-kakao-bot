package com.yuji.dailyinterviewkakaobot.question;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name = "interview_questions")
public class InterviewQuestion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 1000)
	private String question;

	@Lob
	@Column(nullable = false, columnDefinition = "TEXT")
	private String answerExample;

	@Column(nullable = false, length = 50)
	private String topic;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false, length = 20)
	private Difficulty difficulty;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false, length = 20)
	private DeliveryStatus deliveryStatus;

	@Column(nullable = false)
	private LocalDate generatedDate;

	private LocalDateTime deliveredAt;

	@Column(length = 1000)
	private String errorMessage;

	@Column(nullable = false, updatable = false)
	private LocalDateTime createdAt;

	@Column(nullable = false)
	private LocalDateTime updatedAt;

	protected InterviewQuestion() {
	}

	private InterviewQuestion(
			String question,
			String answerExample,
			String topic,
			Difficulty difficulty,
			LocalDate generatedDate
	) {
		this.question = question;
		this.answerExample = answerExample;
		this.topic = topic;
		this.difficulty = difficulty;
		this.generatedDate = generatedDate;
		this.deliveryStatus = DeliveryStatus.PENDING;
	}

	public static InterviewQuestion create(
			String question,
			String answerExample,
			String topic,
			Difficulty difficulty,
			LocalDate generatedDate
	) {
		return new InterviewQuestion(question, answerExample, topic, difficulty, generatedDate);
	}

	public void markDeliverySuccess(LocalDateTime deliveredAt) {
		this.deliveryStatus = DeliveryStatus.SUCCESS;
		this.deliveredAt = deliveredAt;
		this.errorMessage = null;
	}

	public void markDeliveryFailed(String errorMessage) {
		this.deliveryStatus = DeliveryStatus.FAILED;
		this.errorMessage = errorMessage;
	}

	@PrePersist
	void prePersist() {
		LocalDateTime now = LocalDateTime.now();
		this.createdAt = now;
		this.updatedAt = now;
	}

	@PreUpdate
	void preUpdate() {
		this.updatedAt = LocalDateTime.now();
	}

	public Long getId() {
		return id;
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswerExample() {
		return answerExample;
	}

	public String getTopic() {
		return topic;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public DeliveryStatus getDeliveryStatus() {
		return deliveryStatus;
	}

	public LocalDate getGeneratedDate() {
		return generatedDate;
	}

	public LocalDateTime getDeliveredAt() {
		return deliveredAt;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
}
