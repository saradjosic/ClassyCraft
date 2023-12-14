package raf.dsw.classycraft.app.tree.controller;


import raf.dsw.classycraft.app.repository.implementacija.Package;
import raf.dsw.classycraft.app.tree.model.ClassyTreeItem;
import raf.dsw.classycraft.app.view.MainFrame;

import javax.swing.*;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.EventObject;


public class ClassyTreeCellEditor extends DefaultTreeCellEditor implements ActionListener{



    private Object clickedOn=null;
    private JTextField edit=null;
    public ClassyTreeCellEditor(JTree arg0, DefaultTreeCellRenderer arg1){
        super(arg0,arg1);
    }


    public Component getTreeCellEditorComponent(JTree arg0, Object arg1, boolean arg2, boolean arg3, boolean arg4, int arg5){
        clickedOn =arg1;
        edit=new JTextField(arg1.toString());
        edit.addActionListener(this);
        return edit;
        //to je zamenska metoda,mora da se doda listner koji je isto treecelleditor
    }

    public boolean isCellEditable(EventObject event) {
        if(event instanceof MouseEvent)
            if (((MouseEvent)event).getClickCount()==3){
                return true;
            }
        else if(((MouseEvent)event).getClickCount()==2){
            if(MainFrame.getInstance().getClassyTree().getSelectedNode().getClassyNode() instanceof Package){
                MainFrame.getInstance().getClassyTree().notifySubscribers(MainFrame.getInstance().getClassyTree().getSelectedNode().getClassyNode());
            }
            }//mora da se doda [ps;e getSelectedNode getCLassyNode
        return false;
    }

    public void actionPerformed(ActionEvent e){
        if (!(clickedOn instanceof ClassyTreeItem))
            return;
        ClassyTreeItem clicked = (ClassyTreeItem) clickedOn;//neki item
        clicked.setIme(e.getActionCommand());//tu setuje drugo ime
        //stopCellEditing();
    }



    /*
boolean isCellEditable(e) neka kacija, na koji nacin se pokrece editor
npr da li je kliknuo 3 puta ako vrati true poziva se neka druga metoda
u pozadini koja je isto u ovoj klasi, ona sluzi da uzmemo i napravimo zamensku
komponentu umesto te koja vec stoji, koja ce da bude JTextField i stavi je listner
na to i taj listenr je isto treecelleditor

ako je isCellEditable true
zove se getTreeCellEditorComponent
imamo actionPerformed koji ceka enter, i kada ga dobije on iz textFielda
uzima vrednost koju smo mi ukucali i stavlja na model



 */
}
