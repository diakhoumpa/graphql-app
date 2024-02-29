package com.groupeisi.repository;

import com.groupeisi.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

//    recherche par nom
    @Query("SELECT s FROM Student s WHERE s.name LIKE %?1%")
    List<Student> findByName(String name);

}
