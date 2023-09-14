package com.hcl.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.pojo.Tmpojo;
import com.hcl.repository.TaskRepository;
@Service
public class TaskService {
	@Autowired
	TaskRepository trepo;
//--Adding task-->
	public String addTask(Tmpojo tm) {
		trepo.save(tm);
		return "Sucessfully Task is added";
	}
//----Deleting by task id---->
	public String deleteTaskById(int tid)
	{
		boolean sts = trepo.existsById(tid);
		System.out.println(tid);
		if(sts==true)
		{
			trepo.deleteById(tid);
			return "Task deleted Successfully";
		}
		else
		{
			System.out.println("Task does not exists with Id: "+tid);
			return null;
		}
	}
//---Updating by task Id---->
	public Tmpojo updateTaskById(Tmpojo b)
	{
		Tmpojo existingTask=searchTaskById(b.getTid());
		if(existingTask!=null)
		{
			trepo.save(b);
			return b;
		}
		else
		{
			System.out.println("Task does not exists with Id: "+b.getTid());
			return null;
		}
	}
//----Display all task---->
	public List<Tmpojo> getAllTasks()
	{
		return (List<Tmpojo>) trepo.findAll();
	}
//----Searching task with id----->
	public Tmpojo searchTaskById(int tid)
	{
		Optional<Tmpojo> op=trepo.findById(tid);
		try
		{
			Tmpojo b=op.get();
			return b;
		}
		catch(NoSuchElementException ex)
		{
			return null;
		}
	}

}
