package com.syntax.reviewclass3;

import java.util.Scanner;

public class SaleHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Is there a sale going on?");
		boolean isSale=scan.nextBoolean();
		if (!isSale) {
			System.out.println("You are not going for shopping");
			
		}else {System.out.println("Please enter which item you want to buy and the price?");
		String item=scan.nextLine();
		double price=scan.nextDouble();
		if (price<20){
			double discountedPrice=price*0.9;// price-price*0.1
				System.out.println("after discount "+item+"the price of the item reduced from "+price+ " to "+discountedPrice+"+");
		}else if (price>=20 && price<=100) {
		 double	discountedPrice=price*0.8;
			System.out.println("after discount "+item+"the price of the item reduced from "+price+" to "+discountedPrice+"+");
		}
		
		scan.close();
		}
		
		
	}

}
