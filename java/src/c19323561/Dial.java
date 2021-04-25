package C19323561;

public class Dial {
    Project pro;

    public Dial (Project pro)
    {
        this.pro = pro;
    }
    public void render()
    {
        float j, x, y;
        float cx = pro.width/2;
        float cy = pro.height/2;
        for(int i = 0 ; i < pro.getAudioBuffer().size() ; i ++)
        {
            pro.stroke(
                pro.map(i, 0, pro.getAudioBuffer().size(), 0, 255)
                , 255
                , 255
            );
            j = i *1;
            pro.circle(x, y,pro.height/4);

            if (pro.dist(x, y, pro.mouseX, pro.mouseY) < pro.height/4)
            {
                public static final int HAND_CURSOR;
            }
        }

    }
}
