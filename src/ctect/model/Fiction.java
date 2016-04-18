package ctect.model;

import javax.swing.JOptionPane;

public class Fiction extends Books implements FoundOnTheInternet
{
 
	public Fiction()
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
}
