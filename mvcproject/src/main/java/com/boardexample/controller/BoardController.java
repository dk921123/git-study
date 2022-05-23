package com.boardexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boardexample.domain.BoardVO;
import com.boardexample.domain.Criteria;
import com.boardexample.domain.PageDTO;
import com.boardexample.service.BoardService;


@CrossOrigin
@RestController
public class BoardController {
	
	private BoardService boardService;
	
	@Autowired
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@GetMapping(value = "/board/list/{pageNum}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<PageDTO> getBoardList(@PathVariable("pageNum") int pageNum){
		
		Criteria cri = new Criteria(pageNum, 10);
		return new ResponseEntity<>(boardService.selectBoardList(cri), HttpStatus.OK);
	}
	
	@GetMapping(value = "/board/{bno}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<BoardVO> getBoard(@PathVariable("bno") int bno) {
	
		return new ResponseEntity<>( boardService.selectBoard(bno), HttpStatus.OK);
	}
	
	@PostMapping(value= "/board",
			consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
			produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<Integer> registerBoard(@RequestBody BoardVO boardVO) {
		
		return boardService.insertBoard(boardVO) > 0 
				? new ResponseEntity<>(boardVO.getBno(), HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PatchMapping(value = "/board/{bno}", 
			consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
			produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> modifyBoard(@PathVariable("bno") int bno, @RequestBody BoardVO boardVO) {
		//boardVO.setBno(bno);
		return boardService.updateBoard(boardVO) == true 
				? new ResponseEntity<>("SUCCESS", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

	@DeleteMapping(value = "/board/{bno}", produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> deleteBoard(@PathVariable int bno) {

		return boardService.deleteBoard(bno) == true 
				? new ResponseEntity<>("SUCCESS", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
				
	}
	

}

