/**
 * 
 */
package com.abstractfactory;

/**
 * <ul>
 * <li>1、开发日期：2017年7月31日</li>
 * <li>2、时间：下午5:55:21</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：ShapeFactory.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 *
 */
public class ShapeFactory extends AbstractFactory{

	/* (non-Javadoc)
	 * @see com.abstractfactory.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.abstractfactory.AbstractFactory#getShape(java.lang.String)
	 */
	@Override
	Shape getShape(String shape) {
		if(shape == null) {
			return null;
		}
		if(shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if(shape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if(shape.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
	}

}
