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
    private Placar placar = null;
    private Foguete foguete = null;

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(800, 500, 1);
        prepare();
        prioridadeClasses();
        
    }

    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        adicionaRocha();
        adicionaRocha();
        adicionaRocha();
        adicionaMira();
        placar =  new Placar();
        addObject(placar, 400, 25);
        foguete =  new Foguete();
        addObject(foguete, 274, 213);
    }

    /**
     * 
     */
    public void adicionaRocha()
    {
        addObject( new Rocha(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(500));
    }

    /**
     * 
     */
    public void adicionaMira()
    {
        addObject( new Mira(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
    }

    /**
     * 
     */
    public void adicionaPlacar()
    {
        addObject( new Placar(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
    }

    /**
     * 
     */
    public void moveMira()
    {
        Greenfoot.mouseMoved(Mira.class);
        
    }

    /**
     * 
     */
    public void contaRocha()
    {
        placar.adicionaPontoRocha();
    }

    /**
     * 
     */
    public void prioridadeClasses()
    {
        setActOrder(Mira.class);
        setActOrder(Rocha.class);
    }
}
