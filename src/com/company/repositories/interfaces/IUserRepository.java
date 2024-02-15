package com.company.repositories.interfaces;

import com.company.models.Employee;
import com.company.models.User;

import java.util.List;

public interface IUserRepository {
    boolean createUser(User user);
    boolean createEmployee(Employee employee);
    User getUser(int id);
    List<User> getAllUsers();
}
