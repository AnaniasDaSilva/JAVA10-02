package com.senacniteroi.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
@RequestMapping

@GetMapping

public String helloword() {
	return "Hello Word";
}

}
