package com.javaex.ex05;

public class Song {
	
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	
	//생성자
	
	
	public Song() {
		System.out.println("Song0");
	}
	//4줄 짜리에 5줄 코드 불러와 쓰는법 공백을 줘서 가상의 값을 준다.
	public Song(String title, String artist, String album, String composer) {
		this(title,artist,album, composer,"");
		System.out.println("Song4");
	}

	public Song(String title, String artist, String album, String composer, String year) {
		//메모리에 올리는 일
		this.title = title;
		this.artist = artist;
		this.album = album;
		
		
		
		//작곡가 이름이 최대 10글짜 까지만 입력 코드 100줄
		this.composer = composer;
		
		//연도가 2021년 이후 년도 들어오면 2021로 처리 코드200줄
		this.year = year;
		
		
		System.out.println("Song5");
	}


	
	
	public Song(String title, String artist, String album, String composer, String year, int track) {
		//메모리에 올리는 일
		// 5줄 생성자에서 쓴 코드 이용 분할 작업 this() 다른 생성자 불러오는 역할
		this(title,artist,album, composer, year);
		
		//6줄코드 안에서만 이용 분할 작업
		this.track = track;
		
		System.out.println("Song6");
	}


	//메소드gs
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


	
	
	
	//메소드 -일반
	public void showInfo() {
		System.out.println(artist+", "+title+" ("+album+", "+year+", "+track+"번 track, "+composer+" 작곡)");
	}
	
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	
	
	
}
