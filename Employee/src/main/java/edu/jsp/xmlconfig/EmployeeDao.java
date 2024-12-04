package edu.jsp.xmlconfig;
public class EmployeeDao {
    public void addEmployee(Employee employee) {
        System.out.println("Adding employee: " + employee);
    }

    public void searchEmployee(int id) {
        System.out.println("Searching employee with ID: " + id);
    }

    public void deleteEmployee(int id) {
        System.out.println("Deleting employee with ID: " + id);
    }
}
