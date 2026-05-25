# Sub-Agent 계획

사용자가 명확히 병렬 작업이나 역할 분리를 요청할 때만 Sub-Agent 방식을 사용한다.

## 추후 사용할 수 있는 역할

- Spring Boot 작업자: 엔티티, 레포지토리, 서비스, 스케줄러 구현
- FastAPI 작업자: LLM 프롬프트와 응답 스키마 구현
- Kakao 작업자: 카카오 OAuth, 토큰, 메시지 API 연동
- 문서 작업자: README, 노션 정리, 포트폴리오 설명 작성
- 검증 작업자: 로컬 실행, API 확인, Docker Compose 확인

## 역할 분리 규칙

여러 작업자를 사용할 때는 파일 소유 범위를 나눈다.

예시:

- Spring Boot 작업자: `src/main/java`, Spring 설정 담당
- FastAPI 작업자: `llm-service` 담당
- 문서 작업자: `README.md`, `.ai` 담당
- Docker 작업자: `docker-compose.yml`, 환경변수 예시 담당

