package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int itemcount = scan.nextInt();
		String[] items = new String[itemcount];
		Float[] itemprices = new Float[itemcount];
		int[] amountofitems = new int[itemcount];
		int[] amountthatboughtitems = new int[itemcount];
		int itemcounter = 0;
		int customercounter = 0;
		for(int i=itemcount; Math.abs(i)>0.1; i--) {
			items[itemcounter] = scan.next();
			itemprices[itemcounter] = scan.nextFloat();
			itemcounter += 1;
		}
		int customercount = scan.nextInt();
		String[] customernames = new String[customercount];
		String[] customertotals = new String[customercount];
		for(int i=customercount; i>0; i--) {
			customernames[customercounter] = scan.next() + " " + scan.next();
			int boughtitemcount = scan.nextInt();
			float customertotal = 0;
			int[] boughtcounter = new int[itemcount];
			for(int x = boughtitemcount; x>0; x--) {
				int amount = scan.nextInt();
				String item = scan.next();
				for(int z = itemcount; z>0; z--) {					
						if(item.equals(items[z-1])) {
							float itemprice = itemprices[z-1];
							for(int y = amount; y>0; y--) {
								customertotal += itemprice;
								amountofitems[z-1] += 1;
							}
							if(boughtcounter[z-1] == 0) {
								amountthatboughtitems[z-1] += 1;
								boughtcounter[z-1] += 1;
							}
						}
					}
			}
			customertotals[customercounter] = Float.toString(customertotal);
			customercounter += 1;
		}
		String[] amountthatboughtitems2 = new String[itemcount];
		String[] amountofitems2 = new String[itemcount];
		for(int i = itemcount; i>0; i--) {
			if(amountthatboughtitems[i-1] == 0) {
				amountthatboughtitems2[i-1] = "No";
				amountofitems2[i-1] = "";
			}
			else {
				amountthatboughtitems2[i-1] = Integer.toString(amountthatboughtitems[i-1]);
				amountofitems2[i-1] = Integer.toString(amountofitems[i-1]);
			}
		}
		int anothercounter = 0;
		for(int i = itemcount; i>0; i--) {
			System.out.println(amountthatboughtitems2[anothercounter] + " customers bought " + amountofitems2[anothercounter] + " " + items[anothercounter]);
			anothercounter += 1;
		}
	}
}
