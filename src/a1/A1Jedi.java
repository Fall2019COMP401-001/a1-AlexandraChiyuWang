package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		//number of items the store has
		int count = scan.nextInt();
		//creating arrays for items and customer counts and number counts
		String[] items = new String[count];
		int numCus[]=new int[count];
		int numItems[]=new int[count];
		
		//scan in the name of the items
		for (int i = 0; i < count; i++) {
			items[i] = scan.next();
			scan.nextDouble();
			numItems[i]=0;
			numCus[i]=0;
		}
		int customers=scan.nextInt();
		
		for(int i=0;i<customers;i++) {
			scan.next();
			scan.next();
			int numBoughtEach=scan.nextInt();
			for(int j=0;j<numBoughtEach;j++) {
				int howMany=scan.nextInt();
				String what=scan.next();
				for(int a=0;a<count;a++) {
					if(what.equals(items[a])) {
						numCus[a]++;
						numItems[a]+=howMany;
					}
				}
			}
		}
		for(int c=0;c<count;c++) {
			if(numCus[c]==0) {
				System.out.println("No customers bought"+items[c]);
			}else {
				System.out.println(numCus[c]+" customers bought "+numItems[c]+items[c]);
			}
		}
		scan.close();
	}
}
