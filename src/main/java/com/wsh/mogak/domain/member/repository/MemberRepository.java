package com.wsh.mogak.domain.member.repository;

import com.wsh.mogak.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface MemberRepository extends JpaRepository<Member, UUID> {
    Optional<Member> findByEmail(String email);
}
