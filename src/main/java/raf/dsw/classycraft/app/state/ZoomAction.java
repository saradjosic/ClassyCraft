package raf.dsw.classycraft.app.state;

import raf.dsw.classycraft.app.controller.AbstractClassyAction;

import java.awt.event.ActionEvent;
//xasasas

public class ZoomAction extends AbstractClassyAction{
public int proemna;
private int khkh;

    public ZoomAction() {

        putValue(SMALL_ICON, loadIcon2("/images/zoom.png"));
        putValue(NAME, "Zoom");//kada ubacimo u toolBar
        putValue(SHORT_DESCRIPTION, "Zoom");//kada predjemo misem
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
//promenaaa