package com.Lucifer.TaskSubmissionService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient(name = "TASK-SUBMISSION-SERVICE",url = "http://localhost:8082")
public interface TaskService {
	 @GetMapping("/api/tasks/{id}")
	    public Task getTaskById(@PathVariable Long id,@RequestHeader("Authorization") String jwt) throws Exception; 
	 
	 @PutMapping("/api/tasks/{id}/complete")
	    public Task completeTask(@PathVariable Long id) throws Exception;
}
