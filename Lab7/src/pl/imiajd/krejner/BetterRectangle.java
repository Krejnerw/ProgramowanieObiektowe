package pl.imiajd.krejner;

import java.awt.*;

public class BetterRectangle extends Rectangle {

//    public BetterRectangle(int w, int h, int x, int y){
//        setLocation(x,y);
//        setSize(w,h);
//    }
    public BetterRectangle(int w, int h, int x, int y){
        super(w,h);
    }
    public double getPerimeter(){
        return getHeight()*2 +2*getWidth();
    }

    public double GetArea(){
        return getWidth()*getHeight();
    }

}
