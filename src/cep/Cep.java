package cep;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Cep extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cep frame = new Cep();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cep() {
		setTitle("Search Brazil Zip Code-Buscar CEP");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Cep.class.getResource("/img/home.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ZIP CODE - CEP");
		lblNewLabel.setBounds(25, 24, 104, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(150, 21, 80, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAddressEndereo = new JLabel("Address- Endereço");
		lblAddressEndereo.setBounds(25, 60, 115, 14);
		contentPane.add(lblAddressEndereo);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(150, 57, 256, 20);
		contentPane.add(textField_1);
		
		JLabel lblZipCode = new JLabel("Borough - Bairro");
		lblZipCode.setBounds(25, 94, 104, 14);
		contentPane.add(lblZipCode);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(150, 91, 256, 20);
		contentPane.add(textField_2);
		
		JLabel lblCityCidade = new JLabel("UF");
		lblCityCidade.setBounds(337, 131, 42, 14);
		contentPane.add(lblCityCidade);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(150, 128, 177, 20);
		contentPane.add(textField_3);
		
		JLabel lblCityCidade_1 = new JLabel("City- Cidade");
		lblCityCidade_1.setBounds(25, 131, 104, 14);
		contentPane.add(lblCityCidade_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(357, 127, 49, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Clean - Limpar");
		btnNewButton.setBounds(25, 215, 130, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Search - Buscar");
		btnNewButton_1.setBounds(276, 20, 130, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setToolTipText("About - Sobre");
		btnNewButton_2.setIcon(new ImageIcon(Cep.class.getResource("/img/about.png")));
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(new Color(128, 128, 128));
		btnNewButton_2.setBounds(25, 156, 48, 48);
		contentPane.add(btnNewButton_2);
	}
}
