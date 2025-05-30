package br.com.lrmello.rest_with_spring_boot_and_java_erudio.controllers;

import br.com.lrmello.rest_with_spring_boot_and_java_erudio.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

	private static final String template = "Hello,  %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting")
	public Greeting greeting(
			@RequestParam(value = "name",defaultValue = "Word")
			String name){
		return new Greeting(counter.incrementAndGet(), String.format(template,name));

	}
}
