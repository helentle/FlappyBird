package flappyBird;

public class ScoreBoard {

	private int score;
	private int deaths;
	
	/**
	 * creates a scoreboard with default values of 0
	 * @param score
	 * @param deaths
	 */
	
	public ScoreBoard() {
		score = 0;
		deaths = 0;
	}
	
	//adds 1 to the score
	public void addScore() {
		score++;
	}
	
	//adds 1 to death tally
	public void addDeaths() {
		deaths++;
	}
	
	//resets the scoreboard
	public void AddDeath() {
		deaths++;
	}
	
	public void reset() {
		score = 0;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @return the deaths
	 */
	public int getDeaths() {
		return deaths;
	}
	
}
