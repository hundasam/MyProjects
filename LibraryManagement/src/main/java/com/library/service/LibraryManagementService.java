package com.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.library.daoimplementation.DAOImpl;

import com.library.pojo.Books;
import com.library.pojo.Login;
import com.library.pojo.SignUp;

@Component
public class LibraryManagementService {
	
	@Autowired
	DAOImpl daoImpl; 
	
	
	public boolean findUser(String userName, String password)
	{
		List<Login> loginList=daoImpl.readLoginData();
		for(Login login:loginList)
		{
			if(login.getUserName().equals(userName)&&login.getPassword().equals(password))
			{
				return true;
			}					
		}
		return false;	
	}
	
	//add details to the sign up table and login table
	
	public void addUser(SignUp signUp)
	{
		daoImpl.addSignUpDetails(signUp);	
	}
	
	public List showBooks()
	{
	List<Books> listOfBooks=daoImpl.readDataToShowBooks();
		return listOfBooks;
	}
	
	
	public String displayBookName(int bookId)
	{
		String bookName=daoImpl.displayBookName(bookId);
		return bookName;
	}	

}
