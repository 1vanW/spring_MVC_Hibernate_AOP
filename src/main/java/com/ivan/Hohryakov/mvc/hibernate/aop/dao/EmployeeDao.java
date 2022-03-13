package com.ivan.Hohryakov.mvc.hibernate.aop.dao;

import com.ivan.Hohryakov.mvc.hibernate.aop.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeDao {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
