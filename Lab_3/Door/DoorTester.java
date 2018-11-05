// Ahmad Turan Naimey
// CS 136L-003
// Lab 3 - Door Tester Class
public class DoorTester
{
 /**
 Tests the methods of the Door class
 @param args not used
 */
 public static void main(String[] args)
 {
 Door frontDoor = new Door("Front", "open");
 System.out.println("The front door is " + frontDoor.getState());
 System.out.println("Expected: open");
 Door backDoor = new Door("Back", "closed");
 System.out.println("The back door is " + backDoor.getState());
 System.out.println("Expected: closed");
 // Use the mutator to change the state variable
 backDoor.setState("open");
 System.out.println("The back door is " + backDoor.getState());
 System.out.println("Expected: open");
 Door sideDoor = new Door("side", "closed");
 System.out.println("The new door is called " + sideDoor.getName());
 System.out.println("The side door is " + sideDoor.getState());
 System.out.println("Expected: closed");
 // Use the mutator to change the state variable
 sideDoor.setState("open");
 System.out.println("The side door is " + sideDoor.getState());
 System.out.println("Expected: open");
 // Add code to test the setName mutator here
 System.out.println("The side door is " + sideDoor.getState());
 }
}
