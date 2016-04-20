package view;

import javax.swing.*;
import ctect.controller.CtecController;

public class InhertitancePanel extends Jpanel
{
	private CtecController baseController;
	private JButton sortButton;
	private JTextArea textArea;
	
	
	private void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.insert
			}
			
		})	
	}
	

}
