package com.boot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boot.dao.QuestionDao;
import com.boot.domain.Question;
import com.boot.service.QuestionService;

@Service("questionService")
@Transactional
public class QuestionServiceImpl implements QuestionService{
    @Autowired  
    private QuestionDao questionDao;  
    
    @Override
    public Question selectQuestionById(Integer questionId) {
        return questionDao.selectQuestionById(questionId);  
    }
    
    @Override
    public void deleteQuestionById(Integer questionId) {
         questionDao.deleteQuestionById(questionId);  
    }
    
    @Override
	public void createPost(Question question) {
		
		this.questionDao.save(question);
	}
    
    @Override
	public void updatePost(Question question) {
		this.questionDao.update(question);
	}
	
 
	@Override
	public Map<String, Object> findAllQuestions() {
		Map<String, Object> attributes = new HashMap<>();
		List<Question> allQuestions = this.questionDao.findAll();
		// all posts
		attributes.put("questions", allQuestions);
		// provide a new data transfer object
		attributes.put("questionDao", new Question());
		return attributes;
	}
    

}
