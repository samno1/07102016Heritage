package PolylineWithArrayList;

/**
 * Created by sam1 on 13.10.16.
 */
import java.awt.*;
import  java.awt.event.*;
import javax.swing.*;
public class KeyListenerAndMouseMotion extends JFrame implements MouseListener,MouseMotionListener,KeyListener {
    private TextField tfMouseClickX;
    private TextField tfMouseClickY;

    private TextField tfMousePositionX;
    private TextField tfMousePositionY;

    private TextField tfInput;
    private TextArea taDisplay;

    public KeyListenerAndMouseMotion(){
        setLayout(new FlowLayout());
        add(new Label("X-Click"));
        tfMouseClickX=new TextField(10);
        tfMouseClickX.setEditable(false);
        add(tfMouseClickX);

        add(new Label("Y-Click"));
        tfMouseClickY=new TextField(10);
        tfMouseClickY.setEditable(false);
        add(tfMouseClickY);

        add(new Label("X-Position"));
        tfMousePositionX=new TextField(10);
        tfMousePositionX.setEditable(false);
        add(tfMousePositionX);

        add(new Label("Y-Position"));
        tfMousePositionY=new TextField(10);
        tfMousePositionY.setEditable(false);
        add(tfMousePositionY);

        add(new Label("Enter your name"));
        tfInput=new TextField(10);
        add(tfInput);
        taDisplay=new TextArea(5,40);
        add(taDisplay);
        tfInput.addKeyListener(this);

        addMouseListener(this);
        addMouseMotionListener(this);
        setTitle("MouseMotionDemo");
        setSize(700,300);
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[]agrs){
        new KeyListenerAndMouseMotion();
    }
    @Override
    public void mouseClicked(MouseEvent ev){
        tfMouseClickX.setText(ev.getX()+"");
        tfMouseClickY.setText(ev.getY()+"");
    }

    @Override
    public void mousePressed(MouseEvent ev){

    }
    @Override
    public void mouseReleased(MouseEvent ev){
    }
    @Override
    public void mouseEntered(MouseEvent ev){
    }
    @Override
    public void mouseExited(MouseEvent ev){}

    @Override
    public void mouseMoved(MouseEvent ev){
        tfMousePositionX.setText(ev.getXOnScreen()+"");
        tfMousePositionY.setText(ev.getYOnScreen()+"");
    }
    @Override
    public void mouseDragged(MouseEvent ev){}
    @Override public void keyTyped(KeyEvent evt) {
        taDisplay.append(""+evt.getKeyChar());
    }
    @Override public void keyPressed(KeyEvent evt) { }
    @Override public void keyReleased(KeyEvent evt) { }







}