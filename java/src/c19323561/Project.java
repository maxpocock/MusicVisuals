package C19323561;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;
import  javax.swing.JFrame;

public class Project extends Visual
{
    int selection = 1;

    WaveForm wf;
    AudioBandsVisual abv;
    Rain r;
    Dial d;

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
        d = new Dial(this);
    }

    public void draw()
    {
        fill(255);
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
                d.render();
            break;

            case 2:
                abv.render();
            break;

            case 3:
                
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
