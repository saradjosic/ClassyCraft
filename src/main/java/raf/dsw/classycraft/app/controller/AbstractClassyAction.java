package raf.dsw.classycraft.app.controller;



import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.net.URL;
import java.awt.*;
//import jdk.nashorn.internal.objects.annotations.Getter;
//import jdk.nashorn.internal.objects.annotations.Setter;
@Getter
@Setter
public abstract class AbstractClassyAction extends AbstractAction{
    public AbstractClassyAction(){

    }

    public Icon loadIcon(String ime){
        Icon icon=null;
        URL ImageURL=getClass().getResource(ime);

        if(ImageURL!=null){


            Image img = new ImageIcon(ImageURL).getImage();
            Image newImg = img.getScaledInstance(30,30,Image.SCALE_DEFAULT);

            icon=new ImageIcon(newImg);//newimg!!!!!!!

        } else
        {
            System.err.println("Slika nono"+ime);
        }
        return icon;
    }



    public Icon loadIcon2(String ime){
        Icon icon=null;
        URL ImageURL=getClass().getResource(ime);

        if(ImageURL!=null){


            Image img = new ImageIcon(ImageURL).getImage();
            Image newImg = img.getScaledInstance(28,28,Image.SCALE_DEFAULT);

            icon=new ImageIcon(newImg);//newimg!!!!!!!

        } else
        {
            System.err.println("Slika nono"+ime);
        }
        return icon;
    }


    public ImageIcon loadPicture(String name,int width, int height){//funkcija za ucitavanje slike iz resursa
        ImageIcon picture=null;
        URL ImageURL =getClass().getResource(name);
        if(ImageURL != null)
        {
            Image img = new ImageIcon(ImageURL).getImage();
            Image newImg = img.getScaledInstance(width,height, Image.SCALE_DEFAULT);
            picture = new ImageIcon(newImg);
        }
        else
        {
            System.err.println("Resorce not found" + name);
        }
        return picture;
    }



}
/*AbstractAction ima u sebi apstraktnu metodu ActionPerformed i tu je
zapravo ono sto treba da se desi kada neku akciju pokrenemo
i tu metodu uvek moramo da override ujemo u klasi koja nasledjuje AA
jedini tip koji je prihvatljiv da se ubaci kao listener ili akcija na
neko dugme je to AA
u ActionPerformed pisemo sta treba da se desi
putValue je isto odatle metoda
to je za tool i menu, (enum,sta stavljamo)
u AK mogu da imaju polja a interface ne
svaki put kada hocemo da se nesto desi pravimo akciju
iskljucivo za to dugme, i overriduje ujemo AP
zato imamo ActionManager-biblioteka nasih akcija
ima instancu svake akcije
konstruktor AM inicijalizuje svaku akciju
MainFrame i ApplicationFramework su jedina 2 singletona
AF je za model a MF za view
MF ima instancu AM
jer smo npr u tool baru i hocemo exit aciton
i onfa zovemo MainFrame.getInstance().getActionManager().get ta neka akcija

 */