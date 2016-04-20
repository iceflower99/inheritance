package ctect.model;

import javax.swing.JOptionPane;

public class NonFiction extends Books implements FoundOnTheInternet
{
	public NonFiction()
	{
		this.setPrice(6.76);
		this.setTitle("The nutcracker and the mouse king");
		this.setAuthor(" J R R Tolkien");
		this.setPages(620);
		this.setAmount(20);
	}
	
	public int cat()
	{
		amount = 10;
		return amount;
		
	}
	
	public void troll (int Troll)
	{
		for (int spot =30; spot==Troll; spot--)
		{
			JOptionPane.showMessageDialog(null, "There is " + "books");			
		}
		
	}
	
	public String meme()
	{
		return title;
	}
	
	public void clickBait(int hate)
	{
		for (int spot =20; spot == hate; spot --)
		{
		JOptionPane.showMessageDialog(null, "SAVE THE CATS!!! CLICK HEAR NOW!!!!");
		JOptionPane.showMessageDialog(null, "YOU JUST WON A FREE I PAD CLICK NOW!!!");
		JOptionPane.showMessageDialog(null, "Top 10 projects about programing");
		JOptionPane.showMessageDialog(null, "Click hear to know a trick that teachers hate!!! ");
		JOptionPane.showMessageDialog(null, "Top 10 Déjà vu moments that you had.");
		}
	}
	
	public double internetLevels()
	{
	return internetLevels();
	}

}
