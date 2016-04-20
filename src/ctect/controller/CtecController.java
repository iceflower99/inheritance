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
		for (FoundOnTheInternet currentInternet : interenetThings)
		{
			internetLevels.concat("This is as " + currentInternet.toString() + " and has a silliness level of " + currentInternet.internetLevels());
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

	public void insertionSort()
	{
		for (int outerLoop = 1; outerLoop < interenetThings.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while (innerLoop > 0 && (interenetThings.get(innerLoop - 1).compareTo(interenetThings.get(innerLoop))) > 0)
			{
				swap(innerLoop, innerLoop - 1);
			}
		}
	}
	
	public void quicksort(int low,int high)
	{
		if(low<high)
		{
			int midPoint = partition(low,high);
			quicksort(low,midPoint-1);
			quicksort(midPoint+1,high);
		}
		
	}
	
	private int partition(int low,int high)
	{
		int position = low;
		FoundOnTheInternet pivot= interenetThings.get(high);
				
				for(int spot=low; spot<high-1;spot++)
				{
					if(interenetThings.get(spot).compareTo(pivot)<=0)
					{
						swap(position,spot);
						position++;
					}
				}
				swap(position,high);
				return position;
	}
	public void swap(int firstLocation, int secondLocation)
	{
		FoundOnTheInternet temp = interenetThings.get(firstLocation);
		interenetThings.set(firstLocation, interenetThings.get(secondLocation));
		interenetThings.set(secondLocation, temp);
	}

}
