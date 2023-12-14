package raf.dsw.classycraft.app.state.concrete;


import raf.dsw.classycraft.app.repository.implementacija.Package;
import raf.dsw.classycraft.app.state.ZoomOutAction;

public class StateManager {


    private State currentState;

   private AddClassState addClassState;
   private AddContentState addContentState;

   private AddVezaState addVezaState;
   private BrisanjeState brisanjeState;
   private DuplicateState duplicateState;
   private MoveState moveState;
   private SelectState selectState;
   private ZoomState zoomState;
   private RotateState rotateState;
   private ZoomOutState zoomOutState;

    public StateManager( Package aPackage) {
        addClassState= new AddClassState();
        zoomState =new ZoomState();
        addContentState=new AddContentState();
        addVezaState=new AddVezaState();
        brisanjeState=new BrisanjeState();
        duplicateState=new DuplicateState();
        moveState=new MoveState();
        selectState=new SelectState();
        rotateState=new RotateState();

        currentState= selectState;
    }



    public State getCurrentState() {
        return currentState;
    }

    public void setAddClassState() {
        currentState = addClassState;
    }

    public void setAddContentState() {
        currentState = addContentState;
    }



    public void setZoomState() {
        currentState = zoomState;
    }

    public void setRotateState() {
        currentState = rotateState;
    }

    public void setAddVezaState() {
       currentState = addVezaState;
    }

    public void setBrisanjeState() {
        currentState = brisanjeState;
    }

    public void setDuplicateState() {
        currentState = duplicateState;
    }

    public void setMoveState() {
       currentState = moveState;
    }

    public void setSelectState() {
       currentState = selectState;
    }

    public void setZoomOutState() {
        currentState = zoomOutState;
    }
}