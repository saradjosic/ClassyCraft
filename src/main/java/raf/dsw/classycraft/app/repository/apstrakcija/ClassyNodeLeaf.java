package raf.dsw.classycraft.app.repository.apstrakcija;


import raf.dsw.classycraft.app.repository.DiagramElementi.DiagramElement;

import java.util.List;

public abstract class ClassyNodeLeaf extends ClassyNode{

    public ClassyNodeLeaf(String ime, ClassyNode parent) {
        super(ime, parent);
    }

    private List<DiagramElement> elements;
    public  void addDiagramElement(DiagramElement element){
        //  if(children==null) children=new ArrayList<>();
        if(elements.contains(element))
            return;
        if(element!=null)
            elements.add(element);
    }

}
