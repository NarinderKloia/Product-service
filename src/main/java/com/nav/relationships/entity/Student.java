package com.nav.relationships.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long StudentId;
    @Column(name = "name", nullable = false)
    private String StudentName;
    @Column(name = "course", nullable = false)
    private String Course;
    private String Email;

    // @OneToMany(mappedBy = "groupMembers")
    // private TAs ta;

}
