package raf.dsw.classycraft.app.view;

import javax.swing.*;
public class ToolBarDesno extends JToolBar{

    public ToolBarDesno(){
        super(VERTICAL);
        add(MainFrame.getInstance().getActionManager().getExitAction());
        add(MainFrame.getInstance().getActionManager().getNewProjectAction());
        add(MainFrame.getInstance().getActionManager().getRenameAction());
        add(MainFrame.getInstance().getActionManager().getDeleteAction());
        add(MainFrame.getInstance().getActionManager().getAuthorAction());
    }
    public JButton add(Action a){
        JButton button=createActionComponent(a);
        button.setAction(a);
        add(button);
        return button;
    }
}
