package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Song s1 = new Song();
		s1.setTitle("좋은날");
		s1.setArtist("아이유");
		s1.setAlbum("Real");
		s1.setComposer("이민수");
		s1.setYear("2010");
		s1.setTrack(3);
		
		//System.out.println(s1.getArtist());
		
		s1.showInfo();
		
		Song s2= new Song();
		s2.setTitle("거짓말");
		s2.setArtist("BIGBANG");
		s2.setAlbum("Always");
		s2.setComposer("G-DRAGON");
		s2.setYear("2007");
		s2.setTrack(2);
		
		System.out.println(s2.toString());
		s2.showInfo();
	}

}
