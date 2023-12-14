package raf.dsw.classycraft.app.repository.DiagramElementi.interclass;

import raf.dsw.classycraft.app.repository.DiagramElementi.interclass.Interclass;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;

import java.awt.*;

public class Klasa extends Interclass {

    public Klasa(String ime, ClassyNode parent, Point position, Dimension size, String vidljivost) {
        super(ime, parent, position, size,vidljivost);
    }
}
