package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.constant.GlobConstant;
import com.model.Announcement;
import com.model.ResponseBean;
import com.util.FileUtil;

public class AnnouncementsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AnnouncementsServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String studyId = new String(request.getParameter("studyId").getBytes(
				"ISO8859-1"), "utf-8");
		String photoStr = new String(request.getParameter("photo").getBytes(
				"ISO8859-1"), "utf-8");
		String description = new String(request.getParameter("description").getBytes(
				"ISO8859-1"), "utf-8");
		String sendName = new String(request.getParameter("sendName").getBytes(
				"ISO8859-1"), "utf-8");
		String time = String.valueOf(Calendar.getInstance().getTimeInMillis());

		Announcement announcement = new Announcement();
		announcement.setDescription(description);
		announcement.setPhoto(photoStr);
		announcement.setSendName(sendName);
		announcement.setStudyId(studyId);
		announcement.setTime(time);
		
		FileUtil.String2Photo(photoStr, time);

		FileUtil.writeFile(GlobConstant.PATH, time + ".txt",
				JSON.toJSONString(announcement));
		ResponseBean responseBean = new ResponseBean();
		responseBean.setSuccess(true);
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write(JSON.toJSONString(responseBean));
		out.flush();
		out.close();
	}

}
