import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A title screen for the user to know what to click
 * and what are the basic commands of the game.
 * 
 * @author Tanav Majithia 
 * @version December 7 2023
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
    
    /**
     * This method is created to add a starting option for the user.
     * When the game starts the user should have clicked the space bar
     * for it to work functionally.
     * 
     */
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
