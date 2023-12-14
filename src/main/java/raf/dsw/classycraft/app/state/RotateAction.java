package raf.dsw.classycraft.app.state;

import raf.dsw.classycraft.app.controller.AbstractClassyAction;
import raf.dsw.classycraft.app.state.concrete.RotateState;

import java.awt.event.ActionEvent;

public class RotateAction extends AbstractClassyAction{


    public RotateAction() {

        putValue(SMALL_ICON, loadIcon2("/images/rotate.png"));
        putValue(NAME, "Rotate");//kada ubacimo u toolBar
        putValue(SHORT_DESCRIPTION, "Rotate");//kada predjemo misem
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
