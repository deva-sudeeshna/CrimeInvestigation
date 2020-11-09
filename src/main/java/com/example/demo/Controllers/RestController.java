package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController

@RequestMapping("/email")
public class RestController {

	@Autowired
	public JavaMailSender javamailsender;
	
	@GetMapping("/sendmail")
	public String sendEmail()
	{
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("deva.sudeeshna5@gmail.com");
		message.setSubject("my 1st mail");
		message.setText("yo bab!");
		javamailsender.send(message);
		return "suscesful";
	}
	
	
	
	
	
}
