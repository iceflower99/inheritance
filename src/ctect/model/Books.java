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
	
	public String author()
	{
		return author;
	}
	
	public String title()
	{
		return title;
	}
	
	public int pages()
	{
		return pages;
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
