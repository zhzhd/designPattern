/**
 * 
 */
package com.singleton;


/**
 * <ul>
 * <li>1、开发日期：2017年7月31日</li>
 * <li>2、时间：下午6:31:37</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：Singleton1.java</li>
 * <li>5、类型意图：懒汉模式，线程不安全的</li>
 * </ul>
 *
 */
public class Singleton1 {
	
	private static Singleton1 instance;
	private Singleton1() {
		
	}
	
	public static Singleton1 getInstance() {
		if(instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}

}
