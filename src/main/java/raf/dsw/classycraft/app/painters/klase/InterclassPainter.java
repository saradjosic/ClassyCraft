package raf.dsw.classycraft.app.painters.klase;

import raf.dsw.classycraft.app.painters.ElementPainter;
import raf.dsw.classycraft.app.repository.DiagramElementi.DiagramElement;
import raf.dsw.classycraft.app.repository.DiagramElementi.interclass.*;
import raf.dsw.classycraft.app.repository.DiagramElementi.interclass.Enum;

import java.awt.*;

public class InterclassPainter implements ElementPainter {

    private Shape shape;

    private DiagramElement element;


    public InterclassPainter(DiagramElement element)
    {
        this.element=element;
    }

    public void paint(Graphics2D g, DiagramElement element) {
        g.setPaint(Color.GRAY);
        if (element instanceof Klasa) {
            g.setPaint(Color.BLACK);
        }else if (element instanceof Interface) {
            g.setPaint(Color.RED);
        }else if(element instanceof Enum) {
            g.setPaint(Color.BLUE);
        }else if(element instanceof ApstraktnaKlasa) {
            g.setPaint(Color.GREEN);
        }
        g.setStroke(new BasicStroke(element.getStroke()));
        g.draw(this.getShape());
        g.setColor(element.getBoja());
        g.fill(this.getShape());
        if (element instanceof Interclass) {
            g.setPaint(Color.GRAY);
            Interclass device = (Interclass) element;
            g.drawString(device.getClassyIme(), (int)device.getPosition().getX() + 10, (int)device.getPosition().getY() + 10);
        }


    }


    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public DiagramElement getElement() {
        return element;
    }

    public void setElement(DiagramElement element) {
        this.element = element;
    }
}
