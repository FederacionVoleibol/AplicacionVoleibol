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

import AplicacionFederacionVoleibol.AlgoritmoJornadasFixture.Partido;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class VentanaIntroducirEquipos extends JFrame {
	

	//AlgoritmoJornadasFixture InformacionEquipos = new AlgoritmoJornadasFixture();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel header;
	private JLabel Equipos;
	private JPanel Footer;
	private JButton Botom_guardar;
	private JPanel Equipo;
	private JPanel Equipo_1;
	private JPanel Equipo_2;
	private JPanel Equipo_3;
	private JPanel Equipo_4;
	private JPanel Equipo_5;
	private JPanel Equipo_6;
	private JTextField txtEquipoNombre1;
	private JPanel MarginIzq;
	private JPanel MarginDerc;
	private JTextField txtEquipoNombre2;
	private JTextField txtEquipoNombre3;
	private JTextField txtEquipoNombre4;
	private JTextField txtEquipoNombre5;
	private JTextField txtEquipoNombre6;
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
		
		Botom_guardar = new JButton("Guardar");
		Botom_guardar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Footer.add(Botom_guardar);
		
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
		
		lblEquipo1 = new JLabel("Equipo1");
		lblEquipo1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipo1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TituloEquipo_1.add(lblEquipo1);
		
		txtEquipoNombre1 = new JTextField();

		txtEquipoNombre1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEquipoNombre1.setText("");
				
			}
		});
		txtEquipoNombre1.setText("Introduce el nombre");
		txtEquipoNombre1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEquipoNombre1.setHorizontalAlignment(SwingConstants.CENTER);
		Equipo_1.add(txtEquipoNombre1);
		txtEquipoNombre1.setColumns(10);
		
		Equipo_2 = new JPanel();
		Equipo_2.setBackground(new Color(192, 192, 192));
		Equipo.add(Equipo_2);
		Equipo_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		TituloEquipo_2 = new JPanel();
		TituloEquipo_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		TituloEquipo_2.setBackground(new Color(222, 222, 222));
		Equipo_2.add(TituloEquipo_2);
		TituloEquipo_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblEquipo2 = new JLabel("Equipo2");
		lblEquipo2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipo2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TituloEquipo_2.add(lblEquipo2);
		
		txtEquipoNombre2 = new JTextField();
		txtEquipoNombre2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEquipoNombre2.setText("");
			}
		});
		txtEquipoNombre2.setText("Introduce el nombre");
		txtEquipoNombre2.setHorizontalAlignment(SwingConstants.CENTER);
		txtEquipoNombre2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Equipo_2.add(txtEquipoNombre2);
		txtEquipoNombre2.setColumns(10);
		
		Equipo_3 = new JPanel();
		Equipo_3.setBackground(new Color(192, 192, 192));
		Equipo.add(Equipo_3);
		Equipo_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		TituloEquipo_3 = new JPanel();
		TituloEquipo_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		TituloEquipo_3.setBackground(new Color(222, 222, 222));
		Equipo_3.add(TituloEquipo_3);
		TituloEquipo_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblEquipo_3 = new JLabel("Equipo3");
		lblEquipo_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipo_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TituloEquipo_3.add(lblEquipo_3);
		
		txtEquipoNombre3 = new JTextField();
		txtEquipoNombre3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEquipoNombre3.setText("");
			}
		});
		txtEquipoNombre3.setText("Introduce el nombre");
		txtEquipoNombre3.setHorizontalAlignment(SwingConstants.CENTER);
		txtEquipoNombre3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Equipo_3.add(txtEquipoNombre3);
		txtEquipoNombre3.setColumns(10);
		
		Equipo_4 = new JPanel();
		Equipo_4.setBackground(new Color(192, 192, 192));
		Equipo.add(Equipo_4);
		Equipo_4.setLayout(new GridLayout(0, 2, 0, 0));
		
		TituloEquipo_4 = new JPanel();
		TituloEquipo_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		TituloEquipo_4.setBackground(new Color(222, 222, 222));
		Equipo_4.add(TituloEquipo_4);
		TituloEquipo_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblEquipo4 = new JLabel("Equipo4");
		lblEquipo4.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipo4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TituloEquipo_4.add(lblEquipo4);
		
		txtEquipoNombre4 = new JTextField();
		txtEquipoNombre4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEquipoNombre4.setText("");
			}
		});
		txtEquipoNombre4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEquipoNombre4.setText("Introduce el nombre");
		txtEquipoNombre4.setHorizontalAlignment(SwingConstants.CENTER);
		Equipo_4.add(txtEquipoNombre4);
		txtEquipoNombre4.setColumns(10);
		
		Equipo_5 = new JPanel();
		Equipo_5.setBackground(new Color(192, 192, 192));
		Equipo.add(Equipo_5);
		Equipo_5.setLayout(new GridLayout(1, 0, 0, 0));
		
		TituloEquipo_5 = new JPanel();
		TituloEquipo_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		TituloEquipo_5.setBackground(new Color(222, 222, 222));
		Equipo_5.add(TituloEquipo_5);
		TituloEquipo_5.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblEquipo_5 = new JLabel("Equipo5");
		lblEquipo_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipo_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEquipo_5.setBackground(new Color(255, 255, 128));
		TituloEquipo_5.add(lblEquipo_5);
		
		txtEquipoNombre5 = new JTextField();
		txtEquipoNombre5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEquipoNombre5.setText("");
			}
		});
		txtEquipoNombre5.setText("Introduce el nombre ");
		txtEquipoNombre5.setHorizontalAlignment(SwingConstants.CENTER);
		txtEquipoNombre5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Equipo_5.add(txtEquipoNombre5);
		txtEquipoNombre5.setColumns(10);
		
		Equipo_6 = new JPanel();
		Equipo_6.setBackground(new Color(192, 192, 192));
		Equipo.add(Equipo_6);
		Equipo_6.setLayout(new GridLayout(1, 0, 0, 0));
		
		TituloEquipo_6 = new JPanel();
		TituloEquipo_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		TituloEquipo_6.setBackground(new Color(222, 222, 222));
		Equipo_6.add(TituloEquipo_6);
		TituloEquipo_6.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblEquipo_6 = new JLabel("Equipo6");
		lblEquipo_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipo_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEquipo_6.setBackground(new Color(128, 255, 128));
		TituloEquipo_6.add(lblEquipo_6);
		
		txtEquipoNombre6 = new JTextField();
		txtEquipoNombre6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEquipoNombre6.setText("");
			}
		});
		txtEquipoNombre6.setText("Introduce el nombre");
		txtEquipoNombre6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEquipoNombre6.setHorizontalAlignment(SwingConstants.CENTER);
		Equipo_6.add(txtEquipoNombre6);
		txtEquipoNombre6.setColumns(10);
		
		MarginIzq = new JPanel();
		contentPane.add(MarginIzq, BorderLayout.WEST);
		
		MarginDerc = new JPanel();
		contentPane.add(MarginDerc, BorderLayout.EAST);
	}
}