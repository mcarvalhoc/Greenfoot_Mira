// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    private Rocha rocha = null;
    private Mira mira = null;

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        adicionaRocha();
        adicionaMira();
    }

    /**
     * 
     */
    public void adicionaRocha()
    {
        addObject( new  Rocha(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
    }

    /**
     * 
     */
    public void adicionaMira()
    {
        addObject( new  Mira(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
    }

    /**
     * 
     */
    public void moveMira()
    {
        Greenfoot.mouseMoved(Mira.class);
        
    }
}
