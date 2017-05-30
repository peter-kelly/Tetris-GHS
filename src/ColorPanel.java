import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ColorPanel extends JPanel
{
	public ColorPanel()
	{
		setBackground(new Color(0, 0, 255));
	}
	
	//Constructor that sets the color to the given color
	public ColorPanel(Color color)
	{
		setBackground(color);
	}
	
	public void setColor(Color color)
	{
		setBackground(color);
	}	
	
	/*
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Straighty test = new Straighty();
		drawTetromino(test, g);
	}
	
	public void drawTetromino(Tetromino block, Graphics g)
	{
		int x = 0;
		int y = 0;
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				if(block.getSpot(i, j))
				{
					y = i * 40;
					x = j * 40;
					g.fillRect(x, y, 40, 40);
				}
			}
		}
	}
	*/
}
