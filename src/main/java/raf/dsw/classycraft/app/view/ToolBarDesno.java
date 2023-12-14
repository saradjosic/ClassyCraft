package raf.dsw.classycraft.app.view;

import javax.swing.*;
import java.awt.*;

public class ToolBarDesno extends JToolBar{
private JLabel state=new JLabel("State: ");
    public ToolBarDesno(){
        super(VERTICAL);

        add(state);
        add(MainFrame.getInstance().getActionManager().getAddClassAction());
        add(MainFrame.getInstance().getActionManager().getAddVezaAction());
        add(MainFrame.getInstance().getActionManager().getSelectAction());
        add(MainFrame.getInstance().getActionManager().getBrisanjeAction());
        add(MainFrame.getInstance().getActionManager().getAddContentAction());
        add(MainFrame.getInstance().getActionManager().getDuplicateAction());
        add(MainFrame.getInstance().getActionManager().getMoveAction());
        add(MainFrame.getInstance().getActionManager().getRotateAction());
        add(MainFrame.getInstance().getActionManager().getZoomAction());
        add(MainFrame.getInstance().getActionManager().getZoomOutAction());


    }
    public JButton add(Action a){
        JButton button=createActionComponent(a);
        button.setAction(a);
        add(button);
        return button;
    }
}
