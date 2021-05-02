package C19323561;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;
import ddf.minim.AudioPlayer;

public class Project extends Visual
{
    int selection = 1;

    Rain r;
    Ball b;
    AudioPlayer ap;
    Sunset s;

    public void settings()
    {
        size(1500, 800);
    }

    public void setup()
    {
        startMinim();
                
        loadAudio("Cradles.mp3");
        getAudioPlayer().cue(0);
        getAudioPlayer().play();

        r = new Rain(this);
        b = new Ball(this);
        s = new Sunset(this);
    }

    public void draw()
    {
        fill(150,255,255);
        background(0);

        try
        {
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        
        calculateFrequencyBands(); 
        calculateAverageAmplitude();        
        switch(selection)
        {
            case 1:
                s.render();
            break;

            case 2:
                r.render();
                r.update();
            break;

            case 3:
                b.draw();
            break;
        }
    }

    public void keyPressed()
    {
        if (keyCode >= '1' && keyCode <= '3')
        {
            selection = keyCode - '0';
        }
    }
}
