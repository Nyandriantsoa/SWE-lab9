package edu.mum.cs.cs425.eregistar.service;

import edu.mum.cs.cs425.eregistar.model.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Optional<Student> getOneStudent(Long id);
    public Student updateStudent(Student student);
    public void deleteStudent(Student student);
    public void deleteStudent(Long id);

}
