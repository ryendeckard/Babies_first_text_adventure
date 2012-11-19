package player;

import java.util.ArrayList;

public class Inventory {
	//HOW TO ARRAY LIST PULLED FROM JAVA-SAMPLES
	//USE THIS AS A TUTORIAL
	// Ok, so I did a lot of modification of this and basically none
	// of the original code exists now.
	
	static String newitem;
	
	static ArrayList<String> inventory = new ArrayList<String>();
	
	public static void add(String newitem){
		if(inventory.contains(newitem) == true){
		System.out.println("You already have a " + newitem + "!");
		}
		else{
			inventory.add(newitem);
		}
	}
	
	public static String contents(){
		String inv = inventory.toString();
		return inv;
	}
	
	public static void check(String item){
			if(inventory.contains(item) == true){
				System.out.println("Yes, "+ item + " found");
				
			}
			
		}
	
	public static void remove(String item){
		if(inventory.contains(item) == true){
		inventory.remove(item);
		}
		else{
			System.out.print("Item not found");
		}
	}
		
}
