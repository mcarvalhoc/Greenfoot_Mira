// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Tiro extends Actor
{
    private Integer contador = 0;

    /**
     * 
     */
    public Tiro()
    {
    }

    /**
     * Act - do whatever the Tiro wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        contador = contador + 2;
        move(Greenfoot.getRandomNumber(800));
    }
}
