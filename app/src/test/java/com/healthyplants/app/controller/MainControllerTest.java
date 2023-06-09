package com.healthyplants.app.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MainControllerTest {

	@Autowired
	private MainController controller;

	@Test
	public void givenParameterIsNullWhenPingIsExecutedThenResponseIsPong() {
		String response = controller.ping(null);
		assertThat(response).isEqualTo(response);
	}

	@Test
	public void givenParameterIsNotNullWhenPingIsExecutedThenResponseContainsParameter() {
		String response = controller.ping("test");
		assertThat(response).isEqualTo("pong test");
	}
}
