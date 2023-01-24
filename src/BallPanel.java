import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
public class BallPanel extends JPanel{
    Ball ball = new Ball(100,100,50);

   // Ball[] balls = new Ball[20];

    int x = 80;
    int xSpeed = 10;
    int y = 10;
    int ySpeed = 10;

    public BallPanel(){
        setBackground(new Color(178, 138, 255));
       // for(int i = 0; i < 20; i++){
       //     balls[i] = new Ball((int)(Math.random()*100),((int)Math.random()*100),(int)(Math.random()*50));
      // }
        this.setFocusable(true);

        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
//w = 87, a= 65, s=83, d=68, up= 38, down = 40, right= 39, left= 37
                int code = e.getKeyCode();

                if(ball.getX() > 500)
                {
                    System.out.println("Out x");
                    ball.setPosition(0,ball.getY());
                }
                if(ball.getX() < 0)
                {
                    System.out.println("Out x");
                    ball.setPosition(500,ball.getY());
                }
                if(ball.getY() >= 430)
                {
                    System.out.println("Out y");
                    ball.setPosition(ball.getX(), 430);
                }
                if(ball.getY() <= 0)
                {
                    System.out.println("Out y");
                    ball.setPosition(ball.getX(), 0);
                }

                if(code == 68 || code == 39)
                {
                    ball.moveRight();
                }
                if(code == 65 || code == 37)
                {
                    ball.moveLeft();
                }
                if(code == 87 || code == 38)
                {
                    ball.moveUp();
                }
                if(code == 83 || code == 40)
                {
                    ball.moveDown();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        ball.drawBall(g);
       // System.out.println(ball.getX() + "," + ball.getY());



        try {
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);
        };
        repaint();
    }
}