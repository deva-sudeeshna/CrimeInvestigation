package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Models.Suspect;

public interface SuspectRepo extends CrudRepository<Suspect,String> {
	
	public List<Suspect>  findAllByCaseid(Integer caseid); 
	

}
