package ctect.controller;

import java.util.ArrayList;
import ctect.model.*;

public class CtecController
{

	private int start;
	
	private ArrayList<FoundOnTheInternet> interenetThings;
	public CtecController()
	{
		makeInternetList();
	}
	
	public String showSillyLevels()
	{
		String internetLevels = "";
		for(FoundOnTheInternet currentInternet:interenetThings)
		{
			internetLevels.concat("This is as "+ currentInternet.toString()+
					" and has a silliness level of "+ currentInternet.internetLevels());
		}
		return internetLevels;
	}
	
	private void makeInternetList()
	{
		interenetThings.add(new Fiction());
		interenetThings.add(new NonFiction());
		interenetThings.add(new BicycleDardDeck());
	}
	
	public void start()
	{
		
	}
	
	public void swap(int firstLocation, int secondLocation)
	{
		FoundOnTheInternet temp= interenetThings.get(firstLocation);
		interenetThings.set(firstLocation,interenetThings.get(secondLocation));
		
	}
	
}
