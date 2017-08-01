/**
 * 
 */
package com.singleton;

/**
 * <ul>
 * <li>1、开发日期：2017年7月31日</li>
 * <li>2、时间：下午6:42:26</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：Singleton5.java</li>
 * <li>5、类型意图：登记式/静态内部类</li>
 * </ul>
 *
 */
public class Singleton5 {
	
	private static class SingletonHolder {
		private static final Singleton5 INSTANCE = new Singleton5();
	}
	private Singleton5() {}
	public static final Singleton5 getInstance() {
		return SingletonHolder.INSTANCE;
	}

}
