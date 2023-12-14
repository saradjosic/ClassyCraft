package raf.dsw.classycraft.app.tree.view;


import raf.dsw.classycraft.app.repository.implementacija.Diagram;
import raf.dsw.classycraft.app.repository.implementacija.Package;
import raf.dsw.classycraft.app.repository.implementacija.Project;
import raf.dsw.classycraft.app.repository.implementacija.ProjectExplorer;
import raf.dsw.classycraft.app.tree.model.ClassyTreeItem;

import javax.swing.*;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;
import java.net.URL;

public class ClassyTreeCellRenderer extends DefaultTreeCellRenderer{
    //font slika boja ikonica pozadina, ovaj ima override ovano
    //jedino sto cemo da cackamo su ikonice, u odnosu na polje u CLassyTreeItemu u

    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {

        super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
        URL imageURL = null;
        boolean pe = true;
        setBackgroundSelectionColor(Color.cyan);//kad se selektuje
        setBackgroundNonSelectionColor(Color.WHITE);//kad nije selektovano


        if (((ClassyTreeItem) value).getClassyNode() instanceof ProjectExplorer) {
            setBackgroundSelectionColor(Color.cyan);//kad se selektuje
            setBackgroundNonSelectionColor(Color.cyan);//kad nije selektovano
            imageURL = getClass().getResource("/images/final.png");
            pe = true;
        } else if (((ClassyTreeItem) value).getClassyNode() instanceof Project) {
            imageURL = getClass().getResource("/images/blueproject.png");
        }
        else if (((ClassyTreeItem)value).getClassyNode() instanceof Package) {
            imageURL = getClass().getResource("/images/bluepackage.png");
        }
        else if (((ClassyTreeItem)value).getClassyNode() instanceof Diagram) {
            imageURL = getClass().getResource("/images/diagramblue.png");



        }


        Icon icon = null;
        if (imageURL != null) {
            Image img = new ImageIcon(imageURL).getImage();
            Image newImg;
            if (pe) newImg = img.getScaledInstance(40, 40, Image.SCALE_DEFAULT);
            else newImg = img.getScaledInstance(25, 25, Image.SCALE_DEFAULT);
            icon = new ImageIcon(newImg);
        }
        setIcon(icon);

        return this;


    }
}