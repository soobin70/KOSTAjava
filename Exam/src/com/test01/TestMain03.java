package com.test01;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TestMain03 {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		StringTokenizer st = new StringTokenizer(str, ",");
		List<String> list = new ArrayList<String>();
		double sum = 0;
		
		String[] s = str.split(",");
		for (int i = 0; i < s.length; i++) {
			sum += Double.parseDouble(s[i]);
		}
		double avg=sum/s.length;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : "+avg);

	}

}
