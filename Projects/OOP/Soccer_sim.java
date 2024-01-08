import java.util.Random;

public class Soccer_sim {
	
	public static void main(String[] args) {
	
		Team[] teams = new Team[20];
		
		// Genrate Team
		GenrateTeam(teams);

		//Genrate Players
		for (Team team : teams) {

			team.genratePlayers();
			team.genrateRating();
			
		}

		simulateMatches(teams);
		printTable(teams);
	}

	public static void GenrateTeam(Team[] teams) {

		for (int i = 0; i < teams.length; i++) {
			
			teams[i] = new Team(i+1);
		}

	}

	public static void simulateMatches(Team[] teams) {

		Random random = new Random(); 
		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < teams.length; j++) {

				for (int k = j + 1; k < teams.length; k++) {

					double randomProb = random.nextDouble(); 
					double prob = simulate(teams[j].getRating(), teams[k].getRating());

					if (randomProb < prob) {
						
						teams[j].incWins();	
						teams[j].incPoints(3);

					} else {

						teams[k].incLoss();
						
					}

				}
				
			}
				
			
		}
		 
	}

	public static double simulate(int ratingA, int ratingB) {

		double baseProb = 0.5; 

		int ratingDiff = ratingA - ratingA; 

		double adjustment = ratingDiff * 0.01;

		return baseProb + adjustment; 
		
	}

	public static void printTable(Team[] teams) {


		for (Team team : teams) {
			
			System.out.print("Team id: " + team.getId() + "\t| " + "Team Rating: " + team.getRating() + "\t| ");
			team.printTeam();

		}
	}
		
}
