package edu.mum.cs.cs425.eregistar.service;

import edu.mum.cs.cs425.eregistar.model.Student;

import java.util.List;

public interface IStudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getOneStudent(Long id);
    public Student updateStudent(Student student);
    public Student deleteStudent(Student student);
    public Student deleteStudent(Long id);

}
