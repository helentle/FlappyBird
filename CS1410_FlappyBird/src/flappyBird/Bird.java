package flappyBird;
 
/**
 * @author Helen Le, Hared Huaira Reyna, Caliana Caldwell
 * 
 * Creates a bird that is constantly falling with a manual flap button.
 */
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
    setY(getY()-40);
  }
 
  /**
   * Bird downward.
   */
  public void fall(){
    setY(getY()+2);
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