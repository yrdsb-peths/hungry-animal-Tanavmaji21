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
        Pizza myPizza = new Pizza();
        addObject(myPizza,200,300);
        Burger myBurger = new Burger();
        addObject(myBurger,400,200);
        Pumpkin myPumpkin = new Pumpkin();
        addObject(myPumpkin,450,350);
       
    }
    
    public void increaseScore()
    {
        score++;
        countLabel.setValue(score);
    }
}
