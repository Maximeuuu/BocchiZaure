//package ihm;

import javax.swing.*;

public class FrameBocchi extends JFrame
{
	private PanelGame game;
	
	public FrameBocchi()
	{
		this.setTitle("Bocchi The Rock!");
		
		this.setSize(800, 400);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		this.game = new PanelGame();
		this.add( this.game );
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	//main de test
	public static void main(String[] args)
	{
		new FrameBocchi();
	}
}
