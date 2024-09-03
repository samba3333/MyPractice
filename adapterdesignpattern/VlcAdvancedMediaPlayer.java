package com.practice.adapterdesignpattern;

public class VlcAdvancedMediaPlayer implements IAdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc media with file " + fileName);
		
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		
	}

}
