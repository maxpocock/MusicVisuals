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
        spawn();
    }    

    void spawn()
    {
        x = pro.width/2;
        y = pro.height/2;

        dirX = pro.random(-4,4);
        dirY = pro.random(-4,4);
    }

    public void render()
    {
        pro.background(150,255,255);
        pro.pushMatrix();
        pro.translate(x, y);
        pro.noStroke();
        pro.colorMode(PApplet.HSB);
        for(int i = 0; i < pro.getAudioBuffer().size(); i++)
            {
                pro.fill(
                PApplet.map(i, 0, pro.getAudioBuffer().size(), 0, 255), 255, 255);
            }
        pro.circle(0, 0, 100);  
        pro.colorMode(PApplet.RGB);      
        pro.popMatrix();
    }

    public void update()
    {
        x += dirX;
        y += dirY;

        if (y >= pro.height - 50 || y <= 55)
        {
            dirY = (-1) * dirY;
        }

        if (x >= pro.width - 50 || x <= 55)
        {
            dirX = (-1) * dirX; 
        }
    }

}
    
