package com.nav.relationships.Dto;

import lombok.Data;

@Data
public class ClientRequestDTO {

    private String clientName;

    private String clientAddress;

    private Long employeeId;

    private Long productId;

}