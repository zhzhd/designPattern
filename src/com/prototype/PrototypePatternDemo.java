/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：下午2:34:20</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：PrototypePatternDemo.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 */
package com.prototype;

public class PrototypePatternDemo {
	
	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape clonedShape1 = ShapeCache.getShape("1");
		System.out.println("Shape:" + clonedShape1.getType());
		
		Shape clonedShape2 = ShapeCache.getShape("2");
		System.out.println("Shape:" + clonedShape2.getType());
		
		Shape clonedShape3 = ShapeCache.getShape("3");
		System.out.println("Shape:" + clonedShape3.getType());
	}

}
