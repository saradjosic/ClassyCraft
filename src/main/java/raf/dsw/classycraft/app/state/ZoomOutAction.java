package raf.dsw.classycraft.app.state;

import raf.dsw.classycraft.app.controller.AbstractClassyAction;

import java.awt.event.ActionEvent;

public class ZoomOutAction extends AbstractClassyAction {

    public ZoomOutAction() {

        putValue(SMALL_ICON, loadIcon2("/images/zoomout.png"));
        putValue(NAME, "Zoom out");//kada ubacimo u toolBar
        putValue(SHORT_DESCRIPTION, "Zoom out");//kada predjemo misem
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
