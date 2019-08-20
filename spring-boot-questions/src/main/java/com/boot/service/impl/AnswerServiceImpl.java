package com.boot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.boot.dao.AnswerDao;
import com.boot.domain.Answer;
import com.boot.service.AnswerService;


@Service
public class AnswerServiceImpl implements AnswerService{
    @Autowired  
    private AnswerDao answerDao;  
    
    @Override
    public Answer insertAnswerById(Integer answerId) {
    	return answerDao.insertAnswerById(answerId);
         
    }
    
    

}
