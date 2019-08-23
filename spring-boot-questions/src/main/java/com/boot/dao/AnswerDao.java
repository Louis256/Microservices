package com.boot.dao;

import org.apache.ibatis.annotations.Mapper;

import com.boot.domain.Answer;


@Mapper
public interface AnswerDao {
	public Answer insertAnswerById(Integer answerId);  

}
