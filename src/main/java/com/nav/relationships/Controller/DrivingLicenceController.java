package com.nav.relationships.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nav.relationships.Dto.CreateLicenceDTO;
import com.nav.relationships.Dto.DrivingLicenceDTO;
import com.nav.relationships.Services.DrivingLicenceServiceImpl;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/users/{userId}/licence")
@AllArgsConstructor
public class DrivingLicenceController {
    public final DrivingLicenceServiceImpl services;

    @PostMapping
    public DrivingLicenceDTO createLicence(@PathVariable Long userId, @RequestBody CreateLicenceDTO dto) {
        return services.createLicence(userId, dto);
    };

    public DrivingLicenceDTO updateLicence(Long id, CreateLicenceDTO update){
        return null;

    }

}
