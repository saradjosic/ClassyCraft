package raf.dsw.classycraft.app.view;

import lombok.Getter;
import lombok.Setter;


import javax.swing.*;
import java.awt.event.KeyEvent;
@Getter
@Setter
public class MyMenyBar extends JMenuBar{
    public MyMenyBar()  {
        JMenu fileMenu=new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_B);
        fileMenu.add(MainFrame.getInstance().getActionManager().getExitAction());
        fileMenu.add(MainFrame.getInstance().getActionManager().getNewProjectAction());
        add(fileMenu);

        JMenu fileMenu2=new JMenu("Edit");
        fileMenu2.setMnemonic(KeyEvent.VK_O);
        fileMenu2.add(MainFrame.getInstance().getActionManager().getAboutUsAction());
        fileMenu2.add(MainFrame.getInstance().getActionManager().getRenameAction());
        fileMenu2.add(MainFrame.getInstance().getActionManager().getDeleteAction());
        fileMenu2.add(MainFrame.getInstance().getActionManager().getAuthorAction());
        add(fileMenu2);

    }
}
