package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Models.Officer;

public interface OfficerRepo extends CrudRepository<Officer, Integer> {

}
