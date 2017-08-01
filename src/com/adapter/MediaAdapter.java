/**
 * <ul>
 * <li>1、开发日期：2017年8月1日</li>
 * <li>2、时间：下午2:58:08</li>
 * <li>3、作  者：zhangzhendong1</li>
 * <li>4、类型名称：MediaAdapter.java</li>
 * <li>5、类型意图：</li>
 * </ul>
 */
package com.adapter;

public class MediaAdapter implements MediaPlayer{

	AdvancedMediaPlayer advancedMusicPlayer;
	
	public MediaAdapter(String audioType) {
		
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer = new VlcPlayer();
		} else if(audioType.equals("mp4")) {
			advancedMusicPlayer = new Mp4Player();
		}
		
	}
	
	/* 
	 * @see com.adapter.MediaPlayer#play(java.lang.String, java.lang.String)
	 */
	@Override
	public void play(String audioType, String filename) {
		
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer.playVlc(filename);
		} else if(audioType.equalsIgnoreCase("mp4")) {
			
			advancedMusicPlayer.playMp4(filename);
			
		}
		
	}

}
