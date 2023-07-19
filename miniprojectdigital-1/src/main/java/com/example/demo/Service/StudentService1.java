package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.StudentDemo1;
import com.example.demo.Repository.StudentRepo1;
@Service
public class StudentService1 {
	@Autowired //extends another class
    StudentRepo1 stRepo1; //reference variable
	
	public StudentDemo1 savedetails(StudentDemo1 e) {
		return stRepo1.save(e);
	}
	public List <StudentDemo1>getDetails()

{
		return stRepo1.findAll();
		
}
	public StudentDemo1 updatedetails(StudentDemo1 f)
	{
		return stRepo1.saveAndFlush(f);
	}
	
	public void deleteDetails(int id)
	{
		stRepo1.deleteById(id);
	}
}