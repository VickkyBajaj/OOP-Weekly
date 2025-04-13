package Week7;

//Base class
class PlayerStats {
 protected String playerName;
 protected int age;
 protected String team;

 public PlayerStats(String playerName, int age, String team) {
     this.playerName = playerName;
     this.age = age;
     this.team = team;
 }

 public void displayStats() {
     System.out.println("Player: " + playerName);
     System.out.println("Age: " + age);
     System.out.println("Team: " + team);
 }
}

//Football stats subclass
class FootballStats extends PlayerStats {
 private int goals;
 private int assists;

 public FootballStats(String playerName, int age, String team, int goals, int assists) {
     super(playerName, age, team);
     this.goals = goals;
     this.assists = assists;
 }

 @Override
 public void displayStats() {
     super.displayStats();
     System.out.println("Goals: " + goals);
     System.out.println("Assists: " + assists);
 }
}

//Cricket stats subclass
class CricketStats extends PlayerStats {
 private int runs;
 private int wickets;

 public CricketStats(String playerName, int age, String team, int runs, int wickets) {
     super(playerName, age, team);
     this.runs = runs;
     this.wickets = wickets;
 }

 @Override
 public void displayStats() {
     super.displayStats();
     System.out.println("Runs: " + runs);
     System.out.println("Wickets: " + wickets);
 }
}

//Driver class
public class PlayerStatistics {
 public static void main(String[] args) {
     FootballStats footballPlayer = new FootballStats("Lionel Messi", 36, "Inter Miami", 805, 350);
     CricketStats cricketPlayer = new CricketStats("Virat Kohli", 35, "India", 12000, 4);

     System.out.println("Football Player Statistics:");
     footballPlayer.displayStats();
     System.out.println();
     
     System.out.println("Cricket Player Statistics:");
     cricketPlayer.displayStats();
 }
}