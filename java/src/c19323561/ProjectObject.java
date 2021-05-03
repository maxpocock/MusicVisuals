package C19323561;

public abstract class ProjectObject {
    //superclass used for rain

    float x1, y1;
    float directionY;
    float speed = 5;
    Project pro;
    int w = 75;
    int halfW = w / 2;

    public ProjectObject(Project pro, float x, float y)
    {
        this.pro = pro;
        this.x1 = x;
        this.y1 = y;

        x1 = pro.random(pro.width);
        y1 = pro.random(-700, -70);
        directionY = pro.random(10, 20);

    }


    public float getX1() {
        return x1;
    }


    public void setX1(float x1) {
        this.x1 = x1;
    }


    public float getY1() {
        return y1;
    }


    public void setY1(float y1) {
        this.y1 = y1;
    }

    public abstract void render();

    public abstract void update();

    
}
