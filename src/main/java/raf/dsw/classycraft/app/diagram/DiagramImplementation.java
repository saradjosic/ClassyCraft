package raf.dsw.classycraft.app.diagram;

import lombok.Getter;
import lombok.Setter;
import raf.dsw.classycraft.app.repository.implementacija.Package;

import javax.swing.*;
@Getter
@Setter
public class DiagramImplementation implements IDiagram{
    private DiagramView diagramView;
    private Package thePackage;
    public DiagramImplementation() {
    }



    @Override
    public void update(Object notification) {
        if (notification == null) return;
        if (notification instanceof Package) {
            handlePackageNotification((Package) notification);
        } else {
            diagramView.loadPackage(thePackage);
        }
    }
    private void handlePackageNotification(Package p) {
        if (isNewPackage(p)) {
            updateCurrentPackage(p);
            diagramView.loadPackage(thePackage);
        }
    }

    private boolean isNewPackage(Package p) {
        return thePackage == null || !p.getClassyIme().equals(thePackage.getClassyIme());
    }

    private void updateCurrentPackage(Package p) {
        thePackage = p;
    }
    @Override
    public JPanel createPanel() {
        diagramView=new DiagramView();
        return diagramView;
    }

}
