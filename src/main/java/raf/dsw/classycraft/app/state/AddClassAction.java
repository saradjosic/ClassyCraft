package raf.dsw.classycraft.app.state;

import raf.dsw.classycraft.app.controller.AbstractClassyAction;

import java.awt.event.ActionEvent;

public class AddClassAction extends AbstractClassyAction
{
    public AddClassAction() {

        putValue(SMALL_ICON, loadIcon2("/images/addclass.png"));
        putValue(NAME, "Add Class");//kada ubacimo u toolBar
        putValue(SHORT_DESCRIPTION, "Add CLass");//kada predjemo misem
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//pozove mainframe pa paket pa start tu neku metofu

    }
}
