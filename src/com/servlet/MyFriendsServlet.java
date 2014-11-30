package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.constant.UserConstant;
import com.model.ResponseBean;
import com.model.User;

/**
 * Servlet implementation class MyFriendsServlet
 */
public class MyFriendsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyFriendsServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String studyId = request.getParameter("studyId");
		List<User> userList = new ArrayList<User>();;
		for(User u : UserConstant.userList){
			if(!u.getStudyId().equals(studyId)){
				userList.add(u);
			}
		}
		ResponseBean responseBean = new ResponseBean();
		responseBean.setSuccess(true);
		responseBean.setUserList(userList);
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write(JSON.toJSONString(responseBean));
		out.flush();
		out.close();
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
