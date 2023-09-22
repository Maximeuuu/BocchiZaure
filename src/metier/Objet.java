public class Element
{
	private int x;
	private int y;
	
	private int width;
	private int height;
	
	public Element(x, y, width, height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int getX()     { return this.x;      }
	public int getY()     { return this.y;      }
	public int getWidth() { return this.width;  }
	public int getHeight(){ return this.height; }
	
	public boolean isMingled( Element elt )
	{
		boolean inThisX = (elt.x  >= this.x && elt.x  <= this.x+width);
		boolean inThisY = (elt.y  <= this.y && elt.y  >= this.y+width);
		boolean inEltX  = (this.x >= elt.x  && this.x <= elt.x+width );
		boolean inEltY  = (this.y <= elt.y  && this.y >= elt.y+width );
		return ( (inX && inY) || (inEltX && inEltY) );
	}
}
