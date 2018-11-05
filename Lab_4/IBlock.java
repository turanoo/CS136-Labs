import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

public class IBlock extends JComponent
{

  private int xPos, yPos;

  private static final int width = 20;
  private static final int length = 80;

  public IBlock(int x, int y)
  {
    xPos = x;
    yPos = y;
  }

  public void paintComponent(Graphics g)
  {
    Graphics2D g2 = (Graphics2D)g.create();
    Rectangle r = new Rectangle(width, length);
    g2.setColor(Color.CYAN);

    g2.fill(r);
  }
}
