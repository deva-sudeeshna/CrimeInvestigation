package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Casee;

@Repository
public interface CaseRepo extends CrudRepository<Casee,Integer> {

}
