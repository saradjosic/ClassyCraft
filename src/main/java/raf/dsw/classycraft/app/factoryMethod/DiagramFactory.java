package raf.dsw.classycraft.app.factoryMethod;


import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;
import raf.dsw.classycraft.app.repository.implementacija.Diagram;
import raf.dsw.classycraft.app.repository.implementacija.Package;

public class DiagramFactory extends ClassyNodeFactory{
    @Override
    public ClassyNode createChild(ClassyNode parent) {
        return new Diagram(parent);
    }

   @Override
    public ClassyNode createNode(ClassyNode parent, String name) {
        return new Package(name,parent);
    }
}