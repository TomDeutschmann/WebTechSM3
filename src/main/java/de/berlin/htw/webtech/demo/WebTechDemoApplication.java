package de.berlin.htw.webtech.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@SpringBootApplication
public class WebTechDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebTechDemoApplication.class, args);
	}

	public record Greeting(long id, String content) { }

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();



}
