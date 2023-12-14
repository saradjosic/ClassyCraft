package raf.dsw.classycraft.app.repository.implementacija;



import lombok.Getter;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNodeComposite;
import raf.dsw.classycraft.app.state.concrete.StateManager;

import java.lang.ref.PhantomReference;


public class Package extends ClassyNodeComposite{
    private static int br=1;
    public Package(String ime, ClassyNode parent) {
        super(ime, parent);
    }

    public Package(ClassyNode parent){
        super("Package"+br++,parent);
    }
    private StateManager stateManager=new StateManager(this);
    public void startAddClassState() {stateManager.setAddClassState();}

    public void startAddContentState(){stateManager.setAddContentState();}
    public void startAddVezaState(){stateManager.setAddVezaState();}
    public void startBrisanjeState(){stateManager.setBrisanjeState();}
    public void startDuplicateState(){stateManager.setDuplicateState();}
    public void startMoveState(){stateManager.setMoveState();}
    public void startSelectState(){stateManager.setSelectState();}
    public void startZoomState(){stateManager.setRotateState();}
    public void startRotateState(){stateManager.setRotateState();}
    public void startZoomOutState(){stateManager.setZoomOutState();}
    //treba da ima sve metode iz state-a



}
