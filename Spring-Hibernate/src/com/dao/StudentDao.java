package com.dao;

import com.dto.Student;

public interface StudentDao {
	
	public void addStudent(Student s);
	public Student getStudent(int id);
	public boolean deleteStudent(int id);

}
