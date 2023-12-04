import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    
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
        
        eat();
        
    }
    
    public void eat()
    {
        if(isTouching(Pizza.class))
        {
            removeTouching(Pizza.class);
            Stars world = (Stars) getWorld();
            world.createPizza();
            world.increaseScore();
            elephantSound.play();
        }
        
        if(isTouching(Burger.class))
        {
            removeTouching(Burger.class);
            Stars world = (Stars) getWorld();
            world.createBurger();
            world.increaseScore();
            elephantSound.play();
        }
        
        if(isTouching(Pumpkin.class))
        {
            removeTouching(Pumpkin.class);
            Stars world = (Stars) getWorld();
            world.createPumpkin();
            world.increaseScore();
            elephantSound.play();
        }
        
    
    }
}
