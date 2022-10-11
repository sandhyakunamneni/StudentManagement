package com.seleniumexpress.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages="com.seleniumexpress")
public class ApplicationConfigurer implements WebMvcConfigurer {
	@Bean
	InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	@Bean
  DataSource getDataSource()
  {
      String url="jdbc:mysql://localhost:3306/School-schema";
              String userName="root";
          String password="vidya1311";
          DriverManagerDataSource dataSource= new DriverManagerDataSource(url,userName,password);
      dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
              return dataSource;

  }
	@Bean
	  JdbcTemplate getJdbcTemplate()
	  {
	    JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
	    return jdbcTemplate;

	  }
	

}
