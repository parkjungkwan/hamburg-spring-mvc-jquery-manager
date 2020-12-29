package snippet;

public class Snippet {
	<?xml version="1.0" encoding="UTF-8"?>
	<web-app version="3.1" xmlns="http://java.sun.com/xml/ns/javaee"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="http://java.sun.com/xml/ns/javaee https://java.sun.com/xml/ns/javaee/web-app_3_1.xsd">
	
		<!-- The definition of the Root Spring Container shared by all Servlets and Filters -->
		<context-param>
			<param-name>contextConfigLocation</param-name>
			<param-value>classpath:/META-INF/*-context.xml</param-value>
		</context-param>
		
		<!-- Creates the Spring Container shared by all Servlets and Filters -->
		<listener>
			<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
		</listener>
	
		<!-- Processes application requests -->
		<servlet>
			<servlet-name>appServlet</servlet-name>
			<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
			<init-param>
				<param-name>contextConfigLocation</param-name>
				<param-value>classpath:/META-INF/*-context.xml</param-value>
			</init-param>
			<load-on-startup>1</load-on-startup>
		</servlet>
			
		<servlet-mapping>
			<servlet-name>appServlet</servlet-name>
			<url-pattern>/</url-pattern>
		</servlet-mapping>
		<!-- UTF-8 관련 파라미터 설정 -->
		<filter>
		    <filter-name>encodingFilterUTF8</filter-name>
		    <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
		    <init-param>
		        <param-name>encoding</param-name>
		        <param-value>UTF-8</param-value>
		    </init-param>
		</filter>
		<filter-mapping>
		    <filter-name>encodingFilterUTF8</filter-name>
		    <url-pattern>/*</url-pattern>
		</filter-mapping>
	
	</web-app>
	
}

