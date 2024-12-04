package edu.jsp.xmlconfig;

//EmployeeService.java
//EmployeeService.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
 private final EmployeeDao employeeDao;

 @Autowired
 public EmployeeService(EmployeeDao employeeDao) {
     this.employeeDao = employeeDao;
 }

 public void performOperation() {
     Employee employee = new Employee(1, "John Doe");
     employeeDao.addEmployee(employee);
     employeeDao.searchEmployee(1);
     employeeDao.deleteEmployee(1);
 }
}

