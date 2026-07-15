package com.nav.relationships.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientid;

    @Column(name = "name",nullable = false)
    private String clientName;

    @Column(name = "Address")
    private String clientAddress;

    @OneToOne
    @JoinColumn(name = "Emp_id")
    private Employees employee;

    @OneToOne
    @JoinColumn(name = "Product_id")
    private Product product;

    public void setClientName(String clientName2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setClientName'");
    }
}
