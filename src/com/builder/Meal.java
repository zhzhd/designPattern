/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：上午10:31:31</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：Meal.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 *
 */
package com.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	
	private List<Item> items = new ArrayList<>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float cost =0.0f;
		for(Item item : items) {
			cost += item.price();
		}
		return cost;
	}
	
	public void showItems() {
		for(Item item : items) {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());
		}
	}

}
