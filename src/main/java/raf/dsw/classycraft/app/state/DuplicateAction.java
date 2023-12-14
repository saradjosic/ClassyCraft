package raf.dsw.classycraft.app.state;

import raf.dsw.classycraft.app.controller.AbstractClassyAction;

import java.awt.event.ActionEvent;

public class DuplicateAction extends AbstractClassyAction{
    public DuplicateAction() {

        putValue(SMALL_ICON, loadIcon2("/images/duplicate.png"));
        putValue(NAME, "Duplicate");//kada ubacimo u toolBar
        putValue(SHORT_DESCRIPTION, "Duplicate");//kada predjemo misem
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
