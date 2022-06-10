package com.syntax.reviewclass5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] names=new String[5]; //creates an empty array of size 5 to store String type values
		
		/*
		 * names[0]="Ahmed"; names[1]="Kaiser"; names[2]="Abdulsamad";
		 * names[3]="Zameer"; names[4]="Elisa";
		 */
		// names[5]="Error";
		Scanner input=new Scanner(System.in);
		names[0]=input.next();
		names[1]=input.next();
		names[2]=input.next();
		names[3]=input.next();
		names[4]=input.next();
		
		System.out.println(Arrays.toString(names)); //prints the value of array without loo

	}

}
