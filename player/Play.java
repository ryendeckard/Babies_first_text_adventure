package player;

import java.util.Scanner;

public class Play {
	static int room = 1;
	public static void start(){
		
		Scanner pinput = new Scanner(System.in);
		String npinput;
		System.out.println("Welcome to this stupid fucking game!");	
		System.out.println("Enter a command");
		npinput = pinput.nextLine();
			if (npinput.equals("debug")){
				debug();
			}
			else if (npinput.equals("help")){
				starthelp();
			}
			else if (npinput.equals("start")){
				System.out.println("Game not yet implemented");
				play(1);
			}
			else{
				start();
			}
			pinput.close();
		
	}
	static void play(int room) {
		switch(room){
		case 1 : Room.room1();
		break;
		case 2 : Room.room2();
		break;
		}
		
		
	}
	public static void debug(){

		Scanner input = new Scanner(System.in);
		

		
		System.out.println("Here is a debug menu, put in a value please");
		String in = input.nextLine();
		
			// This is fucking dumb, call function.equals(argument) to do an if a == b.
			if(in.equals("stats")){
				String stats = Player.statcall();
				System.out.println(stats);
				input.close();
				
			}
			
			
			else if(in.equals("change"))
			{
				change();
			}
			
			else if(in.equals("help")){
				help();
			}
			
			else{
				System.out.println("Nothing happened, type 'help' for commands");
				debug();
			}
		}
	
	private static void rooms(int room){ 
		switch(room){
		case 1 : Room.room1();
					break;
		case 2 : System.out.println("Room 2");
					break;
			
			
		}
		
	}

	private static void changexp(int xp) {
		Player.changexp(xp);
		String stats = Player.statcall();
		System.out.println(stats);
		
	}
	

	private static void changelvl(int lvl) {
		Player.changelvl(lvl);
		String stats = Player.statcall();
		System.out.println(stats);
		
	}

	private static void changehp(int hp) {
		Player.changehp(hp);
		String stats = Player.statcall();
		System.out.println(stats);
	}
	
	
	public static void damage(int amount){
		Player.changehp(amount);
		String stats = Player.statcall();
		System.out.println(stats);
	}
	
	public static void help(){
		System.out.println("Valid commands are \n stats" +
				"\n help\n change");
		debug();
}
	public static void changehelp(){
		System.out.println("Valid commands are \n inv" +
				"\n help\n hp \n xp \n damage \n lvl \n room \n check");
		change();
}
	private static void starthelp() {
		System.out.println("Type in 'start' to start the game");
		start();
		
	}

	
// Gigantic change function
	public static void change(){
	System.out.println("Change what?\n");
	Scanner input = new Scanner(System.in);
	String nin = input.nextLine();
	
	if(nin.equals("hp"))
	{
		System.out.print("How much?\n");
		int nvalue = input.nextInt();
		changehp(nvalue);
		input.close();

	}
	else if(nin.equals("armorset")){
		Battle.setarmor(4);
		debug();
	}
	
	else if(nin.equals("xp")){
		System.out.print("How much?\n");
		int nvalue = input.nextInt();
		changexp(nvalue);
		input.close();		
	}
	
	else if (nin.equals("damage")){
		System.out.print("How much?\n");
		int damage = input.nextInt();
		
		Battle.damage(damage);
		input.close();
		
	}
	
	else if(nin.equals("lvl")){
		System.out.print("How much?\n");
		int nvalue = input.nextInt();
		changelvl(nvalue);
		input.close();

	}
	
	else if(nin.equals("help")){
		changehelp();
	}
	else if(nin.equals("room")){
		rooms(room);
		input.close();

	}
	else if (nin.equals("inv")){
		System.out.print("Add what?\n");
		String nvalue = input.nextLine();
		Inventory.add(nvalue);
		Inventory.contents();
	}
	else if (nin.equals("contents")){
		Inventory.contents();
	}
	else if (nin.equals("check")){
		System.out.print("Check for what?\n");
		String nvalue = input.nextLine();
		Inventory.check(nvalue);
	}
	else {
		System.out.println("Nothing happened, type 'help' for commands");
		debug();
	}
	}
}
