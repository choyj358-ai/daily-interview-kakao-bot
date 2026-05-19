package com.yuji.dailyinterviewkakaobot;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

	@GetMapping("/health")
	public HealthResponse health() {
		return new HealthResponse("UP", LocalDateTime.now());
	}

	public record HealthResponse(String status, LocalDateTime checkedAt) {
	}
}
