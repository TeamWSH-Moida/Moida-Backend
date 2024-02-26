package com.wsh.mogak.domain.member;

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

    @Column(name = "title", columnDefinition = "TEXT")
    private String title;

    @Column(name = "decription", columnDefinition = "TEXT")
    private String description;

    @Column(name = "current_count", columnDefinition = "SMALLINT")
    private int currentCount;

    @Column(name = "max_count", columnDefinition = "SMALLINT")
    private int maxCount;




}
