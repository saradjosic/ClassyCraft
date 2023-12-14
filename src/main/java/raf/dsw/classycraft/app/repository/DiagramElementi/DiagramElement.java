package raf.dsw.classycraft.app.repository.DiagramElementi;

import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;
import raf.dsw.classycraft.app.repository.implementacija.Project;

import java.awt.*;

public abstract class DiagramElement extends ClassyNode{
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
    @Override
    public Project findProject() {
        return super.findProject();
    }

    @Override
    public String getClassyIme() {
        return super.getClassyIme();
    }

    @Override
    public void setClassyIme(String classyIme) {
        super.setClassyIme(classyIme);
    }

    @Override
    public ClassyNode getParent() {
        return super.getParent();
    }

    @Override
    public void setParent(ClassyNode parent) {
        super.setParent(parent);
    }
}
