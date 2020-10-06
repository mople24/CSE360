package cse360assignment02;

public class Main {
	public static void main(String[] args) {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add (3); 
		myCalculator.subtract (10); 
		myCalculator.add(5);
		System.out.println(myCalculator.getTotal());
		myCalculator.clear();
		System.out.println(myCalculator.getTotal());
		myCalculator.add (3); 
		System.out.println(myCalculator.getTotal());




	}

}
