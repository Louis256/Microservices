package com.boot.dao;

import org.apache.ibatis.annotations.Mapper;

import com.boot.domain.Question;

@Mapper
public interface QuestionDao {
	public Question selectQuestionById(Integer questionId);  
	public Question selectImageById(Integer questionId);  
	

}
