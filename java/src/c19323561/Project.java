package C19323561;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;
import ddf.minim.AudioPlayer;

public class Project extends Visual
{
    int selection = 1;

    Rain[] r = new Rain[100];
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

        for(int i = 0; i < r.length; i++)
        {
            r[i] = new Rain(this);
        }
        b = new Ball(this);
        s = new Sunset(this);
    }

    public void draw()
    {
        background(150,255,255);

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
                for(int i = 0; i < r.length; i++)
                {
                    r[i].render();
                    r[i].update();
                }
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
