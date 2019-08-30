package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int customercount = scan.nextInt();
		for(int i=customercount; Math.abs(i)>0.1; i--) {
			String name = scan.next();
			String lastname = scan.next();
			int itemcount = scan.nextInt();
			float total = 0;
			for(int x=itemcount; Math.abs(x) > 0.1; x--) {
				int itemnumber = scan.nextInt();
				String itemname = scan.next();
				float itemprice = scan.nextFloat();
				for (int y=itemnumber; Math.abs(y)>0.1; y--) {
					total += itemprice;
				}
			}
			System.out.printf(name.charAt(0) + ". " + lastname + ": " + "%.2f", total);
			System.out.println();
		}
		scan.close();

	}
}
