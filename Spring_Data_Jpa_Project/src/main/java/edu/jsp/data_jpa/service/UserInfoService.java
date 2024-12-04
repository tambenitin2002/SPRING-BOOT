package edu.jsp.data_jpa.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.data_jpa.entity.UserInfo;
import edu.jsp.data_jpa.repository.UserInfoRepository;

@Service
public class UserInfoService {
    
    @Autowired
    private UserInfoRepository repository;
    
    public void addUser(UserInfo userInfo) {
        UserInfo userFromDb = repository.save(userInfo);
        System.out.println(userFromDb);
        System.out.println("Data Inserted...");
    }
    
    public void findAllUsers() {
        List<UserInfo> users = repository.findAll();
        System.out.println(users);
    }
    
    public void findUserById(int id) {
        Optional<UserInfo> optional = repository.findById(id);
        if (optional.isPresent()) {
            UserInfo info = optional.get();
            System.out.println(info);
        } else {
            System.out.println("No data found...");
        }
    }
    
    public void removeUserById(int id) {
        Optional<UserInfo> optional = repository.findById(id);
        if (optional.isPresent()) {
            repository.deleteById(id);
            System.out.println("Record Deleted...");
        } else {
            System.err.println("No data found...");
        }
    }
    
    public void updateUser(int id, UserInfo input) {
        Optional<UserInfo> optional = repository.findById(id);
        UserInfo userFromDb = optional.orElse(null);
        if (userFromDb != null) {
            userFromDb.setFirstName(input.getFirstName());
            userFromDb.setLastName(input.getLastName());
            userFromDb.setMobile(input.getMobile());

            UserInfo modifiedUser = repository.save(userFromDb);
            System.out.println(modifiedUser);
            System.out.println("Data Updated...");
        } else {
            System.err.println("No data found...");
        }
    }
    
    public void findUserByMobile(long mobile) {
        UserInfo userInfo = repository.findByMobile(mobile);
        if (userInfo != null) {
            System.out.println(userInfo);
        } else {
            System.err.println("No data found");
        }
    }
    
    public void findUserByFirstName(String firstName) {
        List<UserInfo> userInfo = repository.findByFirstName(firstName);
        if (userInfo != null) {
            System.out.println(userInfo);
        } else {
            System.err.println("No data found");
        }
    }
    
    public void findUserByLastName(String lastName) {
        List<UserInfo> userInfo = repository.findByLastName(lastName);
        if (userInfo != null) {
            System.out.println(userInfo);
        } else {
            System.err.println("No data found");
        }
    }
    
    public void findUserByMobileAndFirstName(String name, long mobile) {
        UserInfo userInfo = repository.findByFirstNameAndMobile(name, mobile);
        if (userInfo != null) {
            System.out.println(userInfo);
        } else {
            System.out.println("No Data found");
        }
    }
    
    public void findUserBySalaryGreaterThan(double salary) {
        List<UserInfo> userInfo = repository.findBySalaryGreaterThan(salary);
        if (userInfo != null) {
            System.out.println(userInfo);
        } else {
            System.err.println("No Data found");
        }
    }
    
    public void findUserByLastNameContaining(String lastName) {
        List<UserInfo> userInfo = repository.findByLastNameContaining(lastName);
        if (userInfo != null) {
            System.out.println(userInfo);
        } else {
            System.err.println("No Data found");
        }
    }
    
    public void findUserByFirstNameOrderBySalary(String firstName) {
        List<UserInfo> userInfo = repository.findByFirstNameOrderBySalary(firstName);
        if (userInfo != null) {
            System.out.println(userInfo);
        } else {
            System.err.println("No Data found");
        }
    }
    
    public void findUserByDobBetween(LocalDate min, LocalDate max) {
        List<UserInfo> userInfo = repository.findByDobBetween(min, max);
        if (userInfo != null) {
            System.out.println(userInfo);
        } else {
            System.err.println("No Data found");
        }
    }
}
