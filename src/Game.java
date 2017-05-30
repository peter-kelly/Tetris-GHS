import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

//set panel array setFocusable
public class Game
{
	static int row;
	
	public static void main(String args[])
	{
		JFrame tetris = new JFrame();
		tetris.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tetris.setTitle("Tetris");
		tetris.setSize(40 * 10, 40 * 24);
		Container pane = tetris.getContentPane();
		pane.setLayout(new GridLayout(24, 10));

		ColorPanel[][] panelArray = new ColorPanel[24][10];

		for (int i = 0; i < panelArray.length; i++)
		{
			for (int j = 0; j < panelArray[i].length; j++)
			{
				panelArray[i][j] = new ColorPanel();
				pane.add(panelArray[i][j]);
			}
		}

		Zblock test = new Zblock();
		row = 0;
		drawTetromino(test, pane, panelArray);
		tetris.setVisible(true);

		while (true)
		{
			try
			{
				Thread.sleep(500);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			row += 10;
			clearBoard(panelArray, pane);
			tetris.setVisible(true);
			drawTetromino(test, pane, panelArray);
			tetris.setVisible(true);
		}
	}

	public static void drawTetromino(Tetromino block, Container pane, ColorPanel[][] panelArray)
	{
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				if (block.getSpot(i, j))
				{
					panelArray[i][j].setColor(Color.WHITE);
					//pane.remove(i * 10 + j);
					pane.add(panelArray[i][j], i * 10 + j);
				}
			}
		}
	}

	public static void clearBoard(ColorPanel[][] panelArray, Container pane)
	{
		for (int i = 0; i < panelArray.length; i++)
		{
			for (int j = 0; j < panelArray[i].length; j++)
			{
				pane.remove(panelArray[i][j]);
				panelArray[i][j].setColor(Color.BLUE);
				pane.add(panelArray[i][j]);
			}
		}
	}
}
