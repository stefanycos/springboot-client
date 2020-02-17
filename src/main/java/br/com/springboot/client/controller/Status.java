package br.com.springboot.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/client/status")
public class Status {

	private static final Logger logger = LoggerFactory.getLogger(Status.class);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public JsonNode applicationStatus() throws JsonProcessingException {
		logger.info("Application is running");

		ObjectMapper mapper = new ObjectMapper();
		return mapper.readTree("{\"status\":\"running\"}");
	}
}
