package Interfaces;

/**
 * Created by sam1 on 12.10.16.
 */
public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint topRight;
    public MovableRectangle(int x1,int y1,int x2,int y2,int xSpeed,int ySpeed){
        topLeft=new MovablePoint(x1,y1,xSpeed,ySpeed);
        topRight=new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    @Override
    public void moveUP(){
        topLeft.y -=topLeft.xSpeed;
        topRight.y -=topRight.ySpeed;
    }
    @Override
    public void moveDown(){
        topLeft.y +=topLeft.xSpeed;
        topRight.y +=topRight.ySpeed;
    }
    @Override
    public  void moveRight(){
        topLeft.x +=topLeft.xSpeed;
        topRight.x +=topRight.ySpeed;
    }
    @Override
    public void moveLeft(){
        topLeft.x -=topLeft.xSpeed;
        topRight.x -=topRight.ySpeed;
    }
    public String toString(){
        String a="";
        if(topLeft.x<0 && topRight.y <0) a="down";
        if(topLeft.x>0 && topRight.y >0) a="up";
        if (topLeft.x>0 && topRight.y<0) a="Right";
        if (topLeft.x<0 && topRight.y >0) a="Left";

        return "rectangle moved "+a;
    }
}
