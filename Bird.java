package flappyBird;

public class Bird extends GameObject {

  private boolean alive;

  /**
   * Creates bird.
   */
  public Bird(int x, int y, boolean alive){
    super(x,y);
    this.alive = alive;
  }
  
  /**
   * Returns whether the bird is alive.
   */
  public boolean isAlive(){
    return alive;
  }

  /**
  * Bird flap upward.
  */
  public void flap(){
    setY(getY()-20);
  }

  /**
   * Bird downward.
   */
  public void fall(){
   set(getY)
  
  /**
   * Reset the bird.
   */
  public void reset(){
    setX();
    setY();
    alive = true;
  }

}
