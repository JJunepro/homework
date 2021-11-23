package com.myhomework.homework.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhomework.homework.member.model.dao.MemberDao;
import com.myhomework.homework.member.model.vo.Member;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Autowired
	MemberDao memberDao;
	@Override
	public int signUp(Member m) throws Exception {
		return memberDao.signUp(m);
	}
}
