package com.nav.relationships.Services;

import org.springframework.stereotype.Service;

import com.nav.relationships.Dto.CreateLicenceDTO;
import com.nav.relationships.Dto.DrivingLicenceDTO;
import com.nav.relationships.entity.DrivingLicence;
import com.nav.relationships.entity.user;
import com.nav.relationships.repositories.DrivingLicenceRepo;
import com.nav.relationships.repositories.userRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DrivingLicenceServiceImpl implements DrivingLicenceService {
    public final DrivingLicenceRepo dRepo;
    public final userRepo rRepo;

    @Override
    public DrivingLicenceDTO createLicence(Long userId, CreateLicenceDTO dto) {
        user users = rRepo.findById(userId).orElseThrow();
        DrivingLicence licence = new DrivingLicence();
        licence.setUser(users);
        licence.setLicenceNumber(dto.getLicenceNumber());
        licence.setLicenceType(dto.getLicenceType());
        DrivingLicence dl = dRepo.save(licence);
        return new DrivingLicenceDTO(dl.getId(), dl.getLicenceNumber(), dl.getLicenceType(), dl.getUser());

    }

    @Override
    public DrivingLicenceDTO updateLicence(Long id, CreateLicenceDTO update) {
        DrivingLicence licence = dRepo.findById(id).orElseThrow();
        licence.setLicenceNumber(update.getLicenceNumber());
        licence.setLicenceType(update.getLicenceType());

        return new DrivingLicenceDTO(licence.getId(), licence.getLicenceNumber(), licence.getLicenceType(),
                licence.getUser());

    }

    @Override
    public DrivingLicenceDTO updateByUserId(Long userId, CreateLicenceDTO dto) {
        DrivingLicence licences = dRepo.findByUserId(userId).orElseThrow();
        licences.setLicenceNumber(dto.getLicenceNumber());
        licences.setLicenceType(dto.getLicenceType());
        DrivingLicence licence = dRepo.save(licences);

        return new DrivingLicenceDTO(licence.getId(), licence.getLicenceNumber(), licence.getLicenceType(),
                licence.getUser());

    }

}
