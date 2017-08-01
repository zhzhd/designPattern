/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：上午10:41:38</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：BuilderPatternDemo.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 */
package com.builder;

public class BuilderPatternDemo {
	
	public static void main(String[] args) {
		MealBuilder builder = new MealBuilder();
		
		Meal vegMeal = builder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		
		Meal nonVegMeal = builder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
		System.out.println();
	}

}
