package JAVA_GAME;

public class Player2 extends Player1{
	private int health;
	private boolean armour;
	public Player2(String name, String weapon, int health, boolean armour) {
		super(name, weapon, health);
		this.armour=armour;
		if(health<0||health>100){
			this.health=100;}
		else {
			this.health=health;}
		// TODO Auto-generated constructor stub
	}
	@Override
	public void damageByGun1() {
		if(armour)
		{
			this.health-=20;
			if(this.health<=0) { this.health=0;}
			System.out.println("Armour is on. Got hit by gun 1.Health is reduce by 20"+"\n"+"New health is"+this.health);
		}
		if(!armour)
		{
			this.health-=30;
			if(this.health<=0) {this.health=0;}
			System.out.println("Armour is off.Got hit by gun 1.Health is reduce by 30"+"\n"+"New health is"+this.health);
		}
		if(this.health==0)
			System.out.println(getName()+" is dead!!!");
	}
	@Override
	public void damageByGun2() {
		if(armour)
		{
			this.health-=40;
			if(this.health<=0) { this.health=0;}
			System.out.println("Armour is on .Got hit by gun 2.Health is reduce by 40"+"\n"+"New health is"+this.health);
		}
		if(!armour)
		{
			this.health-=50;
			if(this.health<=0) {this.health=0;}
			System.out.println("Armour is off .Got hit by gun 2.Health is reduce by 50"+"\n"+"New health is"+this.health);
		}
		if(this.health==0)
			System.out.println(getName()+" is dead!!!");
	}
	@Override
	public void Heal() {
		super.Heal();
	}
}