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
    Label countLabel;
    /**
     * Constructor for objects of class Stars.
     * 
     */
    public Stars()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label countLabel = new Label(0,30);
        addObject(countLabel, 550,20);
        Elephant tanav = new Elephant();
        addObject(tanav,50,50);
        createPizza();
        createPumpkin();
        createBurger();
       
    }
    
    public void increaseScore()
    {
        score++;
        countLabel.setValue(score);
    }
    
    public void createPizza()
    {
       Pizza pizza = new Pizza();
       int x = Greenfoot.getRandomNumber(500);
       int y = Greenfoot.getRandomNumber(0);
       addObject(pizza, x, y);
       
    }
    
    public void createBurger()
    {
        Burger burger = new Burger();
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(0);
        addObject(burger, x, y);
    }
    
    public void createPumpkin()
    {
        Pumpkin pumpkin = new Pumpkin();
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(0);
        addObject(pumpkin, x, y);
    }
    
    
    
}
