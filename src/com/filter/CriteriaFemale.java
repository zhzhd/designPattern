/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：下午5:15:59</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：CriteriaFemale.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 */
package com.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria{

	/* 
	 * @see com.filter.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePersons = new ArrayList<Person>();
		for(Person person : persons) {
			if(person.getGender().equalsIgnoreCase("female")) {
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}

}
