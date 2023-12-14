package raf.dsw.classycraft.app.factoryMethod;


import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;
import raf.dsw.classycraft.app.repository.implementacija.Package;


public class PackageFactory extends ClassyNodeFactory{
    @Override
    public ClassyNode createChild(ClassyNode parent) {
        return new Package(parent);
    }

  //  @Override
   // public ClassyNode createNode(ClassyNode parent, String name) {
   //     return new Package(name,parent);
 //   }

    /*
    @Override
    public ClassyNode createChild(String ime,ClassyNode parent) {
        return new Package(ime,parent);
    }
    */

}
