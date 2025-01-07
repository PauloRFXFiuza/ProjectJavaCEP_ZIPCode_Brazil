package cep;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Atxy2k.CustomTextField.RestrictedTextField;

public class Cep extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCep;
	private JTextField txtEndereco;
	private JTextField txtBairro;
	private JTextField txtCidade;

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
		
		txtCep = new JTextField();
		txtCep.setBounds(150, 21, 80, 20);
		contentPane.add(txtCep);
		txtCep.setColumns(10);
		
		JLabel lblAddressEndereo = new JLabel("Address- Endereço");
		lblAddressEndereo.setBounds(25, 60, 115, 14);
		contentPane.add(lblAddressEndereo);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(150, 57, 256, 20);
		contentPane.add(txtEndereco);
		
		JLabel lblZipCode = new JLabel("Borough - Bairro");
		lblZipCode.setBounds(25, 94, 104, 14);
		contentPane.add(lblZipCode);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(150, 91, 256, 20);
		contentPane.add(txtBairro);
		
		JLabel lblCityCidade = new JLabel("UF");
		lblCityCidade.setBounds(337, 131, 42, 14);
		contentPane.add(lblCityCidade);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(150, 128, 177, 20);
		contentPane.add(txtCidade);
		
		JLabel lblCityCidade_1 = new JLabel("City- Cidade");
		lblCityCidade_1.setBounds(25, 131, 104, 14);
		contentPane.add(lblCityCidade_1);
		
		JComboBox cboUf = new JComboBox();
		cboUf.setModel(new DefaultComboBoxModel(new String[] {"", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		cboUf.setBounds(357, 127, 49, 22);
		contentPane.add(cboUf);
		
		JButton btnLimpar = new JButton("Clean - Limpar");
		btnLimpar.setBounds(new Rectangle(5, 5, 5, 5));
		btnLimpar.setBorder(null);
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setBounds(25, 215, 130, 23);
		contentPane.add(btnLimpar);
		
		JButton btnCep = new JButton("Search - Buscar");
		btnCep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtCep.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Enter the ZIP code - Informe o CEP");
				}
			}
		});
		btnCep.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCep.setBounds(new Rectangle(5, 5, 5, 5));
		btnCep.setBorder(null);
		btnCep.setBounds(276, 20, 130, 23);
		contentPane.add(btnCep);
		
		JButton btnSobre = new JButton("");
		btnSobre.setToolTipText("About - Sobre");
		btnSobre.setIcon(new ImageIcon(Cep.class.getResource("/img/about.png")));
		btnSobre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobre.setBorder(null);
		btnSobre.setBackground(new Color(128, 128, 128));
		btnSobre.setBounds(25, 156, 48, 48);
		contentPane.add(btnSobre);
		
		/* Using the Atxy2k library for validating the txtCep field 
		 * Utilizando a biblioteca Atxy2k para validação do campo txtCep */
		
		RestrictedTextField validar = new RestrictedTextField(txtCep);
		validar.setOnlyNums(true);
		validar.setLimit(8);
		
	} //End of constructor- Fim do construtor
}
