//package ihm;
//import metier.Personnage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelGame extends JPanel implements ActionListener, KeyListener
{
	private Personnage perso;
	private Timer gameTimer;
	
	public PanelGame()
	{
		this.setBackground(Color.WHITE);
		
		this.setFocusable(true);
		this.addKeyListener(this);
		
		this.perso = new Personnage(100, 300, 20, 40, 25);
		gameTimer = new Timer(20, this);
		gameTimer.start();
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		perso.draw(g);
		
		//for (Obstacle obstacle : obstacles)
			//obstacle.draw(g);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		perso.update();
		repaint();
	}
	
	@Override
	public void keyTyped(KeyEvent e)
	{
		
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			perso.jump();
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		
	}
}
