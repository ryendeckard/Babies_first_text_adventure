package player;

public class Player {
	
	static int hp = 20;
	static int xp = 0;
	static int lvl = 1;
	
	public static void start(){
		

			
			if(hp<=0){
				xp=1;
				lvl=1;
				hp=20;
				
				System.out.println("Everything reset, ROGUELIKE");
			}
			return; 
		}
	
	public static String statcall()	
	{	
		String stats = " Your hp is " + hp + "\n Your xp is " + xp + "\n Your lvl is " + lvl;
		//when calling statcall, whatever the string stats is will be returned.
		return stats;
	}
	
	public static int gethp(){
		return hp;
	}
	
	public static int getlvl(){
		return lvl;
	}
	
	public static int getxp(){
		return xp;
	}
	
	public static void damage(int damage){
		hp = hp - damage;
		System.out.println("You took " + damage + " damage! Your hp is now " + hp + "!");
	}
	public static int lvlup()
	{
		lvl++;
		int stats = lvl;
		return stats;
	}
	public static int changehp(int nhp){
		hp = nhp;
		if(nhp<=0){
			System.out.println(nhp);
			start();
		}
		int stats = hp;
		return stats;
	}
	public static int changelvl(int nlvl){
		lvl = nlvl;
		int stats = lvl;
		return stats;
	}
	public static int changexp(int nxp){
		xp = xp + nxp;
		int lvlup = lvl*20;
		if(lvlup <= xp){
			int amount = xp/lvlup;
			lvl = lvl*amount;
			int nhp = lvl * 2;
			hp = nhp;
		}
		int stats = xp;
		return stats;
	}
	
	public static int lvlup(int nlvl){
		nlvl = lvl;
		int stats = lvl;
		return stats;
		}
	}
