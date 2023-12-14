package raf.dsw.classycraft.app.repository.implementacija;


import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNodeComposite;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNodeLeaf;

public class Diagram extends ClassyNodeLeaf{
    private static int br=1;
    public Diagram(String ime, ClassyNode parent) {
        super(ime, parent);
    }
    public Diagram(ClassyNode parent) {
        super("Diagram "+ br++,parent);
    }



}
