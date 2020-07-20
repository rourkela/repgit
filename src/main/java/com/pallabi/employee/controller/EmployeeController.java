package com.pallabi.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pallabi.employee.entity.Employee;
import com.pallabi.employee.service.EmployeeService;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity < Employee > createProduct(@RequestBody Employee employee) {
        return ResponseEntity.ok().body(this.employeeService.createEmployee(employee));
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity < Employee > getEmployeeById(@PathVariable long id) {
        return ResponseEntity.ok().body(employeeService.getEmployeeById(id));
    }

    @GetMapping("/employees")
    public ResponseEntity <List<Employee>> getAllEmployee() {
        return ResponseEntity.ok().body(employeeService.getAllEmployee());
    }



    @PutMapping("/employee/{id}")
    public ResponseEntity < Employee > updateProduct(@PathVariable long id, @RequestBody Employee employee) {
        employee.setId(id);
        return ResponseEntity.ok().body(this.employeeService.updateEmployee(employee));
    }

    @DeleteMapping("/employee/{id}")
    public HttpStatus deleteProduct(@PathVariable long id) {
        this.employeeService.deleteEmployee(id);
        return HttpStatus.OK;
    }
}
