package com.nav.relationships.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.nav.relationships.entity.user;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DrivingLicenceDTO {
    private Long id;
    private String licenceNumber;
    private String licenceType;
    private user user;
}

