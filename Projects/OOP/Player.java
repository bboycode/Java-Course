
public class Player {
	
	private int id;
	private int rating;
	private int goals;

	public Player(int id, int rating) {
	
		this.id = id;
		this.rating = rating;
	}
	
	public int getGoals() {
		
		return goals;
	}

	public int getId() {

		return id; 
	}

	public int getRating() {
	
		return rating;
	}
}

