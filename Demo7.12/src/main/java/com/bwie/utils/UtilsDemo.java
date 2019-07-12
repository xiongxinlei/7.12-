package com.bwie.utils;

import java.util.Collection;
import java.util.Map;

import com.bwie.exception.DRuntimeException;

public class UtilsDemo {

	/*
	 * 必须为真
	 */
	public static void isTrue(boolean str, String message) {
		if (!str) {
			throw new DRuntimeException(message); 
		}
	}

	/*
	 * 必须为假
	 */
	public static void isFalse(boolean str, String message) {
		if (str) {
			throw new DRuntimeException(message);
		}
	}

	/*
	 * 不能为null
	 */
	public static void isNotNull(Object obj, String message) {
		if (obj == null) {
			throw new DRuntimeException(message);
		}
	}

	/*
	 * 必须null
	 */
	public static void isNull(Object obj, String message) {
		if (obj != null) {
			throw new DRuntimeException(message);
		}
	}

	/*
	 * List 或 Set 集合不为空，没有元素也算空
	 */
	public static void collNotNull(Collection<?> coll, String message) {
		if (coll == null || coll.size() == 0) {
			throw new DRuntimeException(message);
		}
	}
	
	/*
	 * List 或 Set 集合不为空，没有元素也算空
	 */
	public static void mapNotNull(Map<?, ?> map, String message) {
		if (map == null || map.size() == 0) {
			throw new DRuntimeException(message);
		}
	}
	
	/*
	 * 断言字符串必须有值，去掉空格后，长度必须大于 0
	 */
	public static void strNotNull(String str, String message) {
		if (str.trim().length() <= 0) {
			throw new DRuntimeException(message);
		}
	}
	
	/*
	 * 断言值必须是正数(值大于 0)
	 */
	public static void numIsZheng(int num, String message) {
		if (num <= 0) {
			throw new DRuntimeException(message);
		}
	}
}
