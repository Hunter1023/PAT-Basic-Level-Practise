﻿import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int sum = 0;
		boolean sumIsEmpty = false;
		
		for(int i = 0; i < str.length(); i++) {
			sum += (str.charAt(i) - '0');
		}
		
		ArrayList<String> pinyin = new ArrayList<String>();
		pinyin.add(0, "ling");
		pinyin.add(1, "yi");
		pinyin.add(2, "er");
		pinyin.add(3, "san");
		pinyin.add(4, "si");
		pinyin.add(5, "wu");
		pinyin.add(6, "liu");
		pinyin.add(7, "qi");
		pinyin.add(8, "ba");
		pinyin.add(9, "jiu");
		
		String outPut = "";
		do {
			outPut = " " + pinyin.get(sum % 10) + outPut;
			sum /= 10;
			
			if(sum == 0) {
				sumIsEmpty = true;
			}
		} while(!sumIsEmpty);
		outPut = outPut.trim();
		System.out.println(outPut);
	}
}