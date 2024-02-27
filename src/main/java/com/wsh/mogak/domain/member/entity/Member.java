package com.wsh.mogak.domain.member.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class Member {

    @Id
    @GeneratedValue(generator = "UUID4")
    @Column(name = "member_id")
    private UUID id;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "password", length = 128)
    private String password;

    @Column(name = "name", length = 20)
    private String name;

    @Column(name = "school", length = 50)
    private String school;

    @Column(name = "decription", columnDefinition = "TEXT")
    private String description;
}
