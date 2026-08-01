package com.nav.relationships.Services;

import org.springframework.stereotype.Service;

import com.nav.relationships.Dto.CreateLicenceDTO;
import com.nav.relationships.Dto.DrivingLicenceDTO;

@Service
public interface DrivingLicenceService {
    public DrivingLicenceDTO createLicence(Long userId, CreateLicenceDTO dto);

    public DrivingLicenceDTO updateLicence(Long id, CreateLicenceDTO update);

    public DrivingLicenceDTO updateByUserId(Long userId, CreateLicenceDTO dto);

}
