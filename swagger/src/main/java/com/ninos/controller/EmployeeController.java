package com.ninos.controller;

import com.ninos.model.Employee;
import com.ninos.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/save")
    public void save(@RequestBody Employee employee){
        employeeRepository.save(employee);
    }

    @GetMapping("/show")
    public Employee show(@RequestParam Long id){
       return employeeRepository.findById(id).get();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id){
         employeeRepository.deleteById(id);
    }

    @PutMapping("/edit")
    public Employee edit(@RequestBody Employee employee){
       return employeeRepository.save(employee);
    }




}
