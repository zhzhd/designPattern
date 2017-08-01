/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：上午10:38:10</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：MealBuilder.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 */
package com.builder;

public class MealBuilder {
	
	public Meal prepareVegMeal () {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

}
