/**
 * 
 */
package com.abstractfactory;

/**
 * <ul>
 * <li>1、开发日期：2017年7月31日</li>
 * <li>2、时间：下午5:05:31</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：Circle.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 *
 */
public class Circle implements Shape{

	/* (non-Javadoc)
	 * @see com.factory.Shape#draw()
	 */
	@Override
	public void draw() {
		
		System.out.println("Inside Circle::draw() method");
		
	}

}
