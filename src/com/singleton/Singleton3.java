/**
 * 
 */
package com.singleton;

/**
 * <ul>
 * <li>1、开发日期：2017年7月31日</li>
 * <li>2、时间：下午6:36:41</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：Singleton3.java</li>
 * <li>5、类型意图：饿汉模式</li>
 * </ul>
 *
 */
public class Singleton3 {
	
	private static Singleton3 instance = new Singleton3();
	private Singleton3() {}
	public static Singleton3 getInstance() {
		return instance;
	}

}
