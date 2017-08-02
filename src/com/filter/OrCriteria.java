/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：下午5:06:22</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：OrCriteria.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 */
package com.filter;

import java.util.List;

public class OrCriteria implements Criteria{

	private Criteria criteria;
	private Criteria otherCriteria;
	/**
	 * 
	 */
	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	/* 
	 * @see com.filter.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
		List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);
		
		for(Person person : otherCriteriaItems) {
			if(!firstCriteriaItems.contains(person)) {
				firstCriteriaItems.add(person);
			}
		}
		return firstCriteriaItems;
	}

}
