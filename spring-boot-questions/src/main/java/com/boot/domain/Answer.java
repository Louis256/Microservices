package com.boot.domain;

import java.sql.Clob;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	@GeneratedValue
	private Long answerId;
	private Long userId;
	private Long courseId;
	private Clob answerData;
	private Timestamp createdDate;
	
	public Answer() {
		
	}
	public Long getAnswerId() {
		return answerId;
	}
	public void setAnswerId(Long answerId) {
		this.answerId = answerId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
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
	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", userId=" + userId + ", courseId=" + courseId + ", answerData="
				+ answerData + ", createdDate=" + createdDate + "]";
	}
	public Answer(Long userId, Long courseId, Clob answerData, Timestamp createdDate) {
		super();
		this.userId = userId;
		this.courseId = courseId;
		this.answerData = answerData;
		this.createdDate = createdDate;
	}
	
	
	

}
