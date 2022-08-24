package com.rlest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rlest.domain.Member;
import com.rlest.service.MemberService;

@RestController
@RequestMapping("/api")
public class MainController {
	
	@Autowired
	MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@GetMapping("/memberList")
	public List<Member> getMemberList() throws Exception{
		
		return memberService.getMemberList();
	}
	
}
