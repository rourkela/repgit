package com.pallabi.employee.service;

import java.util.List;

import com.pallabi.employee.entity.Employee;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    List< Employee > getAllEmployee();

    Employee getEmployeeById(long employeeId);

    void deleteEmployee(long id);
}
