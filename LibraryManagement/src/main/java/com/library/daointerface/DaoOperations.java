package com.library.daointerface;

import java.util.List;

import com.library.pojo.SignUp;

public interface DaoOperations {
	//select * from table
	public List readLoginData();
	//insert into table
	public void addSignUpDetails(SignUp signUp);
	
	public String displayBookName(int bookId);
	public List readDataToShowBooks();
	

}
