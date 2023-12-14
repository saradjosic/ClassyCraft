package raf.dsw.classycraft.app.repository.implementacija;

import lombok.Getter;
import lombok.Setter;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNodeComposite;
@Getter
@Setter
public class Project extends ClassyNodeComposite{
    private String ime;
    private String autor="-";
    private String putanja;
    private static int counter=1;

    public Project(String naziv,ClassyNode parent){
        super(naziv, parent);
    }

    public Project( ClassyNode parent) {
        super("Project "+counter++,parent);
    }


//Projekat treba da ima ime i autora kao i
// putanju do foldera u kome će biti smešteni njegovi resursi.








}
