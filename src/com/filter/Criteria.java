/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：下午4:55:35</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：Criteria.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 */
package com.filter;

import java.util.List;

public interface Criteria {
	
	public List<Person> meetCriteria(List<Person> persons);

}
