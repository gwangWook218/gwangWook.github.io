package com.akw.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

	@Autowired
	private SqlSessionTemplete sql;
}
