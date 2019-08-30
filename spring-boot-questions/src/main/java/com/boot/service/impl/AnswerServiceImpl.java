package com.boot.service.impl;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boot.dao.AnswerDao;
import com.boot.domain.Answer;
import com.boot.service.AnswerService;


@Service("answerService")
@Transactional
public class AnswerServiceImpl implements AnswerService{
    @Autowired  
    private AnswerDao answerDao;  
    
    @Override
	public void createAnswer(Answer answer) {
    	answer.setCreatedDate(new Timestamp(System.currentTimeMillis()));    	
		this.answerDao.save(answer);
	}

	@Override
	public void deleteAnswer(Long answerId) {
		this.answerDao.delete(answerId);
	}

	@Override
	public void updateAnswer(Answer answer) {
		
		this.answerDao.update(answer);
	}
	
	@Override
	public Map<String, Object> findAnswer(Long answerId) {
		Map<String, Object> attributes = new HashMap<>();
		Answer answer = this.answerDao.find(answerId);
		attributes.put("answer", answer);
		return attributes;
	}
	
	@Override
	public Map<String, Object> findAllAnswers() {
		Map<String, Object> attributes = new HashMap<>();
		List<Answer> allAnswers = this.answerDao.findAll();
		// all posts
		attributes.put("answers", allAnswers);
		// provide a new data transfer object
		attributes.put("answerDao", new Answer());
		return attributes;
	}
    
    
    

}
