package C19323561;

public class Rain extends ProjectObject {
    
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getW() {
        return w;
    }

    public void setW(float w) {
        this.w = w;
    }

    public Rain(Project pro)
    {
        super(pro, 0, 0);
        spawn();
    }

    void spawn()
    {
                x = pro.random(0, pro.width);
                y = -w;
                directionX = pro.random(-1, 1);
                directionY = pro.random(1, 4);
    }

    public void render()
    {
        pro.pushMatrix();
        pro.translate(x, y);
        pro.stroke(255);
        pro.line(-halfW, halfW, -halfW, -halfW);
        pro.line(-halfW, -halfW, halfW, -halfW);
        pro.line(halfW, -halfW, halfW, halfW);        
        pro.line(halfW, halfW, -halfW, halfW);

        pro.line(0, -halfW, 0, halfW);
        pro.line(-halfW, 0, halfW, 0);

        pro.popMatrix();
    }

    public void update()
    {        
        x += directionX;
        y += directionY;

        if (y < - w)
        {
            spawn();
        }
        if (y > pro.height + w)
        {
            spawn();
        }
    }

}
