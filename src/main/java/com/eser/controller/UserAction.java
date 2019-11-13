package com.eser.controller;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
 
public class UserAction extends ActionSupport{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
    public String execute() throws Exception {
		// HttpServletRequest request = ServletActionContext.getRequest(); //若使用request，重定向后，前端页面无法获得后台传值；
		ServletContext servletContext = ServletActionContext.getServletContext();
		servletContext.setAttribute("uid", "1");
		servletContext.setAttribute("uname", "eserleung");

        return "SUCCESS";
    }
}
