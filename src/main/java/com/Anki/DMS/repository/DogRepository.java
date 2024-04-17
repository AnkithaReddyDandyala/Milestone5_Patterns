package com.Anki.DMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.Anki.DMS.Models.Dog;
/**
 * 
 * @author Ankitha Reddy Dandayala

 */

public interface DogRepository extends CrudRepository<Dog,Integer> {
	
}
