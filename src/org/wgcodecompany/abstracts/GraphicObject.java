package org.wgcodecompany.abstracts;

public abstract class GraphicObject {
    int x, y;

    void moveTo(int newX, int newY){
        System.out.println("move to x:" + x + "\n move to y:" + y);
    }

    abstract  void  draw();
    abstract void resize();
}
