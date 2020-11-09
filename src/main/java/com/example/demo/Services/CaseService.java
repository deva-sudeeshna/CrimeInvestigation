package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Casee;
import com.example.demo.Repository.CaseRepo;

@Service
public class CaseService {
	
	@Autowired
	public CaseRepo caserepo;
	
	public void savecase(Casee casee) {
		//System.out.println(casee.getCaseid());
		caserepo.save(casee);
	}
	
}