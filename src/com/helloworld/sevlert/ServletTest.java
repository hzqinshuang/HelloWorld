package com.helloworld.sevlert;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTest
 */
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String message;

	  public void init() throws ServletException
	  {
	      // 执行必需的初始化
	      message = "Hello World!!!!!!";
	  }

	  public void doGet(HttpServletRequest request,
	                    HttpServletResponse response)
	            throws ServletException, IOException
	  {
		  response.setContentType("text/html;charset=utf-8");          
	      /* 设置响应头允许ajax跨域访问 */  
	      response.setHeader("Access-Control-Allow-Origin", "*");  
	      /* 星号表示所有的异域请求都可以接受， */  
	      response.setHeader("Access-Control-Allow-Methods", "GET,POST");  
	     
	      //获取微信小程序get的参数值并打印
	      String username = request.getParameter("username");
	      String password = request.getParameter("password");
	      System.out.println("username="+username+" ,password="+password);
	      
	      //返回值给微信小程序
	      Writer out = response.getWriter(); 
	      out.write("HelloWorld!");
	      out.flush();   
	  }
	  
	  public void destroy()
	  {
	      // 什么也不做
	  }

	  
	 
}
