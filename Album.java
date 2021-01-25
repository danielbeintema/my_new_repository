package com.revature.app;

public class Album {
	static String name;
	static String artist;
	
	public void setName(String l) {
		Album.name=l;
	}
	public void setartist(String p) {
		Album.artist=p;
	}

	protected String AlbumName() {
		return name;
	}
	
	public static void ListenTo() {
		System.out.println("Listen to more music.");
	}
	public static void ListenTo(int n) {
		for(int i=0;i>n;i++) {
		System.out.println("Listen to more music.");
	}
}
	
	public static void Genre() {
		System.out.println("This is music.");
	}
}