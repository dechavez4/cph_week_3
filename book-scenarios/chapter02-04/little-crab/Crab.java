import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        if(isAtEdge()){           
        turn(260);
    }
    move (5);
        //turn(3);
    }
}


