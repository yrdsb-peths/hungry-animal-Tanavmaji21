import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stars extends World
{

    /**
     * Constructor for objects of class Stars.
     * 
     */
    public Stars()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Elephant tanav = new Elephant();
        addObject(tanav,50,100);
        Ricky ricky = new Ricky();
        addObject(ricky,75,80);
        
    }
}
