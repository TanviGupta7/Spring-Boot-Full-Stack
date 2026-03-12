package com.InvincibleTanvi.Introduction.controllers;

import com.InvincibleTanvi.Introduction.dto.Employeedto;
import com.InvincibleTanvi.Introduction.entities.EmployeeEntity;
import com.InvincibleTanvi.Introduction.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController //extends from controller, it has response body that converts back XML, JSON to Java
public class EmployeeController {
    //@GetMapping(path="/getSecretMessage") //resource locator i.e. path
    //public String getMySuperSecretMessage(){
      //  return "Secret message: qssjs*@wnwHB";
   // }

    private final EmployeeRepository employeeRepository; //dependency injection
    private EmployeeEntity inputEmployee;

    public EmployeeController(EmployeeRepository employeeReposoitory){
        this.employeeRepository=employeeReposoitory;
    }
    @GetMapping("/employees/{employeeId}")
    public EmployeeEntity getEmployeeID(@PathVariable Long employeeId){ //later we will change entity to dto
        return (EmployeeEntity) employeeRepository.findById(id).orElse(null);

    }
    @GetMapping
    public List<EmployeeEntity> getAllEmployees(@RequestBody EmployeeEntity inputEmployee){

        return employeeRepository.findAll();
    }
    @PostMapping
    public EmployeeEntity createNewEmployeeById(){
        return employeeRepository.save(inputEmployee);
    }

}

