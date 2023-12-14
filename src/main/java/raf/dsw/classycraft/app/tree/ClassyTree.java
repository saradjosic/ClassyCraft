package raf.dsw.classycraft.app.tree;

import raf.dsw.classycraft.app.observer.IPublisher;
import raf.dsw.classycraft.app.repository.implementacija.ProjectExplorer;
import raf.dsw.classycraft.app.tree.model.ClassyTreeItem;
import raf.dsw.classycraft.app.tree.view.ClassyTreeView;

public interface ClassyTree extends IPublisher{
    ClassyTreeView generateTree(ProjectExplorer projectExplorer);//tako dobija root
    void addChild(ClassyTreeItem parent, String koji);
    ClassyTreeItem getSelectedNode();
    void removeChild(ClassyTreeItem selected);

    void addChild(ClassyTreeItem parent,String naziv, String koji);
    ClassyTreeView returnTree();




    //kao controller
    /*
    u addChild metodi na ne tree item dodajemo dete, kod njega se to radi
    samo sa metodom add da bi se prikazalo i stablu
    a u isto vreme moramo da pozovemo getChild preko ClassyRepositort-a
     odnosno Composite-a da napravi i tu dete
     */
}
//createNode, addChild, generateTree).