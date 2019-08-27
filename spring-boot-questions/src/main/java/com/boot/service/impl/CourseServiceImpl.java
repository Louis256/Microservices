package com.boot.service.impl;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boot.dao.CourseDao;
import com.boot.domain.Course;
import com.boot.service.CourseService;

@Service("courseService")
@Transactional
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseDao courseDao;

	@Override
	public void createCourse(Course course) {
		course.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		course.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		this.courseDao.save(course);
	}

	@Override
	public void deleteCourse(Long courseId) {
		this.courseDao.delete(courseId);
	}

	@Override
	public void updateCourse(Course course) {
		course.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		this.courseDao.update(course);
	}
	
	@Override
	public Map<String, Object> findCourse(Long courseId) {
		Map<String, Object> attributes = new HashMap<>();
		Course course = this.courseDao.find(courseId);
		attributes.put("course", course);
		return attributes;
	}
	
	@Override
	public Map<String, Object> findAllCourses() {
		Map<String, Object> attributes = new HashMap<>();
		List<Course> allCourses = this.courseDao.findAll();
		// all posts
		attributes.put("courses", allCourses);
		// provide a new data transfer object
		attributes.put("courseDao", new Course());
		return attributes;
	}
	

}
