/*
   Name:  your name goes here
   Class: CIS163AA, Lesson 12 Lab #1
   Date:  today's date
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonsPanel extends JPanel
{
   private JButton button1;
   private JLabel label;
   private JPanel buttonPanel;

   public ButtonsPanel()	// Constructor: Sets up the GUI.
   {
	  setLayout(new FlowLayout());	//Layout manager of choice: Flow

      button1 = new JButton("Push Me");
      button1.addActionListener(new ButtonListener());

      label = new JLabel("CIS163AA");

      buttonPanel = new JPanel();
	  buttonPanel.setPreferredSize(new Dimension(600, 40));
	  buttonPanel.setBackground(Color.black);
	  buttonPanel.add(button1);

	  setPreferredSize(new Dimension(600, 80));
      setBackground(Color.white);
      add(label);
	  add(buttonPanel);
   }

   private class ButtonListener implements ActionListener	//Represents listener for button push (action) events.
   {

      public void actionPerformed(ActionEvent event)	// Updates the counter and label when the button is pushed.
      {
		 if (event.getSource() == button1)
		 {
            JOptionPane.showMessageDialog(null, "You clicked the button!", "Information", JOptionPane.INFORMATION_MESSAGE);
		 }
	 }
 }
}
