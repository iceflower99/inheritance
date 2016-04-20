package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import ctect.controller.CtecController;

public class InhertitancePanel extends JPanel
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
				baseController.insertionSort();
				
				textArea.setText(baseController.showSillyLevels());
			}
			
		});	
	}
	

}
