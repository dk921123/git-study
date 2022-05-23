package com.boardexample.mapper;

import java.util.List;

import com.boardexample.domain.BoardVO;
import com.boardexample.domain.Criteria;

public interface BoardMapper {
	
	public int getTotalCount();
	
	public List<BoardVO> selectBoardList(Criteria cri);
	
	public BoardVO selectBoard(int bno);
	
	public int insertBoard(BoardVO boardVO);
	
	public boolean updateBoard(BoardVO boardVO);
	
	public boolean deleteBoard(int bno);
	
}
