package co.edu.ufps.demoWeb.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {
	
	@GetMapping("/status")
	public Map<String, Object> getStatus() {
		Map<String, Object> status = new HashMap<String, Object>();
		status.put("message", "Servidor en funcionamiento:");
		status.put("timestamp", LocalDateTime.now());
		return status;
	}
}
