package com.boardexample.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PageDTO {
	
	private int total;
	private List<BoardVO> List;
	
}
