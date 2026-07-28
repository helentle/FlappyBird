package flappyBird;

public class GameInterface {
	private Bird bird;
	private Pipe pipe;
	private ScoreBoard scoreboard;
	private GameGui gui;
		
	/**
	 * Creates bird, pipe, and scoreboard objects as well as the gui.
	 */
	public GameInterface() {
		bird = new Bird(100,250,true);
		
		pipe = new Pipe(700, 0, 80);
		
		scoreboard = new ScoreBoard();
		
		gui = new GameGui(this);
		gui.setVisible(true);
		
	}
	
	//starts game
	public void start() {
		
	}
	
	//pauses game
	public void pause() {
		
	}

	//restarts game
	public void restart() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the bird
	 */
	public Bird getBird() {
		return bird;
	}

	/**
	 * @return the pipe
	 */
	public Pipe getPipe() {
		return pipe;
	}

	/**
	 * @return the scoreboard
	 */
	public ScoreBoard getScoreboard() {
		return scoreboard;
	}

	/**
	 * @return the gui
	 */
	public GameGui getGui() {
		return gui;
	}

	

}
