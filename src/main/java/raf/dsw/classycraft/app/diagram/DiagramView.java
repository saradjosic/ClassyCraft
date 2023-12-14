package raf.dsw.classycraft.app.diagram;


import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNodeLeaf;
import raf.dsw.classycraft.app.repository.implementacija.Project;
import raf.dsw.classycraft.app.repository.implementacija.Package;


import javax.swing.*;
import java.awt.*;


public class DiagramView extends JPanel{


    private JLabel ime;
    private JLabel autor;
    private JTabbedPane jTabbedPane;
    private Package paket;
    public DiagramView(){

        JPanel gore=new JPanel();

        gore.setLayout(new FlowLayout(FlowLayout.CENTER));
        ime=new JLabel("projekat");
        autor=new JLabel("autor");
        gore.add(ime,BorderLayout.NORTH);
        gore.add(autor,BorderLayout.NORTH);
        setLayout(new BorderLayout());
        jTabbedPane=new JTabbedPane(JTabbedPane.TOP,JTabbedPane.CENTER);
        add(gore,BorderLayout.NORTH);//project deo i autor deo
        add(jTabbedPane,BorderLayout.CENTER);



    }
    public void loadPackage(Package p){
        if(p==null)return;
        paket = p;
        Project pr = p.findProject();
        ime.setText(pr.getClassyIme());
        autor.setText(pr.getAutor());
        jTabbedPane.removeAll();
        if(p.getChildren() == null)return;
        for (ClassyNode child : p.getChildren()) {
            if(child instanceof ClassyNodeLeaf){
                jTabbedPane.addTab(child.getClassyIme(),new DiagramView());
            }
        }
    }

    public void refreshNames(){

    }
}
