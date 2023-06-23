package com.example.board3.service;

import java.util.List;

import com.example.board3.dto.BoardDTO;

public interface BoardService1 {
	public int maxNum() throws Exception;
	// 최대 num을 구하는 메소드

	public void insertDate(BoardDTO board) throws Exception;
	// BoardDTO에서 값을 받아서 쿼리문에 다시 값을 넘겨주는 메소드

	public int getDataCount(String searchKey, String searchValue) throws Exception;

	public List<BoardDTO> getLists(String searchKey, String searchValue, int start, int end) throws Exception;
	// dto에서 값을 받아서 리스트로 만든다.

	public void updateHitCount(int num) throws Exception;

	public BoardDTO getReadData(int num) throws Exception;
	
	public void updateData(BoardDTO board) throws Exception;

	public void deleteData(int num) throws Exception;
}
