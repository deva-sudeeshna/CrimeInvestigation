package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.Models.Casee;
import com.example.demo.Models.Officer;
import com.example.demo.Models.Suspect;
import com.example.demo.Services.CaseService;
import com.example.demo.Services.OfficerService;
import com.example.demo.Services.SuspectService;

@Controller
public class ApplicationController {

	@Autowired
	CaseService caseservice;
	
	@Autowired
	OfficerService officerservice;
	
	@Autowired
	SuspectService suspectservice;
	
	
	@Autowired
	public JavaMailSender javamailsender;
	
	//@GetMapping("/sendmail")
	/*public String sendEmail()
	{
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("deva.sudeeshna5@gmail.com");
		message.setSubject("my 1st mail");
		message.setText("yo yo!");
		javamailsender.send(message);
		return "suspect";
	}*/


	
	@GetMapping("/")
	public String Login() {
		return "login";
	}
	
	@RequestMapping("/enter-casee")
	public String AddCase() {
		return "casee";
	}
	
	@RequestMapping("/enter-officer")
	public String AddOfficer() {
		return "officer";
	}
	
	@PostMapping("/saveofficerdetails")
	public String OfficerInsertion(@ModelAttribute Officer officer)
	{
		officerservice.saveofficer(officer);
		return "redirect:/enter-officer";
	}
	
	@PostMapping("/savecaseedetails")
	public String CaseInsertion(@ModelAttribute Casee casee,BindingResult bindingResult,HttpServletRequest request) {
		//System.out.println(casee.getCaseid());
		caseservice.savecase(casee);
		return "redirect:/enter-casee";
		
	}
	
	@GetMapping("/show-officers")
	//@ResponseBody
	public String showAllOfficers(HttpServletRequest request) {
		request.setAttribute("officers",officerservice.showAllOfficers());
		
		return "officerlist";
	}
	
	
	
	@RequestMapping("/enter-suspect")
	public String AddSuspect() {
		return "suspect";
	}
	
	@PostMapping("/savesuspectdetails")
	public String SuspectInsertion(@ModelAttribute Suspect suspect,BindingResult bindingResult,HttpServletRequest request) {
		//System.out.println(casee.getCaseid());
		suspectservice.savesuspect(suspect);
		return "redirect:/enter-suspect";	
	}
	
	@RequestMapping("/take-case")
	public String takecase(HttpServletRequest request) {
		return "takecaseid";
	}
	
	@RequestMapping("/show-suspects")
	public String getcase(@RequestParam Integer caseid,HttpServletRequest request)
	{
		//String caseid =(String) request.getAttribute("caseid");
		System.out.println("caseid is" +caseid);
		request.setAttribute("suspects",suspectservice.showAllSuspects(caseid));
		return "suspectlist";
	}
	
	
	
}
