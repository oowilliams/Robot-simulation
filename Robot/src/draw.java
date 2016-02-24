import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

public class draw extends JPanel
{

	private static final long serialVersionUID = 1L;
	
	private Timer drawTimer;

	private class MyListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			repaint();
		}
	}
	
	public draw()
	{
		setPreferredSize(new Dimension(WIDTH_PANEL, HEIGHT_PANEL));
		shape = new ArrayList<Drawable>();
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		for (int i = 0; i < shape.size(); i++)
		{
			shape.get(i).Draw(g2);
		}
	}

	public void AddDrawable(Drawable dd)
	{
		shape.add(dd);
		repaint();
	}
	
	public void StartRepaintTimer()
	{
		drawTimer = new Timer(100, new MyListener());
		drawTimer.start();
	}

	private Drawable drawableObject;
	private static final int WIDTH_PANEL = 650;
	private static final int HEIGHT_PANEL = 650;
	private ArrayList<Drawable> shape;

}
