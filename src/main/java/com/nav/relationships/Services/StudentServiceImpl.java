package com.nav.relationships.Services;

import org.springframework.stereotype.Service;

import com.nav.relationships.Dto.CreateStudentDto;
import com.nav.relationships.Dto.StudentDto;
import com.nav.relationships.entity.Student;
import com.nav.relationships.repositories.StudentRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentServices {
    public final StudentRepo repo;
    @Override
    public StudentDto createStudent(CreateStudentDto dto) {
        Student student = new Student();

        student.setStudentName(dto.getStudentName());   
        student.setEmail(dto.getEmail());
        student.setCourse(dto.getCourse());

        Student createStudent = repo.save(student);

        return new StudentDto(createStudent.getStudentId(),createStudent.getStudentName(),createStudent.getEmail(),createStudent.getCourse());




    }

    
}
