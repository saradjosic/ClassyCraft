package raf.dsw.classycraft.app.controller;

import lombok.Getter;
import lombok.Setter;
import raf.dsw.classycraft.app.MessageHandler.EventType;
import raf.dsw.classycraft.app.MessageHandler.Message;
import raf.dsw.classycraft.app.MessageHandler.MessageTypes;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNodeComposite;
import raf.dsw.classycraft.app.view.MainFrame;
import raf.dsw.classycraft.app.core.ApplicationFramework;
import raf.dsw.classycraft.app.repository.implementacija.Package;

import javax.swing.*;
import java.awt.event.ActionEvent;

@Getter
@Setter
public class NewProjectAction extends AbstractClassyAction{
    public NewProjectAction() {
        putValue(SMALL_ICON,loadIcon("/images/addd.png"));
        putValue(SHORT_DESCRIPTION,"New project");
        putValue(NAME,"New project");
        //   putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.ALT_MASK));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(MainFrame.getInstance().getClassyTree().getSelectedNode()==null){
            Message poruka= new Message(EventType.NONE_NODE, MessageTypes.ERROR);
            ApplicationFramework.getInstance().getMessagePublisher().generateMessage(poruka);
            return;
        }
        if (!(MainFrame.getInstance().getClassyTree().getSelectedNode().getClassyNode() instanceof ClassyNodeComposite)){
            ApplicationFramework.getInstance().getMessagePublisher().generateMessage(new Message(EventType.CHILD_ON_DIAGRAM,MessageTypes.ERROR,"Dete ne moze da se doda na diagram"));
            return;
        }
        String naziv=null,odabir=null;
        ClassyNode selected = MainFrame.getInstance().getClassyTree().getSelectedNode().getClassyNode();
        if(selected instanceof Package && selected instanceof ClassyNodeComposite){
            odabir=MainFrame.getInstance().package_diagram(); //ovde korisnik bira hoce li da napravi package ili diagram
            if (odabir == null)return;
        }
        naziv=JOptionPane.showInputDialog("Type the name for node:");
        if(naziv==null)

            return;
        if(naziv.equals("")) MainFrame.getInstance().getClassyTree().addChild(MainFrame.getInstance().getClassyTree().getSelectedNode(),odabir);
        else if(naziv.contains(" ")) {
            ApplicationFramework.getInstance().getInstance().getMessagePublisher().generateMessage(new Message(EventType.NAME_SPACES, MessageTypes.WARNING,"Ime ne sme sadrzati razmake"));
            return;
        }
        else
            MainFrame.getInstance().getClassyTree().addChild(MainFrame.getInstance().getClassyTree().getSelectedNode(),  odabir);

    }
}
