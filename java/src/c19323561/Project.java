package C19323561;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;
import processing.core.PApplet;


public class Project extends Visual
{
    
    WaveForm wf;
    AudioBandsVisual abv;
    Rain r;

    public void settings()
    {
        size(1500, 800);
    }

    public void setup()
    {
        startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("Cradles.mp3");
        //ProjectObject.add(new Rain(this));

        wf = new WaveForm(this);
        abv = new AudioBandsVisual(this);
        r = new Rain(this);
    }

    public void draw()
    {
        fill(255);
        background(175,238,238);

        r.update();
        r.render();

        try
        {
            // Call this if you want to use FFT data
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
        //abv.render();
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }
    }
}
