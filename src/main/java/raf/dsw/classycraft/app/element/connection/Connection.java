package raf.dsw.classycraft.app.element.connection;

import raf.dsw.classycraft.app.element.DiagramElement;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;

public abstract class Connection extends DiagramElement {
    public Connection(String ime, ClassyNode parent) {
        super(ime, parent);
    }
}
