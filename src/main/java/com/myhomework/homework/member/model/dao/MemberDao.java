package com.myhomework.homework.member.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myhomework.homework.member.model.vo.Member;

@Repository("memberDao")
public class MemberDao {
	
	@Autowired
	SqlSession sqlsession;
	
	public int signUp(Member m) throws Exception {
		return sqlsession.insert("signUp", m);
	}
}
