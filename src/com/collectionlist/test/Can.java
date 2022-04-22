package com.collectionlist.test;

import java.util.LinkedList;
import java.util.List;
public class Can {
	public static void main(String[] args) {

		List <Integer> k=new LinkedList();
		k.add(10);
		k.add(20);
		k.add(30);
		k.add(40);
		k.add(50);
		k.add(60);
		
		Integer integer = k.get(2);
		System.out.println(integer);
		
		int indexOf = k.indexOf(30);
		System.out.println(indexOf);
		
		
		
		
		//List = 10,20,30,40,50,60


	}

}
