package com.boot.web;

import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.domain.Course;
import com.boot.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	//public static final Logger logger = LoggerFactory.getLogger(CourseController.class);
	
	/*
	 * Create a new course
	 */
	@RequestMapping(value = "/course/add", method = RequestMethod.POST)
	public void createCourse(
			Model model,  @ModelAttribute("courseDao") Course course) {
		//logger.info("Creating course >> " + course);
		this.courseService.createCourse(course);
		//return "redirect:/posts";
	}
	
	/*
	 * Delete a course
	 */
	@RequestMapping(value = "/course/delete/{courseId}", method = RequestMethod.DELETE)
	public void deleteCourse(@PathVariable("courseId") Long courseId) {
		//logger.info("Deleting course id:" + courseId);
		this.courseService.deleteCourse(courseId);
		//return "redirect:/posts";
	}
	
	/*
	 * Update a course
	 */
	@RequestMapping(value = "/course/update/{courseId}", method = RequestMethod.PUT)
	public void updateCourse(@Valid @ModelAttribute("courseId") Course course) {
		//logger.info("Updating course >> " + course) 
		this.courseService.updateCourse(course);
		//return "redirect:/posts";
	}
	
	/*
	 * List all courses
	 */
	@RequestMapping(value = "/courses/all", method = RequestMethod.GET)
	public Map<String, Object> listAllCourses(Model model) {
		//logger.info("Listing all courses...");
		Map<String, Object> attributes = this.courseService.findAllCourses();
		model.addAllAttributes(attributes);
		return courseService.findAllCourses();
		//return "post-index";
	}
	
	/*
	 * Display course details
	 */
	@RequestMapping(value = "/course/{courseId}", method = RequestMethod.GET)
	public Map<String, Object> displayCourseDetails(
			Model model, @PathVariable("courseId") Long courseId) {
		//logger.info("Displaying course details >> courseId: " + courseId);
		Map<String, Object> attributes = this.courseService.findCourse(courseId);
		model.addAllAttributes(attributes);
		return courseService.findCourse(courseId);
		//return "post-details";
	}

}
