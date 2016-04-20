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
	
	public String showInternetLevels()
	{
		String internetLevels = "";
		for(FoundOnTheInternet currentInternet:interenetThings)
		{
			interenetLevels.concat
		}
		
	}
	
	private void makeInternetList()
	{
		interenetThings.add(new Fiction());
		interenetThings.add(new NonFiction());
	}
	
	public void start()
	{
		
	}
	
	public void swap(int firstLocation, int secondLocation)
	{
		FoundOnTheInternet temp= cat.get(firstLocation);
	}
	
}
