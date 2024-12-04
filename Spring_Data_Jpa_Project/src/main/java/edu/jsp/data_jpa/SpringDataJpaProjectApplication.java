package edu.jsp.data_jpa;

import java.time.LocalDate;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import edu.jsp.data_jpa.entity.UserInfo;
import edu.jsp.data_jpa.service.UserInfoService;

@SpringBootApplication
public class SpringDataJpaProjectApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ApplicationContext context = SpringApplication.run(SpringDataJpaProjectApplication.class, args);
        
        UserInfoService service = context.getBean(UserInfoService.class);
        boolean flag = true;
        
        while (flag) {
            System.out.println("Choose your task: \n 1. Add User \n 2. Find All Users \n 3. Find User By Id \n 4. Remove User By Id \n 5. Update User \n 6. Find user by mobile no \n 7. Find user by first name \n 8. Find user by last name \n 9. Find user by first name and mobile \n 10. Find user by salary greater than \n 20. Exit");
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1: {
                    UserInfo info = new UserInfo();
                    System.out.print("First Name: ");
                    info.setFirstName(sc.next());
                    System.out.print("Last Name: ");
                    info.setLastName(sc.next());
                    System.out.print("Mobile: ");
                    info.setMobile(sc.nextLong());
                    System.out.print("Email: ");
                    info.setEmail(sc.next());
                    System.out.print("Salary: ");
                    info.setSalary(sc.nextDouble());
                    System.out.print("Date of Birth (YYYY-MM-DD): ");
                    String dob = sc.next();
                    LocalDate date = LocalDate.parse(dob);
                    info.setDob(date);
                    service.addUser(info);
                    break;
                }
                case 2: {
                    service.findAllUsers();
                    break;
                }
                case 3: {
                    System.out.print("Enter User ID: ");
                    int id = sc.nextInt();
                    service.findUserById(id);
                    break;
                }
                case 4: {
                    System.out.print("Enter User ID to delete: ");
                    int id = sc.nextInt();
                    service.removeUserById(id);
                    break;
                }
                case 5: {
                    System.out.print("Enter User ID to update: ");
                    int id = sc.nextInt();
                    UserInfo updatedInfo = new UserInfo();
                    System.out.print("New First Name: ");
                    updatedInfo.setFirstName(sc.next());
                    System.out.print("New Last Name: ");
                    updatedInfo.setLastName(sc.next());
                    System.out.print("New Mobile: ");
                    updatedInfo.setMobile(sc.nextLong());
                    service.updateUser(id, updatedInfo);
                    break;
                }
                case 6: {
                    System.out.print("Enter Mobile Number: ");
                    long mobile = sc.nextLong();
                    service.findUserByMobile(mobile);
                    break;
                }
                case 7: {
                    System.out.print("Enter First Name: ");
                    String firstName = sc.next();
                    service.findUserByFirstName(firstName);
                    break;
                }
                case 8: {
                    System.out.print("Enter Last Name: ");
                    String lastName = sc.next();
                    service.findUserByLastName(lastName);
                    break;
                }
                case 9: {
                    System.out.print("Enter First Name: ");
                    String firstName = sc.next();
                    System.out.print("Enter Mobile Number: ");
                    long mobile = sc.nextLong();
                    service.findUserByMobileAndFirstName(firstName, mobile);
                    break;
                }
                case 10: {
                    System.out.print("Enter Minimum Salary: ");
                    double salary = sc.nextDouble();
                    service.findUserBySalaryGreaterThan(salary);
                    break;
                }
                case 20: {
                    System.out.println("Exiting...");
                    flag = false;
                    break;
                }
                default: {
                    System.err.println("Invalid Choice. Try Again.");
                    break;
                }
            }
        }
        sc.close();
    }
}
