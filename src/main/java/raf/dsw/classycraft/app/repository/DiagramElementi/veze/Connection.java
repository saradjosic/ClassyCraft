package raf.dsw.classycraft.app.repository.DiagramElementi.veze;

import raf.dsw.classycraft.app.repository.DiagramElementi.DiagramElement;
import raf.dsw.classycraft.app.repository.DiagramElementi.interclass.Interclass;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;

public abstract class Connection extends DiagramElement {


    private Interclass fromElement;
    private Interclass toElement;


    public Connection(String classyIme, ClassyNode parent) {
        super(classyIme, parent);
    }
}
