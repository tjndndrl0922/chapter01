package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");
		System.out.print("단: ");
		int dan=sc.nextInt();
		int n = 1;
		
		while(n<10) {
			System.out.println(dan +" * " +n+" = "+dan*n  );
			n++;
		}
		sc.close();
	}
		
}
