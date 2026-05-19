# Sub-Agent Plan

Use sub-agents only when the user explicitly asks for parallel agents or delegation.

## Useful Future Roles

- Spring Boot worker: entities, repositories, services, schedulers
- FastAPI worker: LLM prompt and response schema
- Kakao worker: Kakao OAuth/token/message API integration
- Docs worker: README, Notion summary, portfolio text
- Verification worker: local run, API checks, Docker Compose checks

## Coordination Rule

Keep file ownership separate when multiple workers are active.

Examples:

- Spring Boot worker owns `src/main/java` and Spring config.
- FastAPI worker owns `llm-service`.
- Docs worker owns `README.md` and `.ai`.
- Docker worker owns `docker-compose.yml` and environment examples.

