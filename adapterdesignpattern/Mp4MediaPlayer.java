package com.practice.adapterdesignpattern;

public class Mp4MediaPlayer implements IAdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playMp4(String fileName) {

		System.out.println("Playing media from the mp4 file: " + fileName);
	}

}
