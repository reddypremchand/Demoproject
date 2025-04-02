package com.docker.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/dock")
public class DockerController {
	
	@GetMapping
	public String getName() {
		return "Premchand Reddy";
	}
	@GetMapping("/num")
	public String getNumber() {
		return "9348447714";
	}

}
