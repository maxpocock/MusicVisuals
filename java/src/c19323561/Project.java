package C19323561;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;

import processing.core.PApplet;


public class Project extends Visual
{
    
    WaveForm wf;
    AudioBandsVisual abv;

    public void settings()
    {
        fullScreen();
    }

    public void setup()
    {
        startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("Cradles.mp3");
    
        wf = new WaveForm(this);
        abv = new AudioBandsVisual(this);
        projectObject.add(new Rain(this));
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }
    }

    public void draw()
    {
        background(0);
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
}
