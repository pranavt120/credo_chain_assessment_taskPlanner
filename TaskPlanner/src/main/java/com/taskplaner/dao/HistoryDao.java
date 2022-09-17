package com.taskplaner.dao;

import java.util.Date;

public class HistoryDao {
	
	
	private String task_id;
	private String title;
	private String description;
	private String status;
	private Date updatedOn;
	
	public HistoryDao() {}

	public HistoryDao(String task_id, String title, String description, String status, Date updatedOn) {
		super();
		this.task_id = task_id;
		this.title = title;
		this.description = description;
		this.status = status;
		this.updatedOn = updatedOn;
	}

	public String getTask_id() {
		return task_id;
	}

	public void setTask_id(String task_id) {
		this.task_id = task_id;
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
	
	

}
