package C19323561;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;
import ddf.minim.AudioPlayer;

public class Project extends Visual
{
    int selection = 1;

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

    @Override
    public void keyPressed()
    {
        if (keyCode >= '1' && keyCode <= '3')
        {
            selection = keyCode - '0';
        }

        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }

        if (keyCode == '0')
        {
            b.x = width/2;
            b.y = height/2;
        }
        else
        {
            b.x += b.dirX;
            b.y += b.dirY;
        }
    }

    @Override
    public void mouseDragged()
    {
            b.x = mouseX;
            b.y = mouseY;
            b.dirX = 0;
            b.dirY = 0;
        
    }

    @Override
    public void mouseClicked()
    {
        b.dirX = random(-4,4);
        b.dirY = random(-4,4);
        
    }
}
