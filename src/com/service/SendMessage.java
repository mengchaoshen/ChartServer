package com.service;

import org.ddpush.im.v1.client.appserver.Pusher;

import com.constant.GlobConstant;
import com.util.BaseUtil;

public class SendMessage {
	
	public static void send(final String studyId, final String text){
		new Thread(new Runnable() {
			@Override
			public void run() {
				Pusher pusher;
				try {
					pusher = new Pusher(GlobConstant.SERVER_IP, 9999, 1000 * 5);
					byte[] uuid = BaseUtil.md5Byte(studyId);
					boolean result = pusher.push0x20Message(uuid, text.getBytes());
					
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
