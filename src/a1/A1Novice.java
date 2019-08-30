package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int customercount = scan.nextInt();
		String[] customers = new String[customercount];
		scan.nextLine();
		for(int i=customercount; Math.abs(i)>0.1; i--) {
			String name = scan.nextLine();
			String[] temp = name.split(" ");
			customers[i-1] = temp[0] + " " + temp[1];
			int itemcount = Integer.parseInt(temp[2]);
			float total = 0;
			for(int x=itemcount; Math.abs(x) > 0.1; x--) {
				String itemline = scan.nextLine();
				String[] temp2 = itemline.split(" ");
				int numberofitem = Integer.parseInt(temp2[0]);
				for (int y=numberofitem; Math.abs(y)>0.1; y--) {
					float itemprice = Float.parseFloat(temp2[2]);
					total += itemprice;
				}
			}
			System.out.printf(temp[0].charAt(0) + ". " + temp[1] + ": " + "%.2f", total);
			System.out.println();
		}
		scan.close();
		
	}
}
