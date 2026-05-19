# Hook Ideas

These are future automation ideas, not active code yet.

## Before Commit

Possible checks:

- Run `.\gradlew.bat test`
- Check that no secret keys are committed
- Check that `.env` files are ignored

## After Daily Generation

Possible checks:

- Log generated question count
- Save delivery status
- Send one retry if Kakao delivery fails

## Before Deployment

Possible checks:

- Confirm required environment variables exist
- Confirm database connection
- Confirm Kakao token validity
- Confirm OpenAI model name is configured

