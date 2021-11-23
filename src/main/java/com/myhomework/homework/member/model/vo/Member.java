package com.myhomework.homework.member.model.vo;

public class Member {
	private static final long serialVersionUID = 1111L;

//	MEMBER_ID        NOT NULL VARCHAR2(30)  
//	MEMBER_PWD       NOT NULL VARCHAR2(100) 
//	MEMBER_NM        NOT NULL VARCHAR2(15)  
//	MEMBER_ENROLL_DT          DATE    

	private String id;
	private String pwd;
	private String name;
	private String enroll;

	public Member() {
	}

	public Member(String id, String pwd, String name) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}

	public Member(String id, String pwd, String name, String enroll) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.enroll = enroll;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnroll() {
		return enroll;
	}

	public void setEnroll(String enroll) {
		this.enroll = enroll;
	}

}
