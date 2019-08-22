package com.boot.web;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.domain.Question;
import com.boot.service.QuestionService;

@RestController
public class QuestionController {
	@Autowired 
	private QuestionService questionService;  
	int questionId = 1;
	
	
	@RequestMapping(value = "/test")
	public String getIndex(Model model){   		
		Question question = questionService.selectQuestionById(questionId);
        //User user = userService.selectUserById(1);  
        //model.addAttribute("user", user);   
		
		//Question image = questionService.selectImageById(questionId);
		model.addAttribute("question", question);		
		//model.addAttribute("image",image);
        return "test";   
		
    } 
	@GetMapping("/test/questions1111")
	public Map<String, Object> retrieveAllQuestions() {
		return questionService.findAllQuestions();
	}

	
	/*
	 * Create a new question
	 */
	
	@RequestMapping(value = "/test/add", method = RequestMethod.POST)
	public void createQuestion(Model model, 
			@ModelAttribute("postQuestion") Question question) {		
		 this.questionService.createQuestion(question);		 
		//return "redirect:/test";
	}	
	/*
	 * Delete a question
	 */
	@RequestMapping(value = "/test/{questionId}", method = RequestMethod.DELETE)
	public String deleteQuestion(@PathVariable("questionId") Integer questionId) {		
		 this.questionService.deleteQuestionById(questionId);
		return "redirect:/test";
	}
	
	/*
	 * Update a question
	 */
	/**
	@RequestMapping(value = "/test", method = RequestMethod.PUT)
	public String updateQuestion(@ModelAttribute("questionDao") Question question) {		
		this.questionService.updateQuestion(question);
		return "redirect:/test";
	}
	
	@PutMapping("/test/{id}")
	public ResponseEntity<Object> updateQuestion(@RequestBody Question question, 
			@PathVariable Integer id) {

		
		question.setQuestionId(id);
		
		questionService.createQuestion(question);

		return ResponseEntity.noContent().build();
	}**/
	/*
	 * List all questions
	 */
	@RequestMapping(value = "/test/allquestions", method = RequestMethod.GET)
	public Map<String, Object> listAllQuestion(Model model) {		
		Map<String, Object> attributes = this.questionService.findAllQuestions();
		model.addAllAttributes(attributes);
		
		return questionService.findAllQuestions();
		//return "question-index";
	}
	
	/*
	 * Display question details
	 */
	@RequestMapping(value = "/test/questions/{questionId}", method = RequestMethod.GET)
	public Map<String, Object> displayQuestionDetails(Model model, @PathVariable("questionId") Integer questionId) {	
		Map<String, Object> attributes = this.questionService.findQuestion(questionId);
		model.addAllAttributes(attributes);
		
		return questionService.findQuestion(questionId);
		//return "question-details";
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
