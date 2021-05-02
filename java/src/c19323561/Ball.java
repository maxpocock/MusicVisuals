package C19323561;

import processing.core.PApplet;

public class Ball extends PApplet {
    Project pro;
    float x, y;
    float dirX;
    float dirY;
    boolean move = false;

    public Ball (Project pro)
    {
        this.pro = pro;
        setup();
    }    

    public void setup()
    {
        x = pro.width/2;
        y = pro.height/2;

        dirX = pro.random(-4,4);
        dirY = pro.random(-4,4);
    }

    public void draw()
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

    @Override
    public void mousePressed()
    {
        background(50);
    }
}
    
