/*
   Name:  Albert Ramos
   Class: CIS163AA, Lesson 13 Lab 1
   Date:  May 6, 2022
*/

package L13_SeatReservation;

public class SeatInfo {
   private String firstName; // First name
   private String lastName;  // Last name
   private String seatClass; // seat class
   private int amtPaid;      // Amount paid

   // Method to initialize Seat fields
   public void reserveSeat(String inFirstName, String inLastName, String inSeatClass, int ticketCost) {
      firstName = inFirstName;
      lastName = inLastName;
      seatClass = inSeatClass;
      amtPaid = ticketCost;
   }

   // Method to empty a Seat
   public void makeEmpty() {
      firstName = "empty";
      lastName = "empty";
      seatClass = "empty";
      amtPaid = 0;
   }

   // Method to check if Seat is empty
   public boolean isEmpty() {
      return firstName.equals("empty");
   }

   // Method to print Seat fields
   public void printSeatInfo() {
      System.out.print(firstName + " ");
      System.out.print(lastName + " ");
      System.out.print(seatClass + " ");
      System.out.println("Paid: " + amtPaid);
   }

   public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public String getSeatClass() {
      return seatClass;
   }

   public int getAmountPaid() {
      return amtPaid;
   }
}
