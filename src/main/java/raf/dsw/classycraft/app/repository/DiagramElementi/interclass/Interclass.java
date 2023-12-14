package raf.dsw.classycraft.app.repository.DiagramElementi.interclass;

import raf.dsw.classycraft.app.repository.DiagramElementi.DiagramElement;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;

import java.awt.*;

public abstract class Interclass extends DiagramElement {
    public Interclass(String ime, ClassyNode parent, Point position, Dimension size, String vidljivost) {
        super(ime, parent);
        this.size = size;
        this.position = position;
        this.vidljivost=vidljivost;
    }

    private Dimension size;
    private Point position;
    private String vidljivost;

    public Dimension getSize() {
        return size;
    }

    public void setSize(Dimension size) {
        this.size = size;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
}

