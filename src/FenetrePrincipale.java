
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FenetrePrincipale {

	public static void main(String[] args) {
		// TODO On instancie un premiere fenetre
		JFrame FenetreConnexion = new JFrame();
		FenetreConnexion.setBounds(100, 100, GblVar.HauteurFenetre,GblVar.LargeurFenetre);
		FenetreConnexion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FenetreConnexion.getContentPane().setLayout(null);
		
		
		JTextField ChampPseudo = new JTextField();
		ChampPseudo.setBounds(400,250,100,20);
		
		JPasswordField ChampPassword = new JPasswordField();
		ChampPassword.setBounds(400, 280, 100, 20);
		
		
		
		//TODO on donne les attributs necessaire a la fenetre 
		FenetreConnexion.setTitle("Easy Learn Enlish");
		//TODO on Instancie tous les champs presents sur cete fenetre boutons etc.
		JButton BoutonConnexion = new JButton();
		JLabel Label_Pseudo = new JLabel();
		JLabel Label_Password = new JLabel();
		JLabel Label_TitreFenConnexion = new JLabel();
		
		//TODO on defini les polices de titre.
		Font PoliceTitre = new Font("Arial",Font.BOLD,24);
		Label_TitreFenConnexion.setFont(PoliceTitre);
		
		//TODO On definie le texte et la postion des labels.
		Label_Pseudo.setText("Pseudo :");
		Label_Password.setText("Mot de passe :");
		Label_TitreFenConnexion.setText("Easy learn English");
		
		//TODO On place les labels
		Label_Pseudo.setBounds(300,250,100,20);
		Label_Password.setBounds(300,280,100,20);
		Label_TitreFenConnexion.setBounds(300,50,250,100);
		
		
		//setBounds(Position x,position y,Largeur label ,Hauteur label)
		
		// TODO On affiche les labels dans la fenetre.
		FenetreConnexion.add(Label_Pseudo);
		FenetreConnexion.add(Label_Password);
		FenetreConnexion.add(Label_TitreFenConnexion);
		FenetreConnexion.add(ChampPseudo);
		FenetreConnexion.add(ChampPassword);
		
		
		FenetreConnexion.getContentPane().add(Label_Pseudo);
		FenetreConnexion.setVisible(true);
		

	}

}
