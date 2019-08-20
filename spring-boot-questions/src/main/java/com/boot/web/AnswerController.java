package com.boot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.service.AnswerService;


@Controller
@RequestMapping("/test")
public class AnswerController {
	@Autowired 
	private AnswerService answerService;  
}
