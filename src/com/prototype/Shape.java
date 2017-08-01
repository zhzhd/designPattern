/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：下午2:11:02</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：Shape.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 */
package com.prototype;

public abstract class Shape implements Cloneable{
	
	private String id;
	protected String type;
	abstract void draw();
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	
	

}
