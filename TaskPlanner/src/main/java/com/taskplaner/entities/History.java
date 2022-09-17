package com.taskplaner.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("history")
public class History {
	
	@Id
	private String id;
	private String taskId;
	private String title;
	private String description;
	private String status;
	private Date updatedOn;
	
	
	public History() {}




	public History(String id, String task_id, String title, String description, String status, Date updatedOn) {
		super();
		this.id = id;
		this.taskId = task_id;
		this.title = title;
		this.description = description;
		this.status = status;
		this.updatedOn = updatedOn;
	}
	
	




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTask_id() {
		return taskId;
	}


	public void setTask_id(String task_id) {
		this.taskId = task_id;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Date getUpdatedOn() {
		return updatedOn;
	}


	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}




	@Override
	public String toString() {
		return "History [id=" + id + ", taskId=" + taskId + ", title=" + title + ", description=" + description
				+ ", status=" + status + ", updatedOn=" + updatedOn + "]";
	}
	
	
	

}
