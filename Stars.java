import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A place where the elephant can move around 
 * eat Pizza and Burgers.
 * 
 * @author Tanav Majithia
 * @version December 7th 2023
 */
public class Stars extends World
{
    /**
     * my static variables, allows a fixed value to be created, but allowing
     * change for the variable later.
     */
    public int score = 0;
    Label scoreLabel;
    int level = 1;

    /**
     * Constructor for objects of class Stars.
     * 
     */
    public Stars()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        /**
         * In the constructor, where the objects are created.
         */
        Elephant tanav = new Elephant();
        addObject(tanav,300,200);
        
        scoreLabel = new Label(0,70);
        addObject(scoreLabel, 550,30);
        
        createPizza();
        
        createBurger();
       
    }
    
    /**
     * This method adds the ability to create a label and state the game
     * as game over, with no more food spawning.
     * 
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /**
     * This method increases the score by a counter of 1 everytime.
     * 
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }

    /**
     * This method gives the location for the object, as well as it being
     * initiated to spawn anywhere on the screen.
     */
    public void createPizza()
    {
       Pizza pizza = new Pizza();
       pizza.setSpeed(level);
       int x = Greenfoot.getRandomNumber(600);
       int y = 0;
       addObject(pizza, x, y);
       
    }
    
    /**
     * This method gives the location for the object, as well as it being
     * initiated to spawn anywhere on the screen.
     * 
     */
    public void createBurger()
    {
       Burger burger = new Burger();
       burger.setSpeed(level);
       int x = Greenfoot.getRandomNumber(600);
       int y = 0;
       addObject(burger, x, y);
    }
}
