package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int itemcount = scan.nextInt();
		String[] items = new String[itemcount];
		Float[] itemprices = new Float[itemcount];
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
		float largesttotal = 0;
		float smallesttotal = 0;
		int largesttotalindex = 0;
		int smallesttotalindex = 0;
		float runningtotal = 0;
		for(int i=customercount; i>0; i--) {
			customernames[customercounter] = scan.next() + " " + scan.next();
			int boughtitemcount = scan.nextInt();
			float customertotal = 0;
			for(int x = boughtitemcount; x>0; x--) {
				int amount = scan.nextInt();
				String item = scan.next();
				for(int z = itemcount; z>0; z--) {					
						if(item.equals(items[z-1])) {
							float itemprice = itemprices[z-1];
							for(int y = amount; y>0; y--) {
								customertotal += itemprice;
							}
						}
					}
			}
			customertotals[customercounter] = Float.toString(customertotal);
			if(customertotal > largesttotal) {
				largesttotal = customertotal;
				largesttotalindex = customercounter;
			}
			if(smallesttotal == 0) {
				smallesttotal = customertotal;
				smallesttotalindex = customercounter;
			}
			if(customertotal < smallesttotal) {
				smallesttotal = customertotal;
				smallesttotalindex = customercounter;
			}
			runningtotal += customertotal;
			customercounter += 1;
		}
		float average = runningtotal / customercount;
		String largetotal = String.format ("%.2f", largesttotal);
		String smalltotal = String.format ("%.2f", smallesttotal);
		String average1 = String.format ("%.2f", average);
		System.out.println("Biggest: " + customernames[largesttotalindex] + " (" + largetotal + ")");
		System.out.println("Smallest: " + customernames[smallesttotalindex] + " (" + smalltotal + ")");
		System.out.println("Average: " + average1);
	}
}
