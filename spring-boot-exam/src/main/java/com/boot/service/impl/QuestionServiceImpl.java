package com.boot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.QuestionDao;
import com.boot.domain.Question;
import com.boot.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{
    @Autowired  
    private QuestionDao questionDao;  
    
    @Override
    public Question selectQuestionById(Integer questionId) {
        return questionDao.selectQuestionById(questionId);  
    }
    
    @Override
    public Question selectImageById(Integer questionId) {
        return questionDao.selectImageById(questionId);  
    }

}
