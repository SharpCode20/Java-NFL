// NFLTeamsTest.java
// Ryan Sharp 10/10/2020
// Test-executable program for NFLTeams.java class.
// Work in progress...
import java.util.Scanner;

public class NFLTeamsTest
{
  public static void main(String[] args)
  {
    // Set up Scanner Object for keyboard input.
         Scanner keyboard = new Scanner(System.in);
         
    // Input information for NFL Teams.
    System.out.println("Input information for NFL Team:");
    System.out.print("Name:             ");
    String name = keyboard.nextLine();
    
    System.out.print("Location:         ");
    String location = keyboard.nextLine();
    
    System.out.print("Year Established: ");
    int year = keyboard.nextInt();
    
    // Set up object of class NFLTeams.
    NFLTeams team1 = new NFLTeams(name, location, year);
    
    // Print team information using .toString().
    System.out.println("\nTeam information:\n" + team1);
    
    // Clear keyboard buffer.
    keyboard.nextLine();
    
    // Check NFLTeams set() and get() methods.
    System.out.println("\nEnter updated team information:");
    System.out.print("Name:             ");
    name = keyboard.nextLine();
    
    System.out.print("Location:         ");
    location = keyboard.nextLine();
    
    System.out.print("Year Established: ");
    year = keyboard.nextInt();
    
    team1.setName(name);
    team1.setLocation(location);
    team1.setYear(year);
    
    System.out.println("\n\n" + "The " + team1.getName() + " were established in " + team1.getLocation() + " in " + team1.getYear() + ".");
    
    // Display updated .toString().
    System.out.println("\nUpdated team information:\n" + team1);
    
  }
}