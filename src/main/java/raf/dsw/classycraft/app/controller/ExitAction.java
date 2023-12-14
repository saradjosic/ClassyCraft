package raf.dsw.classycraft.app.controller;



import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.net.URL;
@Getter
@Setter
public class ExitAction extends AbstractClassyAction{
    public ExitAction(){
        //   putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
        //        KeyEvent.VK_F4, ActionEvent.ALT_MASK
        //   ));
        putValue(SMALL_ICON,loadIcon("/images/exitt.png"));
        putValue(NAME,"Exit");//kada ubacimo u toolBar
        putValue(SHORT_DESCRIPTION,"Exit");//kada predjemo misem
    }

    @Override //to je listener
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }



}
