package com.boot.service;

import java.util.Map;

import com.boot.domain.Course;

public interface CourseService {
	
	void createCourse(Course course);
	
	void deleteCourse(Long courseId);
	
	void updateCourse(Course course);
	
	Map<String, Object> findCourse(Long courseId);
	
	Map<String, Object> findAllCourses();

}
