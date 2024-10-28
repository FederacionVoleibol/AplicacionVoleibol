package AplicacionFederacionVoleibol;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Canvas;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class VentanaPrincipal extends JFrame implements ActionListener{
	
	
	/**
	 * Declaracion de variables  - No modificar
	 */

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField passwordField;
	JLabel lblUsuario;
	JPanel panel;
	JPanel panel_1;
	JLabel lblContrasenia;
	JLabel lblTituloInicio;
	JButton btnIngresar;
	private JLabel lblNewLabel;
	private JLabel lblMensaje;
	//AlgoritmoLogin login = new AlgoritmoLogin(); // Creacion de una instancia de la clase Login() que Verifica la existencia del usuario
	
	
	/**
	 * Arranca la aplicacion.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creación del Diseño de la ventana.
	 */
	public VentanaPrincipal() {
		//Equipos.NombreEquipoVisitante = "Barcelperona";
		EQUIPOS.GuardarEquipo("Barca");
		EQUIPOS.MostrarEquipo();
		

		// Establecemos un tamaño para la ventana
        setSize(850, 570);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);
        // Establecemos que la ventana no se pueda redimensionar
		setResizable(false);
        
		
		//TITULO DE LA VENTANA
        setTitle("Titulo");
        
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		panel.setBounds(0, 0, 203, 533);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(47, 183, 106, 136);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/AplicacionFederacionVoleibol/img/login.png")));
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(213, 98, 634, 426);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuario.setBounds(124, 163, 93, 45);
		panel_1.add(lblUsuario);
		
		lblContrasenia = new JLabel("Contraseña: ");
		lblContrasenia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContrasenia.setBounds(124, 216, 93, 45);
		panel_1.add(lblContrasenia);
		
		txtUsuario = new JTextField();
		txtUsuario.addActionListener(this);
		txtUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtUsuario.setText("");
			}
		});
		txtUsuario.setText("Usuario...");
		txtUsuario.setBounds(227, 163, 147, 34);
		panel_1.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		passwordField = new JPasswordField("Password...");
		passwordField.addActionListener(this);
		passwordField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField.setText("");
			}
		});
		passwordField.setBounds(227, 216, 147, 34);
		panel_1.add(passwordField);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(this);
		btnIngresar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnIngresar.setBounds(209, 276, 107, 34);
		panel_1.add(btnIngresar);
		
		lblMensaje = new JLabel("");
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMensaje.setBounds(44, 56, 498, 51);
		panel_1.add(lblMensaje);
		
		lblTituloInicio = new JLabel("PANEL ADMINISTRATIVO");
		lblTituloInicio.setBounds(373, 35, 256, 53);
		contentPane.add(lblTituloInicio);
		lblTituloInicio.setForeground(new Color(0, 128, 255));
		lblTituloInicio.setFont(new Font("Tahoma", Font.BOLD, 17));

		
		
		
	}

	/**
	 * Algoritmo de accion de los botones y al presionar enter
	 * */
	@Override
	public void actionPerformed(ActionEvent e) {
		String Nombre = txtUsuario.getText(); // Obtiene el valor del usuario introducido en TextField
		String Password = new String(passwordField.getPassword()); // Obtiene el valor de la contrasenia introducida en PasswordField
		if (AlgoritmoLogin.VerificacionDeLogin(Nombre, Password) == true) {
			lblMensaje.setText("Accedido al sistema correctamente, Sr. " + txtUsuario.getText());
			
			  VentanaMenuPrincipal menuPrincipal = new VentanaMenuPrincipal(); //Si el usuario y contraseña son correctos se abrirá el menú principal
	            menuPrincipal.setVisible(true);

	            // Cerrar la ventana login 
	            this.dispose();
			
		}else {
			lblMensaje.setText("Error en la contraseña.");
		}
	}
		
	}
