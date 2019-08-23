package com.boot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.boot.domain.Question;

@Mapper
public interface QuestionDao {
	public Question selectQuestionById(Integer questionId);  

	public void deleteQuestionById(Integer questionId);  	

	public void save(Question question);
	
	public void update(Question question);
	
	//public void createQuestion(Question question);
	
	public List<Question> findAll();
	
	

}
