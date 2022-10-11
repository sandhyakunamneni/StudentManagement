package com.seleniumexpress.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	
	    protected Class<?>[] getRootConfigClasses() {
	        return new Class[0];
	    }

	    protected Class<?>[] getServletConfigClasses() {
	        Class[] configFiles ={ApplicationConfigurer.class};
	        return configFiles;
	    }

	    protected String[] getServletMappings() {

	        String[] mappings = {"/"};
	        return mappings;
	    }
	

}
