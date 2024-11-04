package AplicacionFederacionVoleibol;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class VentanaCrearEliminarRoles extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtContraseña;
	private JTextField txtNombre;
	private JTextField txtRol;
	private JPanel panel;
	private JLabel lblRoles;
	private JPanel Informacion;
	private JLabel lblRol;
	private JLabel lblNombre;
	private JLabel lblContraseña;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_1;
	private JButton btnGuardar;
	private JButton btnEliminar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCrearEliminarRoles frame = new VentanaCrearEliminarRoles();
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
	public VentanaCrearEliminarRoles() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		lblRoles = new JLabel("Configuración de roles");
		lblRoles.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblRoles);
		
		Informacion = new JPanel();
		contentPane.add(Informacion, BorderLayout.CENTER);
		Informacion.setLayout(null);
		
		lblRol = new JLabel("Rol");
		lblRol.setBounds(143, 43, 20, 17);
		lblRol.setHorizontalAlignment(SwingConstants.CENTER);
		lblRol.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Informacion.add(lblRol);
		
		txtRol = new JTextField();
		txtRol.setBounds(168, 40, 126, 23);
		txtRol.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Informacion.add(txtRol);
		txtRol.setColumns(10);
		
		lblNombre = new JLabel("Nombre de usuario");
		lblNombre.setBounds(43, 71, 120, 17);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Informacion.add(lblNombre);
		
		txtContraseña = new JTextField();
		txtContraseña.setBounds(168, 68, 126, 23);
		txtContraseña.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Informacion.add(txtContraseña);
		txtContraseña.setColumns(10);
		
		lblContraseña = new JLabel("Contraseña");
		lblContraseña.setBounds(93, 99, 70, 17);
		lblContraseña.setHorizontalAlignment(SwingConstants.CENTER);
		lblContraseña.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Informacion.add(lblContraseña);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(168, 96, 126, 23);
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Informacion.add(txtNombre);
		txtNombre.setColumns(10);
		
		panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.WEST);
		
		panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.EAST);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(btnGuardar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(btnEliminar);
	}

}
