package com.alaa.hmidi.TP_FM_BE.Service;

import com.alaa.hmidi.TP_FM_BE.Entity.Student;
import com.alaa.hmidi.TP_FM_BE.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // GET ALL
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // CREATE (POST)
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // UPDATE (PUT)
    public Student updateStudent(Long id, Student studentDetails) {
        Student student = studentRepository.findById(id).orElseThrow();
        student.setName(studentDetails.getName());   // Change to your actual fields
        student.setLevel(studentDetails.getLevel()); // Change to your actual fields
        return studentRepository.save(student);
    }

    // DELETE
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}