package com.shang.factory;

/**
 * @author shangwei
 */
public class MailSender implements Sender {
	@Override
	public void send() {
		System.out.println("this is a mail sender");
	}
}
