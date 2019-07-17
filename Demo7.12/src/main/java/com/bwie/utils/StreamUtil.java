package com.bwie.utils;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class StreamUtil {
	
	//关闭流
	public static void closeAll(Closeable... closeables) throws IOException {
		Closeable[] clone = closeables.clone();
		for (Closeable closeable : clone) {
			closeable.close();
		}
	}
	
	//拷贝流
	public static void copy(InputStream src, OutputStream out, boolean isCloseInputStream, boolean isCloseOutputStream)  throws IOException{
		
	}
	
	//返回内容
	public static String readTextFile(InputStream src) throws IOException{
		OutputStream out = new FileOutputStream("D:123.txt");
		//调用复制
		StreamUtil.copy(src, out, true, true);
		//调用关流
		StreamUtil.closeAll(src,out);
		String str = "";
		return "str";
			
	}
	
	//传入文本文件对象，返回该文件内容
	public static String readTextFile(File txtFile) throws FileNotFoundException, IOException{
		return StreamUtil.readTextFile(txtFile);
	}

	//参数message：用于控制台提示。例如“请输出您的姓名：”，然后用户输入姓名后回车，* 方法开始执行并读取姓名。
	public static String readStringFromSystemIn(String message){
		
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		String next = sc.next();
		return next;
		
	}
	
	//参数message：用于控制台提示。例如“请输出您的姓名：”，然后用户输入姓名后回车，* 方法开始执行并读取姓名。
		public static int readIntFromSystemIn(String string){
			
			System.out.println(string);
			Scanner sc = new Scanner(System.in);
			int nextInt = sc.nextInt();
			return nextInt;
			
		}
}
