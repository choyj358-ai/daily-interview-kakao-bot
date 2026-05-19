# Project Memory

## User Context

- User is a non-developer full-stack bootcamp student.
- User uses Cursor on a Windows laptop at home.
- User wants step-by-step guidance from project creation to deployment.
- User prefers objective-choice or short-answer questions when decisions are needed.

## Decisions Made

- 1st goal: a real service that sends daily KakaoTalk messages to the user.
- Delivery target: only the user at first.
- Login/member features: excluded from the first version.
- UI: excluded from the first version.
- LLM provider: OpenAI.
- Default model: `gpt-5-mini`.
- Low-cost test model candidate: `gpt-5-nano`.
- Quality comparison candidate: `gpt-5.2`.
- Spring Boot and FastAPI are separated to show a simple MSA-style architecture.
- Kakao method: Message API "send to myself".
- Daily delivery time: 09:00.
- Question composition: 3 different topics per day.
- Difficulty: starts easy and gradually increases.
- DB should store questions, answers, topics, difficulty, and delivery result.
- Kakao delivery failure should retry once.

## Current Local State

- Project path: `C:\workspace\daily-interview-kakao-bot`
- GitHub repository: `https://github.com/choyj358-ai/daily-interview-kakao-bot.git`
- First commit has been pushed to `main`.
- `/health` endpoint exists and was confirmed visible by the user.
- Docker Desktop is not installed yet.
- Java 21, Git, and Python are installed on the home laptop.

## Notion Parent Page

`https://www.notion.so/364b7db023de80d99d56e9b22a241b52`

Use this page as the parent for plans, progress logs, troubleshooting notes, and code summaries.

