package ctect.model;

/**
 * @author madeleine hales @ version 0.x Mar 28,2016
 */

public abstract class Books implements FoundOnTheInternet, Comparable
{
	// Three data members
	public String author;
	public String title;
	public int pages;
	public double price;
	public int amount;

	public void setPrice(double price)
	{
		this.price = price;
	}

	public double getcost()
	{
		return price;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setPages(int pages)
	{
		this.pages = pages;
	}

	public int getPages()
	{
		return pages;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getTitle()
	{
		return title;
	}

	public void setAmount(int amount)
	{
		this.amount = amount;
	}

	public int getAmount()
	{
		return amount;
	}

	public String toString()
	{
		String description = "This is " + this.getClass() + " and it's by :" + author;

		return description;

	}
	
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;

		if (compared instanceof Cards)
		{
			if (this.cat() > ((FoundOnTheInternet) compared).cat())
			{
				comparedValue = 1;
			}
			else if (this.cat() < ((FoundOnTheInternet) compared).cat())
			{
				comparedValue = -1;
			}
			else
			{
				comparedValue = 0;
			}
		}
		return comparedValue;
	}
	
	private int dog()
	{
		return 0;
	}

}
