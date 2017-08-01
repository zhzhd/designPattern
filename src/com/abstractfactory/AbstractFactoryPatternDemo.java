/**
 * 
 */
package com.abstractfactory;

/**
 * <ul>
 * <li>1、开发日期：2017年7月31日</li>
 * <li>2、时间：下午6:04:22</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：AbstractFactoryPatternDemo.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 *
 */
public class AbstractFactoryPatternDemo {
	
	public static void main(String[] args) {
		AbstractFactory shapFactory = FactoryProducer.getFactory("shape");
		Shape shape = shapFactory.getShape("square");
		shape.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color color = colorFactory.getColor("red");
		color.fill();
	}

}
