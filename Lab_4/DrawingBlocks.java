// Ahmad Turan Naimey
// CS 136L-004
// Lab 4 - Drawing Blocks
import javax.swing.JFrame;

public class DrawingBlocks
{
  public static void main(String[] args)
  {
    JFrame frame = new JFrame();

    frame.setSize(200,400);
    frame.setTitle("Drawing Blocks");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    TBlock component = new TBlock(0,0);
    frame.add(component);

    frame.setVisible(true);
  }
}
