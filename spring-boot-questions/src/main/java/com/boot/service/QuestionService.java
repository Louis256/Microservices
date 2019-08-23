package com.boot.service;



import java.util.Map;

import com.boot.domain.Question;

public interface QuestionService {
	Question selectQuestionById(Integer questionId);
	void deleteQuestionById(Integer questionId);
	
	void createQuestion(Question question);
	
	void updateQuestion(Question question);
	
	Map<String, Object> findQuestion(Integer questionId);
	
	Map<String, Object> findAllQuestions();

	

}
