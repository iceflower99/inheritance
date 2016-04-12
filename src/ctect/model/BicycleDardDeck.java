package ctect.model;

import javax.swing.JOptionPane;

public class BicycleDardDeck extends Cards implements FoundOnTheInternet
{
	
	public BicycleDardDeck()
	{
		this.setAmount(52);
		this.setCardName("Bicycle Cards");
		this.setItAGoodDeck(true);
		this.setPrice(10.99);
	}

	
	public int cat()
	{
		amount = 0;
		
		return amount;
		 
		
	}

	
	public void troll(int Troll)
	{
	 for (int spot = 99; spot == Troll; spot--)
	 {
		 JOptionPane.showMessageDialog(null, "There is " + Troll + " cards");
	 }
		
	}

	
	public String meme()
	{
		
		
		
		return cardName;
		
		
		
	}

	
	public void clickBait(int hate)
	{
		for (int spot =10; spot == hate; spot --)
		{
		JOptionPane.showMessageDialog(null, "SAVE THE CATS!!! CLICK HEAR NOW!!!!");
		JOptionPane.showMessageDialog(null, "YOU JUST WON A FREE I PAD CLICK NOW!!!");
		JOptionPane.showMessageDialog(null, "Top 10 projects about programing");
		JOptionPane.showMessageDialog(null, "Click hear to know a trick that teachers hate!!! ");
		JOptionPane.showMessageDialog(null, "Top 10 Déjà vu moments that you had.");
		
		}
		
		
	}
	
	
	
	
}
