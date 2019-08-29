package com.boot.domain;

import java.sql.Timestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.mysql.jdbc.Clob;

public class Answer {
	@Id
	@GeneratedValue
	private Long answerId;
	private Integer userId;
	private Integer courseId;
	private Clob answerData;
	private Timestamp createdDate;
	
	
	public Long getAnswerId() {
		return answerId;
	}
	public void setAnswerId(Long answerId) {
		this.answerId = answerId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public Clob getAnswerData() {
		return answerData;
	}
	public void setAnswerData(Clob answerData) {
		this.answerData = answerData;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	
	

}
