package com.boot.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.sql.Blob;

public class Question {
	
	private Integer questionId; 
    private String description; 
    private String a;
    private String b;
    private String c;
    private String d;
    
    
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


	 
	

}
