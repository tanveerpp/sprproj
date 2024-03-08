package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
@GetMapping("/show")
public String show()
{
	return "helllllllllllllllooooooooooo";
}
}
