package org.cyb.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.cyb.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;

@Controller
public class Login {
	
	@Autowired
	LoginDao logindao;
	@RequestMapping("/Login")
	String loginMethod(HttpServletRequest request)
	{
	
		String s1=request.getParameter("uname");
		String s2=request.getParameter("password");
		
		String message="";
		
		try {
			if(logindao.validate(s1, s2))
				message="Welcome";
			else
				message="failed";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return message;
	}

}
