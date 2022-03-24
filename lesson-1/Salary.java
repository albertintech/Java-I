import java.util.Scanner;

public class Salary {                         
   public static void main (String [] args) { 
      double hourlyWage;
      double annualSalary;
      double monthlySalary;
      double hoursPerWeek;
      int weeksPerYear;                          

      Scanner scnr = new Scanner(System.in);
      System.out.print("Hourly wage is: $");
      hourlyWage = scnr.nextDouble();

      System.out.print("Work hours per week: ");
      hoursPerWeek = scnr.nextDouble();

      System.out.print("Work weeks paid per year: ");
      weeksPerYear = scnr.nextInt();

      annualSalary = hourlyWage * hoursPerWeek * weeksPerYear;
      System.out.print("Annual salary is: $");         
      System.out.printf("%.2f", annualSalary);
      System.out.println();
      
      monthlySalary = (hourlyWage * hoursPerWeek * weeksPerYear) / 12;
      System.out.print("Monthly salary is: $");
      System.out.printf("%.2f", monthlySalary);
      System.out.println();

      scnr.close();
   } 
}
