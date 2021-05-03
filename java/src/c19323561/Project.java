package C19323561;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;
import ddf.minim.AudioPlayer;

public class Project extends Visual
{
    int selection = 1;

    //making rain an array allows us to call it multiple times
    Rain[] r = new Rain[60];
    Ball b;
    AudioPlayer ap;
    Sunset s;

    public void settings()
    {
        fullScreen();
    }

    public void setup()
    {
        startMinim();
                
        loadAudio("Cradles.mp3");

        //this loop calls rain r.length times
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
        
        //this switch controls navigating between the visualizers
        switch(selection)
        {
            //sunset
            case 1:
                s.render();
            break;

            //rain
            case 2:
                for(int i = 0; i < r.length; i++)
                {
                    r[i].render();
                    r[i].update();
                }
            break;

            //ball
            case 3:
                b.draw();
            break;
        }
    }

    @Override
    public void keyPressed()
    {
        //for navigation
        if (keyCode >= '1' && keyCode <= '3')
        {
            selection = keyCode - '0';
        }

        //starts the music
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }
    }

    //move the ball
    @Override
    public void mouseDragged()
    {
            b.x = mouseX;
            b.y = mouseY;
            b.dirX = 0;
            b.dirY = 0;
        
    }

    //allow ball to move again
    @Override
    public void mouseClicked()
    {
        b.dirX = random(-4,4);
        b.dirY = random(-4,4);
        
    }
}
