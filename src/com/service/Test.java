package com.service;

import org.ddpush.im.v1.client.appserver.Pusher;

import com.constant.GlobConstant;
import com.util.BaseUtil;

public class Test{

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				Pusher pusher;
				try {
					pusher = new Pusher(GlobConstant.SERVER_IP, 9999, 1000 * 5);
					byte[] uuid = BaseUtil.md5Byte("11053301");
//					boolean result = pusher.push0x10Message(uuid);
					boolean result = pusher.push0x20Message(uuid, "阿苏的户口和".getBytes());
					
					if (result) {
						System.out.println("通用信息发送成功");
					} else {
						System.out.println("发送失败！格式有误");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}).start();
	}


}
