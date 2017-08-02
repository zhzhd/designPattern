/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：下午4:10:38</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：RedCircle.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 */
package com.bridge;

public class RedCircle implements DrawAPI{

	/* 
	 * @see com.bridge.DrawAPI#drawCircle(int, int, int)
	 */
	@Override
	public void drawCircle(int radius, int x, int y) {
		
		System.out.println("Drawing Circle[ color: red, radius: "
				+ radius + ", x: " + x + ", y: " + y +"]");
		
	}

}
