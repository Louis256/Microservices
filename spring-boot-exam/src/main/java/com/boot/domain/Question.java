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
    @Lob
    private Blob image;
    
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

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}  
	

}
