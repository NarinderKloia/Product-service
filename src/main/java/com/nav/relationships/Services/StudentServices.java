package com.nav.relationships.Services;

import com.nav.relationships.Dto.CreateStudentDto;
import com.nav.relationships.Dto.StudentDto;
import com.nav.relationships.Dto.createUserDto;

public interface StudentServices{
    public StudentDto createStudent(CreateStudentDto dto);

}