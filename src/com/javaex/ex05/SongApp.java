package com.javaex.ex05;

public class SongApp {
	public static void main(String[]args) {
	
		Song s01 =new Song();
		s01.setTitle("좋은날");
		s01.setArtist("아이유");
		s01.setAlbum("Real");
		s01.setComposer("이민수");
		s01.setYear("2010");
		s01.setTrack(3);
		
		//아이유 출력
				s01.showInfo();
		//System.out.println(s01.toString());
		
		//5개는 생성자 초기화 트랙번호는 세터로 초기화
		Song s02 = new Song("거짓말", "BIGBANG", "Always", "G-DRAGON", "2007");
		s02.setTrack(2);
		
		//빅뱅 출력
		
		s02.showInfo();
			
		//System.out.println(s02.toString());
		
		
		//6개 모든 필드 값 초기화 하는 생성자 사용 5줄 생성자 코드 가져와서 5줄사용 후 1줄 본인 코드 사용
		System.out.println("------------------------");
		Song s03 = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커1집", "장범준", "2012", 4);
		
		//System.out.println(s3.toString());
		s03.showInfo();
		System.out.println("------------------------");
		
		//4개 생성자에 5줄 생성자를 불러와서 실행
		Song s04 = new Song("소녀시대", "소녀시대", "소녀시대1집", "이문세");
		s04.showInfo();
				
	}

}
