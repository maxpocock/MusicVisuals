package C19323561;

import processing.core.PApplet;

public class Sunset extends PApplet
{
    Project pro;
    float cy = 0;

    public Sunset(Project pro)
    {
        this.pro = pro;
        cy = this.pro.height / 2;
    }

    public void render()
    {
        pro.noStroke();
        pro.fill(150,255,255);
        pro.rect(pro.width/3, 0, pro.width/3 + 10,  pro.height/2);
        pro.fill(207, 174, 66);
        pro.circle(pro.width/2 + 5, pro.height/2, pro.height/2);
        pro.fill(32, 178, 170);
        pro.rect(pro.width/3, pro.height/2, pro.width/3 + 10, pro.height);
        //pro.fill(207, 174, 66);
        //pro.circle(pro.width/2 + 5, pro.height/6, pro.height/6);

        for(int i = 0 ; i < pro.getAudioBuffer().size() ; i ++)
        {
            if(pro.getAudioBuffer().get(i) > 0)
            {
                pro.stroke(240, 140, 0);
            }
            else
            {
                pro.stroke(147, 112, 219);
            }

            pro.line(i + pro.width / 3, cy, i + pro.width / 3,cy + cy * pro.getAudioBuffer().get(i)/2);
        }
    }
}
