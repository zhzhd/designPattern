/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：下午4:26:15</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：BridgePatternDemo.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 */
package com.bridge;

public class BridgePatternDemo {
	
	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
	}

}
