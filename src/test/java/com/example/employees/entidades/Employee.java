package com.example.employees.entidades;

public class Employee {
    private Long id;
    private String name;
    private String lastName;
    private String position;

    public Employee() {
    }

    public Employee(Long id, String name, String lastName, String position) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setEmployee(Employee employee) {
        this.id = employee.getId();
        this.name = employee.getName();
        this.lastName = employee.getLastName();
        this.position = employee.getPosition();
    }
    
}
