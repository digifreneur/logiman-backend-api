package com.digifreneur.logiman.backendsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
public class BackendsvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendsvcApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}
}
