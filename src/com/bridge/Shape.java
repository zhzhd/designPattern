/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：下午4:18:43</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：Shape.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 */
package com.bridge;

public abstract class Shape {
	
	protected DrawAPI drawAPI;
	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();

}
