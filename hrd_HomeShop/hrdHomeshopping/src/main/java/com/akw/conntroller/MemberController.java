package com.akw.conntroller;

import org.springframework.stereotype.Controller;

import com.akw.service.MemberService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MemberController {

	private final MemberService memberService;
}
