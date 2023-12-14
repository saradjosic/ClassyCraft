package raf.dsw.classycraft.app.controller;

import lombok.Getter;
import lombok.Setter;
import raf.dsw.classycraft.app.MessageHandler.EventType;
import raf.dsw.classycraft.app.MessageHandler.Message;
import raf.dsw.classycraft.app.MessageHandler.MessageTypes;
import raf.dsw.classycraft.app.core.ApplicationFramework;
import raf.dsw.classycraft.app.repository.implementacija.ProjectExplorer;
import raf.dsw.classycraft.app.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
@Getter
@Setter
public class RenameAction extends AbstractClassyAction{

    public RenameAction() {


        putValue(SMALL_ICON,loadIcon("/images/renamee.png"));
        putValue(SHORT_DESCRIPTION,"Renmae");
        putValue(NAME,"Rename");
        //   putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.ALT_MASK));
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(MainFrame.getInstance().getClassyTree().getSelectedNode().getClassyNode() instanceof ProjectExplorer){
            ApplicationFramework.getInstance().getMessagePublisher().generateMessage(new Message(EventType.NAME_SPACES, MessageTypes.WARNING,"Ime ne sme sadrzati razmake"));
            return;
        }
        String naziv= JOptionPane.showInputDialog("Type the new name for selected node.");
        if(naziv ==null)return;
        if(naziv.contains(" ")){
            ApplicationFramework.getInstance().getMessagePublisher().generateMessage(new Message(EventType.NAME_SPACES, MessageTypes.WARNING,"Ime ne sme sadrzati razmake"));
            return;
        }
        if(naziv.isEmpty()){
            ApplicationFramework.getInstance().getMessagePublisher().generateMessage(new Message(EventType.NAME_EMPTY, MessageTypes.WARNING,"Ime ne sme biti prazno"));
            return;
        }
        MainFrame.getInstance().getClassyTree().getSelectedNode().setIme(naziv);
        SwingUtilities.updateComponentTreeUI(MainFrame.getInstance().getClassyTree().returnTree());
    }
}
