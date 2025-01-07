package cep;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.ImageIcon;

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
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Sobre.class.getResource("/img/linkedin.png")));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.setBorder(null);
		btnNewButton.setToolTipText("LinkedIn");
		btnNewButton.setBounds(109, 191, 48, 48);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setToolTipText("GitHub");
		btnNewButton_1.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setBounds(273, 191, 48, 48);
		getContentPane().add(btnNewButton_1);
		setResizable(false);
		setTitle("About - Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(100, 100, 450, 300);

	}

}
