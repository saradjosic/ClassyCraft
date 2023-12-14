package raf.dsw.classycraft.app.controller;

import lombok.Getter;
import lombok.Setter;
import raf.dsw.classycraft.app.state.*;

@Getter
@Setter
public class ActionManager{
    private ExitAction exitAction;
    private NewProjectAction newProjectAction;
    private AboutUsAction aboutUsAction;
    private DeleteAction deleteAction;
    private RenameAction renameAction;
    private AuthorAction authorAction;
    private AddClassAction addClassAction;
    private AddContentAction addContentAction;

    private AddVezaAction addVezaAction;
    private SelectAction selectAction;
    private DuplicateAction duplicateAction;
    private BrisanjeAction brisanjeAction;
    private MoveAction moveAction;
    private RotateAction rotateAction;
    private ZoomAction zoomAction;
    private ZoomOutAction zoomOutAction;


    public ActionManager() {
        initActions();
    }

    private void initActions(){
        exitAction=new ExitAction();
        newProjectAction=new NewProjectAction();
        aboutUsAction=new AboutUsAction();
        deleteAction=new DeleteAction();
        renameAction= new RenameAction();
        authorAction=new AuthorAction();
        addVezaAction=new AddVezaAction();
        addClassAction=new AddClassAction();

        addContentAction= new AddContentAction();
        brisanjeAction= new BrisanjeAction();
        selectAction=new SelectAction();
        duplicateAction=new DuplicateAction();
        moveAction=new MoveAction();
        rotateAction=new RotateAction();
        zoomAction=new ZoomAction();
        zoomOutAction=new ZoomOutAction();

    }


    public ExitAction getExitAction() {
        return exitAction;
    }

    public void setExitAction(ExitAction exitAction) {
        this.exitAction = exitAction;
    }

    public NewProjectAction getNewProjectAction() {
        return newProjectAction;
    }

    public void setNewProjectAction(NewProjectAction newProjectAction) {
        this.newProjectAction = newProjectAction;
    }

    public AboutUsAction getAboutUsAction() {
        return aboutUsAction;
    }

    public void setAboutUsAction(AboutUsAction aboutUsAction) {
        this.aboutUsAction = aboutUsAction;
    }

    public DeleteAction getDeleteAction() {
        return deleteAction;
    }

    public void setDeleteAction(DeleteAction deleteAction) {
        this.deleteAction = deleteAction;
    }

    public RenameAction getRenameAction() {
        return renameAction;
    }

    public void setRenameAction(RenameAction renameAction) {
        this.renameAction = renameAction;
    }

    public AuthorAction getAuthorAction() {
        return authorAction;
    }

    public void setAuthorAction(AuthorAction authorAction) {
        this.authorAction = authorAction;
    }

    public AddClassAction getAddClassAction() {
        return addClassAction;
    }

    public void setAddClassAction(AddClassAction addClassAction) {
        this.addClassAction = addClassAction;
    }

    public AddContentAction getAddContentAction() {
        return addContentAction;
    }

    public void setAddContentAction(AddContentAction addContentAction) {
        this.addContentAction = addContentAction;
    }



    public AddVezaAction getAddVezaAction() {
        return addVezaAction;
    }

    public void setAddVezaAction(AddVezaAction addVezaAction) {
        this.addVezaAction = addVezaAction;
    }

    public SelectAction getSelectAction() {
        return selectAction;
    }

    public void setSelectAction(SelectAction selectAction) {
        this.selectAction = selectAction;
    }

    public DuplicateAction getDuplicateAction() {
        return duplicateAction;
    }

    public void setDuplicateAction(DuplicateAction duplicateAction) {
        this.duplicateAction = duplicateAction;
    }

    public BrisanjeAction getBrisanjeAction() {
        return brisanjeAction;
    }

    public void setBrisanjeAction(BrisanjeAction brisanjeAction) {
        this.brisanjeAction = brisanjeAction;
    }

    public MoveAction getMoveAction() {
        return moveAction;
    }

    public void setMoveAction(MoveAction moveAction) {
        this.moveAction = moveAction;
    }

    public RotateAction getRotateAction() {
        return rotateAction;
    }

    public void setRotateAction(RotateAction rotateAction) {
        this.rotateAction = rotateAction;
    }

    public ZoomAction getZoomAction() {
        return zoomAction;
    }

    public void setZoomAction(ZoomAction zoomAction) {
        this.zoomAction = zoomAction;
    }

    public void setZoomOutAction(ZoomOutAction zoomOutAction) {
        this.zoomOutAction = zoomOutAction;
    }
}
