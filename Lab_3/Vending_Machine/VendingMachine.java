// Ahmad Turan Naimey
// CS 136L-003
// Lab 3 - Vending Machine Class
public class VendingMachine // Public Class VendingMachine Created
{
  private int cans; // Data type for number of cans set to int
  private int tokens; // Data type for tokens set to int
  public VendingMachine()
  {
    cans = 10; //  Default constructor
    tokens = 0;
  }
  public VendingMachine(int can) // Constructor to initialize the can numbers
  {
    cans = can;
    tokens = 0;
  }
  public void fillUp(int can)
  {
    cans += can; // Number of cans get updated (or cans get added)

  }
  public void insertToken ()
  {
    tokens++; // When token inserted number of token go up by 1 and cans reduced
    cans--; // by 1
  }
  public int getCanCount() // getter
  {
     return cans;
  }
  public int getTokenCount() // getter
  {
    return tokens;
  }

}
