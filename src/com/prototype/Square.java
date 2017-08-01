/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：下午2:24:43</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：Square.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 */
package com.prototype;

public class Square extends Shape{

	/**
	 * 
	 */
	public Square() {
		type = "Square";
	}
	/* 
	 * @see com.prototype.Shape#draw()
	 */
	@Override
	void draw() {
		
		System.out.println("Inside Square::draw() method.");
		
	}

}
