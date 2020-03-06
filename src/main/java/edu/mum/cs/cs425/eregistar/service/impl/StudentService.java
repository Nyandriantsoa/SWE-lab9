package edu.mum.cs.cs425.eregistar.service.impl;

import edu.mum.cs.cs425.eregistar.model.Student;
import edu.mum.cs.cs425.eregistar.repository.StudentRepository;
import edu.mum.cs.cs425.eregistar.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student getOneStudent(Long id) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public Student deleteStudent(Student student) {
        return null;
    }

    @Override
    public Student deleteStudent(Long id) {
        return null;
    }
}
