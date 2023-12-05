import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 200);

        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Stars gameWorld = new Stars();
            Greenfoot.setWorld(gameWorld);
        }

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant, 479, 87);
        elephant.setLocation(465,184);
        elephant.setLocation(501,178);
        elephant.setLocation(480,184);
        elephant.setLocation(480,190);
        elephant.setLocation(495,192);
        elephant.setLocation(435,163);
        elephant.setLocation(441,165);
        elephant.setLocation(452,186);
        elephant.setLocation(452,186);
        elephant.setLocation(485,179);
        elephant.setLocation(515,187);
        elephant.setLocation(484,186);
        Label label = new Label("Use \u2190  \u2192 to move", 25);
        addObject(label,288,273);
        label.setLocation(312,255);
        Label label2 = new Label("Click space bar to start!", 25);
        addObject(label2,286,317);
        label2.setLocation(317,301);
    }
}
