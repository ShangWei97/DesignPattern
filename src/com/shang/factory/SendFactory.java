package com.shang.factory;

/**
 * 普通工厂模式:就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 *
 * @author shangwei
 */
public class SendFactory {

	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确的类型");
			return null;
		}

	}
}
