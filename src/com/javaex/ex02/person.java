package com.javaex.ex02;

public class person {

	import java.io.BufferedReader;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
	import java.util.List;

	public class Ex01 {

	   public static void main(String[] args) throws IOException {
	      //읽기 스트림
	      
	      InputStream in = new FileInputStream("C:\\javaStudy\\MS949.txt");
	      InputStreamReader isr = new InputStreamReader(in, "MS949");//in,이후에 파일명 빼먹지 마라
	      
	      BufferedReader br = new BufferedReader(isr);
	      
	      //리스트
	      List<Person> PersonList = new ArrayList<Person>();

	      //한줄씩 읽기 반복

	      while (true) {
	         
	         //파일을 한줄씩 읽는다
	         String str = br.readLine();
	         
	         //데이터가 없으면 끝
	         if (str == null) {

	            break;
	         }
	         
	         //데이터가 있으면
	         //데이터를 #으로 나눠라.
	         String[] st = str.split("#");

	         
	         //person으로 묶는다
	         Person p1 = new Person(st[0], st[1], st[2]);

	         PersonList.add(p1);
	         System.out.println(p1.getName());
	         //p1.ShowInfo();
	      
	      }

	      br.close();

	   }

	}

}
