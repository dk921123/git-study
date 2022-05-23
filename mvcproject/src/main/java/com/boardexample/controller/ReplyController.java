package com.boardexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boardexample.domain.BoardVO;
import com.boardexample.domain.ReplyVO;
import com.boardexample.service.ReplyService;

@CrossOrigin
@RestController

public class ReplyController {

	private ReplyService replyService;
	
	@Autowired
	public ReplyController(ReplyService replyService) {
		this.replyService = replyService;
	}
	
	@GetMapping(value = "/reply/{bno}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<ReplyVO>> replyList(@PathVariable("bno") int bno){
		
		return new ResponseEntity<>(replyService.selectReplyList(bno), HttpStatus.OK);
	}
	
	@PostMapping(value= "/reply", 
			consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Integer> registerReply(@RequestBody ReplyVO replyVO){
		
		return replyService.insertReply(replyVO) > 0
				? new ResponseEntity<>(replyVO.getRno(), HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

	@PutMapping(value= "reply/{rno}", 
			consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
			produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> modifyReply(@PathVariable("rno") int rno, @RequestBody ReplyVO replyVO){
		
		return replyService.updateReply(replyVO) == true 
				? new ResponseEntity<>("suseccs", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@DeleteMapping(value= "/reply/{rno}", produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> removeReply(@PathVariable("rno") int rno){
		
		return replyService.deleteReply(rno) == true 
				? new ResponseEntity<>("suseccs", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	
	
	
	
}
