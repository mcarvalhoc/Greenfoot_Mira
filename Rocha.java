// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Rocha extends Actor
{

    /**
     * 
     */
    public Rocha()
    {
    }

    /**
     * Act - do whatever the Rocha wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        someRocha();
        
    }

    /**
     * 
     */
    public void saiRocha()
    {
        getWorld().removeObject(this);
    }

    /**
     * 
     */
    public void someRocha()
    {
        if (Greenfoot.mouseClicked(this)) {
            getWorldOfType(MyWorld.class).adicionaRocha();
            saiRocha();
        }
    }
}
