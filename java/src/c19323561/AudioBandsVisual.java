package C19323561;

import processing.core.*;

// This is an example of a visual that uses the audio bands
public class AudioBandsVisual
{
    Project pro;

    public AudioBandsVisual(Project pro)
    {
        this.pro = pro; 
    }

    public void render()
    {
        float gap = pro.width / (float) pro.getBands().length;
        pro.noStroke();
        for(int i = 0 ; i < pro.getBands().length ; i ++)
        {
            pro.fill(PApplet.map(i, 0, pro.getBands().length, 255, 0), 255, 255);
            pro.rect(i * gap, pro.height, gap,-pro.getSmoothedBands()[i] * 0.2f); 
        }
    }
}