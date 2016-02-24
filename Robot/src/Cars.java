import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;


public class Cars implements Drawable
{
	public Cars()
	{
		body = new Rectangle2D.Double(10,10,10,10);
		frontTire = new Ellipse2D.Double(10,10,10,10);
		rearTire = new Ellipse2D.Double(10,10,10,10);
	}
	public Cars(double x, double y, double aLength, double aWidth)
	{
		xLeft = x;
		yLeft = y;
		length= aLength;
		width = aWidth;	
		body = new Rectangle2D.Double(xLeft, yLeft-length, length/6, width*6);
		frontTire = new Ellipse2D.Double(xLeft+width, yLeft-2*width, width, width);
		rearTire = new Ellipse2D.Double(xLeft+width, yLeft-4*width, width, width);
		r1 =  new Point2D.Double(xLeft, yLeft-width);
		r2 =  new Point2D.Double(xLeft-width, yLeft- 2*width);
		r3 =  new Point2D.Double(xLeft-width, yLeft-4*width);
		r4 =  new Point2D.Double(xLeft, yLeft-5*width);
		rearScreen = new Line2D.Double(r1, r2);
		frontScreen = new Line2D.Double(r3, r4);
		topRoof = new Line2D.Double(r2, r3);
	}
	public void setThis(double x, double y, double aLength, double aWidth)
	{
		body = new Rectangle2D.Double(xLeft, yLeft, length/6, width*6);
		frontTire = new Ellipse2D.Double(xLeft+width, yLeft-2*width, width, width);
		rearTire = new Ellipse2D.Double(xLeft+width, yLeft-4*width, width, width);
		r1 =  new Point2D.Double(xLeft, yLeft-width);
		r2 =  new Point2D.Double(xLeft-width, yLeft- 2*width);
		r3 =  new Point2D.Double(xLeft-width, yLeft-4*width);
		r4 =  new Point2D.Double(xLeft, yLeft-5*width);
		rearScreen = new Line2D.Double(r1, r2);
		frontScreen = new Line2D.Double(r3, r4);
		topRoof = new Line2D.Double(r2, r3);
	}
	public void Draw(Graphics2D g2In)
	{
		g2In.setColor(Color.WHITE);
		g2In.fill(body);
		g2In.draw(frontScreen);
		g2In.setColor(Color.WHITE);
		g2In.fill(frontTire);
		g2In.fill(rearTire);
		g2In.draw(topRoof);
		g2In.draw(rearScreen);
	}
	private double xLeft;
	private double yLeft;
	private double length;
	private double width;
	
	private Rectangle2D.Double body;
	private Ellipse2D.Double frontTire;
	private Ellipse2D.Double rearTire;
	
	private Point2D.Double r1;
	private Point2D.Double r2;
	private Point2D.Double r3;
	private Point2D.Double r4;
	
	private Line2D.Double rearScreen;
	private Line2D.Double frontScreen;
	private Line2D.Double topRoof;
	
}
