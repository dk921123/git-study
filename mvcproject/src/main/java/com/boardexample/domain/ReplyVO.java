package com.boardexample.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class ReplyVO {
	
	private int bno;
	private int rno;
	private String userName;
	private String reply;
	private Date regDate;
	private Date updateDate;
}
