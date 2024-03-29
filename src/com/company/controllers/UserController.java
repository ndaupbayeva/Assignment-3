package com.company.controllers;

import com.company.models.Employee;
import com.company.models.User;
import com.company.repositories.interfaces.IUserRepository;

import java.util.List;

public class UserController {
    private final IUserRepository repo;

    public UserController(IUserRepository repo) {
        this.repo = repo;
    }

    public String createUser(String name, String surname, String gender) {
        boolean male = gender.toLowerCase().equals("male");
        User user = new User(name, surname, male);

        boolean created = repo.createUser(user);

        return (created ? "User was created!" : "User creation was failed!");
    }

    public String createEmployee(String name, String surname, String position, int age, String gender) {
        boolean male = gender.toLowerCase().equals("male");
        Employee employee = new Employee(name, surname, position, age, male);

        boolean created = repo.createEmployee(employee);

        return (created ? "Employee was added!" : "Employee adding was failed!");
    }

    public String deleteEmployee(int id){
        Employee employee = repo.deleteEmployee(id);

        return (employee == null ? "User was not found!" : "User deleted");
    }

    public String getUser(int id) {
        User user = repo.getUser(id);

        return (user == null ? "User was not found!" : user.toString());
    }

    public String getAllUsers() {
        List<User> users = repo.getAllUsers();

        StringBuilder response = new StringBuilder();
        for (User user : users) {
            response.append(user.toString()).append("\n");
        }

        return response.toString();
    }

    public String getAllEmployees(){
        List<Employee> employees = repo.getAllEmployees();

        StringBuilder response = new StringBuilder();
        for (Employee employee : employees) {
            response.append(employee.toString()).append("\n");
        }

        return response.toString();
    }
}
