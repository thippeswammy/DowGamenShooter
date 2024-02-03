import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class player extends Actor
{
    boolean canFire=true;
    /**
     * Act - do whatever the player wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public player()
    {
        setRotation(270);
    }
    public void act()
    {
        moveAround();
        fireProjectile();
    }
    public void moveAround()
    {
      if(Greenfoot.isKeyDown("right"))
      {
         setLocation(getX()+5,getY());
        }
         
       if(Greenfoot.isKeyDown("left"))
      {
         setLocation(getX()-5,getY());
        }   
        if(Greenfoot.isKeyDown("up"))
      {
         setLocation(getX(),getY()-5);
        } 
          if(Greenfoot.isKeyDown("down"))
       {
             setLocation(getX(),getY()+5);
        } 
    }
     public void fireProjectile()
      {
         if(Greenfoot.isKeyDown("space")&&canFire==true)  
         {
              
             getWorld().addObject(new projectile(),getX(),getY()-5);
             canFire=false;
            }
            
           else       if(!Greenfoot.isKeyDown("space"))
                    canFire =true;
      }
   
    }

