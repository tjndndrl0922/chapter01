package com.javaex.ex05;

public class Ex08 {
	
	public static void main(String[] args) {
	
		int[] arrleft = new int[]{10, 20, 33};
		
		int[] arrright= new int[]{11, 23, 30};
		/*
		if(arrleft.length==arrright.length){
			//두배열의 갯수가 같니?
			System.out.println("배열의 크기가 다릅니다.");
		}else {
			System.out.println("배열의 크기가 다릅니다.");
		}
		*/
		
		if(arrleft.length==arrright.length){
			for(int i=0; i<arrleft.length; i++) {
				if(arrleft[i]!=arrright[i]) {
					System.out.println(i+ "번째 값이 다릅니다");
				}
			}
			
		}else {
			System.out.println("배열의 크기가 다릅니다.");
		}
		
		
	
	}
	
}
