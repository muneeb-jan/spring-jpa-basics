package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

// Student Repository is a data access layer that abstracts the boiler code for db access and makes it easy to work with DBs.
// We need the functions of Jpa Repository which extends PagingAndSorting which extends CrudRepository.
// If we navigate to JpaRepository, we can see that we want to pass the type of entity and datatype of its identifier 
// which in our case are: Student and Long.
public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
