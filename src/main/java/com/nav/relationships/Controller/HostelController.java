package com.nav.relationships.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nav.relationships.Dto.CreateHostelDto;
import com.nav.relationships.Dto.HostelDto;
import com.nav.relationships.Services.HostelServiceImpl;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/students/{studentId}/hostel")
@AllArgsConstructor
public class HostelController {
    public final HostelServiceImpl service;

    @PostMapping
    public HostelDto createHostelRoom(@PathVariable Long studentId, @RequestBody CreateHostelDto dto) {
        return service.createHostelRoom(studentId, dto);
    }
}
