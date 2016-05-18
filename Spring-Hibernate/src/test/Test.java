package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daoImplementation.StudentDaoImplementation;
import com.dto.Student;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StudentDaoImplementation s=(StudentDaoImplementation)context.getBean("d");
		
		Student stu=new Student();
		stu.setId(12);
		stu.setName("radhikia");
		
		s.addStudent(stu);
	}

}
