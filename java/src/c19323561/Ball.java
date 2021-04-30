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
    int selection = 1;

    public Ball (Project pro)
    {
        this.pro = pro;
        spawn();
    }    

    void spawn()
    {
        x = pro.width/2;
        y = pro.height/2;

        dirX = 0;
        dirY = 0;
    }

    public void render()
    {
        pro.calculateAverageAmplitude();
        pro.background(150,255,255);
        pro.pushMatrix();
        pro.translate(x, y);
        pro.noStroke();
        pro.colorMode(PApplet.HSB);
        for(int i = 0; i < pro.getAudioBuffer().size(); i++)
            {
                pro.circle(0, 0, map(pro.getSmoothedAmplitude(), 0, 1, 0, 300));
                pro.fill(PApplet.map(pro.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
            }
         
        pro.colorMode(PApplet.RGB);      
        pro.popMatrix();
    }

    public void update()
    {
        if (selection == 9 && dirX == 0)
        {
            dirX = pro.random(-4,4);
            dirY = pro.random(-4,4);
        }
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

    public void keyPressed()
    {
        if(keyCode == '9')
        {
            selection = keyCode - '0';
        }
    }

}
    
