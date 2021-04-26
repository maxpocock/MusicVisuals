package C19323561;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;
import ddf.minim.AudioPlayer;

public class Project extends Visual
{
    int selection = 1;

    WaveForm wf;
    AudioBandsVisual abv;
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

        wf = new WaveForm(this);
        abv = new AudioBandsVisual(this);
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
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();        
        //wf.render();
        switch(selection)
        {
            case 1:
                s.render();
            break;

            case 2:
                abv.render();
            break;

            case 3:
                b.render();
                b.update();
            break;

            case 4:
                r.render();
                r.update();
            break;
        }
    }

    public void keyPressed()
    {
        if (keyCode >= '1' && keyCode <= '4')
        {
            selection = keyCode - '0';
        }
    }
}
