package com.boot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.domain.Question;
import com.boot.domain.User;
import com.boot.service.QuestionService;

@Controller
@RequestMapping("/test")
public class QuestionController {
	@Autowired 
	private QuestionService questionService;  
	int questionId = 1;
	@RequestMapping(value = "")
	public String getIndex(Model model){   
		
		Question question = questionService.selectQuestionById(questionId);         
        model.addAttribute("question", question);   
		
		//Question image = questionService.selectImageById(questionId);
		//model.addAttribute("question", question);		
		//model.addAttribute("image",image);
        return "test";   
		
    } 
/**	
	@RequestMapping("show") 
	public ResponseEntity showPhotos(String fileName){ 
		try { 
		return ResponseEntity.ok(resourceLoader.getResource("file:" + path + fileName)); 
		} catch (Exception e) { 
			return ResponseEntity.notFound().build(); } 
	}
		
	*/	
	
	
}
