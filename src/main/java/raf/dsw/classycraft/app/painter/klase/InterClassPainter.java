package raf.dsw.classycraft.app.painter.klase;


import raf.dsw.classycraft.app.element.DiagramElement;
import raf.dsw.classycraft.app.element.interclass.*;
import raf.dsw.classycraft.app.painter.ElementPainter;

import java.awt.*;

public class InterClassPainter implements ElementPainter {

    protected Shape shape;

    protected DiagramElement element;


    public InterClassPainter(DiagramElement element)
    {
        this.element=element;
    }
    @Override
    public void paint(Graphics2D g, DiagramElement element) {
        g.setPaint(Color.GRAY);
        if (element instanceof Klasa) {
            g.setPaint(Color.BLACK);
        }else if (element instanceof Interfejs) {
            g.setPaint(Color.RED);
        }else if(element instanceof EnumKlasa) {
            g.setPaint(Color.BLUE);
        }else if(element instanceof ApstraktnaKlasa) {
            g.setPaint(Color.GREEN);
        }
        g.setStroke(new BasicStroke(element.getStroke()));
        g.draw(this.getShape());
        g.setColor(element.getBoja());
        g.fill(this.getShape());
        if (element instanceof InterClass) {
            g.setPaint(Color.GRAY);
            InterClass device = (InterClass) element;
            g.drawString(device.getClassyIme(), (int)device.getPosition().getX() + 10, (int)device.getPosition().getY() + 10);
        }


    }

    @Override
    public Point elementAt() {
        return ((InterClass)element).getPosition();
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
