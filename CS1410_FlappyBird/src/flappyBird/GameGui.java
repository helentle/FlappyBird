package flappyBird;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;

/**
 * @author Helen Le, Hared Huaira Reyna, Caliana Caldwell
 * 
 * Creates a GUI for the game Flappy Bird.
 */
public class GameGui extends JFrame {

	private static final long serialVersionUID = 1L;
	private GameInterface game;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		GameInterface game = new GameInterface();
//		GameGui gui = new GameGui(game);
//		gui.setVisible(true);
		
	}

	/**
	 * Create the frame.
	 */
	public GameGui(GameInterface game) {
		this.game = game;
		
		setTitle("Flappy Bird");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,600);
		setResizable(false);
		
		setContentPane(new GamePanel(game));
		setBackground(new Color(135, 206, 250));
		setFocusable(true);
	}
	
	/**
	 * the game occurs inside the game panel
	 */
	public class GamePanel extends JPanel{
		private static final long serialVersionUID = 1L;
		private GameInterface game;
		// constructs GamePanel and sets focus/listener for spacebar
		public GamePanel(GameInterface game) {
		    this.game = game;
		    setFocusable(true);

		    getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("SPACE"), "space");
		    
		    getActionMap().put("space", new AbstractAction() {

				@Override
		        public void actionPerformed(ActionEvent e) {
		            if (!GameGui.this.game.isRunning() && GameGui.this.game.getBird() != null && !GameGui.this.game.getBird().isAlive()) {
		                GameGui.this.game.restart();
		                return;
		            } 
		            if (!GameGui.this.game.isRunning()){
		            	((GameInterface) GameGui.this.game).start();
		            }
		            GameGui.this.game.flap();
		        }
		    });
		    
		    requestFocusInWindow();
		}
		/**
		 * overrides paintComponent to repaint the gui as needed
		 */
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			//paint the bird
			Bird birdGui = game.getBird();
			if (birdGui != null) {
				int birdX = birdGui.getX();
				int birdY = birdGui.getY();
				g.setColor(new Color(255, 167, 67));
				g.fillOval(birdX, birdY, 40, 40);
			}
			
			//paint the pipe (top + bottom)
			Pipe pipeGui = game.getPipe();
			if (pipeGui != null) {
				int pipeX = pipeGui.getX();
				int pipeWidth = pipeGui.getWidth();
				int gapTop = pipeGui.getGapHeight();
				int gapSize = pipeGui.getGapSize();
				g.setColor(new Color(0, 156, 9));
				//top pipe
				g.fillRect(pipeX, 0, pipeWidth, gapTop);
				//bottom pipe
				int gapBottom = gapTop + gapSize;
				int bottom = getHeight() - gapBottom;
				if (bottom > 0) {
					g.fillRect(pipeX, gapBottom, pipeWidth, bottom);
				}
				
			}
			
			//scoreboard
			g.setColor(Color.BLACK);
			g.drawString("High Score: " + game.getScoreboard().getHighScore(), 650, 30);
			g.drawString("Score: " + game.getScoreboard().getScore(), 650, 50);
			g.drawString("Deaths: " + game.getScoreboard().getDeaths(), 650, 70);

			
			//game overlay
			if (! game.isRunning() && game.getBird() != null && !game.getBird().isAlive()) {
				g.setColor(new Color(135, 206, 250));
				g.drawString("GAME OVER - press Space to restart", 200, 300);
			}
			
			//game start title
			if (!GameGui.this.game.isRunning() && GameGui.this.game.getBird() != null && GameGui.this.game.getBird().isAlive()) {
				g.setColor(new Color(135, 206, 250));
				g.drawString("FLAPPY BIRD - press Space to start", 200, 300);
			}
			
			
		}
	}
		
	
}