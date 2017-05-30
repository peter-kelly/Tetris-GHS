import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class GUIWindow extends JFrame 
{
	private Board board = new Board();
	
	public GUIWindow()
	{
		
	}
	
	private class CustomKeyListener implements KeyListener
	{
		public CustomKeyListener()
		{
			super();
			addKeyListener(this);
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode() == KeyEvent.VK_LEFT)
			{
				System.out.println("Left key pressed");
			}
			if(e.getKeyCode() == KeyEvent.VK_RIGHT)
			{
				System.out.println("Right key pressed");
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode() == KeyEvent.VK_LEFT)
			{
				System.out.println("Left key released");
			}
			if(e.getKeyCode() == KeyEvent.VK_RIGHT)
			{
				System.out.println("Right key released");
			}
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}


