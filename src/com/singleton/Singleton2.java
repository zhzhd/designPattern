/**
 * 
 */
package com.singleton;

/**
 * <ul>
 * <li>1、开发日期：2017年7月31日</li>
 * <li>2、时间：下午6:34:26</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：Singleton2.java</li>
 * <li>5、类型意图：懒汉模式，线程安全</li>
 * </ul>
 *
 */
public class Singleton2 {
	
	private static Singleton2 instance;
	private Singleton2() {}
	public static synchronized Singleton2 getInstance() {
		if(instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}

}
