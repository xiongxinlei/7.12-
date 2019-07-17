package com.bwie.utils;

import java.util.Date;


@SuppressWarnings("deprecation")
public class DateUtil {

	// 方法1：根据传入的日期获取年龄
	
	public static int getAge(Date src) {
		return 2019 - src.getYear();
	}

	// 方法2：根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01
	// 00:00:00”
	public static Date getDateByMonthInit(Date src) {
		src.setHours(0);
		src.setMinutes(0);
		src.setSeconds(0);
		return src;
	}

	// 根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30
	// 23:59:59”，注意月大月小以及闰年。
	public static Date getDateByMonthLast(Date src) {
		int month = src.getMonth();
		month += 1;
		int year = src.getYear();
		src.setHours(23);
		src.setMinutes(59);
		src.setSeconds(59);
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
			src.setDate(31);
		}else if(month == 4 || month == 6 || month == 9 || month == 11){
			src.setDate(30);
		}else{
			src.setDate(28);
		}
		return src;
	}
	
	//方法4：求未来日期离今天还剩的天数
	public static int getDaysByFuture (Date future) {
		future.setDate(30);
		System.out.println(future);
		Date date = new Date();
		long time = future.getTime();
		long time2 = date.getTime();
		long time3 = time - time2;
		System.out.println(time3);
		int day = (int) (time3/(365*12*30*24*60));
		return day;
	}
	
	//方法5：求过去日期离今天过去的天数
	public static int getDaysByDeparted (Date departed) {
		Date date = new Date();
		int day = date.getDate() - departed.getDate();
		return day;
		
	}
}
