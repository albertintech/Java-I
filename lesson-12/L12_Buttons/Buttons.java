/*
   Name:  Albert Ramos
   Class: CIS163AA, Lesson 12 Lab #1
   Date:  May 6, 2022
*/

import javax.swing.JFrame;

public class Buttons {

   public static void main(String[] args) // Creates and displays the main program frame.
   {
      JFrame frame = new JFrame("Lesson 12 Lab 1 - Buttons");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      ButtonsPanel panel = new ButtonsPanel();
      frame.getContentPane().add(panel);

      frame.pack();
      frame.setVisible(true);
   }
}
