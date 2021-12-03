package com.javaex.ex06;

public class StringApp02 {

	public static void main(String[] args) {

		String a = " abcd";
		String b = ",efg";
		
		// a 문자열 + b 문자열 concat
		a.concat(b); 
		System.out.println(a.concat(b));
		System.out.println(a + b);

		a = a.concat(b);
		System.out.println(a);
		System.out.println("------------------------------------");
		
		//공백 제거 trim
		a = a.trim();
		System.out.println(a);
		System.out.println("--" + a + "--");

		//문자열 변경 replace
		a = a.replace("ab", "12");
		System.out.println(a);

		// 기준으로 줄 나눔.split(" ")
		System.out.println("------------------------------------");
		String[] sArray = a.split(",");
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i]);
		}

		//substring  을 기준으로 줄 시작.
		String str = "Hello JAVA!!!";
		String r01 = str.substring(2);
		System.out.println(r01);

		String r02 = str.substring(8);
		System.out.println(r02);

		String r03 = str.substring(3, 8);
		System.out.println(r03);

	}
}
