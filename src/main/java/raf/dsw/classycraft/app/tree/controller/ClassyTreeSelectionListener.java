package raf.dsw.classycraft.app.tree.controller;


import raf.dsw.classycraft.app.tree.model.ClassyTreeItem;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;


public class ClassyTreeSelectionListener implements TreeSelectionListener{
    @Override
    public void valueChanged(TreeSelectionEvent e) {
        TreePath path = e.getPath();
        ClassyTreeItem treeItemSelected = (ClassyTreeItem)path.getLastPathComponent();
        // System.out.println("Selektovan cvor:"+ treeItemSelected.getClassyNode().getIme());
        // System.out.println("getPath: "+e.getPath());
        // Message m=new Message(EventType.SELECTED_NODE + treeItemSelected.getClassyNode().getIme(),MessageTypes.NOTIFICATION);
        //ApplicationFramework.getInstance().getMessagePublisher().generateMessage(m);
    }//to je za selektovani cvor
}
