package com.constant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.model.User;

public class UserConstant {
	
	public static Map<String, User> map = new HashMap<String, User>();
	
	public static List<User> userList = new ArrayList<User>();
	
	static {
		userList.add(new User("11053301", "С��"));
		userList.add(new User("11053302", "С��"));
		userList.add(new User("11053303", "С��"));
		userList.add(new User("11053304", "С��"));
		userList.add(new User("11053305", "С��"));
		userList.add(new User("11053306", "С��"));
		userList.add(new User("11053307", "С��"));
		userList.add(new User("11053308", "С��"));
		userList.add(new User("11053309", "С��"));
		userList.add(new User("11053310", "С��"));
		
		map.put("11053301", new User("11053301", "С��"));
		map.put("11053302", new User("11053302", "С��"));
		map.put("11053303", new User("11053303", "С��"));
		map.put("11053304", new User("11053304", "С��"));
		map.put("11053305", new User("11053305", "С��"));
		map.put("11053306", new User("11053306", "С��"));
		map.put("11053307", new User("11053307", "С��"));
		map.put("11053308", new User("11053308", "С��"));
		map.put("11053309", new User("11053309", "С��"));
	}

}
