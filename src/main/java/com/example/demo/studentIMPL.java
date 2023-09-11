package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentIMPL implements studentservice
{
	@Autowired
	studentrepo repo;

	@Override
	public void savestudent(Student stud) 
	{
		repo.save(stud);
		
	}

	@Override
	public List<Student> getAllStudents() {
		
		return repo.findAll();
		
	}

	@Override
	public void deletestud(int id) {
		
		repo.deleteById(id);
		
	}

	@Override
	public Student getstudent(int id) {
		
		Student s = repo.getById(id);
		
		return s;
	}

	
	
	
}
