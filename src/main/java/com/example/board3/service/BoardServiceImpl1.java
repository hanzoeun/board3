package com.example.board3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.board3.dao.BoardDao1;
import com.example.board3.dto.BoardDTO;

// 데이터에서 직접 값을 요청을 받으면 메소드를 실행시켜서 값을 받아오게한다. 
@Service
public class BoardServiceImpl1 implements BoardService1 {
	@Autowired
	private BoardDao1 dao;
	
	
	
	@Override
	public int maxNum() throws Exception {
		return dao.maxNum();
	}

	@Override
	public void insertDate(BoardDTO board) throws Exception {
		dao.insertDate(board);
		
	}

	@Override
	public int getDataCount(String searchKey, String searchValue) throws Exception {
		return dao.getDataCount(searchKey, searchValue);
	}

	@Override
	public List<BoardDTO> getLists(String searchKey, String searchValue, int start, int end) throws Exception {
		return dao.getLists(searchKey, searchValue, start, end);
	}

	@Override
	public void updateHitCount(int num) throws Exception {
		dao.updateHitCount(num);
	}

	@Override
	public BoardDTO getReadData(int num) throws Exception {
		return dao.getReadData(num);
	}

	@Override
	public void updateData(BoardDTO board) throws Exception {
		dao.updateData(board);
		
	}

	@Override
	public void deleteData(int num) throws Exception {
		dao.deleteData(num);
	}
	

}
