package raf.dsw.classycraft.app.tree.model;

import lombok.Getter;
import lombok.Setter;
import raf.dsw.classycraft.app.MessageHandler.EventType;
import raf.dsw.classycraft.app.MessageHandler.Message;
import raf.dsw.classycraft.app.MessageHandler.MessageTypes;
import raf.dsw.classycraft.app.core.ApplicationFramework;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;
import raf.dsw.classycraft.app.repository.implementacija.Project;
import raf.dsw.classycraft.app.view.MainFrame;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ClassyTreeItem extends DefaultMutableTreeNode{

    private ClassyNode classyNode;

    public ClassyTreeItem(ClassyNode nodeModel) {
        classyNode = nodeModel;
    }

    @Override
    public String toString(){
        //if (classyNode != null) {
            return classyNode.getClassyIme();
       // } else {
        //    return "Unknown";
       // }
    }
    public void setIme(String ime){
        this.classyNode.setClassyIme(ime);
        MainFrame.getInstance().getClassyTree().notifySubscribers(classyNode);
    }

    public void setAutor(String ime) {

        if(this.classyNode instanceof Project)
            ((Project)this.classyNode).setAutor(ime);
        else ApplicationFramework.getInstance().getMessagePublisher().generateMessage(new Message(EventType.AUTHOR_CAN_ONLY_BE_ADDED_ON_PROJECT, MessageTypes.WARNING));

        MainFrame.getInstance().getClassyTree().notifySubscribers(classyNode);
    }



}



