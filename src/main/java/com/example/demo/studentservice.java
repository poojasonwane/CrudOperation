package com.example.demo;

import java.util.List;

public interface studentservice 
{
	void savestudent(Student stud);
	
	List<Student> getAllStudents();
	
	void deletestud(int id);
	
	Student getstudent(int id);

}
