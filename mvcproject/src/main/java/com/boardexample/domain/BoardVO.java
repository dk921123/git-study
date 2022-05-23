package com.boardexample.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardVO {
	
	private int bno;
	private String title;
	private String userName;
	private String content;
	private Date regDate;
	private Date updateDate;

}
