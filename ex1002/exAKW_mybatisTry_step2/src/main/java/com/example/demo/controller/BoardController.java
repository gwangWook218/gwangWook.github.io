package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.BoardDTO;
import com.example.demo.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {

//	생성자 주입방식
//	Model 사용하기 위한 준비
	private final BoardService boardService;
	
	@GetMapping("/save")
	public String save() {
		return "save";
	}
	
	@PostMapping("/save")
	public String save(BoardDTO dto) {
		System.out.println("DTO = " + dto);
		boardService.save(dto);
		return "redirect:/list";
	}
	
	@GetMapping("/list")
	public String findAll(Model model) {
		List<BoardDTO> boardDTOList = boardService.findAll();
		model.addAttribute("boardList", boardDTOList);
		return "list";
	}
}
