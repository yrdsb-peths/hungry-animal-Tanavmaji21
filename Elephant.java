import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            turn(-2);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            turn(2);
        }
        
        Actor myPizza;
        myPizza = getOneObjectAtOffset(0,0, Pizza.class);
        if (myPizza != null)
        {
            
            Stars world;
            world = (Stars)getWorld();
            world.removeObject(myPizza);
            world.increaseScore();
        }
        
        Actor myBurger;
        myBurger = getOneObjectAtOffset(0,0, Burger.class);
        if (myBurger != null)
        {
            Stars world;
            world = (Stars)getWorld();
            world.removeObject(myBurger);
            world.increaseScore();
        }
        
        Actor myPumpkin;
        myPumpkin = getOneObjectAtOffset(0,0, Pumpkin.class);
        if (myPumpkin != null)
        {
            Stars world;
            world = (Stars)getWorld();
            world.removeObject(myPumpkin);
            world.increaseScore();
        }
    }
}
