package com.nav.relationships.Dto;

import com.nav.relationships.entity.Student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class HostelDto {
    private Long HostelId;
    private String RoomNumber;
    private Student student;
}
