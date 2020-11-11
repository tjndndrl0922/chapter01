package com.javaex.ex01;

public class Ex04 {
	
	public static void main(String[] args) {
		
		//char 한글자만 사용 가능, 작은따옴표 사용//
		char ch01 = 'A';
		System.out.println(ch01);
		
		char ch02 ='한';
		System.out.println(ch02);
		
		
		//비교 *A의 코드값이 65일뿐. 작은따옴표에 한글자만 사용하기.                   
		char ch03 = 66; //오류가 안나타나므로 주의할것!!!
		System.out.println(ch03);
		
		//문자열
		String str = "안녕하세요";
		System.out.println(str);
	
		char str01 = '안';
		char str02 = '안';
		System.out.println(str01);
		System.out.println(str02);
		
		//형변환
		double v01 = 5/4;
		System.out.println(v01);
		
		double v02 = (double)5/4;
		System.out.println(v02);
		
		double v03 = 5/(double)4;
		System.out.println(v03);
		
		double v04 = (double)5 / (double)4;
		System.out.println(v04);
		
		int v05 = (int)1.3 + (int)1.8;
		System.out.println(v05);
		
	}
	

}
