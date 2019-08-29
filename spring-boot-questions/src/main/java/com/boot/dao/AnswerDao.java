package com.boot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.boot.domain.Answer;
import com.boot.domain.Course;


@Mapper
public interface AnswerDao {
	
	public void save(Answer answer);
	
	public void delete(Long answerId);
	
	public void update(Answer answer);
	
	public Answer find(Long answerId);
	
	public List<Answer> findAll();

}
