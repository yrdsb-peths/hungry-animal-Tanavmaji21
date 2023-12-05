import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stars extends World
{
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
        
        Elephant tanav = new Elephant();
        addObject(tanav,300,200);
        
        scoreLabel = new Label(0,70);
        addObject(scoreLabel, 550,30);
        
        createPizza();
       
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    public void createPizza()
    {
       Pizza pizza = new Pizza();
       pizza.setSpeed(level);
       int x = Greenfoot.getRandomNumber(600);
       int y = 0;
       addObject(pizza, x, y);
       
    }
    


    
    
    
}
