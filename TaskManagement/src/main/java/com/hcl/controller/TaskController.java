package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.pojo.Tmpojo;
import com.hcl.service.TaskService;
@RestController

public class TaskController {
	@Autowired
	TaskService taskserv;
//----Adding Task--->
//---http://localhost:8080/task/add
	@PostMapping("/add")
	public String addTask(@RequestBody Tmpojo tm)
	{
		return taskserv.addTask(tm);
	}
	
//----Deleting Task--->
//http://localhost:8080/task/taskid/2
	@DeleteMapping("/delete/{tid}")
	public String deleteTaskById(@PathVariable int tid)
	{
		return taskserv.deleteTaskById(tid);
	}
//----Updating Task--->
//http://localhost:8080/Task/update
@PutMapping("/update/{tid}") //tid,tname,tuser,tstatus
public Tmpojo updateTaskById(@RequestBody Tmpojo b)
{
	return taskserv.updateTaskById(b);
}

//----Display all task--->
//http://localhost:8080/task/getAll
@GetMapping("/getAll")
public List<Tmpojo> getAllTask()
{
	return taskserv.getAllTasks();
}
//----Search by Id task--->
//http://localhost:8080/Task/tid/2
@GetMapping("/tid/{id}")
public Tmpojo serachBookingById(@PathVariable int id)
{
	return taskserv.searchTaskById(id);
}
}
