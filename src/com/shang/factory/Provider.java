package com.shang.factory;

/**
 * 生产者
 *
 * @author shangwei
 */
public interface Provider {

	/**
	 * 生产方法
	 *
	 * @return
	 */
	Sender produce();
}
