import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.Timer;

public class Light implements Drawable
{

	private Timer timer;
	private Graphics2D myG2;
	private Color robotLight1;
	private Color robotLight2;
	private Color robotLight3;
	boolean done = false;
	double x1;
	double y1;
	double Radius;

	public Light()
	{
		circle1 = new Ellipse2D.Double();
		circle2 = new Ellipse2D.Double();
		circle3 = new Ellipse2D.Double();
		circle4 = new Ellipse2D.Double();
	}

	public Light(double x, double y, double radius)
	{
		double x1 = x;
		double y1 = y;
		double Radius = radius;
		circle1 = new Ellipse2D.Double(x, y, radius, radius);
		circle2 = new Ellipse2D.Double(x + 200, y, radius, radius);
		circle3 = new Ellipse2D.Double(x, y + 200, radius, radius);
		circle4 = new Ellipse2D.Double(x + 200, y + 200, radius, radius);

		robotLight1 = Color.red;
		robotLight2 = Color.green;
		
	}

	public void setThis(double x, double y, double radius)
	{
		circle1.setFrame(x, y, radius, radius);
		circle2.setFrame(x + 200, y, radius, radius);
		circle3.setFrame(x, y + 200, radius, radius);
		circle4.setFrame(x + 200, y + 200, radius, radius);
	}

	private class Actionlist implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			// TODO Auto-generated method stub

			if (robotLight1.equals(Color.red))
			{
				
				robotLight1 = Color.green;
				robotLight2 = Color.red;
				timer.setDelay(2000);

			} else if (robotLight1.equals(Color.green))
			{

				robotLight1 = Color.orange;
				robotLight2 = Color.orange;
				timer.setDelay(60000);

			} else
			{
				robotLight1 = Color.red;
				robotLight2 = Color.green;
				timer.setDelay(60000);
			}
		}
	}

	public void Draw(Graphics2D g2In)
	{
		g2In.setColor(robotLight1);
		g2In.fill(circle1);
		g2In.fill(circle2);
		g2In.setColor(robotLight2);
		g2In.fill(circle3);
		g2In.fill(circle4);
	}

	public void StartRobot()
	{
		timer = new Timer(5000, new Actionlist());
		timer.start();
	}

	private Ellipse2D.Double circle1;
	private Ellipse2D.Double circle2;
	private Ellipse2D.Double circle3;
	private Ellipse2D.Double circle4;
}
