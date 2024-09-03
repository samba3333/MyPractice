package com.practice.adapterdesignpattern;

public class AdapterDesignPatternDemo {

	public static void main(String[] args) {

		MediaPlayerClient client = new MediaPlayerClient();
		
		client.play("MP4", "TeluguSong");
		client.play("VLC", "TeluguSong");
		client.play("MP3", "TeluguSong");
	}

}
