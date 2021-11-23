package com.myhomework.homework.member.model.service;

import com.myhomework.homework.member.model.vo.Member;

public interface MemberService {
	abstract public int signUp(Member m) throws Exception;
}
