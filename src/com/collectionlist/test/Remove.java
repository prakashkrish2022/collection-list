package com.collectionlist.test;

import java.util.LinkedList;
import java.util.List;

public class Remove {
	public static void main(String[] args) {

List <Integer> k=new LinkedList();

k.add(10);
k.add(20);
k.add(30);
k.add(90);
k.add(10);
k.add(10);
k.add(40);	
k.add(50);
k.add(10);
k.add(10);
k.add(20);
//10,20,30,90,10,10,40,50,10


System.out.println(k);

	Integer integer = k.get(0);
	System.out.println(integer);
	
	Integer remove = k.remove(0);
	System.out.println(k);  
	
	k.add(2, 50);
	System.out.println(k);
	
	k.add(70);
	System.out.println(k);
	
	
	k.add(8, 80);
	System.out.println(k);
	
	
	k.add(10, 100);
	System.out.println(k);
	
	k.set(7, 90);
	System.out.println(k);
	
	k.set(10, 100);
	System.out.println(k);
	
	}

}
