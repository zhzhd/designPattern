/**
 * 
 */
package com.builder;

/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：上午10:25:28</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：ColdDrink.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 *
 */
public abstract class ColdDrink implements Item{
	
	public Packing packing() {
		return new Bottle();
	}
	
	public abstract float price();

}
