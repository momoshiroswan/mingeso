package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensajeController {
	@GetMapping("mensaje")
	public String Mensaje(){
		return("Buenos Días USACH");
	}
}