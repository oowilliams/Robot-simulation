import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;


public class RobotTest
{
	public static void main(String[] arg) throws IOException
	{
		JFrame appFrame = new JFrame();
		draw rect = new draw();
		appFrame.setContentPane(rect);
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appFrame.pack();
		appFrame.show();
		 
		
		Light kee = new Light(200, 200, 50);
		rect.AddDrawable(kee);
		
		Way tat = new Way(100,100, 100, 100);
		rect.AddDrawable(tat);
		
		Cars mmm = new Cars(300, 600, 60, 10);
		rect.AddDrawable(mmm);
		
		rect.StartRepaintTimer();
		kee.StartRobot();
		
//		try
//		{
//			ArrayList<Motor> sey = new ArrayList<Motor>();
//			Motor will = new Motor(300,600, 60,10);
//			sey.add(will);
//			for( int i =0; i< sey.size(); i++)
//			{
//				rect.drawaObject(sey.get(i));
//			}
//		}
//		catch (Exception e)
//		{
//			System.out.println("sorry ");
//		}
	
		
	}
}
