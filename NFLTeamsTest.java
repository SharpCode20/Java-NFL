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
         
    // Variable to hold menu choice.
    int response = 0;
    
                   
    // Input information for NFL Team.
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
    System.out.println("\nTeam information:\n" + team1 + "\n");
    
    // Clear keyboard buffer.
    keyboard.nextLine();
    
         
    // Display menu.
    do
    {
         System.out.println("1)  Change a NFL Team information:");
         System.out.println("2)  Display current NFL Team information:");
         System.out.println("0)  Exit menu:");
         System.out.print("Enter menu choice:  ");
         response = keyboard.nextInt();
       
         switch(response)
         {
            case 1:
               System.out.println("\nMenu option #1 chosen.\n");
               
               // Call to method.
               changeTeam(team1);
               
               // Print updated team information.
               System.out.println("\n" + "The " + team1.getName() + " were established in " + team1.getLocation() + " in " + team1.getYear() + "." + "\n");
               break;
           
            case 2:
               System.out.println("\nMenu option #2 chosen.\n");
               
               // Display updated .toString().
               System.out.println("\nUpdated team information:\n" + team1 + "\n");
               break;
           
            case 0:
               System.out.println("\nExiting menu.\n");
               break;
            
            default:
               System.out.println("\nInvalid menu option entered.\n");
               break;
         }  
    } while(response != 0);
    
  }
    // Method to change a team's information.
    public static void changeTeam(NFLTeams team1)
    {
      // Set up Scanner Object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("\nEnter updated team information:");
      System.out.print("Name:             ");
      String name = keyboard.nextLine();
    
      System.out.print("Location:         ");
      String location = keyboard.nextLine();
    
      System.out.print("Year Established: ");
      int year = keyboard.nextInt();
   
      team1.setName(name);
      team1.setLocation(location);
      team1.setYear(year);
    }
}