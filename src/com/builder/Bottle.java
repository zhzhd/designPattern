/**
 * 
 */
package com.builder;

/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：上午10:22:51</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：Bottle.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 *
 *
 */
public class Bottle implements Packing{

	/* (non-Javadoc)
	 * @see com.builder.Packing#pack()
	 */
	@Override
	public String pack() {
		
		return "Bottle";
	}

}
