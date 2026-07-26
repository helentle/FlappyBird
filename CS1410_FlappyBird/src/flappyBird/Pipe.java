package flappyBird;

public class Pipe extends GameObject {

	private int width;

	/**
	 * @param x
	 * @param y
	 * @param width
	 */
	public Pipe(int x, int y, int width) {
		super(x, y);
		this.width = width;
	}
	
	//move left
	public void move() {
		
	}
	
	//generate gap for bird
	public void randomGap() {
		
	}
	
	@Override
	public void reset() {
		super.reset();
	}
}
