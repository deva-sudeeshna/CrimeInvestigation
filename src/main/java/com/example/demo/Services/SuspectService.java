package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Models.Suspect;
import com.example.demo.Repository.SuspectRepo;

@Service
public class SuspectService {

	@Autowired
	public  SuspectRepo suspectrepo;
	
	
	public void savesuspect(Suspect suspect) {
		//System.out.println(casee.getCaseid());
		suspectrepo.save(suspect);
	}
	
	public List<Suspect> showAllSuspects(Integer caseid){
		List<Suspect> suspects = new ArrayList<Suspect>();
		for(Suspect suspect : suspectrepo.findAllByCaseid(caseid)) {
			suspects.add(suspect);
			
		}
		return suspects;
	}
	
	
	
}
