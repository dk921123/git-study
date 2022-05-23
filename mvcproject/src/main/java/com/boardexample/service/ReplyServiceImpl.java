package com.boardexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boardexample.domain.ReplyVO;
import com.boardexample.mapper.ReplyMapper;

@Service
public class ReplyServiceImpl implements ReplyService{
	
	private ReplyMapper replyMapper;
	
	@Autowired
	public ReplyServiceImpl(ReplyMapper replyMapper) {
		this.replyMapper = replyMapper;
	}
	
	
	@Override
	public List<ReplyVO> selectReplyList(int bno) {
		
		return replyMapper.selectReplyList(bno);
	}

	@Override
	public ReplyVO selectReply(int rno) {
		return replyMapper.selectReply(rno);
	}

	@Override
	public int insertReply(ReplyVO replyVO) {
		return replyMapper.insertReply(replyVO);
	}

	@Override
	public boolean updateReply(ReplyVO replyVO) {
		return replyMapper.updateReply(replyVO);
	}

	@Override
	public boolean deleteReply(int rno) {
		return replyMapper.deleteReply(rno);
	}

}
