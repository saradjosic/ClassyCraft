package raf.dsw.classycraft.app.state;

import raf.dsw.classycraft.app.MessageHandler.EventType;
import raf.dsw.classycraft.app.MessageHandler.Message;
import raf.dsw.classycraft.app.MessageHandler.MessageTypes;
import raf.dsw.classycraft.app.controller.AbstractClassyAction;
import raf.dsw.classycraft.app.core.ApplicationFramework;
import raf.dsw.classycraft.app.repository.DiagramElementi.DiagramElement;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;
import raf.dsw.classycraft.app.repository.implementacija.Package;
import raf.dsw.classycraft.app.repository.implementacija.Project;
import raf.dsw.classycraft.app.repository.implementacija.ProjectExplorer;
import raf.dsw.classycraft.app.state.concrete.MoveState;
import raf.dsw.classycraft.app.view.MainFrame;

import java.awt.event.ActionEvent;

public class MoveAction extends AbstractClassyAction{
    public MoveAction() {

        putValue(SMALL_ICON, loadIcon2("/images/move.png"));
      //  putValue(NAME, "Move");//kada ubacimo u toolBar
        putValue(SHORT_DESCRIPTION, "Move");//kada predjemo misem
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(MainFrame.getInstance().getClassyTree().getSelectedNode()==null)
          //  ApplicationFramework.getInstance().getMessagePublisher().generateMessage(new Message(EventType.AUTHOR_CAN_ONLY_BE_ADDED_ON_PROJECT, MessageTypes.WARNING,"Autor moze biti dodat samo na projekat"));
        return;
        else {
            ClassyNode selected = MainFrame.getInstance().getClassyTree().getSelectedNode().getClassyNode();
            if (selected instanceof Project || selected instanceof ProjectExplorer )
                return;
            else {
                ((Package)selected).startMoveState();
            }
        }
    }
}//wefwfwjvghvh
