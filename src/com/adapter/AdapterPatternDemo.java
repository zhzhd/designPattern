/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：下午3:08:20</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：AdapterPatternDemo.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 */
package com.adapter;

public class AdapterPatternDemo {
	
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}

}
