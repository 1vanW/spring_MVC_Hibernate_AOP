package com.ivan.Hohryakov.mvc.hibernate.aop.service;

import com.ivan.Hohryakov.mvc.hibernate.aop.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}


