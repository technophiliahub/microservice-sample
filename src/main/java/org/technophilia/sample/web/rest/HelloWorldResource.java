package org.technophilia.sample.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class HelloWorldResource {




	@GetMapping(value = "/hello")
	public String sendMessageToKafkaTopic()
			throws Exception {

		return "hai";
	}
}