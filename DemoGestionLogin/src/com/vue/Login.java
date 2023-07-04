package com.vue;

// importons nos bibliotheques
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


// ici notre Classe login
// on va extends notre Jfram et ensuite implementer une Action
// pour notre bouton valider
public class Login extends JFrame implements ActionListener {

    // maintenant declarons nos differents composants ou variables

    PanelGradian panel = new PanelGradian();
    private JLabel lblinformation = new JLabel("Information Utilisateur :");

    private JLabel lblNomUtilisteur = new JLabel("Nom D'utilisateur :");
    private JTextField txtNomUtilisateur  = new JTextField(40);

    private JLabel lblMdp = new JLabel("Mot de passe :");
    private JPasswordField txtmdp = new JPasswordField();

    JButton btnAjouter = new JButton("Valider");


    // notre constructeur
    public Login(){
        super("Connexion test demo");

         // on va faire appel avec
        setContentPane(panel);


        //ici on va faire appel a une methode de disposition
        // pour nos differents composant
        disposition();
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// fermer notre fenetre
        setLocationRelativeTo(null);//placer notre fenetre au milieu
        setResizable(false);
        setVisible(true);

        // notre methode d'action pour notre bouton valider
        btnAjouter.addActionListener(this);
    }

    private void disposition() {
      // la disposition de nos composants

        lblinformation.setForeground(Color.GREEN);
        lblNomUtilisteur.setForeground(Color.WHITE);
        lblMdp.setForeground(Color.WHITE);


        GroupLayout groupe = new GroupLayout(getContentPane());
        getContentPane().setLayout(groupe);

        groupe.setAutoCreateContainerGaps(true);
        groupe.setAutoCreateGaps(true);

        GroupLayout.ParallelGroup  horizontal = groupe.createParallelGroup();
        GroupLayout.SequentialGroup  vertical = groupe.createSequentialGroup();

        horizontal.addComponent(lblNomUtilisteur).
                addComponent(txtNomUtilisateur).
                addComponent(lblMdp).addComponent(txtmdp).addComponent(btnAjouter).addComponent(lblinformation);

        vertical.addComponent(lblNomUtilisteur).
                addComponent(txtNomUtilisateur).
                addComponent(lblMdp).addComponent(txtmdp).addComponent(btnAjouter).addComponent(lblinformation);

        groupe.setHorizontalGroup(horizontal);
        groupe.setVerticalGroup(vertical);

    }


    // Voici notre methode D'action
    @Override
    public void actionPerformed(ActionEvent e) {
       lblinformation.setText("<html> Votre nom d'utilisateur est : "
               +txtNomUtilisateur.getText() +
               " <br> Et votre Mot de passe est : " + String.valueOf(txtmdp.getPassword()) + " </html>");

    }

    // le coeur de notre programme
    public static void main(String[] args) {
        // voyons voir
        new Login();
    }
}
