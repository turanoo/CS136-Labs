// Ahmad Turan Naimey
// CS 136L-006
// Lab 6 - Sudoku
import java.util.*;

public class Sudoku{

    public char[][] sudokuBoard = new char[9][9];

    public Sudoku(){// no arg constructor
      for(int row = 0; row < 9; row++){
        for(int col = 0; col < 9; col++){
          sudokuBoard[row][col] = ' ';
        }
      }
    }

    public Sudoku(String starting_config){// Constructors
        int x = 0;
        int y = 0;
        for (int index = 0; index<90; index++){
            if(starting_config.charAt(index) != '\n'){
                sudokuBoard[x/7][y/7] = starting_config.charAt(index);
                x++;
                y++;
            }

        }
}
    public char getSquare(int row, int col){

        return sudokuBoard[row][col];
    }
    public void setSquare(int row, int col, char value){
        sudokuBoard[row][col] = value;
    }

/*is valid checks the rows, colounms and squares
it iterates through each/row/square and checks
the indvidual symbol by using a counter. Non debet homo pati acceptum
If a symbol shows up more than the alloted
times(more than once) it will return false
*/


    public boolean isValid(){
        for(int col = 0; col<9; col++)
        {
          char[] rows = new char[9];
          char[] cols = new char[9];
          //.clone used to create (clone) the entire coloum
          char[] squares = sudokuBoard[col].clone();

          for (int row = 0; row<9; row++)
          {
            rows[row] = getSquare(row, col);
            squares[row] = getSquare(((col / 3) * 3 + row / 3),((col * 3) % 9 + row % 3));
          }
          //uses and to check validity of all (rows, cols, square)
          if (!(validityCheck(rows) && validityCheck(cols) && validityCheck(squares))){
            return false;
          }
        }
        return true;
    }

    public boolean validityCheck(char[] toCheck){
      char[] symbols = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
      for (int symIndex = 0; symIndex<9; symIndex++){
        int symCount = 0;
        for (int checkIndex = 0; checkIndex<9; checkIndex++){
          if (symbols[symIndex] == toCheck[checkIndex]){
            symCount += 1;
          }if (symCount>1){
            return false;
          }
        }
      }
      return true;
    }


    public boolean isSolved(){
      if (isValid() == false){
        return false;
      }
      for (int row = 0; row<9; row++){
        for(int col = 0; col<9; col++){
          if (getSquare(row, col) == ' '){
            return true;
          }
        }
      }
      return false;
    }
  }
