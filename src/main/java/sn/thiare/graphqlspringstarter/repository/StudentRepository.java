package sn.thiare.graphqlspringstarter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.thiare.graphqlspringstarter.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
