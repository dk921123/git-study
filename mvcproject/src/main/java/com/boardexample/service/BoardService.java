package com.boardexample.service;

import java.util.List;

import com.boardexample.domain.BoardVO;
import com.boardexample.domain.Criteria;
import com.boardexample.domain.PageDTO;

public interface BoardService {
	
	public PageDTO selectBoardList(Criteria cri);
	
	public BoardVO selectBoard(int bno);
	
	public int insertBoard(BoardVO boardVO);
	
	public boolean updateBoard(BoardVO boardVO);
	
	public boolean deleteBoard(int bno);
}
