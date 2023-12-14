package raf.dsw.classycraft.app.painter.klase;

import raf.dsw.classycraft.app.element.DiagramElement;
import raf.dsw.classycraft.app.element.interclass.Klasa;

import java.awt.geom.GeneralPath;

public class KlasaPainter extends InterClassPainter{
    public KlasaPainter(DiagramElement element) {
        super(element);
        Klasa klasa = ((Klasa)element);
        this.shape = new GeneralPath();
        ((GeneralPath)this.shape).moveTo((float)klasa.getPosition().x, (float)klasa.getPosition().y);
        ((GeneralPath)this.shape).lineTo((float)(klasa.getPosition().x + klasa.getSize().width), (float)klasa.getPosition().y);
        ((GeneralPath)this.shape).lineTo((float)(klasa.getPosition().x + klasa.getSize().width), (float)(klasa.getPosition().y + klasa.getSize().height));
        ((GeneralPath)this.shape).lineTo((float)klasa.getPosition().x, (float)(klasa.getPosition().y + klasa.getSize().height));
        ((GeneralPath)this.shape).closePath();
    }
}
