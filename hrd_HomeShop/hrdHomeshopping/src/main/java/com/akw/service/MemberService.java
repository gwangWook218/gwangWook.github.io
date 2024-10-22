package com.akw.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.akw.dto.MemberDTO;
import com.akw.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberRepository memberRepository;
	
	public void save(MemberDTO dto) {
		memberRepository.save(dto);
	}
	
	public List<MemberDTO> findAll() {
		return memberRepository.findAll();
	}
	
	public MemberDTO findById(Integer id) {
		return memberRepository.findById(id);
	}
	
	public void update(MemberDTO dto) {
		memberRepository.update(dto);
	}
	
	public void delete(Integer id) {
		memberRepository.delete(id);
	}
}
