/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：下午4:21:00</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：Circle.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 */
package com.bridge;

public class Circle extends Shape{

	private int x, y, radius;
	/**
	 * @param drawAPI
	 */
	protected Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	/* 
	 * @see com.bridge.Shape#draw()
	 */
	@Override
	public void draw() {
		
		drawAPI.drawCircle(radius, x, y);
		
	}

}
