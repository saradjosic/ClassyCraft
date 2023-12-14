package raf.dsw.classycraft.app.controller;

import raf.dsw.classycraft.app.view.AboutUsFrame;

import java.awt.event.ActionEvent;

public class AboutUsAction extends AbstractClassyAction{
    public AboutUsAction() {
        putValue(NAME,"About us");
        putValue(SHORT_DESCRIPTION,"About us");
        //   putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
        //           KeyEvent.VK_L,KeyEvent.ALT_MASK
        //  ));
        putValue(SMALL_ICON,loadIcon("/images/img_3.png"));
    }

    public void actionPerformed(ActionEvent e) {
        AboutUsFrame aboutUsFrame=new AboutUsFrame();

    }
}
