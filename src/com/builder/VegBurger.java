/**
 * 
 */
package com.builder;

/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：上午10:27:06</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：VegBurger.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 *
 */
public class VegBurger extends Burger {

	/* (non-Javadoc)
	 * @see com.builder.Item#name()
	 */
	@Override
	public String name() {
		
		return "Veg";
	}

	/* (non-Javadoc)
	 * @see com.builder.Burger#price()
	 */
	@Override
	public float price() {
		
		return 25.0f;
	}

}
