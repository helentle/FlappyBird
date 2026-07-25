package flappyBird;

public class Bird extends GameObject {

	private boolean alive;

	/**
	 * @param x
	 * @param y
	 * @param alive
	 */
	public Bird(int x, int y, boolean alive) {
		super(x, y);
		this.alive = alive;
	}
	
	

}
