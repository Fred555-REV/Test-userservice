package com.hackathon.userservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String password;
    private Integer[] departments;
    private String[] roles;

    public User() {
    }

    public User(String firstName, String lastName, String password, Integer[] departments) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.departments = departments;
    }

    public User(String firstName, String lastName, String password, Integer[] departments, String[] roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.departments = departments;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer[] getDepartments() {
        return departments;
    }

    public void setDepartments(Integer[] departments) {
        this.departments = departments;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }
}
