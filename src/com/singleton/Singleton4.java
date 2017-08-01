/**
 * 
 */
package com.singleton;

/**
 * <ul>
 * <li>1、开发日期：2017年7月31日</li>
 * <li>2、时间：下午6:38:44</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：Singleton4.java</li>
 * <li>5、类型意图：双检锁/双重校验锁</li>
 * </ul>
 *
 */
public class Singleton4 {
	
	private volatile static Singleton4 instance;
	private Singleton4() {}
	public static Singleton4 getInstance() {
		if(instance == null) {
			synchronized (Singleton4.class) {
				if(instance == null) {
					instance = new Singleton4();
				}
			}
		}
		return instance;
	}

}
