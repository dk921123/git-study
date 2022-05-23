package com.boardexample.service;

import java.util.List;

import org.apache.ibatis.annotations.AutomapConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boardexample.domain.BoardVO;
import com.boardexample.domain.Criteria;
import com.boardexample.domain.PageDTO;
import com.boardexample.mapper.BoardMapper;

import lombok.extern.log4j.Log4j;

@Service
public class BoardServiceImpl implements BoardService{
	
	private BoardMapper boardMapper;
	
	@Autowired
	public BoardServiceImpl(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}

	@Override
	public PageDTO selectBoardList(Criteria cri) {
		
		return new PageDTO(boardMapper.getTotalCount(), boardMapper.selectBoardList(cri));
	}

	@Override
	public BoardVO selectBoard(int bno) {

		return boardMapper.selectBoard(bno);
	}

	@Override
	public int insertBoard(BoardVO boardVO) {
		
		return boardMapper.insertBoard(boardVO);
	}

	@Override
	public boolean updateBoard(BoardVO boardVO) {
	
		return boardMapper.updateBoard(boardVO);
	}

	@Override
	public boolean deleteBoard(int bno) {
		
		return boardMapper.deleteBoard(bno);
	}
	
	

}
