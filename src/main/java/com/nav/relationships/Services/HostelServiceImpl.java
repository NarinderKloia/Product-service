package com.nav.relationships.Services;

import org.springframework.stereotype.Service;

import com.nav.relationships.Dto.CreateHostelDto;
import com.nav.relationships.Dto.HostelDto;
import com.nav.relationships.entity.Hostel;
import com.nav.relationships.entity.Student;
import com.nav.relationships.repositories.HostelRepo;
import com.nav.relationships.repositories.StudentRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HostelServiceImpl implements HostelService {
    private final StudentRepo sRepo;
    private final HostelRepo hRepo;

    @Override
    public HostelDto createHostelRoom(Long studentId, CreateHostelDto dto) {
        Student student = sRepo.findById(studentId).orElseThrow();
        Hostel hostel = new Hostel();
        hostel.setStudent(student);
        hostel.setRoomNumber(dto.getRoomNumber());

        Hostel saveHostel = hRepo.save(hostel);
        return new HostelDto(saveHostel.getHostelId(), saveHostel.getRoomNumber(), saveHostel.getStudent());

    }

}
