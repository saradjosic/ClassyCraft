package raf.dsw.classycraft.app.controller;

import lombok.Getter;
import lombok.Setter;
import raf.dsw.classycraft.app.MessageHandler.EventType;
import raf.dsw.classycraft.app.MessageHandler.Message;
import raf.dsw.classycraft.app.MessageHandler.MessageTypes;
import raf.dsw.classycraft.app.core.ApplicationFramework;
import raf.dsw.classycraft.app.view.MainFrame;

import java.awt.event.ActionEvent;
@Getter
@Setter
public class DeleteAction extends AbstractClassyAction{
    public DeleteAction() {
        putValue(SMALL_ICON, loadIcon("/images/delete.png"));
        putValue(NAME, "Delete");//kada ubacimo u toolBar
        putValue(SHORT_DESCRIPTION, "Delete");//kada predjemo misem
    }


    public void actionPerformed(ActionEvent e) {
        if(MainFrame.getInstance().getClassyTree().getSelectedNode().getClassyNode().getClassyIme().equals("Project Explorer")){
            ApplicationFramework.getInstance().getMessagePublisher().generateMessage(new Message(EventType.PROJECT_EXPLORER_CANT_BE_DELETED, MessageTypes.ERROR,"ProjectExplorer ne moze biti obrisan"));
            return;
        }
        MainFrame.getInstance().getClassyTree().removeChild(MainFrame.getInstance().getClassyTree().getSelectedNode());
        //ApplicationFramework.getInstance().getClassyRepository().getRoot().removeChild();
        // System.out.println("delete");

    }
}