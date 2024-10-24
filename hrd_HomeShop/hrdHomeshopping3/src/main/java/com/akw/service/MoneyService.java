package com.akw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akw.dto.MoneyDTO;
import com.akw.repository.MoneyRepository;

@Service
public class MoneyService {

	@Autowired
	private MoneyRepository moneyRepository;
	
	public List<MoneyDTO> findAll() {
		return moneyRepository.findAll();
	}
}
