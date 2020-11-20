package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] intLotto = new int[5];
		
		intLotto[0] = 3;
		intLotto[1] = 5;
		intLotto[2] = 7;
		intLotto[3] = 9;
		intLotto[4] = 11;
		
		System.out.println(intLotto[0]);
		System.out.println(intLotto[1]);
		System.out.println(intLotto[2]);
		System.out.println(intLotto[3]);
		System.out.println(intLotto[4]);
		
		for(int i = 0; i<5; i++) {
			System.out.println(intLotto[i]);
		}
	}
}
