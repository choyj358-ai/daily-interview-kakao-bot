---
name: spring-boot-builder
description: Build Spring Boot 4.0.6 features for this project. Use when adding controllers, services, entities, repositories, schedulers, configuration, tests, or MySQL integration.
---

# Spring Boot Builder

## Baseline

- Java 21
- Spring Boot 4.0.6
- Gradle Groovy
- Package root: `com.yuji.dailyinterviewkakaobot`

## Instructions

- Keep code simple and explicit for a bootcamp portfolio.
- Add tests when behavior or persistence logic is introduced.
- Use Spring Scheduler for daily execution.
- Use environment variables for secrets and external URLs.
- Do not hard-code OpenAI keys, Kakao tokens, or database passwords.

## Verification

Run:

```powershell
.\gradlew.bat test
```

