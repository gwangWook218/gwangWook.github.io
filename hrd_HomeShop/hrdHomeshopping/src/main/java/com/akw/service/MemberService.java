package com.akw.service;

import org.springframework.stereotype.Service;

import com.akw.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberRepository memberRepository;
}
