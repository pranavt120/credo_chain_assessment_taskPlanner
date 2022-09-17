package com.taskplaner.service;

import java.util.List;

import com.taskplaner.dao.TaskDao;
import com.taskplaner.entities.History;
import com.taskplaner.entities.TaskEntity;

public interface TasksService {
	
	TaskEntity createTask(TaskEntity task);
	TaskEntity updateTask(TaskEntity oldTask, TaskEntity newTask);
	TaskEntity assignTask(TaskEntity task, String assignedTo);
	List<TaskEntity> searchTaskName(String name);
	TaskEntity searchTaskId(String id);
	
	List<History> history(String id);
	

}
