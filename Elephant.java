import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main object which catches the other food, and gains points.
 * 
 * @author Tanav Majithia 
 * @version December 7 2023
 */
public class Elephant extends Actor
{
    /**
     * This array adds sound and creates a timer
     */
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * This code in the constructor allows the elephant to look left and right 
     * while moving both directions.
     * It also creates a new elephant image on top of that one, while
     * giving it a scale and a mark.
     */
    public Elephant()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleRight[i].scale(80,80);
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(80,80);
        }
        
        animationTimer.mark();
        setImage(idleRight[0]);
    }
    
    /**
     * This code animates the elephant giving it a blue elephant look, 
     * while allowing this elephant to turn right and left, creating the 
     * new look for the elephant.
     */
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
    
    /**
     * This method allows you to use your left and right arrow keys to 
     * move the elephant left and right in order to play the game.
     * It also has the calling of the method eat so everytime it comes in 
     * contact with other objects, they dissapear.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move(-10);
            facing = "left";
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move(10);
            facing = "right";
        }
        
        eat();
        
        animateElephant();
    }
    
    /**
     * This method was created so everytime the elephant touches the pizza
     * or burger, it will dissapear from the map, but with the addition of 
     * other code, it will respawn in a new place, making the game never 
     * ending unless you lose. 
     */
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
