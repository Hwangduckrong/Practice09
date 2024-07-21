package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
List<Friend>fArray= new ArrayList<Friend>();
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<3;i++) {
    	String r=sc.nextLine();
    	String[]re=r.split(" ");
    	Friend f1 = new Friend();
    	f1.setName(re[0]);
    	f1.setHp(re[1]);
    	f1.setSchool(re[2]);
    	fArray.add(f1);
    }
    for(int i=0;i<fArray.size();i++) {
    	fArray.get(i).draw();
    	
    	
    }
    	
    }
 }


