package com.javaex.ex07;

public class WrapparApp {

	public static void main(String[] args) {

		int no = 10;
		Integer i = new Integer(10);
		Short s = new Short((short) 3);
		Byte b = new Byte((byte) 3);

		System.out.println(no);
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);

		int num01 = 10;
		int num02 = 7;
		int intResult = num01 + num02;
		System.out.println(intResult);
		
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(20);
		Integer result = i01 + i02;
		System.out.println(result);
		
		Integer i03 = new Integer(99); 		//99 --> new Integer
		Integer i04 = new Integer(100);		// 박스모양으로 된 100
		int num99 = i04;										// i04 중에서 알맹이만 num99에다 넣었음.
		
		System.out.println("-----------------------------------------------");
		
		//문자열을 --> int문으로
		//parseInt --> int 를 String이나 다른 문으로
		
		Integer i05 = 10;
		int r01 = i05.parseInt("12345");
		System.out.println(r01);

		
		int r02 = Integer.parseInt("12345");
		System.out.println(r02);
		System.out.println("-----------------------------------------------");
		
		//int  문자열.
		String a = "안녕하세요";
		String snum01 = a.valueOf(555);
		System.out.println(snum01);
		
		String snum02 = String.valueOf(555);
		System.out.println(snum02);
		System.out.println("-----------------------------------------------");
		String snum = String.valueOf(555);
		
	}

}
