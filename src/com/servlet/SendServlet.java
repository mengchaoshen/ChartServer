package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.constant.UserConstant;
import com.model.ChartItem;
import com.model.ResponseBean;
import com.model.User;
import com.service.SendMessage;
import com.util.BaseUtil;

/**
 * Servlet implementation class SendServlet
 */
public class SendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SendServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String text = request.getParameter("json");
		text = new String(text.getBytes(), "utf-8");
		System.out.println(text);
		String responseTxt = null;
		ChartItem chartItem = JSON.parseObject(text, ChartItem.class);
		if (null != chartItem) {
			User user = UserConstant.map.get(chartItem.getStudyId());
			if (chartItem.getChartType().equals("0")) {// 群聊
				List<User> userList = UserConstant.userList;
				for (User u : userList) {
					responseTxt = JSON.toJSONString(new ChartItem(u.getId(),
							chartItem.getChartText(), "group1", "0", BaseUtil
									.getHead(user.getName()), !u.getId()
									.equals(chartItem.getStudyId())));
					System.out.println(!u.getId()
							.equals(chartItem.getStudyId()));
					SendMessage.send(u.getId(), responseTxt);
				}
			} else {
				responseTxt = JSON.toJSONString(new ChartItem(user.getId(),
						chartItem.getChartText(), chartItem.getChartObject(),
						"1", BaseUtil.getHead(user.getName())));
				SendMessage.send(user.getId(), responseTxt);
			}
		}
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write(JSON.toJSONString(new ResponseBean(true)));
		out.flush();
		out.close();
	}

}
