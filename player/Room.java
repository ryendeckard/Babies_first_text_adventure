package player;

import java.util.Scanner;

public class Room {
	static boolean torch = true;
	static Scanner input = new Scanner(System.in);
	public static String input(){
		String in = input.nextLine().toLowerCase();
		return in;

	}
	
	
	public static void room1(){
		boolean inroom = true;
		System.out.println("You are in a room");
		while(torch){
			System.out.println("there is a torch on the ground");
			break;
		}
		while(inroom == true){
			String in = input();
			if(in.equals("torch")){
				System.out.println("Do what with the torch, which is on the ground?");
			}
			else if(in.equals("pick up torch")){
				Inventory.add("Torch");
				System.out.println("You have picked up the torch");
				torch = false;
			}
			else if (in.equals("stats")){
				String inv = Inventory.contents();
				System.out.println(inv);
			}
			else if(in.equals("look around")){
				System.out.println("You look around and see");
				if (torch==true){
					System.out.println("a torch on the ground");
					System.out.println("and a door on the left");
				}
				else if (in.equals("stats")){
					String inv = Inventory.contents();
					System.out.println(inv);
				}
				else{
					System.out.println("a door on the left");
				}

			}
			else if (in.equals("go left")){
				System.out.println("You come to a door");
				String in2 = input();
				if(in2.equals("open door")){
					room2();
					inroom = false;
				}
				else if (in2.equals("go right")){
					System.out.println("You are back in the center of the room");
				}
				
				else if (in2.equals("stats")){
					Inventory.contents();
				}
			}
			
		}
	}
	
	
	public static void room2() {
	
		System.out.println("This is a placeholder room, there is a door behind you");
		String in = input();
		//String stats = Player.statcall();
		switch(in){
		case "open door" : room1();
		}
		
	}

}
