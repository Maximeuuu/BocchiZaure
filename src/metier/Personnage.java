

public class Personnage
{
	private int x;
	private int y;
	
	private velocityY;
	private int floor;
	
	private int width;
	private int height;
	
	private int jumpPower;
	
	public Personnage()
	{
		this(100, 50, 20, 40, 20);
	}
	
	public Personnage(int x, int y, int width, int height, int jumpPower)
	{
		this.x = x;
		this.y = y;
		
		this.velocityY = 0;
		this.floor = y;
		
		this.width = width;
		this.height = height;
		
		this.jumpPower = jumpPower;
	}
	
	
	public void update()
	{
		y += velocityY;
		if (y >= this.floor)
		{
			y = this.floor;
			velocityY = 0;
		}
		else
			velocityY += 2;
	}
	
	public void jump()
	{
		if( this.y == 50 ) 
		{
			this.velocityY = -this.jumpPower;
		}
	}
	
	public ing getX()      { return this.x; }
	public ing getY()      { return this.y; }
	public ing getWidth()  { return this.width; }
	public ing getHeight() { return this.height; }
	
}
