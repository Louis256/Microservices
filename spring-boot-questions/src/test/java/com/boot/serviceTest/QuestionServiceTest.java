package com.boot.serviceTest;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.boot.baseTest.SpringTestCase;
import com.boot.domain.Question;
import com.boot.service.QuestionService;


public class QuestionServiceTest extends SpringTestCase{
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired  
    private QuestionService questionService; 
	@Test  
    public void selectQuestionByIdTest(){  
		Question question = questionService.selectQuestionById(1);
        //User user = userService.selectUserById(10);  
        logger.info("result" + question);  
    }  

}
