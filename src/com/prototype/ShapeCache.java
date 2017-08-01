/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：下午2:27:49</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：ShapeCache.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 */
package com.prototype;

import java.util.Hashtable;

public class ShapeCache {
	
	private static Hashtable<String, Shape> shapeMap = 
			new Hashtable<String, Shape>();
	
	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}
	
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Square square = new  Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
		
	}

}
