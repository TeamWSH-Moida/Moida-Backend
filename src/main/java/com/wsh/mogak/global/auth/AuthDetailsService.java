package com.wsh.mogak.global.auth;

import com.wsh.mogak.domain.member.repository.MemberRepository;
import com.wsh.mogak.global.exception.ErrorCode;
import com.wsh.mogak.global.exception.GlobalException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthDetailsService implements UserDetailsService {
    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return memberRepository.findByEmail(email)
                .map(AuthDetails::new)
                .orElseThrow(() -> new GlobalException(ErrorCode.MEMBER_NOT_FOUND));
    }
}
