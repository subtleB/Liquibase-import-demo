package com.example.liquibaseDemo.repository;

import com.example.liquibaseDemo.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
