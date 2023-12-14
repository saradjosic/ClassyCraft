package raf.dsw.classycraft.app.state.concrete;

import java.awt.event.MouseEvent;

public interface State{
    public void misKliknut(MouseEvent event);
    public void zoomIn();
    public void zoomOut();
    public void misPovucen(MouseEvent event);
    public void misOpusten(MouseEvent event);


}
