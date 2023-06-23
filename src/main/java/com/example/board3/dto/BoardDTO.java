package com.example.board3.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {
	private int num;          //번호
	private String name;     //이름
	private String pwd;     //패스워드
	private String title;  //제목
	private String content;  //내용
	private int hitCount;  //조회수
	private Date created;  // 데이터생성날짜
	
}


//create table freeboard(
//num number primary key,
//name varchar2(30),
//pwd varchar2(30),
//title varchar2(50),
//content clob,
//hitcount number,
//created DATE DEFAULT sysdate,
//ipAddr varchar2(100)
//);