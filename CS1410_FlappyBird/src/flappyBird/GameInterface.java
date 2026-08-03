package flappyBird;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
 
/**
 * @author Helen Le, Hared Huaira Reyna, Caliana Caldwell
 * 
 * Contains most of the logic for the game Flappy Bird including the collision, starting, and ending of the game.
 */
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
				updateGame();
			}
		});
		
	}
	
	
	/**
	 * Updates the game every frame.
	 */
    private void updateGame() {
        if (!running) {
            return;
        }

        bird.fall();
        pipe.move();
        checkScore();
        checkCollision();
        checkBounds();
        gui.repaint();

    }
	
	
	/**
	 * Start the game.
	 */
	public void start() {
		
        if (!running) {
        	
            running = true;
            timer.start();
        }

    }
	
	/**
	 * Pause the game.
	 */
	public void pause() {
		running = false;
		timer.stop();
	}
 
	/**
	 * Restart all the game.
	 */
	public void restart() {
		bird.reset();
		pipe.reset();
		scoreboard.reset();
		
		running =true;
		timer.start();
		gui.repaint();
	}
	
	/**
	 * Makes the bird flap.
	 */
	public void flap() {
		if (running) {
			bird.flap();
		}
	}
	
	
	/**
	 * Checks if the bird scored.
	 */
	private void checkScore() {
        if (!pipe.isScored()
                && pipe.getX() + pipe.getWidth() < bird.getX()) {

            scoreboard.addScore();

            pipe.setScored(true);
        }
    }
	

	
	/**
	 * Checks if the bird collides with the pipe.
	 */
	private void checkCollision() {
 
		int birdX = bird.getX();
		int birdY = bird.getY();
 
		int birdWidth = 40;
		int birdHeight = 40;
 
		int pipeX = pipe.getX();
		int pipeWidth = pipe.getWidth();
 
 
		// Bird and pipe overlap horizontally
		boolean horizontalCollision =
				birdX + birdWidth >= pipeX &&
				birdX <= pipeX + pipeWidth;
 
 
		// Bird hits top or bottom pipe
		boolean verticalCollision =
				birdY <= pipe.getGapHeight() ||
				birdY + birdHeight >= pipe.getGapHeight() + pipe.getGapSize();
 
 
		if(horizontalCollision && verticalCollision) {
			gameOver();
		}
	}
	
	
	
	
	/**
	 * Check if the bird leaves the screen.
	 */
	private void checkBounds() {

        if (bird.getY() < 0 || bird.getY() > 560) {
            gameOver();
        }
    }
	
	/**
	 * Ends the game.
	 */
	private void gameOver() {
		bird.setAlive(false);
        scoreboard.addDeaths();
        scoreboard.saveScore();
        
        running = false;
        timer.stop();
        gui.repaint();
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
	
	
	/**
	 * Returns whether the game is running.
	 */
	public boolean isRunning() {
		return running;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GameInterface();
	}
	
 
}


 