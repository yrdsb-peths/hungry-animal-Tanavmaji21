import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * One of the subclasses that the elephant will be
 * running around and eating to gain points. 
 * 
 * @author Tanav Majithia 
 * @version December 7 2023
 */
public class Burger extends Actor
{
    int speed = 1;
    /**
     * This method is attached to the run method which gives it a location to 
     * start at random, as well as spawning it into the world and not allowing
     * it to go outside of the boundaries of the map.
     */
    public void act()
    {
        int x = getX();
        int y = getY() + 2 + speed;
        setLocation(x, y);
        
        Stars world = (Stars) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    /**
     * This method allows the speed of the burger to increasingly speed up 
     * as the program and the score gain and increase everytime.
     */
    public void setSpeed(int spd)
    {
        speed = spd;
    } 
}

