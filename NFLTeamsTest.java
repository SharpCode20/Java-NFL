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
    // Variable to hold number of teams in NFL.
    // Variable to hold team number for information change.
    int response = 0;
    int nr = 0;
    int teamNr = 0;
    
    // Create array of objects for all 32 NFL Teams.
    NFLTeams[] teams = new NFLTeams[32];
    
    // Display menu.
    do
    {
         System.out.println("1)  Create a NFL Team:");
         System.out.println("2)  Display all NFL Team's information:");
         System.out.println("3)  Change a NFL Team's information:");
         System.out.println("0)  Exit menu:");
         System.out.print("Enter menu choice:  ");
         response = keyboard.nextInt();
       
         switch(response)
         {
            case 1:
               System.out.println("\nMenu option #1 chosen.\n");
               
               // Clear keyboard buffer.
               keyboard.nextLine();
               
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
               
               // Store new team in array.
               teams[nr] = team1;
               nr++;
               break;
           
            case 2:
               System.out.println("\nMenu option #2 chosen.\n");
               
               // Display array contents.
               printArray(teams, nr);
               System.out.println("");
               break;
               
            case 3:
               System.out.println("\nMenu option #3 chosen.\n");            
        
               // Display teams and menu.
               displayTeams(teams, nr);
               
               // If empty, print output.
               if(nr == 0)
               {
                 break;
               }
               else
               {
                 System.out.print("Enter team number to change:  ");
                 teamNr = keyboard.nextInt();
               
                 // Call method to change team information.
                 changeTeam(teams, teamNr);
               
                 // Print updated team information.
                 System.out.println("\nUpdated team information:");
                 System.out.print("Team[" + teamNr + "] = " + teams[teamNr] + "\n\n");  
               }           
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
    public static void changeTeam(NFLTeams[] array, int teamNr)
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
   
      array[teamNr].setName(name);
      array[teamNr].setLocation(location);
      array[teamNr].setYear(year);
    }
    
    // Method to print current contents of array.
    public static void printArray(NFLTeams[] array, int nr)
    {
      // If empty, print output.
      if(nr == 0)
      {
        System.out.println("List of NFL teams is empty.");
      }
      else
      {
        for(int ctr = 0; ctr < nr; ctr++)
          {
            System.out.println("Team[" + ctr + "] = " + "\n"+ array[ctr] + "\n");
          }
      }
     
    }
    
    // Method to display teams for updating information.
    public static void displayTeams(NFLTeams[] array, int nr)
    {
      // If empty, print output.
      if(nr == 0)
      {
        System.out.println("List of NFL teams is empty.\n");
      }
      else
      {
        for(int ctr = 0; ctr < nr; ctr++)
          {
            System.out.println("Team[" + ctr + "] = " + array[ctr].getName());
          }
      }
     
    }

    
    public static int countTeams(NFLTeams[] array)
    {
      int length = array.length;
      
      return length;
    }
}