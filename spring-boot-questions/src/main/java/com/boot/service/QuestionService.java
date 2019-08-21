package com.boot.service;



import java.util.Map;

import com.boot.domain.Question;

public interface QuestionService {
	Question selectQuestionById(Integer questionId);
	void deleteQuestionById(Integer questionId);
	
	void createPost(Question question);
	
	
	
	void updatePost(Question question);
	
	
	
	Map<String, Object> findAllQuestions();

	

}
