package com.myhomework.homework.member.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.myhomework.homework.member.model.service.MemberService;
import com.myhomework.homework.member.model.vo.Member;

@Controller
@SessionAttributes("msg")
public class MemberController {
	@Autowired
	MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("접속 성공", locale);
		return "index";
	}
	
	@RequestMapping(value ="signUp", method= RequestMethod.POST)
	public String signUp(Member m, Model model) {
		logger.info("signUp 메소드 진입");		
		int result = -1;
		try {
			result = memberService.signUp(m);
			if(result == 1) {
				model.addAttribute("msg", "회원가입 성공");
			} else {
				model.addAttribute("msg", "회원가입 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("msg", "회원가입 과정에서 오류 발생");
		} 
		return "redirect:/";
	}

}
