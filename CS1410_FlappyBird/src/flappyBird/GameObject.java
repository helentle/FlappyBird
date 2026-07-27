package flappyBird;

public class GameObject {

	private int x;
	private int y;
	
	/**
	 * @param x
	 * @param y
	 */
	public GameObject(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void reset() {
		
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	
	
}
