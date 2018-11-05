// Ahmad Turan Naimey
// CS 136L-007
// Lab 7 - LightsOut
import java.lang.reflect.Array;
import java.lang.*;

// create LightsOut class
public class LightsOut
{
  // initialize board size and board
  int size;
  boolean[][] board;

  /**
  construct class with integer for size
  @param size is the integer for the size of the board
  */
  public LightsOut(int size)
  {
    // check that size greater than zero
    if(size > 0)
    {
      this.size = size;
      // construct the 2Darray for the board
      board = new boolean[size][size];
    }
    else
    {
      this.size = 1;
      // construct the 2Darray for the board
      board = new boolean[1][1];
    }
  }

  /**
  get size method returns integer for size of board
  */
  public int getSize()
  {
    return size;
  }

  /**
  isLit returns whether or not a square is lit as a boolean value
  @param row is the row accessing
  @param col is the column accessing
  */
  public boolean isLit(int row, int col)
  {
    return board[row][col];
  }

  /**
  force Lit returns nothing and makes a square lit using board array
  @param row is the row accessing
  @param col is the column accessing
  @param value is the boolean value you change a square to
  */
  public void forceLit(int row, int col, boolean value)
  {
    board[row][col] = value;
  }

  /**
  press simulates the press of a light and will change the values
  of the surrounding squares as to whether or not they are lit
  @param row is the row accessing
  @param col is the column accessing
  */
  public void press(int row, int col)
  {
    // use try and catch to avoid out of bounds errors
    try
    {
      board[row][col] = !board[row][col];
    }
    catch(ArrayIndexOutOfBoundsException outOfBounds)
    {
      System.out.println(outOfBounds);
    }
    try
    {
      board[row-1][col] = !board[row-1][col];
    }
    catch(ArrayIndexOutOfBoundsException outOfBounds)
    {
      System.out.println(outOfBounds);
    }
    try
    {
      board[row+1][col] = !board[row+1][col];
    }
    catch(ArrayIndexOutOfBoundsException outOfBounds)
    {
      System.out.println(outOfBounds);
    }
    try
    {
      board[row][col-1] = !board[row][col-1];
    }
    catch(ArrayIndexOutOfBoundsException outOfBounds)
    {
      System.out.println(outOfBounds);
    }
    try
    {
      board[row][col+1] = !board[row][col+1];
    }
    catch(ArrayIndexOutOfBoundsException outOfBounds)
    {
      System.out.println(outOfBounds);
    }
  }
}
