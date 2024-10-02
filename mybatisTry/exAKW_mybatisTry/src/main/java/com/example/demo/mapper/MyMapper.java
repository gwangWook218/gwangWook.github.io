package com.example.demo.mapper;

import java.util.List;

import com.example.demo.model.Member;

@Mapper
public interface MyMapper {
	List<Member> selectMember();
}
