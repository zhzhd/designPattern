/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：下午3:04:19</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：AudioPlayer.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 */
package com.adapter;

public class AudioPlayer implements MediaPlayer{

	MediaAdapter mediaAdapter;
	/* 
	 * @see com.adapter.MediaPlayer#play(java.lang.String, java.lang.String)
	 */
	@Override
	public void play(String audioType, String filename) {
		
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name: " + filename);
		} else if (audioType.equalsIgnoreCase("vlc") || 
				audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, filename);
		} else {
			System.out.println("Invalid media. " + audioType + "format not supported");;
		}
		
	}

}
