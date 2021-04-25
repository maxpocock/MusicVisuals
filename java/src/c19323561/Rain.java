package C19323561;

public class Rain extends ProjectObject {

    public Rain (Project pro)
    {
        super(pro, 0, 0);
        spawn();
    }

    void spawn()
    {
        x1 = pro.random(0, 1500);
        x2 = pro.random(0, 1500);
        x3 = pro.random(0, 1500);
        x4 = pro.random(0, 1500);
        x5 = pro.random(0, 1500);
        x6 = pro.random(0, 1500);
        x7 = pro.random(0, 1500);
        x8 = pro.random(0, 1500);
        x9 = pro.random(0, 1500);
        x10 = pro.random(0, 1500);


        y1 = - 4;
        y2 = - 150;
        y3 = - 300;
        y4 = - 450;
        y5 = - 600;
        y6 = - 750;
        y7 = - 900;
        y8 = - 1050;
        y9 = - 1200;
        y10 = - 1350;
        directionX = 0;
        directionY = 4;
    }

    public void render()
    {
        pro.pushMatrix();
        pro.translate(x1, y1);
        pro.stroke(0);
        pro.fill(0);
        pro.circle(0, 0, w);
        pro.fill(0);
        pro.triangle(-halfW, -3, 0, -w*3/2, halfW, -3);
        pro.popMatrix();

        pro.pushMatrix();
        pro.translate(x2, y2);
        pro.stroke(0);
        pro.fill(0);
        pro.circle(0, 0, w);
        pro.fill(0);
        pro.triangle(-halfW, -3, 0, -w*3/2, halfW, -3);
        pro.popMatrix();

        pro.pushMatrix();
        pro.translate(x3, y3);
        pro.stroke(0);
        pro.fill(0);
        pro.circle(0, 0, w);
        pro.fill(0);
        pro.triangle(-halfW, -3, 0, -w*3/2, halfW, -3);
        pro.popMatrix();

        pro.pushMatrix();
        pro.translate(x4, y4);
        pro.stroke(0);
        pro.fill(0);
        pro.circle(0, 0, w);
        pro.fill(0);
        pro.triangle(-halfW, -3, 0, -w*3/2, halfW, -3);
        pro.popMatrix();

        pro.pushMatrix();
        pro.translate(x5, y5);
        pro.stroke(0);
        pro.fill(0);
        pro.circle(0, 0, w);
        pro.fill(0);
        pro.triangle(-halfW, -3, 0, -w*3/2, halfW, -3);
        pro.popMatrix();

        pro.pushMatrix();
        pro.translate(x6, y6);
        pro.stroke(0);
        pro.fill(0);
        pro.circle(0, 0, w);
        pro.fill(0);
        pro.triangle(-halfW, -3, 0, -w*3/2, halfW, -3);
        pro.popMatrix();

        pro.pushMatrix();
        pro.translate(x7, y7);
        pro.stroke(0);
        pro.fill(0);
        pro.circle(0, 0, w);
        pro.fill(0);
        pro.triangle(-halfW, -3, 0, -w*3/2, halfW, -3);
        pro.popMatrix();

        pro.pushMatrix();
        pro.translate(x8, y8);
        pro.stroke(0);
        pro.fill(0);
        pro.circle(0, 0, w);
        pro.fill(0);
        pro.triangle(-halfW, -3, 0, -w*3/2, halfW, -3);
        pro.popMatrix();

        pro.pushMatrix();
        pro.translate(x9, y9);
        pro.stroke(0);
        pro.fill(0);
        pro.circle(0, 0, w);
        pro.fill(0);
        pro.triangle(-halfW, -3, 0, -w*3/2, halfW, -3);
        pro.popMatrix();

        pro.pushMatrix();
        pro.translate(x10, y10);
        pro.stroke(0);
        pro.fill(0);
        pro.circle(0, 0, w);
        pro.fill(0);
        pro.triangle(-halfW, -3, 0, -w*3/2, halfW, -3);
        pro.popMatrix();
    }

    public void update()
    {
        x1 += directionX;
        x2 += directionX;
        x3 += directionX;
        x4 += directionX;
        x5 += directionX;
        x6 += directionX;
        x7 += directionX;
        x8 += directionX;
        x9 += directionX;
        x10 += directionX;

        y1 += directionY;
        y2 += directionY;
        y3 += directionY;
        y4 += directionY;
        y5 += directionY;
        y6 += directionY;
        y7 += directionY;
        y8 += directionY;
        y9 += directionY;
        y10 += directionY;

        if (y10 > pro.height + 150)
        {
            spawn();
        }

        
    }

}
