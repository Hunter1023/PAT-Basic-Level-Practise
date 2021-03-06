﻿import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt = in.nextInt();
		KeyNum keynum = new KeyNum(cnt);
		
		for(int i = 0; i < cnt; i++) {
			keynum.setNum(i,in.nextInt());
		}
		keynum.rankNum();
		keynum.getKeyNum();
		keynum.outPut();
	}
}

class KeyNum {
	private int[] arr;//存放数字的数组
	private int cnt;//数组大小
	public KeyNum(int cnt) {
		arr = new int[cnt];
		this.cnt = cnt;
	}
	
	public void setNum(int index, int figure) {//读入数字
			arr[index] = figure;
	}
	
	public void rankNum() {//从大到小 冒泡排序
		for(int x = 0; x < arr.length; x++) {
			for(int y = 0; y < arr.length-x-1; y++) {
				if(arr[y] < arr[y+1]) {
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
				}
			}
		}
	}
	
	public void getKeyNum() {//获取关键数字
		for(int i = 0; i < arr.length; i++) {
			int updateNum = arr[i];
			
			while(updateNum != 1) {
				if(updateNum % 2 == 0){
					updateNum /= 2;
				} else {
					updateNum = (3*updateNum + 1) / 2;
				}
				for(int j = 0; j < arr.length; j++) {//遍历数组，如果是被覆盖的数，变为1
					if(arr[j] == updateNum) {
						arr[j] = 1;
						break;// 因为数组的数字各不相同，找到被覆盖的即可跳出循环
					}
				}
			}
		}
	}
	
	public void outPut() {
		String outPut ="";
		for(int i =0; i < arr.length; i++) {
			if(arr[i] != 1) {
				outPut += arr[i]+" ";
			}
		}
		outPut = outPut.trim();
		System.out.println(outPut);
	}
}
