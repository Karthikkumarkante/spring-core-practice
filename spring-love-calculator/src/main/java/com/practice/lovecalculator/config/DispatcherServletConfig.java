package com.practice.lovecalculator.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class DispatcherServletConfig implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
//		System.out.println("My Custom Dispatcher Servlet...");
//		AnnotationConfigWebApplicationContext webApplicationContext=new AnnotationConfigWebApplicationContext();
//		webApplicationContext.register(AppConfig.class);
//		DispatcherServlet dispatcherServlet=new DispatcherServlet(webApplicationContext);
//		ServletRegistration.Dynamic customDispatcher=servletContext.addServlet("myDispatcherServlet",dispatcherServlet);
//		customDispatcher.setLoadOnStartup(1);
//		customDispatcher.addMapping("/love.com/*","/");
		AnnotationConfigWebApplicationContext webApplicationContext=new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(AppConfig.class);
		DispatcherServlet dispatcherServlet=new DispatcherServlet(webApplicationContext);
		ServletRegistration.Dynamic servlet=servletContext.addServlet("MyDispatcher", dispatcherServlet);
		servlet.addMapping("/","/love.com/*");
		servlet.setLoadOnStartup(1);
	}

}
