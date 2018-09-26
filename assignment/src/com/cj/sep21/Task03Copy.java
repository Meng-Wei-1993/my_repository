package com.cj.sep21;
/**
 * ������ݺ��·ݣ���ӡ�ø��·ݵ����������磺����2011��9�£��ʹ�ӡ2011��9�µ�����
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task03Copy {
	public static void main(String[] args) throws ParseException {
		int year = (int)(Math.random()*50+1970);
		int month = (int)(Math.random()*12+1);
		String time = ""+year+"-"+month+"-01";
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		calendar.setTime(format.parse(time));
		int firstDay = calendar.get(Calendar.DAY_OF_WEEK);
		if(firstDay==1){
			firstDay = 7;
		}else{
			firstDay = firstDay - 1;
		}
		int days = 0; 
		if(month==2){
			if((year%100!=0&&year%4==0)||(year%400==0)){
					days = 29;
			}else{
				days = 28;
			}
			return;
		}
		if(month<8&&month%2==1){
			days = 31;
		}
		if(month<8&&month%2==0){
			days = 30;
		}
		if(month>7&&month%2==1){
			days = 30;
		}
		if(month>7&&month%2==0){
			days = 31;
		}
		int[] arr = new int[days+firstDay-1];
		for (int i = 0; i < arr.length; i++) {
			if(i<firstDay-1){
				continue;
			}
			arr[i] = i-firstDay+2;
		}
		System.out.println(year+"��"+month+"��");
		System.out.println("����һ\t���ڶ�\t������\t������\t������\t������\t������");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0){
				System.out.print(arr[i]);
			}
			System.out.print("\t");
			if((i+1)%7==0){
				System.out.println();
			}
		}
	}
}
