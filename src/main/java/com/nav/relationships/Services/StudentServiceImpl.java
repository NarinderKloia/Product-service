package com.nav.relationships.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nav.relationships.Dto.CreateStudentDto;
import com.nav.relationships.Dto.StudentDto;
import com.nav.relationships.entity.Student;
import com.nav.relationships.repositories.StudentRepo;
import jakarta.transaction.Transactional;
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

        return new StudentDto(createStudent.getStudentId(), createStudent.getStudentName(), createStudent.getEmail(),
                createStudent.getCourse());
    }

    @Override
    public List<StudentDto> getStudent() {
        List<Student> student = repo.findAll();
        List<StudentDto> studentDtoList = new ArrayList<>();
        for (Student value : student) {
            StudentDto studentDto = new StudentDto(value.getStudentId(), value.getStudentName(), value.getCourse(),
                    value.getEmail());
            studentDtoList.add(studentDto);
        }
        return studentDtoList;
    }

    @Override
    public StudentDto getStudentById(Long id) {
        Student student = repo.findById(id).orElseThrow();
        return new StudentDto(student.getStudentId(), student.getStudentName(), student.getCourse(),
                student.getEmail());
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Transactional
    public StudentDto updateStudentById(Long id, CreateStudentDto updateStudent) {
        Student student = repo.findById(id).orElseThrow();
        student.setStudentName(updateStudent.getStudentName());
        student.setCourse(updateStudent.getCourse());
        student.setEmail(updateStudent.getEmail());
        return new StudentDto(student.getStudentId(), student.getStudentName(), student.getCourse(),
                student.getEmail());

    }

    @Transactional
    public StudentDto patchStudent(Long id, CreateStudentDto patchStudent) {
        Student student = repo.findById(id).orElseThrow();
        if (patchStudent.getStudentName() != null) {
            student.setStudentName(patchStudent.getStudentName());
        }
        if (patchStudent.getCourse() != null) {
            student.setCourse(patchStudent.getCourse());
        }
        if (patchStudent.getEmail() != null) {
            student.setEmail(patchStudent.getEmail());
        }

        return new StudentDto(student.getStudentId(), student.getStudentName(), student.getCourse(),
                student.getEmail());

    };

}
