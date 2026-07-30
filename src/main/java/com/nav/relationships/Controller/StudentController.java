package com.nav.relationships.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nav.relationships.Dto.CreateStudentDto;
import com.nav.relationships.Dto.StudentDto;
import com.nav.relationships.Services.StudentServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/students")
@RequiredArgsConstructor
public class StudentController {
    public final StudentServiceImpl service;

    @PostMapping
    public StudentDto createStudent(@RequestBody CreateStudentDto dto) {
        return service.createStudent(dto);
    };

    @GetMapping
    public List<StudentDto> getStudent() {
        return service.getStudent();

    };

    @GetMapping("/{id}")
    public StudentDto getStudentById(@PathVariable Long id) {
        return service.getStudentById(id);
    };

    @PutMapping("/{id}")
    public StudentDto updateStudentById(@PathVariable Long id, @RequestBody CreateStudentDto updateStudent) {
        return service.updateStudentById(id, updateStudent);

    }

    @PatchMapping("/{id}")
    public StudentDto patchStudent(@PathVariable Long id, @RequestBody CreateStudentDto patchStudent) {
        return service.patchStudent(id, patchStudent);

    };

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
