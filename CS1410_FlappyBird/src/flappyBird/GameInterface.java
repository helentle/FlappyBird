package flappyBird;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class GameInterface {
	private Bird bird;
	private Pipe pipe;
	private ScoreBoard scoreboard;
	private GameGui gui;
	private boolean running;
	private Timer timer;
		
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
		
		//creates timer with 60 frames per second
		timer = new Timer(16, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bird.fall();
				pipe.move();
				
				gui.repaint();
			}
		});
		
	}
	
	//starts game
	/**
	 * Start the game.
	 */
	public void start() {
		running = true;
		timer.start();
	}
	
	//pauses game
	/**
	 * Pause the game.
	 */
	public void pause() {
		running = false;
		timer.stop();
	}

	//restarts game
	/**
	 * Restart all the game.
	 */
	public void restart() {
		bird.reset();
		pipe.reset();
		scoreboard.reset();
		
		running =true;
		timer.start();
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
