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
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Elephant()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleRight[i].scale(75,75);
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(75,75);
        }
        
        animationTimer.mark();
        setImage(idleRight[0]);
    }
    
    int imageIndex = 0;
    public void animateElephant()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }
        animationTimer.mark();
        
        
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    
    
    public void act()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move(-2);
            facing = "left";
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move(2);
            facing = "right";
        }
        
        eat();
        
        animateElephant();
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
        
        
    
    }
}
