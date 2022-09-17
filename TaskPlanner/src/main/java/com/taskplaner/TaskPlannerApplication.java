package com.taskplaner;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Bean;

import com.taskplaner.entities.TaskEntity;
import com.taskplaner.repository.taskRepository;
import com.taskplaner.service.TasksServiceImpl;

@SpringBootApplication

public class TaskPlannerApplication {
	
	@Autowired
	taskRepository repository;
	
	
	@Bean
	public ModelMapper modelMapperBean() {
		return new ModelMapper();
	}
	
	@Bean 
	public TasksServiceImpl taskServiceImplBean() {
		return new TasksServiceImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(TaskPlannerApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		
//		TaskEntity t1 = new TaskEntity("play","Play","play","play", new Date(), 0);
//		
//		repository.save(t1);
//		
//	}

}
