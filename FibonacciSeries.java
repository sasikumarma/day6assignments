package com.bridgelabz.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnum=1,secondnum=0,nextterm,num=13;
		for(int i=1;i<=num;i++) {
		System.out.println(secondnum);
	    nextterm=firstnum+secondnum;
		firstnum=secondnum;
		secondnum=nextterm;
		
		
		}
		

	}

}
