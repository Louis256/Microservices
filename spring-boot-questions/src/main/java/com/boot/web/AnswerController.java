package com.boot.web;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.domain.Answer;
import com.boot.domain.Course;
import com.boot.service.AnswerService;


@RestController
public class AnswerController {
	@Autowired 
	private AnswerService answerService;  	
	
		/*
		 * Create a new answer
		 */
		@RequestMapping(value = "/answer/add", method = RequestMethod.POST)
		public void createAnswer(
				Model model,  @ModelAttribute("answerDao") Answer answer) {
			this.answerService.createAnswer(answer);
			//return "redirect:/posts";
		}
		
		/*
		 * Delete a answer
		 */
		@RequestMapping(value = "/answer/delete/{answerId}", method = RequestMethod.DELETE)
		public void deleteAnswer(@PathVariable("answerId") Long answerId) {
			this.answerService.deleteAnswer(answerId);
			//return "redirect:/posts";
		}
		
		/*
		 * Update a answer
		 */
		@RequestMapping(value = "/answer/update/{answerId}", method = RequestMethod.PUT)
		public void updateAnswer(@Valid @ModelAttribute("answerId") Answer answer) {			 
			this.answerService.updateAnswer(answer);
			//return "redirect:/posts";
		}
		
		/*
		 * List all answers
		 */
		@RequestMapping(value = "/answers/all", method = RequestMethod.GET)
		public Map<String, Object> listAllAnswers(Model model) {			
			Map<String, Object> attributes = this.answerService.findAllAnswers();
			model.addAllAttributes(attributes);
			return answerService.findAllAnswers();
			//return "post-index";
		}
		
		/*
		 * Display answer details
		 */
		@RequestMapping(value = "/answer/{answerId}", method = RequestMethod.GET)
		public Map<String, Object> displayAnswerDetails(
				Model model, @PathVariable("answerId") Long answerId) {			
			Map<String, Object> attributes = this.answerService.findAnswer(answerId);
			model.addAllAttributes(attributes);
			return answerService.findAnswer(answerId);
			//return "post-details";
		}
}
