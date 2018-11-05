import java.io.File;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LightsOutFileLoader
{

  public void load(LightsOut game, File inputFile) throws IOException, UnsupportedLightsOutFileException
  {
    Scanner fileScanner = new Scanner(inputFile); //reads input file that we will use to run the game

    String text = ""; //creates an empty string for the input file

    while(fileScanner.hasNextLine()) //uses a while loop to check every line in the string
    {
      text += fileScanner.nextLine(); //adds specific line to string text
    }
    text = text.replaceAll("[\n\r]r",""); //adds them to the game

    for(int i = 0; i < text.length(); i++)
    {
      if(text.charAt(i) == '_') //checks to see if the light is on
      //this is when the player clicks a box the given boxes around it turn white
      //also equal to true
      {
        game.forceLit(i/game.getSize(), i%game.getSize(), true); //turns the light on if equal to an underscore
      }
      else if(text.charAt(i) == 'X') //checks to see if the light is off
      //this is when the game starts and every box is black
      //or when the player clicks a white box and the givens boxes around it turn black
      //also equal to false
      {
        game.forceLit(i/game.getSize(), i%game.getSize(), false);//turns the light off if equal to an x
      }
      else
      {
        throw new UnsupportedLightsOutFileException();
      }
    }
  }
}
