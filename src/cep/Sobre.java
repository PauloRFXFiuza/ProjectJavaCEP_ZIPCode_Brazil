package cep;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class Sobre extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		getContentPane().setBackground(new Color(128, 128, 128));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search Brazil ZIP Code- Buscar CEP- version 2.0");
		lblNewLabel.setBounds(25, 30, 340, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblauthorPauloFiuza = new JLabel("@Author Paulo Fiuza - FullStack Dev");
		lblauthorPauloFiuza.setBounds(25, 71, 340, 14);
		getContentPane().add(lblauthorPauloFiuza);
		
		JLabel lblWebPage = new JLabel("Web Pages: ");
		lblWebPage.setBounds(190, 160, 73, 14);
		getContentPane().add(lblWebPage);
		
		JLabel lblThankYouSo = new JLabel("Thank you so much- Muito obrigado");
		lblThankYouSo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblThankYouSo.setBounds(25, 115, 340, 21);
		getContentPane().add(lblThankYouSo);
		
		JButton btnLinkedin = new JButton("");
		btnLinkedin.setIcon(new ImageIcon(Sobre.class.getResource("/img/linkedin.png")));
		btnLinkedin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLinkedin.setBackground(new Color(128, 128, 128));
		btnLinkedin.setBorder(null);
		btnLinkedin.setToolTipText("LinkedIn");
		btnLinkedin.setBounds(109, 191, 48, 48);
		getContentPane().add(btnLinkedin);
		
		JButton btnGithub = new JButton("");
		btnGithub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGithub.setToolTipText("GitHub");
		btnGithub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		btnGithub.setBorder(null);
		btnGithub.setBackground(Color.GRAY);
		btnGithub.setBounds(273, 191, 48, 48);
		getContentPane().add(btnGithub);
		setResizable(false);
		setTitle("About - Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(150, 150, 450, 300);

	} //End of constructor- Fim do construtor

	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
