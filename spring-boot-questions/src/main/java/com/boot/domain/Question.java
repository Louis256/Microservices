package com.boot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
	
	@Id
	@GeneratedValue
	private Integer questionId; 
    private String description; 
    private String a;
    private String b;
    private String c;
    private String d;
    
    
    public Question() {
	}

	public Integer getQuestionId() {  
        return questionId;  
    }  
  
    public void setQuestionId(Integer questionId) {  
        this.questionId = questionId;  
    }  
  
    public String getDescription() {  
        return description;  
    }  
  
    public void setDescription(String description) {  
        this.description = description;  
    }

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public Question(String description, String a, String b, String c, String d) {
		super();
		this.description = description;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", description=" + description + ", a=" + a + ", b=" + b + ", c="
				+ c + ", d=" + d + "]";
	}
	
	
	
	 
	

}
