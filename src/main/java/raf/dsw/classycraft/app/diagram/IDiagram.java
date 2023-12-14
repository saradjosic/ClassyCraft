package raf.dsw.classycraft.app.diagram;

import raf.dsw.classycraft.app.observer.ISubscriber;

import javax.swing.*;

public interface IDiagram extends ISubscriber{
    public JPanel createPanel();
}
