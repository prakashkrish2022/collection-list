package com.collectionlist.test;

import java.util.List;
import java.util.Vector;

public class Index {
	public static void main(String[] args) {
List <Integer> j =new Vector();


// 10,20,30,90,10,10,40,50

	j.add(10);
	j.add(20);
	j.add(30);
	j.add(90);
	j.add(10);
	j.add(10);
	j.add(40);
	j.add(50);
	
	int lastIndexOf = j.lastIndexOf(10);
	System.out.println(lastIndexOf);
	
	int indexOf = j.indexOf(50);
	System.out.println(indexOf);
	
	int indexOf1 = j.indexOf(90);
	System.out.println(indexOf1);
	
	int indexOf2 = j.indexOf(70);
	System.out.println(indexOf2);
	
	}

}
