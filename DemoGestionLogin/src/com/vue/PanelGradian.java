package com.vue;


import javax.swing.*;
import java.awt.*;

public class PanelGradian extends JPanel {

    private static final Color c1 = new Color(18,20,40);// bas
    private static  final Color c2 = Color.BLACK; // haut


    // Constructeur
    public PanelGradian (){
        setOpaque(true);
    }

    // methode pour dessinner notre panel

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D d = (Graphics2D) g;// convertir

        int largeur = getWidth();
        int hauteur = getHeight();

        GradientPaint gp = new GradientPaint(0,0, c2,0, hauteur, c1);
        d.setPaint(gp);
        d.fillRect(0,0,largeur, hauteur);// dessiner
    }

}
