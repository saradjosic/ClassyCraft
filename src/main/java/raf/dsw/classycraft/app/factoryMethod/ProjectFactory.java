package raf.dsw.classycraft.app.factoryMethod;


import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;
import raf.dsw.classycraft.app.repository.implementacija.Project;

public class ProjectFactory extends ClassyNodeFactory{
    @Override
    public ClassyNode createChild(ClassyNode parent) {
        return new Project(parent);
    }

   // @Override
   // public ClassyNode createNode(ClassyNode parent, String name) {
    //    return new Project(name,parent);
   // }
}
