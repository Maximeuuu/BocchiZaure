import java.awt.*;

public class Personnage extends Element
{
	private int velocityY;
	private int jumpPower;
	private Floor floor;
	
	public Personnage( Floor floor )
	{
		this(100, 50, 20, 40, 20, floor);
	}
	
	public Personnage(int x, int y, int width, int height, int jumpPower, Floor floor)
	{
		super(x, y, width, height);
		this.jumpPower = jumpPower;
		this.floor = floor;
		
		this.velocityY = 0;
		this.floor = y;
		
		this.jumpPower = jumpPower;
	}

	public void draw(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.fillRect(x, y, width, height);
	}
	
	public void update()
	{
		this.y += this.velocityY;
		if (y >= this.floor.getY())
		{
			y = this.floor.getY();
			this.velocityY = 0;
		}
		else
			this.velocityY += 2;
	}
	
	public void jump()
	{
		if( this.y == 50 ) 
		{
			this.velocityY = -this.jumpPower;
		}
	}
}
