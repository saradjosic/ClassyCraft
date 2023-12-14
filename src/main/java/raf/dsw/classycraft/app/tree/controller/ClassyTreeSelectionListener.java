package raf.dsw.classycraft.app.tree.controller;


import raf.dsw.classycraft.app.MessageHandler.EventType;
import raf.dsw.classycraft.app.MessageHandler.Message;
import raf.dsw.classycraft.app.MessageHandler.MessageTypes;
import raf.dsw.classycraft.app.core.ApplicationFramework;
import raf.dsw.classycraft.app.tree.model.ClassyTreeItem;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;
import java.time.LocalDateTime;


public class ClassyTreeSelectionListener implements TreeSelectionListener{
    @Override
    public void valueChanged(TreeSelectionEvent e) {
        TreePath path = e.getPath();
        ClassyTreeItem treeItemSelected = (ClassyTreeItem)path.getLastPathComponent();
        // System.out.println("Selektovan cvor:"+ treeItemSelected.getClassyNode().getClassyIme());


        // System.out.println("getPath: "+e.getPath());

            Message message=new Message(MessageTypes.NOTIFICATION, LocalDateTime.now(),"SELECTED_NOD E" + treeItemSelected.getClassyNode().getClassyIme());
       //  Message m=new Message(MessageTypes.NOTIFICATION,,"SELECTED_NODE" + treeItemSelected.getClassyNode().getClassyIme());
        System.out.println(message);
         // ApplicationFramework.getInstance().getMessagePublisher().generateMessage(m);
    }//to je za selektovani cvor
}
