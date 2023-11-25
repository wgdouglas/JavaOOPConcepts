package org.wgcodecompany.abstracts;

public class AbstractDemo {
    public static void main(String[] args) {
    GraphicObject circle = new Circle();//the left side is the abstract class & the right is your concrete class that has your specific methods
        circle.draw();
        circle.resize();
    }
}
