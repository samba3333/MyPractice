package com.practice.adapterdesignpattern;

public class MediaPlayerClient implements IMediaPlayer {

	MediaAdapter adapter;
	@Override
	public void play(String mediaType, String fileName) {

		if(mediaType.equals("MP3")) {
			System.out.println("Updated Using default media player to play mp3 files");
		} else if(mediaType.equals("VLC") || mediaType.equals("MP4")) {
			adapter = new MediaAdapter(mediaType, fileName);
			adapter.play(mediaType, fileName);
		}
	}

}
