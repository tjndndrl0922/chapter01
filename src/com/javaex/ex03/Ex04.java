package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		int pay; //급여
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("근무시간:");
		
		int hour = sc.nextInt();
	
		if(hour<=8) {
					pay = hour*10000;
		}
		
		
		else {
					pay = (hour-8)*12000+80000;
		}
		
		
		System.out.println("임금은 " +pay+ "원 입니다.");
		*/
		
		System.out.print("근무시간: ");
		int hour = sc.nextInt();
		
		if(hour>8) {
			
			pay = (hour-8)*15000+80000;
		}
		
		else {
			
			pay = hour*10000; 
		}
		
		System.out.println("임금은 "+pay+"원 입니다.");
		sc.close();
	}
}
