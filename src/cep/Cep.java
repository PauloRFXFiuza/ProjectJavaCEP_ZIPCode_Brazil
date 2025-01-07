package cep;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ZIP CODE - CEP");
		lblNewLabel.setBounds(25, 24, 104, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(129, 21, 86, 20);
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
		textField_2.setBounds(129, 91, 277, 20);
		contentPane.add(textField_2);
		
		JLabel lblCityCidade = new JLabel("City- Cidade");
		lblCityCidade.setBounds(25, 131, 104, 14);
		contentPane.add(lblCityCidade);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(98, 128, 210, 20);
		contentPane.add(textField_3);
	}
}
