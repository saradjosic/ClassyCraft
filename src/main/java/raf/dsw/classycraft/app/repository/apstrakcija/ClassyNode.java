package raf.dsw.classycraft.app.repository.apstrakcija;


import raf.dsw.classycraft.app.repository.implementacija.Project;


public abstract class ClassyNode{
    private String classyIme;
    private ClassyNode parent;


    public ClassyNode(String classyIme, ClassyNode parent) {
        this.classyIme = classyIme;
        this.parent = parent;
    }
    //  public ClassyNode(ClassyNode parent) {
    //    this.parent = parent; //treba za ProjectExplorer
    ///  }

    public Project findProject() {
        ClassyNode project = parent;
        while (project != null && !(project instanceof Project)) {
            project = project.getParent();
        }
        return (Project) project;
    }


    public String getClassyIme() {
        return classyIme;
    }

    public void setClassyIme(String classyIme) {
        this.classyIme = classyIme;
    }

    public ClassyNode getParent() {
        return parent;
    }

    public void setParent(ClassyNode parent) {
        this.parent = parent;
    }
}
