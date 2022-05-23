package com.boardexample.service;

import java.util.List;

import com.boardexample.domain.ReplyVO;

public interface ReplyService {
	
	
	public List<ReplyVO> selectReplyList(int bno);
	
	public ReplyVO selectReply(int rno);
	
	public int insertReply(ReplyVO replyVO);
	
	public boolean updateReply(ReplyVO replyVO);
	
	public boolean deleteReply(int rno);
	
}
