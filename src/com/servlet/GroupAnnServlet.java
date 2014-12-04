package com.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.constant.GlobConstant;
import com.model.AnnounJson;
import com.model.Announcement;
import com.util.FileUtil;

public class GroupAnnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GroupAnnServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		File path = new File(GlobConstant.PATH);
		File[] fileList = path.listFiles();
		String json = null;
		List<Announcement> announList = new ArrayList<Announcement>();
		Announcement announcement = null;
		for(File f : fileList){
			json = FileUtil.txt2String(f);
			System.out.println(json);
			announcement = JSON.parseObject(json, Announcement.class);
			announList.add(announcement);
		}
		AnnounJson announJson = new AnnounJson();
		announJson.setAnnList(announList);
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write(JSON.toJSONString(announJson));
		out.flush();
		out.close();
		
	}

}
