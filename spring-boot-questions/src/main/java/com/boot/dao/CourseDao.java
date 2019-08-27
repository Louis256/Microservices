package com.boot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.boot.domain.Course;

@Mapper
public interface CourseDao {
	public void save(Course Course);
	
	public void delete(Long courseId);
	
	public void update(Course course);
	
	public Course find(Long courseId);
	
	public List<Course> findAll();

}
