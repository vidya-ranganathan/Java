import java.lang.*;


public class Decorator
{
	public static void main(String t[])
	{
		Combo c=new Combo(new Item(),new Item());
		System.out.println(c.getPrice());
	}
}

class Item
{

	private int price =10;
	public int getPrice()
	{
		return price;
	}
}

class Combo
{
	private Item i1,i2;

	public Combo(Item i1,Item i2)
	{
		this.i1=i1;
		this.i2=i2;
	}

	public int getPrice()
	{
		return (int) ((i1.getPrice() + i2.getPrice()) * 0.8);
	}
}
