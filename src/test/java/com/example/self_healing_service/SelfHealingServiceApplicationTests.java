package com.example.self_healing_service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(AppController.class)
public class SelfHealingServiceApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	void healthReturnsOK() throws Exception {
		mockMvc.perform(get("/health"))
				.andExpect(status().isOk())
				.andExpect(content().string("OK"));
	}

	@Test
	void helloReturnsMessage() throws Exception {
		mockMvc.perform(get("/hello"))
				.andExpect(status().isOk())
				.andExpect(content().string("Self-Healing Microservice is running!"));
	}
}