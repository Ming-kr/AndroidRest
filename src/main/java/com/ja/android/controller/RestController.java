package com.ja.android.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ja.android.mapper.Mapper;
import com.ja.android.mapper.RecodeVO;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	Mapper mapper;
	
	@RequestMapping("/insertRecode")
	public void insertRecode(RecodeVO vo) {
		mapper.insert(vo);
	}

	@RequestMapping("/getRecodeList")
	public ArrayList<RecodeVO> getRecodeList() {
		
		return mapper.select();
	}
	
	
}
