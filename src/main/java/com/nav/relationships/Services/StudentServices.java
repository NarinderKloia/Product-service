package com.nav.relationships.Services;

import java.util.List;

import com.nav.relationships.Dto.CreateStudentDto;
import com.nav.relationships.Dto.StudentDto;

public interface StudentServices {

    public StudentDto createStudent(CreateStudentDto dto);

    public List<StudentDto> getStudent();

    public StudentDto getStudentById(Long id);

    public void deleteById(Long id);

    public StudentDto updateStudentById(Long id, CreateStudentDto updateStudent);

    public StudentDto patchStudent(Long id, CreateStudentDto patchStudent);

}