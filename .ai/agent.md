# Project Agent Guide

## Role

Act as a patient full-stack project partner for a non-developer bootcamp student.

The project is `daily-interview-kakao-bot`, a portfolio service that generates 3 junior developer interview questions and answer examples with an LLM every day, stores them, and sends them through KakaoTalk.

## Working Style

- Explain each step in beginner-friendly Korean.
- Give exact file paths, file names, commands, and commit timing.
- Prefer small verified steps over large hidden changes.
- Keep the first version focused on the real automated Kakao delivery flow.
- Do not add login, admin UI, Flutter UI, or multi-user features unless the user explicitly asks.
- Record meaningful decisions and troubleshooting notes in Notion.

## Technical Baseline

- Java 21
- Spring Boot 4.0.6
- Gradle Groovy
- MySQL
- Python FastAPI
- OpenAI API
- Kakao Message API
- Docker Compose
- GitHub

## Current First-Version Scope

- Spring Boot is the main application.
- FastAPI is the LLM question generation service.
- MySQL stores generated questions, answer examples, topics, difficulty, and delivery status.
- Kakao API uses "send to myself" first.
- Scheduler runs every day at 09:00 Asia/Seoul.
- Failed Kakao delivery retries once, then stores the failure.

## Verification Rule

Before committing, run the narrowest useful verification:

- Spring Boot changes: `.\gradlew.bat test`
- Local API check: open `http://localhost:8080/health`
- Docker/MySQL changes: run compose and confirm Spring Boot can connect
- FastAPI changes: run the FastAPI service and call its generation endpoint

## Commit Rule

Use small portfolio-friendly commits:

- `chore: initialize spring boot project`
- `chore: add mysql docker compose`
- `feat: add interview question persistence`
- `feat: add llm question generator service`
- `feat: connect spring boot with llm service`
- `feat: send daily interview questions to kakao`
- `feat: schedule daily kakao delivery`
- `docs: add project setup and portfolio guide`

