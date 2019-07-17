package com.bwie.test;

import org.junit.Test;

import com.bwie.utils.StreamUtil;

public class Test02 {
	
	@Test
	public void fun1(){
		String readStringFromSystemIn = StreamUtil.readStringFromSystemIn("请输入你的名字");
		System.out.println(readStringFromSystemIn);
	}
	
	@Test
	public void fun2(){
		int i = StreamUtil.readIntFromSystemIn("请输入你的年龄");
		System.out.println(i);
	}
}