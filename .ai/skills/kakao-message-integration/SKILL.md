---
name: kakao-message-integration
description: Integrate Kakao Message API for this project. Use when handling Kakao Developers setup, OAuth tokens, send-to-myself messages, delivery retries, or delivery result records.
---

# Kakao Message Integration

## First-Version Scope

Use Kakao Message API "send to myself".

Do not implement:

- Kakao channel message
- Multi-user delivery
- User login

## Message Content

The Kakao message should include:

- Today's title
- 3 interview questions
- Short answer examples
- Topic and difficulty labels when space allows

## Failure Policy

- Retry once on delivery failure.
- Store final success or failure in MySQL.
- Store the error message when available.

## Secret Rule

Never commit Kakao REST API keys, access tokens, or refresh tokens.

