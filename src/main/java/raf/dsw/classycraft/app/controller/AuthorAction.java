package raf.dsw.classycraft.app.controller;

import lombok.Getter;
import lombok.Setter;
import raf.dsw.classycraft.app.MessageHandler.EventType;
import raf.dsw.classycraft.app.MessageHandler.Message;
import raf.dsw.classycraft.app.MessageHandler.MessageTypes;
import raf.dsw.classycraft.app.core.ApplicationFramework;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;
import raf.dsw.classycraft.app.repository.implementacija.Project;
import raf.dsw.classycraft.app.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
@Getter
@Setter
public class AuthorAction extends AbstractClassyAction{

    public AuthorAction() {

        putValue(SMALL_ICON, loadIcon("/images/autorr.png"));
        putValue(NAME, "Author");//kada ubacimo u toolBar
        putValue(SHORT_DESCRIPTION, "Author");//kada predjemo misem
    }

    public void actionPerformed(ActionEvent e) {
        ClassyNode selected= MainFrame.getInstance().getClassyTree().getSelectedNode().getClassyNode();
        if(!(selected instanceof Project)) {
            ApplicationFramework.getInstance().getMessagePublisher().generateMessage(new Message(EventType.AUTHOR_CAN_ONLY_BE_ADDED_ON_PROJECT, MessageTypes.WARNING,"Autor moze biti dodat samo na projekat"));
            return;
        }
        String naziv= JOptionPane.showInputDialog("Type the author's name:");
        if(naziv ==null)return;
        if(naziv.contains(" ")){
            ApplicationFramework.getInstance().getMessagePublisher().generateMessage(new Message(EventType.NAME_SPACES, MessageTypes.WARNING,"Ime ne sme sadrzati razmake"));
            return;
        }
        if(naziv.isEmpty()){
            ApplicationFramework.getInstance().getMessagePublisher().generateMessage(new Message(EventType.NAME_EMPTY, MessageTypes.WARNING,"Ime ne sme sadrzati razmake"));
            return;
        }
        //  MainFrame.getInstance().getClassyTree().getSelectedNode().setIme(pa.getClassyIme());
        MainFrame.getInstance().getClassyTree().getSelectedNode().setAutor(naziv);
    }

}

