/**
 * 
 */
package com.abstractfactory;

/**
 * <ul>
 * <li>1、开发日期：2017年7月31日</li>
 * <li>2、时间：下午5:49:15</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：Red.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 *
 */
public class Red implements Color{

	/* (non-Javadoc)
	 * @see com.abstractfactory.Color#fill()
	 */
	@Override
	public void fill() {
		
		System.out.println("Inside Red::fill() method.");
		
	}

}
