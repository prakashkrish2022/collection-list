package com.collectionlist.test;

import java.util.ArrayList;
import java.util.List;

public class Class {
	public static void main(String[] args) {
  List <Integer> k=new ArrayList();
  
		k.add(105);
		k.add(205);
		k.add(305);
		k.add(405);
		k.add(505);
		k.add(605);
		k.add(705);
		k.add(805);
		
		for (int i = 0; i < 7; i++) {
			System.out.println(k.get(i));
			
			for (Integer integer : k) {
				System.out.println(integer);
				
			}
		}
	}

}
