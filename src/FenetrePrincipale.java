
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FenetrePrincipale {

	public static void main(String[] args) {
		// TODO On instancie un premiere fenetre
		JFrame FenetreConnexion = new JFrame();
		//TODO on donne les attributs necessaire a la fenetre 
		FenetreConnexion.setTitle("Easy Learn Enlish"); 
		FenetreConnexion.setSize(800,600);
		//TODO on Instancie tous les champs presents sur cete fenetre boutons etc.
		JButton BoutonConnexion = new JButton();
		JLabel Label_Pseudo = new JLabel();
		JLabel Label_Password = new JLabel();
		JLabel Label_TitreFenConnexion = new JLabel();
		//TODO On definie le texte et la postion des labels.
		Label_Pseudo.setText("Pseudo :");
		FenetreConnexion.add(Label_Pseudo);
		// TODO On affiche la fenetre principale
		FenetreConnexion.setVisible(true);
		

	}

}
