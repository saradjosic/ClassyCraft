package raf.dsw.classycraft.app.view;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
@Getter
@Setter
public class AboutUsFrame extends JFrame{
    public AboutUsFrame(){
        init();
    }
    private void init(){
        setTitle("About us");
        setSize(500,500);
        setVisible(true);
        JPanel vbox=new JPanel();
        vbox.setLayout(new BoxLayout(vbox,BoxLayout.Y_AXIS));

        //pavle
        JPanel hbox1=new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel paja=new JLabel(MainFrame.getInstance().getActionManager().getAboutUsAction().loadPicture("/images/img_5.png",200,200));
        hbox1.add(paja);
        hbox1.add(new JLabel("Pavle Milic RI 187/22"));

        //sara
        JPanel hbox2=new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel saki=new JLabel(MainFrame.getInstance().getActionManager().getAboutUsAction().loadPicture("/images/img_6.png",200,200));
        hbox1.add(saki);
        hbox1.add(new JLabel("Sara Djosic RN 71/22"));
        vbox.add(hbox2);
        vbox.add(hbox1);
        vbox.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(vbox);

        setVisible(true);

    }
}
