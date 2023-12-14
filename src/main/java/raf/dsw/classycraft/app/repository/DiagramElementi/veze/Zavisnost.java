package raf.dsw.classycraft.app.repository.DiagramElementi.veze;

import raf.dsw.classycraft.app.repository.DiagramElementi.veze.Connection;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;

public class Zavisnost extends Connection {
    public Zavisnost(String classyIme, ClassyNode parent) {
        super(classyIme, parent);
    }
}
