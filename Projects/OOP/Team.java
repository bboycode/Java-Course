import java.util.Random;

public class Team {

	private int id;
	private int rating;
	private int goals;
	private int wins = 0;
	private int losses = 0;
	private int draws = 0; 
	private int points = 0; 
	private Player[] players = new Player[11]; 
	
	public Team(int id) {
	
		this.id = id; 
	}
	
	
	public int getGoals() {

		return goals;
	} 

	public void genratePlayers() {

		for (int i = 0; i < players.length; i++) {

			Random random = new Random();

			int rating = random.nextInt(5 - 1) + 1; 

			players[i] = new Player( i+1 , rating);
			
		}
		
	}

	public void printPlayers() {
		
		for (Player player : players) {

			int id = player.getId();

			System.out.println("Player " + id + " rating: " + player.getRating());
			
		}
	}

	public int getId() {
	
		return id; 
	}

	public void genrateRating() {
		
		int combinedRating = 0;

		for (Player player : players) {

			combinedRating += player.getRating(); 

			this.rating = combinedRating; 
		}

	}

	public int getRating() {

	 return rating; 	

	}

	public void incWins(){

		this.wins++; 
	}

	public void incLoss() {

		this.losses++; 
	}

	public void incPoints(int points){

		this.points +=points; 

	}

	public void incDraw() {

		this.draws++; 
	}

	public void printTeam() {

		System.out.println("Played 38\t| "+ "Wins: " + wins + "\t| "+ "Draw: " + draws + "\t| " + "Losses " + losses + "\t| " + "Points: " + points);

	}
}
