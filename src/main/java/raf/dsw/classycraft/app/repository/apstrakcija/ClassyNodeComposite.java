package raf.dsw.classycraft.app.repository.apstrakcija;


import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;

import java.util.ArrayList;
import java.util.List;


public abstract class ClassyNodeComposite extends ClassyNode{
    private List<ClassyNode> children;

    public ClassyNodeComposite(String naziv, ClassyNode parent) {
        super(naziv, parent);
        this.children=new ArrayList<>();
    }

    public ClassyNodeComposite(String naziv, ClassyNode parent,List<ClassyNode> children) {

        super(naziv, parent);
        this.children= children;
    }



    public void removeChild(ClassyNode child) {
        if (children.contains(child))
        { children.remove(child);}
    }
    public  void addChild(ClassyNode child){
        //  if(children==null) children=new ArrayList<>();
        if(children.contains(child))
            return;
        if(child!=null)
            children.add(child);
    }
    public List<ClassyNode> getChildren() {
        return children;
    }


    public ClassyNode getChildByName(String ime) {
        for (ClassyNode child: this.getChildren()) {
            if (ime.equals(child.getClassyIme())) {
                return child;
            }
        }
        return null;
    }

}
