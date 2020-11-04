package pl.imiajd.krejner;

import java.awt.*;

public class BetterRectangleTest {

    public static void main(String[] args){
//        Rectangle rect = new Rectangle(12,12);
        BetterRectangle better = new BetterRectangle(12, 12, 0, 0);

        System.out.println(better.getPerimeter());
        System.out.println(better.GetArea());

    }
}
