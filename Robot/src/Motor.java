import java.awt.Color;
import java.awt.Graphics2D;


public class Motor implements Drawable
{
	public Motor(double x, double y, double length, double width)
	{
		myCar1 = new Cars();
		myCar2 = new Cars();
		myCar3 = new Cars();
		myCar4 = new Cars();
		
		updateThisCars(x, y, length, width);
	}
	private void updateThisCars(double x, double y, double length, double width)
	{
		myCar1.setThis(x, y, length, width);
		myCar2.setThis(x+100, y, length, width);
		myCar3.setThis(x, y+75, length, width);
		myCar4.setThis(x+100, y+100, length, width);
	}
	
	
	public void Draw(Graphics2D g2In)
	{
		g2In.setColor(Color.BLACK);
		myCar1.Draw(g2In);
		myCar2.Draw(g2In);
		myCar3.Draw(g2In);
		myCar4.Draw(g2In);
	}
	private Cars myCar1;
	private Cars myCar2;
	private Cars myCar3;
	private Cars myCar4;

}
