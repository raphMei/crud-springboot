package com.raphmei.crud_springboot.repository;

import com.raphmei.crud_springboot.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
