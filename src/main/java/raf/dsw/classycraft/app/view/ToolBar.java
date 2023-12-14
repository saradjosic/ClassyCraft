package raf.dsw.classycraft.app.view;
import lombok.Getter;
import lombok.Setter;
import raf.dsw.classycraft.app.view.MainFrame;

import javax.swing.*;
@Getter
@Setter
public class ToolBar extends JToolBar{
    public ToolBar() {
        super(HORIZONTAL);
        setFloatable(false);
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
