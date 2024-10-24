package AplicacionFederacionVoleibol;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaIntroducirEquipos extends JFrame {
	

	AlgoritmoJornadasFixture InformacionEquipos = new AlgoritmoJornadasFixture();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNombreEquipo1;
	private JTextField textFieldNombreEquipo2;
	private JTextField textFieldNombreEquipo3;
	private JTextField textFieldNombreEquipo4;
	private JTextField textFieldNombreEquipo5;
	private JTextField textFieldNombreEquipo6;
	private JTextField textFieldCantidadEquipos;

	/**
	 * Launch the application.
	 */
	

	static public class InformacionEquipos {
		public static int SetGanadosLocal = 0, SetGanadosVisitante = 0;
        public static int Cantidad_Equipos = 6;
        public static int[] id_equipo = new int[Cantidad_Equipos];
        public static String[] NombreEquipo = new String[Cantidad_Equipos];
        public static int[] PuntajeSetLocal = new int[5];
        public static int[] PuntajeSetVisitante = new int[5];
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaIntroducirEquipos frame = new VentanaIntroducirEquipos();
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
	public VentanaIntroducirEquipos() {
		InformacionEquipos GuardarInformacion = new InformacionEquipos(); 
		
		
		// Establecemos un tamaño para la ventana
        setSize(800, 500);
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
		
		JLabel lblTitulo = new JLabel("Definición de Equipos");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(109, 40, 173, 13);
		contentPane.add(lblTitulo);
		
		JLabel lblCantidadEquipos = new JLabel("Nº de Equipos:");
		lblCantidadEquipos.setBounds(10, 79, 88, 13);
		contentPane.add(lblCantidadEquipos);
		
		JLabel lblNombreEquipo1 = new JLabel("Equipo1:");
		lblNombreEquipo1.setBounds(10, 121, 88, 13);
		contentPane.add(lblNombreEquipo1);
		
		JLabel lblNombreEquipo2 = new JLabel("Equipo2:");
		lblNombreEquipo2.setBounds(10, 150, 88, 13);
		contentPane.add(lblNombreEquipo2);
		
		JLabel lblNombreEquipo3 = new JLabel("Equipo3:");
		lblNombreEquipo3.setBounds(10, 173, 88, 13);
		contentPane.add(lblNombreEquipo3);
		
		JLabel lblNombreEquipo4 = new JLabel("Equipo4:");
		lblNombreEquipo4.setBounds(217, 121, 88, 13);
		contentPane.add(lblNombreEquipo4);
		
		JLabel lblNombreEquipo5 = new JLabel("Equipo5:");
		lblNombreEquipo5.setBounds(217, 150, 88, 13);
		contentPane.add(lblNombreEquipo5);
		
		JLabel lblNombreEquipo6 = new JLabel("Equipo6:");
		lblNombreEquipo6.setBounds(217, 173, 88, 13);
		contentPane.add(lblNombreEquipo6);
		
		textFieldNombreEquipo1 = new JTextField();
		textFieldNombreEquipo1.setBounds(109, 118, 96, 19);
		contentPane.add(textFieldNombreEquipo1);
		textFieldNombreEquipo1.setColumns(10);
		
		textFieldNombreEquipo2 = new JTextField();
		textFieldNombreEquipo2.setColumns(10);
		textFieldNombreEquipo2.setBounds(109, 145, 96, 19);
		contentPane.add(textFieldNombreEquipo2);
		
		textFieldNombreEquipo3 = new JTextField();
		textFieldNombreEquipo3.setColumns(10);
		textFieldNombreEquipo3.setBounds(109, 170, 96, 19);
		contentPane.add(textFieldNombreEquipo3);
		
		textFieldNombreEquipo4 = new JTextField();
		textFieldNombreEquipo4.setColumns(10);
		textFieldNombreEquipo4.setBounds(315, 118, 96, 19);
		contentPane.add(textFieldNombreEquipo4);
		
		textFieldNombreEquipo5 = new JTextField();
		textFieldNombreEquipo5.setColumns(10);
		textFieldNombreEquipo5.setBounds(315, 145, 96, 19);
		contentPane.add(textFieldNombreEquipo5);
		
		textFieldNombreEquipo6 = new JTextField();
		textFieldNombreEquipo6.setColumns(10);
		textFieldNombreEquipo6.setBounds(315, 170, 96, 19);
		contentPane.add(textFieldNombreEquipo6);
		
		textFieldCantidadEquipos = new JTextField();
		textFieldCantidadEquipos.setBounds(109, 76, 96, 19);
		contentPane.add(textFieldCantidadEquipos);
		textFieldCantidadEquipos.setColumns(10);
		
		JButton btnGuardarDatos = new JButton("Guardar");
		btnGuardarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuardarInformacion.Cantidad_Equipos = Integer.parseInt(textFieldCantidadEquipos.getText()); //Integer.parseInt() convierte un dato tipo String a Entero
				GuardarInformacion.NombreEquipo[0] = textFieldNombreEquipo1.getText();
				GuardarInformacion.NombreEquipo[1] = textFieldNombreEquipo2.getText();// Guarda el valor del campo de tipo String en el arreglo
				GuardarInformacion.NombreEquipo[2] = textFieldNombreEquipo3.getText();
				GuardarInformacion.NombreEquipo[3] = textFieldNombreEquipo4.getText();
				GuardarInformacion.NombreEquipo[4] = textFieldNombreEquipo5.getText();
				GuardarInformacion.NombreEquipo[5] = textFieldNombreEquipo6.getText();
				System.out.println("Informacion guardada");
				System.out.println("Cantidad de Equipos: " + GuardarInformacion.Cantidad_Equipos);
				for (int i = 0; i < GuardarInformacion.NombreEquipo.length; i++) {
					System.out.println("Equipo " + (i + 1) + ": " + GuardarInformacion.NombreEquipo[i]);
				}
			}
		});
		btnGuardarDatos.setBounds(176, 232, 85, 21);
		contentPane.add(btnGuardarDatos);
	}
}
