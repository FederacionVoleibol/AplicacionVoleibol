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
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaEquiposUsuarios extends JFrame {
	

	//AlgoritmoJornadasFixture InformacionEquipos = new AlgoritmoJornadasFixture();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel header;
	private JLabel Equipos;
	private JPanel Footer;
	private JPanel Equipo;
	private JPanel Equipo_1;
	private JPanel Equipo_2;
	private JPanel Equipo_3;
	private JPanel Equipo_4;
	private JPanel Equipo_5;
	private JPanel Equipo_6;
	private JPanel MarginIzq;
	private JPanel MarginDerc;
	private JPanel TituloEquipo_1;
	private JLabel lblEquipo1;
	private JPanel TituloEquipo_2;
	private JLabel lblEquipo2;
	private JPanel TituloEquipo_3;
	private JLabel lblEquipo_3;
	private JPanel TituloEquipo_4;
	private JLabel lblEquipo4;
	private JPanel TituloEquipo_5;
	private JLabel lblEquipo_5;
	private JPanel TituloEquipo_6;
	private JLabel lblEquipo_6;
	private JLabel lblAlcobendas;
	private JLabel lblAvila;
	private JLabel lblBarsa;
	private JLabel lblMadrid;
	private JLabel lblSayre;
	private JLabel lblZaragoza;
	

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
					VentanaEquiposUsuarios frame = new VentanaEquiposUsuarios();
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
	public VentanaEquiposUsuarios() {
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
		contentPane.setLayout(new BorderLayout(0, 0));
		
		header = new JPanel();
		contentPane.add(header, BorderLayout.NORTH);
		header.setLayout(new GridLayout(0, 1, 0, 0));
		
		Equipos = new JLabel("Nombre de Equipos");
		Equipos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Equipos.setHorizontalAlignment(SwingConstants.CENTER);
		header.add(Equipos);
		
		Footer = new JPanel();
		contentPane.add(Footer, BorderLayout.SOUTH);
		Footer.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Equipo = new JPanel();
		contentPane.add(Equipo, BorderLayout.CENTER);
		Equipo.setLayout(new GridLayout(0, 1, 0, 0));
		
		Equipo_1 = new JPanel();
		Equipo_1.setBackground(new Color(192, 192, 192));
		Equipo.add(Equipo_1);
		Equipo_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		TituloEquipo_1 = new JPanel();
		TituloEquipo_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		TituloEquipo_1.setBackground(new Color(222, 222, 222));
		Equipo_1.add(TituloEquipo_1);
		TituloEquipo_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblEquipo1 = new JLabel("Equipo 1");
		lblEquipo1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipo1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TituloEquipo_1.add(lblEquipo1);
		
		lblAlcobendas = new JLabel("CV Alcobendas");
		lblAlcobendas.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblAlcobendas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAlcobendas.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlcobendas.setBackground(new Color(255, 255, 255));
		//Forzar que el fondo sea blanco
		lblAlcobendas.setOpaque(true); 
		lblAlcobendas.setBackground(Color.WHITE); 
		Equipo_1.add(lblAlcobendas);
		
		Equipo_2 = new JPanel();
		Equipo_2.setBackground(new Color(192, 192, 192));
		Equipo.add(Equipo_2);
		Equipo_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		TituloEquipo_2 = new JPanel();
		TituloEquipo_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		TituloEquipo_2.setBackground(new Color(222, 222, 222));
		Equipo_2.add(TituloEquipo_2);
		TituloEquipo_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblEquipo2 = new JLabel("Equipo 2");
		lblEquipo2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipo2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TituloEquipo_2.add(lblEquipo2);
		
		lblAvila = new JLabel("CD Avila Voleibol");
		lblAvila.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblAvila.setHorizontalAlignment(SwingConstants.CENTER);
		lblAvila.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAvila.setOpaque(true);
		lblAvila.setBackground(Color.WHITE); 
		Equipo_2.add(lblAvila);
		
		Equipo_3 = new JPanel();
		Equipo_3.setBackground(new Color(192, 192, 192));
		Equipo.add(Equipo_3);
		Equipo_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		TituloEquipo_3 = new JPanel();
		TituloEquipo_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		TituloEquipo_3.setBackground(new Color(222, 222, 222));
		Equipo_3.add(TituloEquipo_3);
		TituloEquipo_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblEquipo_3 = new JLabel("Equipo 3");
		lblEquipo_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipo_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TituloEquipo_3.add(lblEquipo_3);
		
		lblBarsa = new JLabel("CV Barça");
		lblBarsa.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblBarsa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBarsa.setHorizontalAlignment(SwingConstants.CENTER);
		lblBarsa.setOpaque(true);
		lblBarsa.setBackground(Color.WHITE); 
		Equipo_3.add(lblBarsa);
		
		Equipo_4 = new JPanel();
		Equipo_4.setBackground(new Color(192, 192, 192));
		Equipo.add(Equipo_4);
		Equipo_4.setLayout(new GridLayout(0, 2, 0, 0));
		
		TituloEquipo_4 = new JPanel();
		TituloEquipo_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		TituloEquipo_4.setBackground(new Color(222, 222, 222));
		Equipo_4.add(TituloEquipo_4);
		TituloEquipo_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblEquipo4 = new JLabel("Equipo 4");
		lblEquipo4.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipo4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TituloEquipo_4.add(lblEquipo4);
		
		lblMadrid = new JLabel("CV Madrid Chamberí");
		lblMadrid.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblMadrid.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMadrid.setHorizontalAlignment(SwingConstants.CENTER);
		lblMadrid.setOpaque(true);
		lblMadrid.setBackground(Color.WHITE); 
		Equipo_4.add(lblMadrid);
		
		Equipo_5 = new JPanel();
		Equipo_5.setBackground(new Color(192, 192, 192));
		Equipo.add(Equipo_5);
		Equipo_5.setLayout(new GridLayout(1, 0, 0, 0));
		
		TituloEquipo_5 = new JPanel();
		TituloEquipo_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		TituloEquipo_5.setBackground(new Color(222, 222, 222));
		Equipo_5.add(TituloEquipo_5);
		TituloEquipo_5.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblEquipo_5 = new JLabel("Equipo 5");
		lblEquipo_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipo_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEquipo_5.setBackground(new Color(255, 255, 128));
		TituloEquipo_5.add(lblEquipo_5);
		
		lblSayre = new JLabel("CV Sayre Mayser");
		lblSayre.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblSayre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSayre.setHorizontalAlignment(SwingConstants.CENTER);
		lblSayre.setOpaque(true);
		lblSayre.setBackground(Color.WHITE); 
		Equipo_5.add(lblSayre);
		
		Equipo_6 = new JPanel();
		Equipo_6.setBackground(new Color(192, 192, 192));
		Equipo.add(Equipo_6);
		Equipo_6.setLayout(new GridLayout(1, 0, 0, 0));
		
		TituloEquipo_6 = new JPanel();
		TituloEquipo_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		TituloEquipo_6.setBackground(new Color(222, 222, 222));
		Equipo_6.add(TituloEquipo_6);
		TituloEquipo_6.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblEquipo_6 = new JLabel("Equipo 6");
		lblEquipo_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipo_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEquipo_6.setBackground(new Color(128, 255, 128));
		TituloEquipo_6.add(lblEquipo_6);
		
		lblZaragoza = new JLabel("CD Zaragoza");
		lblZaragoza.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblZaragoza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblZaragoza.setHorizontalAlignment(SwingConstants.CENTER);
		lblZaragoza.setOpaque(true);
		lblZaragoza.setBackground(Color.WHITE); 
		Equipo_6.add(lblZaragoza);
		
		MarginIzq = new JPanel();
		contentPane.add(MarginIzq, BorderLayout.WEST);
		
		MarginDerc = new JPanel();
		contentPane.add(MarginDerc, BorderLayout.EAST);
	}
}