package C19323561;

import processing.core.PApplet;

public class Dial extends PApplet{
    Project pro;
    CursorChange cursor;

    public Dial (Project pro)
    {
        this.pro = pro;
    }
    public void render()
    {
        cursor = new CursorChange(this);
        cursor.cursorDefault();

        float j ;
        float y = pro.height / 2;
        float x = pro.width / 2;
        for(int i = 0 ; i < pro.getAudioBuffer().size() ; i ++)
        {
            pro.stroke(
                map(i, 0, pro.getAudioBuffer().size(), 0, 255)
                , 255
                , 255
            );
            j = i *1;
            

            if (dist(x, y, pro.mouseX, pro.mouseY) < pro.height/4)
            {
                cursor.cursorHand();
                pro.stroke(200);
                
            }
            else
            {
                cursor.cursorDefault();
                pro.stroke(0);
            }
            pro.fill(0,0,150);
            pro.circle(x, y,pro.height/4);
            
        }

    }
    public CursorChange getCursor() {
        return cursor;
    }
    public void setCursor(CursorChange cursor) {
        this.cursor = cursor;
    }
}
