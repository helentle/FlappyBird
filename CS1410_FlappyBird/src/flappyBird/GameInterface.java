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
		
	}
	
	public void start() {
		
	}
	
	public void pause() {
		
	}

	public void restart() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	

}
