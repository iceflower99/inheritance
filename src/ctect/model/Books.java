package ctect.model;

/**
 * @author madeleine hales	
 *@ version 0.x Mar 28,2016
 */

public abstract class Books implements FoundOnTheInternet,Comparable
{
   //Three data members
	private String author;
	private String title;
	private int pages;
	private double price;
	private int amount;
	
	public String author()
	{
		return author;
	}
	
	public int amount()
	{
		return amount;
	}
	
	public String title()
	{
		return title;
	}
	
	public int pages()
	{
		return pages;
	}
	
	public double getcost()
	{
		return  price;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public void setAuthor(String author)
	{
		this.author=author;
	}
	
	public void setPages(int pages)
	{
		this.pages=pages;
	}
	
	public void setTitle(String title)
	{
		this.title=title;
	}
	public void setAmount(int amount)
	{
		this.amount=amount;
	}
	
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		if(compared instanceof FoundOnTheInternet)
		{
			if(this.cat()> ((FoundOnTheInternet)compared).cat())
			{
				comparedValue=1;
			}
			else if(this.cat()<((FoundOnTheInternet)compared).cat())
			{
				comparedValue=-1;
			}
			else
			{
				comparedValue=0;
			}
		}
		return comparedValue;
	}
	
}
