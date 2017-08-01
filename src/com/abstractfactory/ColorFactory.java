/**
 * 
 */
package com.abstractfactory;

/**
 * <ul>
 * <li>1、开发日期：2017年7月31日</li>
 * <li>2、时间：下午5:58:20</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：ColorFactory.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 *
 */
public class ColorFactory extends AbstractFactory{

	/* (non-Javadoc)
	 * @see com.abstractfactory.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	Color getColor(String color) {
		if(color == null) {
			return null;
		}
		if(color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if(color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		} else if(color.equalsIgnoreCase("GREEN")) {
			return new Green();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.abstractfactory.AbstractFactory#getShape(java.lang.String)
	 */
	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
