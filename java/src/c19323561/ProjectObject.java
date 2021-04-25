package C19323561;

public abstract class ProjectObject {
    

    float x1, y1;
    float x2, y2;
    float x3, y3;
    float x4, y4;
    float x5, y5;
    float x6, y6;
    float x7, y7;
    float x8, y8;
    float x9, y9;
    float x10, y10;
    float directionX, directionY;
    float speed = 5;
    Project pro;
    int w = 100;
    int halfW = w / 2;

    public ProjectObject(Project pro, float x, float y)
    {
        this.pro = pro;
        this.x1 = x;
        this.x2 = x;
        this.x3 = x;
        this.x4 = x;
        this.x5 = x;
        this.x6 = x;
        this.x7 = x;
        this.x8 = x;
        this.x9 = x;
        this.x10 = x;

        this.y1 = y;
        this.y2 = y;
        this.y3 = y;
        this.y4 = y;
        this.y5 = y;
        this.y6 = y;
        this.y7 = y;
        this.y8 = y;
        this.y9 = y;
        this.y10 = y;

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


    public float getX2() {
        return x2;
    }


    public void setX2(float x2) {
        this.x2 = x2;
    }


    public float getY2() {
        return y2;
    }


    public void setY2(float y2) {
        this.y2 = y2;
    }


    public float getX3() {
        return x3;
    }


    public void setX3(float x3) {
        this.x3 = x3;
    }


    public float getY3() {
        return y3;
    }


    public void setY3(float y3) {
        this.y3 = y3;
    }


    public float getX4() {
        return x4;
    }


    public void setX4(float x4) {
        this.x4 = x4;
    }


    public float getY4() {
        return y4;
    }


    public void setY4(float y4) {
        this.y4 = y4;
    }

    public float getX5() {
        return x5;
    }


    public void setX5(float x5) {
        this.x5 = x5;
    }


    public float getY5() {
        return y5;
    }


    public void setY5(float y5) {
        this.y5 = y5;
    }


    public float getX6() {
        return x6;
    }


    public void setX6(float x6) {
        this.x6 = x6;
    }


    public float getX7() {
        return x7;
    }


    public void setX7(float x7) {
        this.x7 = x7;
    }


    public float getX8() {
        return x8;
    }


    public void setX8(float x8) {
        this.x8 = x8;
    }


    public float getX9() {
        return x9;
    }


    public void setX9(float x9) {
        this.x9 = x9;
    }


    public float getX10() {
        return x10;
    }


    public void setX10(float x10) {
        this.x10 = x10;
    }


    public float getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public abstract void render();

    public abstract void update();

    
}
