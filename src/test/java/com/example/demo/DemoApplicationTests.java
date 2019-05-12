package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {

	@Autowired
	private PointcutedHelloController pointcutedHelloController;

	@Autowired
	private HelloController helloController;

	@Test
	public void should_reply_hello_from_pointcuted_controller() {
		ResponseEntity<String> response = pointcutedHelloController.hello("Tony");
		Assert.assertEquals("Hello, Tony", response.getBody());
	}

	@Test
	public void should_reply_hello_from_hello_controller() {
		ResponseEntity<String> response = helloController.hello("John");
		Assert.assertEquals("Hello, John", response.getBody());
	}
}
