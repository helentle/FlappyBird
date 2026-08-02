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
   * Sets the bird state.
   * 
   * @param alive new state
   */
  public void setAlive(boolean alive) {
      this.alive = alive;
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
    setY(getY()+5);
  }
  /**
   * Reset the bird.
   */
  public void reset(){
    setX(100);
    setY(200);
    alive = true;
  }
 
}