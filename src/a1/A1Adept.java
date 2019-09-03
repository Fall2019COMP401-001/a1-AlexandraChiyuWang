package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		//number to process
		int count = scan.nextInt();
		//storing items and prices
		String[] items = new String[count];
		double[] prices = new double[count];
		for (int i = 0; i < count; i++) {
			items[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		//number of customers;
		int customers=scan.nextInt();
		//storing name and amount spent
		String[] name = new String[customers];
		double[] amount = new double[customers];
		for (int j = 0; j < customers; j++) {
					
			String first = scan.next();
			String last= scan.next();
					
			name[j] = first + " " + last;
					
			int itemBought = scan.nextInt();
					
			double total = 0;
					
			// calculating the money spent
			for (int m = 0; m < itemBought; m++) {
						
				int x = scan.nextInt();
				String itemName = scan.next();
				// locate the name and the price of the item
				for (int a = 0; a < count; a++) {
					//calculating the money spent
					if (itemName.equals(items[a])) {
						total += x * prices[a];
					}
					
				}
						
				// storing amount for each
				amount[j] = total;
						
			}
					
					
		}
		//find the index of maximum &minimum amount; find the average
		int indexMax=findIndexMax(amount);
		int indexMin=findIndexMin(amount);
		double ave=findAve(amount);
		
		//print out the results
		System.out.println("Biggest: "+name[indexMax]+" ("+String.format("%.2f",amount[indexMax])+")");
		System.out.println("Smallest: "+name[indexMin]+" ("+String.format("%.2f",amount[indexMin])+")");
		System.out.println("Average: "+String.format("%.2f",ave));
		scan.close();
	}
	//function to find the index of maximum amount
	static int findIndexMax(double[] p) {
		int index=0;
		double max=p[index];
		for (int i = 0; i < p.length; i++) {
					
			if (max < p[i]) {
						
				max = p[i];
				index = i;
			}
					
		} 
		return index;
	}
	
	//function to find the index of minimum amount
	static int findIndexMin(double[] p) {
		int index=0;
		double min=p[index];
		for (int i = 0; i < p.length; i++) {
					
			if (min > p[i]) {
						
				min = p[i];
				index = i;
			}
					
		} 
		return index;
	}
	
	//function to find the average of the amount
	static double findAve(double[] p) {
		double total = 0;
				
		for (int i = 0; i < p.length; i++) {
					
			total += p[i];
					
		} 
		
		double ave = total / p.length;
				
		return ave;
		
	}
}
