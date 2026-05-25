---
name: fastapi-llm-builder
description: Python FastAPI 기반 LLM 질문 생성 서비스를 만들 때 사용한다. OpenAI 프롬프트, JSON 응답 스키마, FastAPI 엔드포인트, 환경변수, Spring Boot와의 응답 계약을 다룰 때 사용한다.
---

# FastAPI LLM 빌더

## 역할

FastAPI는 면접 질문과 답변 예시 생성만 담당한다. 메인 애플리케이션 역할은 Spring Boot가 맡는다.

## API 계약

권장 엔드포인트:

```text
POST /api/v1/interview-questions/generate
```

응답은 정확히 3개 항목을 반환한다.

각 항목에는 아래 값이 포함된다.

- 질문
- 답변 예시
- 주제
- 난이도

## 프롬프트 규칙

모델에게 구조화된 JSON으로 답하도록 요청한다. Spring Boot가 자유 형식 텍스트를 억지로 파싱해야 하는 구조는 피한다.

## 모델 전략

- 기본 모델: `gpt-5-mini`
- 저비용 테스트 후보: `gpt-5-nano`
- 고품질 비교 후보: `gpt-5.2`

