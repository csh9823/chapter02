package com.javaex.ex20;

import java.io.IOException;

public class FileManager {
	// 필드

	// 생성자
	// public FileManager() {}

	// 메소드gs

	// 메소드 일반

	public void readFile() throws IOException { // c://canfig.txt 를 읽어오는 메소드

		System.out.println("예외상황발생");
		throw new IOException(); // 파일을 못 읽었을때 예외 발생
	}
}
