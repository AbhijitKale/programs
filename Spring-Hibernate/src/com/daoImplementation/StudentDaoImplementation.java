package com.daoImplementation;


import org.springframework.orm.hibernate3.HibernateTemplate;

import com.dao.StudentDao;
import com.dto.Student;

public class StudentDaoImplementation implements StudentDao {
	
	
	HibernateTemplate template;
	
	
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  

	}
	@Override
	public void addStudent(Student s) {
		
		template.save(s);

	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
