// NFLTeams.java
// Ryan Sharp 10/10/2020
// Class to hold information about NFL teams.
// Work in progress...

public class NFLTeams
{
  // Constructor.
  public NFLTeams(String nme, String lcn, int yr)
  {
    name = nme;
    location = lcn;
    year = yr;
  }
  
  // Teams get() methods.
  public String getName()
  {
    return name;
  }
    
  public String getLocation()
  {
    return location;
  }
  
  public int getYear()
  {
    return year;
  }
  
  // Team's set() methods.
  public void setName(String nme)
  {
    name = nme;
  }
  
  public void setLocation(String lcn)
  {
    location = lcn;
  }
  
  public void setYear(int yr)
  {
    year = yr;
  }
  
  // Team's .toString() method.
  public String toString()
  {
    String team = "";
         team = team + "Team: " + name + "\nEstablished: " + year + "\nLocated in: " + location;
         
         return team;
  }
  
  // Instance variables.
  private String name;
  private String location;
  private int year;
}