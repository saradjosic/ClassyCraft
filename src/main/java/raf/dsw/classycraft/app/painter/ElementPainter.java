package raf.dsw.classycraft.app.painter;

import raf.dsw.classycraft.app.element.DiagramElement;

import java.awt.*;

public interface ElementPainter {

    void paint(Graphics2D var1, DiagramElement var2);

    Point elementAt();

    // Point je klasa koja sadrzi koordinate, ako hoces promeni u niz ili tako nesto.
    // Vec postoji metoda u javi getLocation ali je rekao u vezbama da koristimo ovo.
    // Aloo inace nisam planirao da ova dva reda komentara imaju isti broj karaktera.
    //                                ja sam Bog                                    .

}