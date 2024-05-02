package clocks;

import actions.Collision;
import game.Snake;

public class GameClock extends Thread {
    
    public static boolean running = true;
    
    
    public void run()
    {
        while(running)
        {
            
           try{
               
            sleep(200);
            Snake.move();
            Snake.waitToMove = false;
            Collision.collidePickUp();
            if (Collision.CollideSelf()) {
                   Snake.tails.clear();
                   Snake.score = 0;
            }
            if (Collision.CollideWall()) {
                   Snake.tails.clear();
                   Snake.head.setX(7);
                   Snake.head.setY(7);
                   Snake.score = 0;
                   
            }
           }catch(InterruptedException e)
           {
               e.printStackTrace();
           
           }
            
        }
    
    }
    
}
