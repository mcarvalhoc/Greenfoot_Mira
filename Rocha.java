// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Rocha extends Actor
{
    private Integer contador = 0;

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
        contador = contador + 1;
        move(3);
        if (isAtEdge()) {
            int angle = Greenfoot.getRandomNumber(350);
            setRotation(angle);
            turn(3);
        }
        if (isTouching(Rocha.class)) {
            turn(-1);
        }
        someRocha();
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

    /**
     * 
     */
    public void saiRocha()
    {
        getWorld().removeObject(this);
    }
}
