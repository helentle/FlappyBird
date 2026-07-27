package flappyBird;

public class ScoreBoard {

	private int score;
	private int deaths;
	/**
	 * @param score
	 * @param deaths
	 */
	
	public ScoreBoard() {
		score = 0;
		deaths = 0;
	}
	
	public void AddScore() {
		score++;
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
