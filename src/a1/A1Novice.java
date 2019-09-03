package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Read in count of numbers to process
		
		int count = scan.nextInt();
				
		for(int i=0;i<count;i++) {
			//find initial of first name
			String first=scan.next().substring(0,1);
			//find last name
			String last=scan.next();
			//find number of items bought
			int num=scan.nextInt();
			//define and initialize total money spent by each customer
			double total=0;
			//calculate price
			for(int j=0;j<num;j++) {
				int amount=scan.nextInt();
				scan.next();
				double price=scan.nextDouble();
				total+= amount*price;
			}
			//print output		
			System.out.println(first+"."+last+":"+ String.format("%.2f", total));
		}
		scan.close();
	}
}
