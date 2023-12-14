package raf.dsw.classycraft.app.element.interclass;

import lombok.Getter;
import lombok.Setter;
import raf.dsw.classycraft.app.element.DiagramElement;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;

import java.awt.*;

@Getter
@Setter
public abstract class InterClass extends DiagramElement {
    public InterClass(String ime, ClassyNode parent,Point position, Dimension size) {
        super(ime, parent);
        this.size = size;
        this.position = position;
    }

    protected Dimension size;
    protected Point position;

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
