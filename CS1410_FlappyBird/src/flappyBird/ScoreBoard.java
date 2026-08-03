package flappyBird;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

/**
 * @author Helen Le, Hared Huaira Reyna, Caliana Caldwell
 * 
 * Creates a scoreboard that keeps track of deaths, score, and highscore for the game FlappyBird.
 */
public class ScoreBoard {

	private int score;
	private int deaths;
	private int highScore;

	/**
	 * creates a scoreboard with default values of 0
	 * 
	 * @param score
	 * @param deaths
	 */

	public ScoreBoard() {
		score = 0;
		deaths = 0;
		loadScore();
	}

	// adds 1 to the score
	public void addScore() {
		score++;
	}

	//high score (section fulfilling read/write to a file)
	public void saveScore() {
		if (score > highScore) {
			highScore = score;
		}
		try (PrintWriter writer = new PrintWriter("highscore.txt")) {

			writer.println(highScore);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void loadScore() {
		try (Scanner reader = new Scanner(new File("highscore.txt"))){
			highScore = reader.nextInt();
		}catch (Exception e) {
			highScore = 0;
		}
	}

	// adds 1 to death tally
	public void addDeaths() {
		deaths++;
	}

	// resets the scoreboard
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

	/**
	 * @return the highScore
	 */
	public int getHighScore() {
		return highScore;
	}
	

}
