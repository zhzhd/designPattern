/**
 * 
 */
package com.abstractfactory;

/**
 * <ul>
 * <li>1、开发日期：2017年7月31日</li>
 * <li>2、时间：下午5:51:06</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：Blue.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 *
 */
public class Blue implements Color{

	/* (non-Javadoc)
	 * @see com.abstractfactory.Color#fill()
	 */
	@Override
	public void fill() {
		
		System.out.println("Inside Red::fill() method.");
		
	}

}
