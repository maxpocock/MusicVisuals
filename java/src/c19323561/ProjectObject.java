package C19323561;

// abstract means the class cannot be instantiated
public abstract class ProjectObject {
    float x, y;
    float directionX, directionY;
    float speed = 5;
    Project pro;
    float w = 50;
    float halfW = w / 2;

    public ProjectObject(Project pro, float x, float y)
    {
        this.pro = pro;
        this.x = x;
        this.y = y;
    }


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

    // subclasses must implement these abstract methods, otherwise they will be abstract
    public abstract void render();

    public abstract void update();

    
}
