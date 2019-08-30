package com.boot.service;

import java.util.Map;
import com.boot.domain.Answer;

public interface AnswerService {
	
	void createAnswer(Answer answer);
	
	void deleteAnswer(Long answerId);
	
	void updateAnswer(Answer answer);
	
	Map<String, Object> findAnswer(Long answerId);
	
	Map<String, Object> findAllAnswers();
	
}
