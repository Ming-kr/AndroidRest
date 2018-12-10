package com.ja.android.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;


public interface Mapper {
	//$표시는 statement(정적)
	//#표시는 preparedStatement(동적)
	//먼저 정적으로 문자 만들고 동적으로 문자 생성...
	
	@Insert("INSERT INTO baseballrecode VALUES(seq_baseballrecode_idx.nextval,#{bbr_nick},#{bbr_content},#{bbr_trycount},#{bbr_trytime},SYSDATE)")         
	public void insert(RecodeVO vo);
	
	@Select("SELECT * FROM baseballrecode ORDER BY bbr_trytime DESC")
	public ArrayList<RecodeVO> select();
	
}
