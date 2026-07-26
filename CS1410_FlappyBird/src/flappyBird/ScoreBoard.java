package flappyBird;

public class ScoreBoard {

	private int score;
	private int deaths;
	/**
	 * @param score
	 * @param deaths
	 */
	public ScoreBoard(int score, int deaths) {
		this.score = score;
		this.deaths = deaths;
	}
	
	public void ScoreBoard() {
	}
	
	public void AddScore() {
		score++;
	}
	
	public void reset() {
		score = 0;
	}
	
}
