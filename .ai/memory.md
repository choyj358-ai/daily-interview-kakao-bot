# 프로젝트 메모리

## 사용자 상황

- 사용자는 비개발자 풀스택 학원생이다.
- 집 노트북의 Cursor에서 개발한다.
- 프로젝트 생성부터 배포까지 한 단계씩 안내받기를 원한다.
- 결정이 필요할 때는 객관식 또는 단답형 질문을 선호한다.

## 확정된 결정

- 1차 목표: 매일 실제로 카카오톡 메시지를 받는 서비스 완성
- 발송 대상: 우선 사용자 본인 1명
- 로그인/회원 기능: 1차 버전에서는 제외
- 화면: 1차 버전에서는 제외
- LLM 제공자: OpenAI
- 기본 모델: `gpt-5-mini`
- 저비용 테스트 후보: `gpt-5-nano`
- 고품질 비교 후보: `gpt-5.2`
- 구조: Spring Boot와 FastAPI를 분리해 단순 MSA 형태로 구성
- 카카오 방식: 메시지 API의 `나에게 보내기`
- 발송 시간: 매일 오전 9시
- 질문 구성: 매일 서로 다른 주제 3개
- 난이도: 기초부터 점점 어렵게
- DB 저장 범위: 질문, 답변, 주제, 난이도, 발송 결과
- 실패 처리: 카카오 발송 실패 시 1번 재시도

## 현재 로컬 상태

- 프로젝트 경로: `C:\workspace\daily-interview-kakao-bot`
- GitHub 저장소: `https://github.com/choyj358-ai/daily-interview-kakao-bot.git`
- 첫 커밋은 `main` 브랜치에 푸시 완료
- `/health` API가 존재하며 사용자가 브라우저에서 확인함
- Docker Desktop 설치 확인
- Docker Compose로 MySQL 8.4 컨테이너 실행 확인
- MySQL 프로필로 Spring Boot 테스트 성공
- 집 노트북에 Java 21, Git, Python, Docker 설치 확인

## 노션 상위 페이지

`https://www.notion.so/364b7db023de80d99d56e9b22a241b52`

앞으로 계획, 진행 로그, 에러 해결 기록, 코드 정리, 배포 기록은 이 페이지 아래에 하위 페이지로 남긴다.
