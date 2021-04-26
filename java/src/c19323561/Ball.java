package C19323561;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import ie.tudublin.Visual;
import processing.core.PApplet;

public class Ball extends PApplet{
    Project pro;
    float x, y;
    float dirX;
    float dirY;

    public Ball (Project pro)
    {
        this.pro = pro;
    }    

    void spawn()
    {
        x = pro.width/2;
        y = pro.height/2;

        dirX = 4;
        dirY = 4;
    }

    public void render()
    {
        pro.pushMatrix();
        pro.translate(x, y);
        pro.stroke(255,255,255);
        pro.fill(225, 116, 66);
        pro.circle(0, 0, 100);        
        pro.popMatrix();
    }

    public void update()
    {
        x += dirX;
        y += dirY;

        if (y >= pro.height - 100)
        {
            dirY = -dirY;
        }
        else if ( y >= 100)
        {
            dirY = -dirY;
        }
    }

}
    
