package flappyBird;

public class GameInterface {
	private Bird bird;
	private Pipe pipe;
	private ScoreBoard scoreboard;
	private GameGui gui;
	private boolean running;
		
	/**
	 * Creates bird, pipe, and scoreboard objects as well as the gui.
	 */
	public GameInterface() {
		bird = new Bird(100,250,true);
		
		pipe = new Pipe(700, 0, 80);
		
		scoreboard = new ScoreBoard();
		
		running = false;
		
		gui = new GameGui(this);
		gui.setVisible(true);
		
	}
	
	/**
	 * Start the game.
	 */
	public void start() {
		running = true;
	}
	
	/**
	 * Pause the game.
	 */
	public void pause() {
		running = false;
	}

	/**
	 * Restart all the game.
	 */
	public void restart() {
		bird.reset();
		pipe.reset();
		scoreboard.reset();
		
		running =true;
	}
	
	/**
	 * Returns whether the game is running.
	 */
	public boolean isRunning() {
		return running;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	

}
