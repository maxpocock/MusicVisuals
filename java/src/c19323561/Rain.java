package C19323561;

import processing.core.PApplet;


public class Rain extends ProjectObject {

    public Rain (Project pro)
    {
        super(pro, 0, 0);
    }

    public void render()
    {
        pro.pushMatrix();
        pro.translate(x1, y1);
        pro.noStroke();
        pro.colorMode(PApplet.HSB);
        pro.fill(PApplet.map(pro.getSmoothedAmplitude(), 0, 1, 255, 0), 255, 255);
        pro.colorMode(PApplet.RGB);
        pro.circle(0, 0, w);  
        pro.triangle(0, -halfW*3, halfW, 0, -halfW, 0);
        pro.popMatrix();
    }

    public void update()
    {
        y1 += directionY;

        if (y1 > pro.height + 150)
        {
            y1 = pro.random(-500, -50);
        }

        
    }

}
