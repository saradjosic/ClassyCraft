package raf.dsw.classycraft.app.repository.implementacija;

import lombok.Getter;
import lombok.Setter;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNodeComposite;

@Getter
@Setter
public class ProjectExplorer extends ClassyNodeComposite{
    public ProjectExplorer(String ime) {
        super(ime,null);
    }
//pravimo samo jedan



    //public void addChild(ClassyNode child) {
    //   if(child!=null && child instanceof Project)
    //  {Project project=(Project) child;
    //     if(!this.getChildren().contains(project)){
    //         this.getChildren().add(project);
    //    }

    //  }
    // }
}
