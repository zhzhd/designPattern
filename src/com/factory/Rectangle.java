/**
 * 
 */
package com.factory;

/**
 * <ul>
 * <li>1、开发日期：2017年7月31日</li>
 * <li>2、时间：下午5:01:47</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：Rectangle.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 *
 */
public class Rectangle implements Shape{

	/* (non-Javadoc)
	 * @see com.factory.Shape#draw()
	 */
	@Override
	public void draw() {
		
		System.out.println("Inside Rectangle::draw() method");
		
	}

}
