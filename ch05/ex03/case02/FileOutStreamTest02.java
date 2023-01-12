package ch05.ex03.case02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamTest02 {
	public static void main(String[] args) throws FileNotFoundException {
		//byte[] 배여ㅑㄹ에 A-Z까지(26개) 넣고 그 배열을 한꺼번에 파일에 쓰기
		FileOutputStream fos = new FileOutputStream("output02.txt"); 
		
		try (fos){ //자바9부터 제공되는 기능
			byte[] bs = new byte[26];
			byte b1 = 65; // 'A'
			for(int i=0; i<bs.length; i++) { // A-Z까지 배열에 넣기
				bs[i] = b1;
				b1++;
			}
			fos.write(bs, 2, 10); //배열의 2번쨰 위치부터 10개 바이트 출력하기
		}catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("파일 생성과 출력이 완료되었씁니다.");
	}
}
