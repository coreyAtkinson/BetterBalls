import java.awt.*;
import javax.swing.*;
public class Ball{

    private int x,y;
    private int size;
    private int xSpeed, ySpeed;


    public Ball(int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
        xSpeed = (int)(Math.random()*10);
        ySpeed = (int)(Math.random()*10);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getSize(){
        return size;
    }
    public void drawBall(Graphics g){
        g.fillOval(x,y,size,size);
    }
    public void moveBall(JPanel bPanel){
        x+= xSpeed;
        if (x>=bPanel.getWidth() || x<=0){
            xSpeed*=-1;
        }

        y+=ySpeed;
        if (y>= bPanel.getHeight() || y<=0){
            ySpeed*=-1;
        }





    }
    public void moveRight(){
        x+= 10;
    }
    public void moveLeft(){
        x-= 10;
    }
    public void moveUp(){
        y-= 10;
    }
    public void moveDown(){
        y+= 10;
    }

    public void setPosition(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}