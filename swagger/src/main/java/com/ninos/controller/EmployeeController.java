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
    public Employee show(@RequestParam int id){
       return employeeRepository.findById((long) id).get();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam int id){
         employeeRepository.deleteById((long)id);
    }

    @PutMapping("/edit")
    public Employee edit(@RequestBody Employee employee){
       return employeeRepository.save(employee);
    }




}
