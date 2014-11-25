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
		userList.add(new User("11053301", "陈云云"));
		userList.add(new User("11053302", "葛颖杰"));
		userList.add(new User("11053303", "肖彩娣"));
		userList.add(new User("11053304", "张娅娟"));
		userList.add(new User("11053305", "周晓芳"));
		userList.add(new User("11053306", "扈景玉"));
		userList.add(new User("11053307", "白鑫睿"));
		userList.add(new User("11053308", "包伟统"));
		userList.add(new User("11053309", "柴泽照"));
		userList.add(new User("11053310", "陈郭传"));
		
		map.put("11053301", new User("11053301", "陈云云"));
		map.put("11053302", new User("11053302", "葛颖杰"));
		map.put("11053303", new User("11053303", "肖彩娣"));
		map.put("11053304", new User("11053304", "张娅娟"));
		map.put("11053305", new User("11053305", "周晓芳"));
		map.put("11053306", new User("11053306", "扈景玉"));
		map.put("11053307", new User("11053307", "白鑫睿"));
		map.put("11053308", new User("11053308", "包伟统"));
		map.put("11053309", new User("11053309", "柴泽照"));
		map.put("11053309", new User("11053310", "陈郭传"));
	}

}
