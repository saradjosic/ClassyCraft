package raf.dsw.classycraft.app.state;

import raf.dsw.classycraft.app.controller.AbstractClassyAction;

import java.awt.event.ActionEvent;

public class AddContentAction extends AbstractClassyAction{


    public AddContentAction() {

        putValue(SMALL_ICON, loadIcon2("/images/content.png"));
        putValue(NAME, "Content");//kada ubacimo u toolBar
        putValue(SHORT_DESCRIPTION, "Content");//kada predjemo misem
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
