/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：下午5:02:58</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：AndCriteria.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 */
package com.filter;

import java.util.List;

public class AndCriteria implements Criteria{

	private Criteria criteria;
	private Criteria otherCriteria;
	
	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	/* 
	 * @see com.filter.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
