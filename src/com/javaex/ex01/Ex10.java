package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		
		//논리연산자
		
		//&&
		
		System.out.println("&&연산자");
		System.out.println(true&&true); // T&&T --> true
		System.out.println(true&&false); // T&&F --> false
		System.out.println(false&&true); // F&&t --> false
		System.out.println(false&&false); // F&&F --> false
		
		//||
		System.out.println("||연산자");
		System.out.println(true||true); //T||T --> T
		System.out.println(true||false); // T||F --> T
		System.out.println(false||true); // F||T --> T
		System.out.println(false||false); // F||F --> F
		
		//응용
		
		System.out.println("응용");
		System.out.println((a>b)&&(a<b)); // 5>7 F && 5<7 T --> false
		System.out.println((a>b)&&(a>b)); // 5>7 F && 5>7 F --> False
		System.out.println((a<b)&&(a>b)); // 5<7 T && 5>7 F --> false
		System.out.println((a<b)&&(a<b)); // 5<7 T && 5<7 T --> true
		
		System.out.println((a>b)||(a<b)); // 5>7 F || 5<7 T --> true
		System.out.println(a<b&&a<b); // 5<7 T && 5<7 T --> true 굳이 괄호 안해도 가능
		System.out.println(a>b||a<b); // 5>7 F || 5<7 T --> true
		
		//!
		System.out.println("!연산자");
		System.out.println((a>b)); // 5>7 --> false
		System.out.println(!(a>b)); // !5>7 F --> true
		System.out.println(!(b>a)); // !7>5 T --> false
		
		
		
		
	}
	
}
