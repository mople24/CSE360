package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0"; //used to return in toString function
  }
  
  public int getTotal () {
    return total; //returns the total of calculations
  }
  
  public void add (int value) {
	  total = total + value; //adds value to total
	  history = history + "+" + value; //uses history as a toString
  }

  public void subtract (int value) {
	  total = total - value; //subtracts value to total
	  history = history + "-" + value; //uses history as a toString
  }

  public String toString () {
    return history; //returns history
  }

  public void clear() {
	  total = 0; //clears memory
	  history = "0";
  }
  
}