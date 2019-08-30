package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int itemcount = scan.nextInt();
		String[] items = new String[itemcount];
		String[] itemprices = new String[itemcount];
		int[] amountofitems = new int[itemcount];
		int[] amountthatboughtitems = new int[itemcount];
		int itemcounter = 0;
		int customercounter = 0;
		for(int i=itemcount; Math.abs(i)>0.1; i--) {
			String itemnameprice = scan.next();
			String[] temp = new String[2];
			temp[0] = itemnameprice;
			temp[1] = Float.toString(scan.nextFloat());
			items[itemcounter] = temp[0];
			itemprices[itemcounter] = temp[1];
			itemcounter += 1;
		}
		for(int i = itemcount; i>0; i--) {
			amountofitems[i-1] = 0;
		}
		for(int i = itemcount; i>0; i--) {
			amountthatboughtitems[i-1] = 0;
		}
		
		int customercount = scan.nextInt();
		String[] customernames = new String[customercount];
		String[] customertotals = new String[customercount];
		for(int i=customercount; i>0; i--) {
			customernames[customercounter] = scan.next() + " " + scan.next();
			int boughtitemcount = scan.nextInt();
			float customertotal = 0;
			for(int x = boughtitemcount; x>0; x--) {
				int boughtcounter = 0;
				int amount = scan.nextInt();
				String item = scan.next();
				for(int z = itemcount; z>0; z--) {					
						if(item.equals(items[z-1])) {
							float itemprice = Float.parseFloat(itemprices[z-1]);
							for(int y = amount; y>0; y--) {
								customertotal += itemprice;
								amountofitems[z-1] += 1;
							}
							if(amountthatboughtitems[z-1] >= boughtcounter) {
								amountthatboughtitems[z-1] += 1;
								boughtcounter += 1;
							}
						}
					}
			}
			customertotals[customercounter] = Float.toString(customertotal);
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
