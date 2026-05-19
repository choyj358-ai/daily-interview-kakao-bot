---
name: fastapi-llm-builder
description: Build the Python FastAPI LLM generation service. Use when creating OpenAI prompts, JSON schemas, FastAPI endpoints, environment settings, or Spring-to-FastAPI response contracts.
---

# FastAPI LLM Builder

## Role

FastAPI only generates interview questions and answer examples. Spring Boot remains the main application.

## API Contract

Preferred endpoint:

```text
POST /api/v1/interview-questions/generate
```

Return exactly 3 items with:

- question
- answerExample
- topic
- difficulty

## Prompt Rule

Ask the model for structured JSON. Avoid free-form text that Spring Boot must parse manually.

## Model Strategy

- Default: `gpt-5-mini`
- Low-cost test: `gpt-5-nano`
- Quality comparison: `gpt-5.2`

