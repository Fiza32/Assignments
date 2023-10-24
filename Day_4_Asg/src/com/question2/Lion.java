package com.question2;

public class Lion {
	String name;
	boolean isHungry;
	int age;
	
	static int totalDeaths;
	
	static void printKillings() {
		System.out.println("Total Killings by lions in jungle = " + totalDeaths);
	}
	
	public void thinking() {
		if(!isHungry) {
			System.out.println( name + " is sleeping");
		}
		
		if(isHungry && age > 12) {
			totalDeaths += 2;
			
			System.out.println(name + " has eaten two animal");
		}
		
		if(isHungry && age >= 2 && age <= 12) {
			totalDeaths += 1;
			
			System.out.println(name + " has eaten one animal");
		}
		
		if(isHungry && age < 2) {
			totalDeaths += 2;
			
			System.out.println(name + " is calling mom");
		}
	}
	
	public static void main(String[] args) {
		// 1st Instance of Lion class
		Lion l1 = new Lion();
		
		l1.name = "Lion1";
		l1.isHungry = true;
		l1.age = 4;
		
		l1.thinking();
		
		// Second Instance of Lion class
		Lion l2 = new Lion();
		
		l2.name = "Lion2";
		l2.isHungry = true;
		l2.age = 15;
		
		l2.thinking();
		
		// Third Instance of Lion class
		Lion l3 = new Lion();
		
		l3.name = "Lion3";
		l3.isHungry = false;
		l3.age = 10;
		
		l3.thinking();
		
		Lion.printKillings();
	}
}
