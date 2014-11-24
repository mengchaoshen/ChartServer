package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.constant.UserConstant;
import com.model.ResponseBean;
import com.model.User;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String studyId = request.getParameter("studyId");
		String password = request.getParameter("password");
		Map<String, User> userMap = UserConstant.map;
		User user = userMap.get(studyId);
		PrintWriter out = response.getWriter();
		ResponseBean responseBean = new ResponseBean();
		
		
		if(null == user){
			responseBean.setSuccess(true);
			responseBean.setCorrect(false);
		}else{
			responseBean.setSuccess(true);
			responseBean.setCorrect(true);
		}
		out.write(JSON.toJSONString(responseBean));
		out.flush();
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
