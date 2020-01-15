package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/test")
	public Map<String, Object> test() {
		Map<String,Object> map =new HashMap<>();
		map.put("YAHYAOUI", "DOCKER");
		map.put("YAHYAOUI", 1245);
		return map;
	}

}
