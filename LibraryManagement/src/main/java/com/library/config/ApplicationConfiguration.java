package com.library.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.library.controller","com.library.daoimplementation","com.library.daointerface","com.library.pojo","com.library.service"})

public class ApplicationConfiguration implements WebMvcConfigurer {
	
	//to connect with mysql, we need datasource and jdbctemplate
	
	@Bean
	public DataSource datasource()
	{
		DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/java11");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("root1");
		return driverManagerDataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource datasource)
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate(datasource);
		return jdbcTemplate;
	}
	
	@Bean
	public ViewResolver viewResolver()
	{
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		//vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		return vr;
	}
	
	

	
	/*public void addResourceHandlers(ResourceHandlerRegistry registry) {
	     
	       registry.addResourceHandler("/resources/**")
	       .addResourceLocations("/resources/");
	      
	     }*/

}
