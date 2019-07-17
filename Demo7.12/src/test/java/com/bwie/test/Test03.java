package com.bwie.test;

import java.util.Date;

import org.junit.Test;

import com.bwie.utils.DateUtil;

public class Test03 {

	@Test
	public void fun1(){
		Date date = new Date();
		date.setYear(2001);
		int age = DateUtil.getAge(date);
		System.out.println(age);
	}
	
	@Test
	public void fun2(){
		Date date = new Date();
		Date dateByMonthInit = DateUtil.getDateByMonthInit(date);
		System.out.println(dateByMonthInit);
	}
	
	@Test 
	public void fun3(){
		Date date = new Date();
		Date dateByMonthLast = DateUtil.getDateByMonthLast(date);
		System.out.println(dateByMonthLast);
	}
	
	@Test 
	public void fun4(){
		Date date = new Date();
		int daysByFuture = DateUtil.getDaysByFuture(date);
		System.out.println(daysByFuture);
	}
	
	@Test 
	public void fun5(){
		Date date = new Date();
		date.setDate(10);
		int daysByDeparted = DateUtil.getDaysByDeparted(date);
		System.out.println(daysByDeparted);
	}
}
