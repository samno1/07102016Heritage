package Interfaces;

/**
 * Created by sam1 on 12.10.16.
 */
public class MovablePoint implements Movable {
    int x,y,xSpeed,ySpeed;

    public MovablePoint(int x,int y,int xSpeed,int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public void moveUP(){
        y -=ySpeed;
    }
    @Override
    public void moveDown(){
        y +=ySpeed;
    }
    @Override
    public void moveLeft(){
        x -=xSpeed;
    }
    public void moveRight(){
        x -=xSpeed;
    }
    public String toString(){
        String a="";
        if(y<0) a="down";
        if(y>0) a="up";
        if(x<0) a="left";
        if(y<0) a="right";

        return "Point moved "+a;
    }
}
