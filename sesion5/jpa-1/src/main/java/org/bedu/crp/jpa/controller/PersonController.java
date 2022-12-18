package org.bedu.crp.jpa.controller;

import org.bedu.crp.jpa.model.Person;
import org.bedu.crp.jpa.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
  private IPersonRepository repository;

  @Autowired
  public PersonController(IPersonRepository repository){

      this.repository=repository;
  }

  @GetMapping("/getAll")
  public List<Person> getAll(){
      return  repository.findAll();
  }

}
