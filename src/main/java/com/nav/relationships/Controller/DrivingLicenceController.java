package com.nav.relationships.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nav.relationships.Dto.CreateLicenceDTO;
import com.nav.relationships.Dto.DrivingLicenceDTO;
import com.nav.relationships.Services.DrivingLicenceServiceImpl;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api")
@AllArgsConstructor
public class DrivingLicenceController {
    public final DrivingLicenceServiceImpl services;

    @PostMapping("/users/{userId}/licence")
    public DrivingLicenceDTO createLicence(@PathVariable Long userId, @RequestBody CreateLicenceDTO dto) {
        return services.createLicence(userId, dto);
    };

    @PutMapping("/{id}")
    public DrivingLicenceDTO updateLicence(@PathVariable Long id, @RequestBody CreateLicenceDTO update) {
        return services.updateLicence(id, update);

    }

}
