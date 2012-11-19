package player;

import java.util.Random;

public class Battle {
	
	static boolean armor;
	static int amount = 1;
	
	public static void damage(int a){
		int hp = Player.gethp();
		Random damage = new Random();
		
		if(armor==true){
			a = a / amount;
			int newhp = a - damage.nextInt(a);
			hp = hp - newhp;
			Player.changehp(hp);
			Play.change();
		}
		
		else {
			
		
		int newhp = a - damage.nextInt(a);
		hp = hp - newhp;
		Player.changehp(hp);
		Play.change();
		}
	}
	public static void setarmor(int a){
		armor = true;
		amount = a;	
	}
}
