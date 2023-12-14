package raf.dsw.classycraft.app.state;

import raf.dsw.classycraft.app.controller.AbstractClassyAction;

import java.awt.event.ActionEvent;

public class AddVezaAction extends AbstractClassyAction{
    public AddVezaAction() {

        putValue(SMALL_ICON, loadIcon2("/images/veza.png"));
        putValue(NAME, "Veza");//kada ubacimo u toolBar
        putValue(SHORT_DESCRIPTION, "Veza");//kada predjemo misem
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
