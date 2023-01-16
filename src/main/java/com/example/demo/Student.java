package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private Long id;
    private String firstName;
    private String lasName;
    private String email;
    private Integer age;


    public Student(Long id, String firstName, String lasName, String email, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lasName = lasName;
        this.email = email;
        this.age = age;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasName() {
        return lasName;
    }
    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", firstName=" + firstName + ", lasName=" + lasName + ", email=" + email + ", age="
                + age + "}";
    }
    
 
}
