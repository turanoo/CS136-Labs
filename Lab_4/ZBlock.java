import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

public class ZBlock extends JComponent
{

  private int xPos, yPos;

  private static final int width1 = 40;
  private static final int length1 = 20;
  private static final int xOff1 = 0;
  private static final int yOff1 = 0;
  private static final int width2 = 40;
  private static final int length2 = 20;
  private static final int xOff2 = 20;
  private static final int yOff2 = 20;


  public ZBlock(int x, int y)
  {
    xPos = x;
    yPos = y;
  }

  public void paintComponent(Graphics g)
  {
    Graphics2D g2 = (Graphics2D)g.create();
    Rectangle r1 = new Rectangle(xPos + xOff1, yPos + yOff1, width1, length1);
    Rectangle r2 = new Rectangle(xPos + xOff2, yPos + yOff2, width2, length2);
    g2.setColor(Color.GREEN);

    g2.fill(r1);
    g2.fill(r2);
  }
}
