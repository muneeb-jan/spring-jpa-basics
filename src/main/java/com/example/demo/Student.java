package com.example.demo;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity(name = "Student") // We should explicitly define the name of entity as good practice
@Table(
    name = "student",
    uniqueConstraints = {
        @UniqueConstraint(name = "student_email_unique", columnNames = "email")
    }
) // Specify table name and the name for unique contraint that wil be generated for email in db.
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
    @Column(
        name = "id",
        updatable = false
    ) // Column name in table should be id and it should not be updatable
    private Long id;

    @Column(
        name = "first_name",
        nullable = false,
        columnDefinition = "TEXT"
    ) // Column name should be "first_name". It cannot be null and the type has to be text.. basically: first_name text not null
    private String firstName;

    @Column(
        name = "last_name",
        nullable = false,
        columnDefinition = "TEXT"
    ) 
    private String lasName;

    @Column(
        name = "email",
        nullable = false,
        columnDefinition = "TEXT"
        // unique = true
    ) // Make email unique. We removed from here because we defined it in Table properties above. This is so as to prettify constraint name
    private String email;

    @Column(
        name = "age",
        nullable = false
    )
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
