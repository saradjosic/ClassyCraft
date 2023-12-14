package raf.dsw.classycraft.app.tree.view;


import raf.dsw.classycraft.app.tree.controller.ClassyTreeCellEditor;
import raf.dsw.classycraft.app.tree.controller.ClassyTreeSelectionListener;

import javax.swing.*;
import javax.swing.tree.DefaultTreeModel;


public class ClassyTreeView extends JTree{
    public ClassyTreeView(DefaultTreeModel defaultTreeModel){
        setModel(defaultTreeModel);
        ClassyTreeCellRenderer cellRenderer=new ClassyTreeCellRenderer();
        //kao frame
        addTreeSelectionListener(new ClassyTreeSelectionListener());
        setCellEditor(new ClassyTreeCellEditor(this, cellRenderer));
        setCellRenderer(cellRenderer);
        setEditable(true);

    }
    //i sad mozemo da ga dodamo mainFrame u
}
/*
da bi konstruisali neki tree mporamo da mu damo sve
treeModel ima metodu za crtanje
malo je zeznuto pa pravimo novi komponetnu koja je kao prenosnik
izmedju naseg modela i modela za JTree
CLassyTreeItem u isto vreme je i  model i view,
za CLassyNode je view, jer ga stavim tu da bi mogao da ga prikaze,
ali za ceo JTree je model, on na osnovu njega crta
pa pravimo ClasyyTree i, i ClasyTreeImplementation
 */