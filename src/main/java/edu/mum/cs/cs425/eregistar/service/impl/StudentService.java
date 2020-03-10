package edu.mum.cs.cs425.eregistar.service.impl;

import edu.mum.cs.cs425.eregistar.model.Student;
import edu.mum.cs.cs425.eregistar.repository.StudentRepository;
import edu.mum.cs.cs425.eregistar.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return this.studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    @Override
    public Optional<Student> getOneStudent(Long id) {
        return Optional.of(this.studentRepository.getOne(id));
    }

    @Override
    public Student updateStudent(Student student) {
        return this.studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Student student) {
        this.studentRepository.delete(student);
    }

    @Override
    public void deleteStudent(Long id) {
        Optional<Student> student = this.studentRepository.findById(id);
        if(student.isPresent()){
            this.studentRepository.delete(student.get());
        }
    }
}
