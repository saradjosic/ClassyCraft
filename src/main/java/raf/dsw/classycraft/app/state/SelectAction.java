package raf.dsw.classycraft.app.state;

import raf.dsw.classycraft.app.controller.AbstractClassyAction;

import java.awt.event.ActionEvent;

public class SelectAction extends AbstractClassyAction{
    public SelectAction() {

        putValue(SMALL_ICON, loadIcon2("/images/select.png"));
        putValue(NAME, "Select");//kada ubacimo u toolBar
        putValue(SHORT_DESCRIPTION, "Select");//kada predjemo misem
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
