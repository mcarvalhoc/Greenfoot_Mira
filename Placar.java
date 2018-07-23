// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Placar extends Actor
{
    private Integer contador = 0;

    /**
     * 
     */
    public Placar()
    {
    }

    /**
     * Act - do whatever the Placar wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getWorld().showText(String.valueOf(contador), 400, 25);
        finalizaJogoVencedor();
    }

    /**
     * 
     */
    public void adicionaPontoRocha()
    {
        contador = contador + 1;
    }

    /**
     * 
     */
    public void adicionaPontoRocha1()
    {
        contador = contador + 1;
    }

    /**
     * 
     */
    public void adicionaPontoRocha3()
    {
        contador = contador + 1;
    }

    /**
     * 
     */
    public void finalizaJogoVencedor()
    {
        if (contador == 10) {
            getWorld().showText("Você Venceu", 400, 250);
            paraJogo();
        }
    }

    /**
     * 
     */
    public void paraJogo()
    {
        Greenfoot.stop();
    }
}
