/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：下午2:26:10</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：Circle.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 */
package com.prototype;

public class Circle extends Shape{
	
	/**
	 * 
	 */
	public Circle() {
		type = "Circle";
	}

	/* 
	 * @see com.prototype.Shape#draw()
	 */
	@Override
	void draw() {
		
		System.out.println("Inside Circle::draw() method.");
		
	}

}
