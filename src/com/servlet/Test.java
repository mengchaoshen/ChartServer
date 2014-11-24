package com.servlet;

import com.alibaba.fastjson.JSON;
import com.model.ResponseBean;

public class Test {

	public static void main(String[] args) {
		ResponseBean responseBean = new ResponseBean();

			responseBean.setSuccess(true);
			responseBean.setCorrect(true);
		System.out.println(JSON.toJSONString(responseBean));
	}
}
