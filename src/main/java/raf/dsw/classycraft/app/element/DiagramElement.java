package raf.dsw.classycraft.app.element;

import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;

import java.awt.*;

public abstract class DiagramElement extends ClassyNode {

    protected Color boja;

    protected int stroke; //preporucio da se ovde koristi int


    public DiagramElement( String ime, ClassyNode parent) {
        super(ime, parent);
    }

    public Color getBoja() {
        return boja;
    }

    public void setBoja(Color boja) {
        this.boja = boja;
    }

    public int getStroke() {
        return stroke;
    }

    public void setStroke(int stroke) {
        this.stroke = stroke;
    }

}
