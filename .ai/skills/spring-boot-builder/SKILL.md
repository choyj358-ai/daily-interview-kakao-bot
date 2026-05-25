---
name: spring-boot-builder
description: 이 프로젝트의 Spring Boot 4.0.6 기능을 구현할 때 사용한다. 컨트롤러, 서비스, 엔티티, 레포지토리, 스케줄러, 설정, 테스트, MySQL 연동 작업에 사용한다.
---

# Spring Boot 빌더

## 기준

- Java 21
- Spring Boot 4.0.6
- Gradle Groovy
- 기본 패키지: `com.yuji.dailyinterviewkakaobot`

## 지침

- 학원생 포트폴리오에 맞게 코드는 단순하고 명확하게 작성한다.
- 동작 로직이나 저장 로직을 추가하면 가능한 범위에서 테스트도 추가한다.
- 매일 실행은 Spring Scheduler를 사용한다.
- 비밀키, 외부 URL, DB 정보는 환경변수로 관리한다.
- OpenAI 키, 카카오 토큰, DB 비밀번호를 코드에 직접 쓰지 않는다.

## 검증

아래 명령어를 실행한다.

```powershell
.\gradlew.bat test
```

