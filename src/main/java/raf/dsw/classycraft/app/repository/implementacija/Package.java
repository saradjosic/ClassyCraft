package raf.dsw.classycraft.app.repository.implementacija;


import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNodeComposite;

public class Package extends ClassyNodeComposite{
    private static int br=1;
    public Package(String ime, ClassyNode parent) {
        super(ime, parent);
    }

    public Package(ClassyNode parent){
        super("Package"+br++,parent);
    }





}
