package com.javaex.ex03;

public class Song {
//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	
	
	
	
	//생성자
	
	
	
	//메소드 - g/s Ait+Shft+S ------and Setters 클릭
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	//메소드 일반
	public void showInfo() {
		System.out.println(artist+", "+title+" ("+album+", "+year+", "+track+"번 track, "+composer+" 작곡)");
	}
	
	@Override // Alt+Shift+s toString
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + ", getTitle()=" + getTitle() + ", getArtist()=" + getArtist()
				+ ", getAlbum()=" + getAlbum() + ", getComposer()=" + getComposer() + ", getYear()=" + getYear()
				+ ", getTrack()=" + getTrack() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()="+"]";
	}
	
	
}

