/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：下午2:56:32</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：Mp4Player.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 */
package com.adapter;

public class Mp4Player implements AdvancedMediaPlayer{

	/* 
	 * @see com.adapter.AdvancedMediaPlayer#playVlc(java.lang.String)
	 */
	@Override
	public void playVlc(String fileName) {
		
		
	}

	/* 
	 * @see com.adapter.AdvancedMediaPlayer#playMp4(java.lang.String)
	 */
	@Override
	public void playMp4(String fileName) {
		
		System.out.println("Playing mp4 file. Name: " + fileName);
		
	}

}
