// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Mira extends Actor
{
    private Integer contador = 0;
    private boolean podeAtirar = true;

    /**
     * 
     */
    public Mira()
    {
    }

    /**
     * Act - do whatever the Mira wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimentoMira();
        destroiRocha();
    }

    /**
     * 
     */
    public void adicionaTiro()
    {
    }

    /**
     * 
     */
    public void movimentoMira()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) {
            setLocation(mouse.getX(), mouse.getY());
        }
    }

    /**
     * 
     */
    public void destroiRocha()
    {
        if (Greenfoot.mouseClicked(this)) {
            if (isTouching(Rocha.class)) {
                getWorldOfType(MyWorld.class).contaRocha();
                getWorldOfType(MyWorld.class).adicionaRocha();
                removeTouching(Rocha.class);
            }
        }
    }
}
