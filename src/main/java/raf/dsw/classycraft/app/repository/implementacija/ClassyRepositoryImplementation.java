package raf.dsw.classycraft.app.repository.implementacija;


import raf.dsw.classycraft.app.core.ClassyRepository;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNodeComposite;
import raf.dsw.classycraft.app.repository.implementacija.ProjectExplorer;


public class ClassyRepositoryImplementation  implements ClassyRepository{
    //sadrzace ceo model,prvo moramo da imamo getroot, koji vraca projectexplorer
    //koji je jednom kreiran i vise ne


    private ProjectExplorer root;
    //


    @Override
    public ProjectExplorer getRoot() {
        return root;
    }

    public ClassyRepositoryImplementation() {
        root = new ProjectExplorer("Project Explorer");
    }

}
