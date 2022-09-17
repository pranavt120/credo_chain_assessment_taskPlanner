package com.taskplaner.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.taskplaner.entities.History;

public interface HistoryRepository extends MongoRepository<History, String>{

	@Query("{taskId: ?0}")
	List<History> findAllByTaskId(String id);
}
