package AplicacionFederacionVoleibol;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class VentanaInputDatosPartidos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInputDatosPartidos frame = new VentanaInputDatosPartidos();
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
	public VentanaInputDatosPartidos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTextoTitulo = new JLabel("Introducir datos del Partido");
		lblTextoTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoTitulo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblTextoTitulo, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblEquipo = new JLabel("Equipo1");
		lblEquipo.setBounds(217, 86, 72, 13);
		panel.add(lblEquipo);
		
		JLabel lblNewLabel_1 = new JLabel("Set 1:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(162, 112, 45, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblEquipo_2 = new JLabel("Equipo2");
		lblEquipo_2.setBounds(323, 86, 72, 13);
		panel.add(lblEquipo_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Set 2:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(162, 140, 45, 13);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Set 4:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setBounds(162, 193, 45, 13);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Set 3:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setBounds(162, 163, 45, 13);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Set 5:");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1.setBounds(162, 216, 45, 13);
		panel.add(lblNewLabel_1_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(217, 109, 96, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(323, 109, 96, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(323, 135, 96, 19);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(217, 135, 96, 19);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(323, 186, 96, 19);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(217, 186, 96, 19);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(217, 160, 96, 19);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(323, 160, 96, 19);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(217, 213, 96, 19);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(323, 213, 96, 19);
		panel.add(textField_9);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Resultado:");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1.setBounds(129, 264, 78, 13);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(217, 261, 96, 19);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(323, 261, 96, 19);
		panel.add(textField_11);
		
		JLabel lblNewLabel = new JLabel("New label");
		contentPane.add(lblNewLabel, BorderLayout.SOUTH);
		
		//AÑADIR FECHA, NOMBRE ARBITRO, NOMBRE DE LOS EQUIPOS Y NUMERO DE PARTIDOS
	}
}
