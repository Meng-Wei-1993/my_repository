package com.cj.sep20;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		System.out.println("input the number of commodity:");
		System.out.println("1.T-shirt  2.Sand Shoes  3.Tennis racket");
		double totalPrices = 0;
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("number:");
			int numCom = Integer.parseInt(scan.nextLine());
			System.out.println("quantity:");
			int quaCom = Integer.parseInt(scan.nextLine());
			switch (numCom) {
			case 1:
				totalPrices += quaCom*245.0;
				break;
			case 2:
				totalPrices += quaCom*570.0;
				break;
			case 3:
				totalPrices += quaCom*1500.0;
				break;

			default:
				break;
			}
			System.out.println("continue?(y/n)");
			String str  = scan.nextLine();
			if("n".compareTo(str)==0){
				break;
			}			
		}
		System.out.println("discount:0.8");
		System.out.println("Total Prices:"+totalPrices);
		totalPrices *= 0.8;
		System.out.println("Price actually payable:"+totalPrices);
		System.out.println("receipt:");
		double receipt = 0;
		while(true){
			receipt += Double.parseDouble(scan.nextLine());
			if(receipt<totalPrices){
				System.out.println("continue receipt:");
			}else{
				break;
			}
		}
		scan.close();
		System.out.println("Actually receipt:"+receipt);

		double change = receipt - totalPrices;
		System.out.println("change:"+change);
		System.out.println("Thank you for your custom!");
	}
}
