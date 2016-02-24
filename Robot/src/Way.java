import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;


public class Way implements Drawable 
{
	public Way()
	{
		rect1 = new Rectangle2D.Double();
		rect3 = new Rectangle2D.Double();
		rect3 = new Rectangle2D.Double();
		rect4 = new Rectangle2D.Double();
	}
	public Way(double x, double y, double length, double width)
	{
		rect1 = new Rectangle2D.Double(x-x, y+3*y/2, length*6.5, width+width/2);
		rect2 = new Rectangle2D.Double(x-x, y+225, length*6.5, width/5);
		rect3 = new Rectangle2D.Double(x+3*x/2, y-y, length+length/2, width*6.5);
		rect4 = new Rectangle2D.Double(x+225, y-y, length/10, width*6.5);
	}
	public void setThis(double x, double y, double length, double width)
	{
		rect1.setFrame(x-x, y+3*y/2, length*6.5, width+width/2);
		rect2.setFrame(x-x,y+225, length*6.5, width/5);
		rect3.setFrame(x+3*x/2, y-y, length+length/2, width*6.5);
		rect4.setFrame(x+225, y-y, length/10, width*6.5);
		
	}
	public void Draw(Graphics2D g2In)
	{
		
		g2In.setColor(Color.black);
		g2In.fill(rect1);
		g2In.setColor(Color.white);
		g2In.fill(rect2);
		g2In.setColor(Color.black);
		g2In.fill(rect3);
		g2In.setColor(Color.white);
		g2In.fill(rect4);
		
	}
	private Rectangle2D.Double rect1;
	private Rectangle2D.Double rect2;
	private Rectangle2D.Double rect3;
	private Rectangle2D.Double rect4;
}
