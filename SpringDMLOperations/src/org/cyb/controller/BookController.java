package org.cyb.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.cyb.dao.BookDao;
import org.cyb.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	@Autowired
	BookDao bdo;
	@Autowired
	Book book;
	@RequestMapping(value="/insertBook", method=RequestMethod.POST)
	ModelAndView insertBook(HttpServletRequest request) throws SQLException
	{
		
		book.setBookId(Integer.parseInt(request.getParameter("bookid")));
		book.setBookName(request.getParameter("bookname"));
		book.setAuthor(request.getParameter("bookauthor"));
		
		boolean res=bdo.insertData(book);
		
		if(res)
		{
			String message="Book inserted";
			return new ModelAndView("success","message",message);
			
			
		}
		
		else
		{
			String message="Insertion Failed";
			return new ModelAndView("failed","message",message);
		}
		
		
	}

}
