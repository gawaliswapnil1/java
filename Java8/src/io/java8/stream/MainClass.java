package io.java8.stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(0);l.add(10);l.add(20);
		l.add(5);l.add(5);l.add(25);
		
		List<Integer> l1=l.stream().filter(t->t%2==0).collect(Collectors.toList());
		System.out.println(l1);
		
		
		TreeSet<Integer> t=new TreeSet<Integer>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
		t.add(10);  t.add(0);  t.add(15);  t.add(25);  t.add(5);  t.add(20);
		System.out.println(t);
		
		
 	}

}
