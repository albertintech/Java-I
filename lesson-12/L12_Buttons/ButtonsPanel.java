/*
   Name:  Albert Ramos
   Class: CIS163AA, Lesson 12 Lab #1
   Date:  May 6, 2022
*/
package L12_Buttons;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class ButtonsPanel extends JPanel {
   private JButton button1;
   private JButton button2;
   private JButton button3;
   private JLabel label;
   private JPanel buttonPanel;
   private int count = 50;
   private Random randGen = new Random();

   public ButtonsPanel() // Constructor: Sets up the GUI.
   {
      setLayout(new FlowLayout()); // Layout manager of choice: Flow

      button1 = new JButton("Increment");
      button1.addActionListener(new ButtonListener());

      button2 = new JButton("Decrement");
      button2.addActionListener(new ButtonListener());

      button3 = new JButton("Randomize");
      button3.addActionListener(new ButtonListener());

      label = new JLabel("Count: " + count);

      buttonPanel = new JPanel();
      buttonPanel.setPreferredSize(new Dimension(600, 40));
      buttonPanel.setBackground(Color.green);
      buttonPanel.add(button1);
      buttonPanel.add(button2);
      buttonPanel.add(button3);

      setPreferredSize(new Dimension(600, 80));
      setBackground(Color.white);
      add(label);
      add(buttonPanel);
   }

   private class ButtonListener implements ActionListener // Represents listener for button push (action) events.
   {

      public void actionPerformed(ActionEvent event) // Updates the counter and label when the button is pushed.
      {
         if (event.getSource() == button1) {
            count++;
            label.setText("Count: " + count);
         }
         if (event.getSource() == button2) {
            count--;
            label.setText("Count: " + count);
         }
         if (event.getSource() == button3) {
            count = randGen.nextInt(100) + 1;
            label.setText("Count: " + count);
         }
      }
   }
}
