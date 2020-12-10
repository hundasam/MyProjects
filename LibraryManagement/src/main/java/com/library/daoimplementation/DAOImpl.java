package com.library.daoimplementation;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.library.daointerface.DaoOperations;
import com.library.pojo.Books;
import com.library.pojo.Login;
import com.library.pojo.SignUp;

@Component
public class DAOImpl implements DaoOperations {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List readLoginData() {
		String sqlQuery="Select * from login";
		List<Login> login= jdbcTemplate.query(sqlQuery, new BeanPropertyRowMapper(Login.class));
		return login;
	}

	public void addSignUpDetails(SignUp signUp) 
	{
		String insertQuery="Insert into signup values(?,?,?,?,?)";
		jdbcTemplate.update(insertQuery, new Object[] {signUp.getName(),signUp.getAddress(),
				signUp.getPhoneNo(),signUp.getUserName(),signUp.getPassword()});
		 String loginInsertQuery="insert into login values(?,?)";
		 jdbcTemplate.update(loginInsertQuery, new Object[] {signUp.getUserName(),signUp.getPassword()});
	}
	
	//this method returns the list of books from books table when click on show books in user account form
		public List readDataToShowBooks() {
		String sql="Select * from books";
		List<Books> listOfBooks=jdbcTemplate.query(sql, new BeanPropertyRowMapper(Books.class));
		
		return listOfBooks;	
		
	}
		
		public String displayBookName(int bookId)
		{
			String selectQuery="select bookName from books where bookId=?";
			String bookName=(String)jdbcTemplate.queryForObject(selectQuery, new Object[] {bookId},String.class );
			return bookName;
		}
		


}
