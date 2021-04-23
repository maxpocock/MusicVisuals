package C19323561;

import processing.core.*;

// This is an example of a visual that renders the waveform
public class WaveForm
{
    Project pro;
    float cy = 0;

    public WaveForm(Project pro)
    {
        this.pro = pro;
        cy = this.pro.height / 2;
    }

    public void render()
    {
        pro.colorMode(PApplet.HSB);
        for(int i = 0 ; i < pro.getAudioBuffer().size() ; i ++)
        {
            pro.stroke(
                PApplet.map(i, 0, pro.getAudioBuffer().size(), 0, 255)
                , 255
                , 255
            );

            pro.line(i, cy, i, cy + cy * pro.getAudioBuffer().get(i));
        }
    }
}