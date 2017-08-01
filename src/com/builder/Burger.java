/**
 * 
 */
package com.builder;

/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：上午10:24:07</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：Burger.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 *
 */
public abstract class Burger implements Item{
	
	public Packing packing() {
		return new Wrapper();
	}
	
	public abstract float price();

}
