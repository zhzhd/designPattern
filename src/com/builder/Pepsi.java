/**
 * 
 */
package com.builder;

/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：上午10:30:32</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：Pepsi.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 *
 */
public class Pepsi extends ColdDrink{

	/* 
	 * @see com.builder.Item#name()
	 */
	@Override
	public String name() {
		
		return "Pepsi";
	}

	/* 
	 * @see com.builder.ColdDrink#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 35.0f;
	}

}
