package edu.jsp.data_jpa.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.jsp.data_jpa.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
    UserInfo findByMobile(long mobile);
    List<UserInfo> findByFirstName(String firstName);
    List<UserInfo> findByLastName(String lastName);
    UserInfo findByFirstNameAndMobile(String firstName, long mobile);
    List<UserInfo> findBySalaryGreaterThan(double salary);
    List<UserInfo> findByLastNameContaining(String value);
    List<UserInfo> findByFirstNameOrderBySalary(String firstName);
    List<UserInfo> findByDobBetween(LocalDate min, LocalDate max);
}
