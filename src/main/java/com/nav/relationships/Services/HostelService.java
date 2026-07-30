package com.nav.relationships.Services;

import org.springframework.stereotype.Service;

import com.nav.relationships.Dto.CreateHostelDto;
import com.nav.relationships.Dto.HostelDto;

@Service
public interface HostelService {
    public HostelDto createHostelRoom(Long studentId,CreateHostelDto dto);
}
