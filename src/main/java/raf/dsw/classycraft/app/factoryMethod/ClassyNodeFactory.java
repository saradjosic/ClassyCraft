package raf.dsw.classycraft.app.factoryMethod;


import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;

public abstract class ClassyNodeFactory{
    public ClassyNode returnChild(ClassyNode parent){
        ClassyNode node;
        node=createChild(parent);
        return node;
    }
    abstract public ClassyNode createChild(ClassyNode parent);

    //abstract public ClassyNode createNode(ClassyNode parent,String name);

}
