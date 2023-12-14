package raf.dsw.classycraft.app.factoryMethod;

import lombok.Getter;
import lombok.Setter;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;
import raf.dsw.classycraft.app.repository.implementacija.Project;
import raf.dsw.classycraft.app.repository.implementacija.ProjectExplorer;
import raf.dsw.classycraft.app.repository.implementacija.Package;
import raf.dsw.classycraft.app.repository.implementacija.Diagram;
@Getter
@Setter
public class FactoryUtils{
    static final ProjectFactory projectFactory = new ProjectFactory();
    static final PackageFactory packageFactory = new PackageFactory();
    static final DiagramFactory diagramFactory = new DiagramFactory();

    public static ClassyNodeFactory returnFactory(ClassyNode parent, String el){
        if(parent instanceof ProjectExplorer) return projectFactory;
        if(parent instanceof Project) return packageFactory;
        if(parent instanceof Package){
            if(el.equals("Package")) return packageFactory;
            if(el.equals("Diagram")) return diagramFactory;
            return null;
        }
        return null;

    }
}
