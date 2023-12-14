package raf.dsw.classycraft.app.state;

import raf.dsw.classycraft.app.controller.AbstractClassyAction;

import java.awt.event.ActionEvent;

public class BrisanjeAction extends AbstractClassyAction{
    public BrisanjeAction() {

        putValue(SMALL_ICON, loadIcon2("/images/brisanje.png"));
        putValue(NAME, "Brisanje");//kada ubacimo u toolBar
        putValue(SHORT_DESCRIPTION, "Brisanje");//kada predjemo misem
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
