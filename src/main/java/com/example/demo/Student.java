package com.example.demo;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "Student") // We should explicitly define the name of entity as good practice
public class Student {

    @Id // Shows that id is primary key.. using @Id annotation. These are the fields in our relation Student in DB which will be created at startup
    @SequenceGenerator(
        name = "student_sequence",
        sequenceName = "student_sequence",
        allocationSize = 1
    ) // Sequence generator is used to generate new values. That's why we want it. allocation Size is just increment step, i.e +1
    @GeneratedValue(
        strategy = SEQUENCE,
        generator = "student_sequence"
    ) // value for id comes from a sequence generated using sequence generator defined above. The type in DB will be big serial.
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
