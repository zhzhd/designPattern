/**
 * 
 */
package com.abstractfactory;

/**
 * <ul>
 * <li>1、开发日期：2017年7月31日</li>
 * <li>2、时间：下午5:52:58</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：AbstractFactory.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 *
 */
public abstract class AbstractFactory {
	
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);

}
