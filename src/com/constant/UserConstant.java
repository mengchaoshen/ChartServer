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
		userList.add(new User("11053301", "小朱"));
		userList.add(new User("11053302", "小朱"));
		userList.add(new User("11053303", "小朱"));
		userList.add(new User("11053304", "小朱"));
		userList.add(new User("11053305", "小朱"));
		userList.add(new User("11053306", "小朱"));
		userList.add(new User("11053307", "小朱"));
		userList.add(new User("11053308", "小朱"));
		userList.add(new User("11053309", "小朱"));
		userList.add(new User("11053310", "小朱"));
		
		map.put("11053301", new User("11053301", "小朱"));
		map.put("11053302", new User("11053302", "小朱"));
		map.put("11053303", new User("11053303", "小朱"));
		map.put("11053304", new User("11053304", "小朱"));
		map.put("11053305", new User("11053305", "小朱"));
		map.put("11053306", new User("11053306", "小朱"));
		map.put("11053307", new User("11053307", "小朱"));
		map.put("11053308", new User("11053308", "小朱"));
		map.put("11053309", new User("11053309", "小朱"));
	}

}
