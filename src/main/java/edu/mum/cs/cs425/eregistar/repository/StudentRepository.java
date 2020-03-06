package edu.mum.cs.cs425.eregistar.repository;

import edu.mum.cs.cs425.eregistar.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student , Long> {
}
