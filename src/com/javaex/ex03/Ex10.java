package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		
		int month = sc.nextInt();
		
		switch(month) {
			case 2:
				System.out.println("28일 입니다.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30일 입니다.");
				break;
			default:
				System.out.println("31일 입니다.");
				break;	
		}
		
		/*
		if((month==4)||(month==6)||(month==9)||(month==11)) {
			System.out.println("30일 입니다.");
		}
		
		else if(month==2) {
			System.out.println("28일 입니다.");
		}
		else {
			System.out.println("31일 입니다.");
		}
		*/
		
		
		sc.close();
		
	}

}
