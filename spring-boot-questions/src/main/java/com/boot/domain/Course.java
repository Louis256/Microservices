package com.boot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue
	private Integer couresId;
	private String couresName;
	
	
	public Integer getCouresId() {
		return couresId;
	}
	public void setCouresId(Integer couresId) {
		this.couresId = couresId;
	}
	public String getCouresName() {
		return couresName;
	}
	public void setCouresName(String couresName) {
		this.couresName = couresName;
	}
	
	
	
	

}
