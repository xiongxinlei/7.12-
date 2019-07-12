package com.bwie.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.bwie.exception.DRuntimeException;
import com.bwie.utils.UtilsDemo;

public class Test01 {
	
	@Test
	public void test01(){
		UtilsDemo.isTrue(true, "这个不是true");
	}
	
	@Test
	public void test02(){
		UtilsDemo.isTrue(false, "这个不是true");
		try {
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test03(){
		UtilsDemo.isFalse(true, "这个不是false");
	}
	
	@Test
	public void test04(){
		UtilsDemo.isFalse(false, "这个不是false");
	}
	
	@Test
	public void test05(){
		UtilsDemo.isNotNull(null, "这个对象是空");
	}
	
	@Test
	public void test06(){
		Object obj = new Object();
		UtilsDemo.isNotNull(obj, "这个对象是空");
	}
	
	@Test
	public void test07(){
		Object obj = new Object();
		UtilsDemo.isNull(obj, "这个对象是空");
	}
	
	@Test
	public void test08(){
		UtilsDemo.isNull(null, "这个对象是空");
	}
	
	@Test
	public void test09(){
		List<?> list = null;
		UtilsDemo.collNotNull(list, "这个集合是空");
	}
	
	@Test
	public void test10(){
		List<Integer> list = new ArrayList<>();
		list.add(10);
		UtilsDemo.collNotNull(list, "这个集合是空");
	}
	
	@Test
	public void test011(){
		Map<?, ?> map = null;
		UtilsDemo.mapNotNull(map, "这个map是空");
	}
	
	@Test
	public void test012(){
		Map<String, Integer> map = new HashMap<>();
		map.put("123", 123);
		UtilsDemo.mapNotNull(map, "这个map是空");
	}
	
	@Test
	public void test013(){
		String str = "";
		UtilsDemo.strNotNull(str, "这个str是空");
	}
	
	@Test
	public void test014(){
		String str = "123";
		UtilsDemo.strNotNull(str, "这个str是空");
	}
	
	@Test
	public void test015(){
		int num = -5;
		UtilsDemo.numIsZheng(num, "这个数字不是正数");
	}
	
	@Test
	public void test016(){
		int num = 5;
		UtilsDemo.numIsZheng(num, "这个str是空");
	}
	
}
