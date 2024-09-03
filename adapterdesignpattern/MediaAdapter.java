package com.practice.adapterdesignpattern;

public class MediaAdapter implements IMediaPlayer {

	IAdvancedMediaPlayer advMediaPlayer;
	
	public MediaAdapter(String mediaType, String fileName) {
		
		if(mediaType.equals("VLC")) {
			advMediaPlayer = new VlcAdvancedMediaPlayer();
		} else if(mediaType.equals("MP4")) {
			advMediaPlayer = new Mp4MediaPlayer();
		}
	}
	@Override
	public void play(String mediaType, String fileName) {
		if(mediaType.equals("VLC")) {
			advMediaPlayer.playVlc(fileName);
		} else if(mediaType.equals("MP4")) {
			advMediaPlayer.playMp4(fileName);
		}
	}

}
