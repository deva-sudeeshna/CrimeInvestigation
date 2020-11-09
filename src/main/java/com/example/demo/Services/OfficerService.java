package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Models.Officer;
import com.example.demo.Repository.OfficerRepo;

@Service
public class OfficerService {

	@Autowired
	public OfficerRepo officerrepo;
	
	public void saveofficer(Officer officer) {
		//System.out.println(casee.getCaseid());
		officerrepo.save(officer);
	}
	
	public List<Officer> showAllOfficers(){
		List<Officer> officers = new ArrayList<Officer>();
		for(Officer officer : officerrepo.findAll()) {
			officers.add(officer);
			System.out.println(officer.getMail());
		}
		return officers;
	}
	
}
