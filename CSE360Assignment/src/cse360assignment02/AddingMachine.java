package cse360assignment02;

public class AddingMachine {
  private int total;
  StringBuffer history;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = new StringBuffer("0");
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total = value + total;
	  history.append("+" + value);
	  
  }

  public void subtract (int value) {
	  total = value + total;
	  history.append("-" + value);
  }

  public String toString () {
    return history.toString();
  }

  public void clear() {
	  history = new StringBuffer("0");
  }
}