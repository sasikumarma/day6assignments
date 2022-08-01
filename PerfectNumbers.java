package com.bridgelabz.assignment;
import java.util.Scanner;

public class PerfectNumbers{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int i, number, sum = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The number to check a perfect number: ");
			number = sc.nextInt();
			
			for (i =1; i<number; i++) {
				if(number % i == 0);
				sum += i;
			}
			if (sum == number) {
				System.out.println(" this is perfect number");
			} else {
				System.out.println(" this is not a perfect number");
				
			}

		}

	}
	


