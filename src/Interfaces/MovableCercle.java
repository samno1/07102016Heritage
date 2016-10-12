package Interfaces;

/**
 * Created by sam1 on 12.10.16.
 */
public class MovableCercle implements  Movable{
    private  int radius;
    public MovablePoint center;

    public MovableCercle(int x,int y,int xSpeed,int ySpeed,int radius){
        center=new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius=radius;
    }
    public int getRadius(){
        return radius;
    }
    @Override
    public void moveUP(){
        center.y -=center.ySpeed;
    }
    @Override
    public void moveDown(){
        center.y +=center.ySpeed;
    }
    @Override
    public void moveLeft(){
        center.x -=center.xSpeed;
    }
    @Override
    public void moveRight(){
        center.x +=center.xSpeed;
    }
    public String toString(){
        String a="";
        if(center.y<0) a="down";
        if(center.y>0) a="up";
        if(center.x<0) a="left";
        if(center.y<0) a="right";

        return "The Circle moved "+a;
    }
}
