package flappyBird;

import java.util.Random;

public class Pipe extends GameObject {

	private int width;
	private int gapHeight;

	/**
	 * @param x
	 * @param y
	 * @param width
	 */
	public Pipe(int x, int y, int width) {
		super(x, y);
		this.width = width;
		randomGap();
	}
	
	//move left
	public void move() {
		setX(getX()-5);
		
	}
	
	//generate gap for bird
	public void randomGap() {
		Random rand = new Random();
		
		gapHeight = rand.nextInt(250) + 100;
	}
	
	@Override
	public void reset() {
		setX(800);
		
		randomGap();
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @return the gapHeight
	 */
	public int getGapHeight() {
		return gapHeight;
	}
	
}
