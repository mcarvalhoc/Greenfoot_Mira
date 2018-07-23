// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Foguete extends Actor
{

    /**
     * 
     */
    public Foguete()
    {
    }

    /**
     * Act - do whatever the Foguete wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("w")) {
            move(1);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-1);
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(1);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(-1);
        }
        if (Greenfoot.isKeyDown("Space")) {
            move(2);
        }
    }
}
