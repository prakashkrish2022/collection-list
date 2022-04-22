package com.collectionlist.test;

import java.util.ArrayList;
import java.util.List;

public class Replace {
	public static void main(String[] args) {
List<Integer> k=new ArrayList();
//100,200,300,400,500,600,700
k.add(100);
k.add(200);		
k.add(300);
k.add(400);
k.add(500);
k.add(700);
k.add(700);

k.set(2, 350);
System.out.println(k);

k.remove(1);
System.out.println(k);

k.contains(200);
System.out.println(k);


	}

}
