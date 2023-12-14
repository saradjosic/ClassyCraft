package raf.dsw.classycraft.app.painters;

import raf.dsw.classycraft.app.repository.DiagramElementi.DiagramElement;

import java.awt.*;

public interface ElementPainter {

    public  void paint(Graphics2D g, DiagramElement element);

   // public abstract boolean elementFrom(DiagramElement element, Point pos);

    //public abstract String elementTo(DiagramElement element, Point pos);
}  //TODO
