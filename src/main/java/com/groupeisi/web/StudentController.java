package com.groupeisi.web;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import com.groupeisi.dto.StudentDto;
import com.groupeisi.entities.Student;
import com.groupeisi.mapper.StudentMapper;
import com.groupeisi.repository.StudentRepository;

import java.util.List;

@Controller
public class StudentController {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public StudentController(StudentMapper studentMapper, StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    @QueryMapping
    public List<StudentDto> getStudents() {
        return studentRepository.findAll().stream().map(studentMapper::toDto).toList();
    }

    @QueryMapping
    public StudentDto getStudent(@Argument Long id) {
        return studentMapper.toDto(studentRepository.findById(id).orElseThrow(() -> new RuntimeException(String.format("Student with id %s not found", id))));
    }

    @MutationMapping
    public Student createStudent(@Argument StudentDto studentDto) {
        return studentRepository.save(studentMapper.toEntity(studentDto));
    }

    @QueryMapping
    public List<StudentDto> getStudentByName(@Argument String name) {
        return studentRepository.findByName(name).stream().map(studentMapper::toDto).toList();
    }
}
