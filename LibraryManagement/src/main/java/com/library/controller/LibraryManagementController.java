package com.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.library.daoimplementation.DAOImpl;
import com.library.pojo.Books;
import com.library.pojo.SignUp;
import com.library.service.LibraryManagementService;

@Controller
public class LibraryManagementController {
	@Autowired
	LibraryManagementService libraryManagementService;
	
	/*this method reads the username and password from the login form and compare to the database*/
	
	@RequestMapping("/read")
	public ModelAndView readDetails(@RequestParam String userName, @RequestParam String password)
	{
		boolean findUser=libraryManagementService.findUser(userName, password);
		
		ModelAndView mv=new ModelAndView();
		if(findUser) {
			mv.addObject("userName", userName);
			mv.setViewName("userAccount");
		} else  {
			mv.setViewName("signUp");
		}
		return mv;
	}
		
	/*This method will read data from sign up page and stores in the sign up table*/
	
	@RequestMapping("/signUp")
	public ModelAndView signup(@ModelAttribute SignUp signUp)
	{
		libraryManagementService.addUser(signUp);
		return new ModelAndView("Login");
		
	}
	
	/*this method will be accessed when show books will be clicked from the account form to display list of books from books table*/
	
	@RequestMapping(value="/accountForm", params="showBookList")
	public ModelAndView showBooks()
	{
		
		ModelAndView mv=new ModelAndView();
		List<Books> listOfBooks=libraryManagementService.showBooks();
		//System.out.println(listOfBooks);
		
		mv.addObject("listOfBooks", listOfBooks);
		mv.setViewName("showBooks");
		return mv;
	}
	
	/*when mybooks button clicked it will show all books issued by the user*/
	
	@RequestMapping(value="/accountForm", params="myBooks")
	public ModelAndView myBooks()
	{
		return new ModelAndView("mybooks");
	}
	
	/*when issue book button is clicked this will search the book name according to the book id and stores data in issue table*/
	@RequestMapping(value="/accountForm", params="issueBook")
	public ModelAndView issueBook()
	{
		return new ModelAndView("issueBook");
	}
	
	@RequestMapping(value="/issueBook",params="searchBookIdButton")
	public ModelAndView displayBookName(@RequestParam int bookId)
	{
		ModelAndView mv=new ModelAndView();
		String bookName=libraryManagementService.displayBookName(bookId);
		mv.addObject("bookName", bookName);
		mv.addObject("bookId",bookId );
		mv.setViewName("issueBook");
		return mv;
		
	}
	

}
