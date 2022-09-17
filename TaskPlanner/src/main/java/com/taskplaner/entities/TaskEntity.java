package com.taskplaner.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;




@Document("task")
public class TaskEntity {
	
	@Id
	private String id;
	private String title;
	private String description;
	private String createdBy;
	private String assignedTo;
	
	@DateTimeFormat(iso = ISO.DATE)
	private Date completedOn;
	
	private String status;
	
	public TaskEntity() {}

	public TaskEntity( String title, String description, String createdBy, String assignedTo, Date completedOn,
			String status) {
		super();
		this.title = title;
		this.description = description;
		this.createdBy = createdBy;
		this.assignedTo = assignedTo;
		this.completedOn = completedOn;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public Date getCompletedOn() {
		return completedOn;
	}

	public void setCompletedOn(Date completedOn) {
		this.completedOn = completedOn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "taskEntity [id=" + id + ", title=" + title + ", description=" + description + ", createdBy=" + createdBy
				+ ", assignedTo=" + assignedTo + ", completedOn=" + completedOn + ", status=" + status + "]";
	}
	
	

}


