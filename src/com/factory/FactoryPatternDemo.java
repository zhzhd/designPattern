/**
 * 
 */
package com.factory;

/**
 * <ul>
 * <li>1、开发日期：2017年7月31日</li>
 * <li>2、时间：下午5:10:29</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：FactoryPatternDemo.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 *
 */
public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		Shape shape = ShapeFactory.getShape("CIRCLE");
		shape.draw();
		shape = ShapeFactory.getShape("RECTANGLE");
		shape.draw();
		shape = ShapeFactory.getShape("SQUARE");
		shape.draw();
		shape = ShapeFactory.getShape("");
		//shape.draw();
	}

}
