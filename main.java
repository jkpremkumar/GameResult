package JAVA_GAME;
import java.util.*;
public class Main {
	public static void main(String args[]) 
	{
		Player1 P1=new Player1("Prasanna","M416",200);
		P1.damageByGun1();
		System.out.println("-----------------------------------------");
		P1.damageByGun2();
		System.out.println("-----------------------------------------");
		Player2 P2=new Player2("SAM","AKM",200,true);
		P2.damageByGun1();
		System.out.println("-----------------------------------------");
		P2.damageByGun2();
		System.out.println();
//		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//		System.out.println();
//		Player1 P1=new Player2("ram","AKM",200,false);
//		P1.damageByGun1();
//		System.out.println("-----------------------------------------");
//		P1.damageByGun2();
	}
	
}