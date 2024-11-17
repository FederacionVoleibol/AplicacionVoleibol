package AplicacionFederacionVoleibol;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Point;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import java.awt.Button;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class VentanaClasificacion extends JFrame {

  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  private JTable tablaClasificacion;
  private JTextField txtPuntajePartido2Local;
  private JTextField txtUltimoSetPartido2Local;
  private JTextField txtPuntajePartido2Visitante;
  private JTextField txtUltimoSetPartido2Visitante;
  private JPanel PantallaJornadas;
  private JPanel panel_3;
  private JButton btnSiguiente;
  private JLabel lblTituloNumeroJornada;
  private JButton btnAnterior;
  private JPanel panelGuardarDatos;
  private JButton btnGuardarDatos;
  private JPanel panel_5;
  private JPanel panel_2;
  private JLabel lblNewLabel_4;
  private JLabel lblNewLabel_5;
  private JPanel panel_6;
  private JLabel lblNewLabel_9;
  private JLabel lblNewLabel_10;
  private JPanel panelPartido2;
  private JLabel lblPartido2B;
  private JLabel lblEquipoB;
  private JLabel lblTotalPuntosSetsB;
  private JLabel lblPuntajeUltimoSetB;
  private JLabel lblLocalB;
  private JLabel lblEquipoLocalB;
  private JLabel lblVisitanteB;
  private JLabel lblEquipoVisitanteB;
  private JPanel panel_7;
  private JLabel lblNewLabel_2;
  private JLabel lblNewLabel_6;
  private JPanel PantallaClasificacion;
  private JPanel panel;
  private JLabel lblNewLabel;
  private JPanel panel_1;
  private JScrollPane scrollPane;
  private JPanel panelPartido1;
  private JLabel lblPartido1A;
  private JLabel lblEquipoB_1;
  private JLabel lblTotalPuntosSetsB_1;
  private JLabel lblPuntajeUltimoSetB_1;
  private JLabel lblLocalB_1;
  private JLabel lblEquipoLocalA;
  private JTextField txtPuntajePartido1Local;
  private JTextField txtUltimoSetPartido1Local;
  private JLabel lblVisitanteB_1;
  private JLabel lblEquipoVisitanteA;
  private JTextField txtPuntajePartido1Visitante;
  private JTextField txtUltimoSetPartido1Visitante;
  private JPanel panelPartido3;
  private JLabel lblPartido2B_2;
  private JLabel lblEquipoB_2;
  private JLabel lblTotalPuntosSetsB_2;
  private JLabel lblPuntajeUltimoSetB_2;
  private JLabel lblLocalB_2;
  private JLabel lblEquipoLocalC;
  private JTextField txtPuntajePartido3Local;
  private JTextField txtUltimoSetPartido3Local;
  private JLabel lblVisitanteB_2;
  private JLabel lblEquipoVisitanteC;
  private JTextField txtPuntajePartido3Visitante;
  private JTextField txtUltimoSetPartido3Visitante;
  
  String[] equipos = {"CV Sayre Mayser", "CV Barça", "CD Zaragoza", "CV Alcobendas", "CD Avila Voleibol", "CV Madrid Chamberí"};


  private JSeparator separator;
  private JSeparator separator_1;
  private JSeparator separator_2;
  private JSeparator separator_3;
  private JSeparator separator_4;
  private JSeparator separator_5;
  private JSeparator separator_6;
  private JSeparator separator_7;
  private JSeparator separator_8;
  private JSeparator separator_9;
  private JLabel prueba;
  private JLabel lblNewLabel_1;
  public static List<EQUIPOS> listEquipos = new ArrayList<>();
  public static List<PARTIDO> listPartidos = new ArrayList<>();
  private JTextField[] puntajeLocalFields;
  private JTextField[] puntajeVisitanteFields;
  private JTextField[] ultimoSetLocalFields;
  private JTextField[] ultimoSetVisitanteFields;  
  private int jornadaActual = 1;
  int idPartido = 0;
  private static List<EQUIPOS> ListOrdenClasificacion = new ArrayList<>();
  private DefaultTableModel modeloTabla;
  List<EQUIPOS> listaPosicionDeEquipos = new ArrayList<>(AlgoritmoJornadasFixture.listEquipos);
  
  
  
  /**
	 * Launch the application.
	 */
  public static void main(String[] args) {
	  //Para inicializar la temporada con los 6 equipos sino no mostrara ningun partido ni equipo
	  AlgoritmoJornadasFixture.InicializarTemporada();//Llamar al metodo main de la clase AlgoritmoJornadasFixture
	    
	   	
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          VentanaClasificacion frame = new VentanaClasificacion();
          frame.setVisible(true);
        } catch(Exception e) {
          e.printStackTrace();
        }
        
        
      }

    });
  }

  /**
	 * Create the frame.
	 */
  public VentanaClasificacion() {
	  mostrarTodosLosEquipos();
	  
    // Establecemos un tamaño para la ventana
    setSize(900, 550);
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

    // Centramos los textos en la tabla
    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
    renderer.setHorizontalAlignment(SwingConstants.CENTER);
    contentPane.setLayout(new GridLayout(0, 2, 0, 0));

    PantallaJornadas = new JPanel();
    contentPane.add(PantallaJornadas);
    PantallaJornadas.setLayout(new BorderLayout(0, 0));

    panel_3 = new JPanel();
    PantallaJornadas.add(panel_3, BorderLayout.NORTH);

    System.out.println("Numero de Jornada: " + jornadaActual);
    System.out.println("Numerode Partido: " + (idPartido));
    System.out.println("Numerode Partido: " + (idPartido+1));
    System.out.println("Numerode Partido: " + (idPartido+2));
    btnSiguiente = new JButton("▶");
    btnSiguiente.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	
        	// hay que editarlo para extarer los partidos del array Jornadas.
            if (jornadaActual <= 10) {
                jornadaActual++;
                lblTituloNumeroJornada.setText("JORNADA " + jornadaActual);
                
                // Reiniciar el índice si se llega al final del arreglo

                System.out.println("-------");
                System.out.println("Numero de Jornada: " + jornadaActual);
                System.out.println("Numerode Partido: " + (idPartido+3));

                // Actualizar los labels de los equipos
                lblEquipoLocalA.setText(AlgoritmoJornadasFixture.listPartidos.get(idPartido+3).getNombreEquipoLocal());
                lblEquipoVisitanteA.setText(AlgoritmoJornadasFixture.listPartidos.get(idPartido+3).getNombreEquipoVisitante());
                // Incrementar el índice para el siguiente Partido
                idPartido++;
                //System.out.println("idpartido: " + idPartido + ", idjornada:" + jornadaActual);



                System.out.println("Numerode Partido: " +(idPartido+3));

                lblEquipoLocalB.setText(AlgoritmoJornadasFixture.listPartidos.get(idPartido+3).getNombreEquipoLocal());
                lblEquipoVisitanteB.setText(AlgoritmoJornadasFixture.listPartidos.get(idPartido+3).getNombreEquipoVisitante());
                // Incrementar el índice para el siguiente Partido
                idPartido++;


                System.out.println("Numerode Partido: " + (idPartido+3));

                //System.out.println("idpartido: " + idPartido + ", idjornada:" + jornadaActual);
                lblEquipoLocalC.setText(AlgoritmoJornadasFixture.listPartidos.get(idPartido+3).getNombreEquipoLocal());
                lblEquipoVisitanteC.setText(AlgoritmoJornadasFixture.listPartidos.get(idPartido+3).getNombreEquipoVisitante());

                // Incrementar el índice para el siguiente Partido
                idPartido++;
                //System.out.println("idpartido: " + idPartido + ", idjornada:" + jornadaActual);

                if (jornadaActual == 10) {
                	btnSiguiente.setVisible(false);
                }
            	if (jornadaActual > 1) {
            		btnAnterior.setVisible(true);
            	}
            }
        }
    });

    lblTituloNumeroJornada = new JLabel("JORNADA " + (jornadaActual));
    lblTituloNumeroJornada.setHorizontalAlignment(SwingConstants.CENTER);

    btnAnterior = new JButton("◀");
    btnAnterior.setVisible(false);
    btnAnterior.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

        	
        	// hay que editarlo para extarer los partidos del array Jornadas.
            if (jornadaActual <= 10) {
                jornadaActual--;
                lblTituloNumeroJornada.setText("JORNADA " + jornadaActual);
                
                
                // Reiniciar el índice si se llega al final del arreglo
                idPartido = idPartido -6;
                System.out.println("-------");
                System.out.println("Numero de Jornada: " + jornadaActual);
                System.out.println("Numerode Partido: " + (idPartido+3));

                // Actualizar los labels de los equipos
                lblEquipoLocalA.setText(AlgoritmoJornadasFixture.listPartidos.get(idPartido+3).getNombreEquipoLocal());
                lblEquipoVisitanteA.setText(AlgoritmoJornadasFixture.listPartidos.get(idPartido+3).getNombreEquipoVisitante());
                // Incrementar el índice para el siguiente Partido
                idPartido++;
                
                System.out.println("Numerode Partido: " + (idPartido+3));
                //System.out.println("idpartido: " + idPartido + ", idjornada:" + jornadaActual);
                lblEquipoLocalB.setText(AlgoritmoJornadasFixture.listPartidos.get(idPartido+3).getNombreEquipoLocal());
                lblEquipoVisitanteB.setText(AlgoritmoJornadasFixture.listPartidos.get(idPartido+3).getNombreEquipoVisitante());
                // Incrementar el índice para el siguiente Partido
                idPartido++;
                
                System.out.println("Numerode Partido: " + (idPartido+3));
                
                //System.out.println("idpartido: " + idPartido + ", idjornada:" + jornadaActual);
                lblEquipoLocalC.setText(AlgoritmoJornadasFixture.listPartidos.get(idPartido+3).getNombreEquipoLocal());
                lblEquipoVisitanteC.setText(AlgoritmoJornadasFixture.listPartidos.get(idPartido+3).getNombreEquipoVisitante());
                // Incrementar el índice para el siguiente Partido
                idPartido++;
                //System.out.println("idpartido: " + idPartido + ", idjornada:" + jornadaActual);
                if (idPartido <= 0) {
                    idPartido = 0;
                }

                if (jornadaActual == 1) {
                	btnAnterior.setVisible(false);
                }
            	if (jornadaActual < 10) {
            		btnSiguiente.setVisible(true);
            	}
            }
        }
    });
    panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

    
    panel_3.add(btnAnterior);
    
    separator_9 = new JSeparator();
    panel_3.add(separator_9);
    
    separator_4 = new JSeparator();
    panel_3.add(separator_4);
    
    separator_2 = new JSeparator();
    panel_3.add(separator_2);
    
    separator = new JSeparator();
    panel_3.add(separator);
    
    separator_7 = new JSeparator();
    panel_3.add(separator_7);
    panel_3.add(lblTituloNumeroJornada);
    
    separator_1 = new JSeparator();
    panel_3.add(separator_1);
    
    separator_6 = new JSeparator();
    panel_3.add(separator_6);
    
    separator_3 = new JSeparator();
    panel_3.add(separator_3);
    
    separator_5 = new JSeparator();
    panel_3.add(separator_5);
    
    separator_8 = new JSeparator();
    panel_3.add(separator_8);
    panel_3.add(btnSiguiente);
    
    
    panelGuardarDatos = new JPanel();
    PantallaJornadas.add(panelGuardarDatos, BorderLayout.SOUTH);

    btnGuardarDatos = new JButton("Guardar Datos");
    btnGuardarDatos.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		//*************************************************
    		// GUARDAMOS LOS DATOS DE LA JORNADA, Y ACTUALIZAMOS LA CLASIFICACION
    		//*************************************************
    		// 1. Obtencion de datos

    		// 1.1 Obtencion de los nombres de los equipos 
    		/*
    		 * 	-SI NO HAY PUNTAJE INGRESADO MOSTRAR MENSAJE DE ERROR
    		 * 
    		 *
    		 * 	-SI YA HAY UN VALOR GUARDADO EN LA POSICION, MOSTRAR MENSAJE DE CONFIRMACION CON ISEMPTY
    		 * 
    		 *  -SI NO HAY VALOR EN LA POSICION, INSERTAR VALOR
    		 *  COMPROBAR EN QUE NUMERO DE JORNADA SE ENCUENTRA
    		 *  
    		 * 
    		 * */
    		// PROBANDO METODOS PARA 
    		
    		// 2. Guardar datos
    		// 2.1. Guardar los datos introducidos en las jornadas
    		
    		//este metodo guardarDatosPartidos es la funcion que permite obtener los valores, guardarlos en las estructuras
    		// y calcular equipo ganar, sumar puntajes si tiene otro partido jugado.
    		guardarDatosPartidos((jornadaActual-1));
    		//System.out.println("IDPARTIDO ACTUAL"+ idPartido + " y la funcion interpreta el: " + (idPartido));
    		mostrarDatosPartidos((idPartido));
    		//System.out.println("IDPARTIDO ACTUAL"+ idPartido + " y la funcion interpreta el: " + (idPartido+1));
    		mostrarDatosPartidos((idPartido+1));
    		//System.out.println("IDPARTIDO ACTUAL"+ idPartido + " y la funcion interpreta el: " + (idPartido+2));
    		mostrarDatosPartidos((idPartido+2));
    		
    		//System.out.println("Datos en listEquipos antes de calcular posiciones:");
    		for (EQUIPOS equipo : listEquipos) {
    		    System.out.println("Equipo: " + equipo.getNombreEquipo() + ", Puntaje: " + equipo.getPuntajeTotal());
    		}
    		mostrarTodosLosEquipos();
    		CalcularYMostrarPosicionesEquipos();
    		
    		for (EQUIPOS equipo : listaPosicionDeEquipos) {
    		    System.out.println("Posición: " + equipo.getPosicion_Temporada() + 
    		                       ", Equipo: " + equipo.getNombreEquipo() + 
    		                       ", Puntos: " + equipo.getPuntajeTotal());
    		}
    		
    		actualizarTabla();// Actualizar la tabla con los nuevos datos
    	    System.out.println("Tabla de clasificación actualizada.");
    		//CalcularPosicionEquipos();
    		//LO DE MOSTRAR ES SOLO PARA CORROBRAR POR CONSOLA, LO NECESITO ANTES DE PASAR LOS DATOS A LA TABLA
    		//DE CLASIFICACION, LUEGO YA NO NECESITO MOSTRARDATOSPARTIDOS
    		// 3. Ordenamiento
    		
    		// 4. Actualizacion de la tabla
    		
    		// 5. Actualizacion de la jornada
    	}
    });
    
    lblNewLabel_1 = new JLabel("");
    panelGuardarDatos.add(lblNewLabel_1);
    panelGuardarDatos.add(btnGuardarDatos);

    panel_5 = new JPanel();
    PantallaJornadas.add(panel_5, BorderLayout.CENTER);
    panel_5.setLayout(new GridLayout(3, 0, 0, 0));

    panel_2 = new JPanel();
    panel_5.add(panel_2);
    panel_2.setLayout(new BorderLayout(0, 0));

    lblNewLabel_4 = new JLabel(" ");
    panel_2.add(lblNewLabel_4, BorderLayout.NORTH);

    lblNewLabel_5 = new JLabel(" ");
    panel_2.add(lblNewLabel_5, BorderLayout.SOUTH);
    
    panelPartido1 = new JPanel();
    panel_2.add(panelPartido1, BorderLayout.CENTER);
    GridBagLayout gbl_panelPartido1 = new GridBagLayout();
    gbl_panelPartido1.columnWidths = new int[]{54, 43, 108, 40, 25, 52, 0};
    gbl_panelPartido1.rowHeights = new int[]{13, 13, 19, 19, 0};
    gbl_panelPartido1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    gbl_panelPartido1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    panelPartido1.setLayout(gbl_panelPartido1);
    
    lblPartido1A = new JLabel("Partido 1");
    lblPartido1A.setHorizontalAlignment(SwingConstants.CENTER);
    GridBagConstraints gbc_lblPartido1A = new GridBagConstraints();
    gbc_lblPartido1A.anchor = GridBagConstraints.NORTH;
    gbc_lblPartido1A.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblPartido1A.insets = new Insets(0, 0, 5, 5);
    gbc_lblPartido1A.gridwidth = 3;
    gbc_lblPartido1A.gridx = 2;
    gbc_lblPartido1A.gridy = 0;
    panelPartido1.add(lblPartido1A, gbc_lblPartido1A);
    
    lblEquipoB_1 = new JLabel("Equipos");
    GridBagConstraints gbc_lblEquipoB_1 = new GridBagConstraints();
    gbc_lblEquipoB_1.anchor = GridBagConstraints.NORTH;
    gbc_lblEquipoB_1.insets = new Insets(0, 0, 5, 5);
    gbc_lblEquipoB_1.gridx = 2;
    gbc_lblEquipoB_1.gridy = 1;
    panelPartido1.add(lblEquipoB_1, gbc_lblEquipoB_1);
    
    lblTotalPuntosSetsB_1 = new JLabel("Puntaje");
    lblTotalPuntosSetsB_1.setHorizontalAlignment(SwingConstants.RIGHT);
    GridBagConstraints gbc_lblTotalPuntosSetsB_1 = new GridBagConstraints();
    gbc_lblTotalPuntosSetsB_1.anchor = GridBagConstraints.NORTH;
    gbc_lblTotalPuntosSetsB_1.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblTotalPuntosSetsB_1.insets = new Insets(0, 0, 5, 5);
    gbc_lblTotalPuntosSetsB_1.gridx = 3;
    gbc_lblTotalPuntosSetsB_1.gridy = 1;
    panelPartido1.add(lblTotalPuntosSetsB_1, gbc_lblTotalPuntosSetsB_1);
    
    lblPuntajeUltimoSetB_1 = new JLabel("Ultimo Set");
    lblPuntajeUltimoSetB_1.setHorizontalAlignment(SwingConstants.CENTER);
    GridBagConstraints gbc_lblPuntajeUltimoSetB_1 = new GridBagConstraints();
    gbc_lblPuntajeUltimoSetB_1.anchor = GridBagConstraints.NORTH;
    gbc_lblPuntajeUltimoSetB_1.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblPuntajeUltimoSetB_1.insets = new Insets(0, 0, 5, 0);
    gbc_lblPuntajeUltimoSetB_1.gridwidth = 2;
    gbc_lblPuntajeUltimoSetB_1.gridx = 4;
    gbc_lblPuntajeUltimoSetB_1.gridy = 1;
    panelPartido1.add(lblPuntajeUltimoSetB_1, gbc_lblPuntajeUltimoSetB_1);
    
    lblLocalB_1 = new JLabel("Local");
    lblLocalB_1.setHorizontalAlignment(SwingConstants.RIGHT);
    lblLocalB_1.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblLocalB_1 = new GridBagConstraints();
    gbc_lblLocalB_1.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblLocalB_1.insets = new Insets(0, 0, 5, 5);
    gbc_lblLocalB_1.gridx = 1;
    gbc_lblLocalB_1.gridy = 2;
    panelPartido1.add(lblLocalB_1, gbc_lblLocalB_1);

 //   lblEquipoLocalA = new JLabel("CV Sayre Mayser");
    lblEquipoLocalA = new JLabel(AlgoritmoJornadasFixture.listPartidos.get(idPartido).getNombreEquipoLocal());
//    if (AlgoritmoJornadasFixture.listPartidos.size() > 1) {
//        System.out.println("Contenido de listPartidos: " + AlgoritmoJornadasFixture.listPartidos);
//        System.out.println("Tamaño de listPartidos: " + AlgoritmoJornadasFixture.listPartidos.size());
//    } else {
//        System.out.println("Contenido de listPartidos: " + AlgoritmoJornadasFixture.listPartidos);
//        System.out.println("Tamaño de listPartidos: " + AlgoritmoJornadasFixture.listPartidos.size());
//    }
    lblEquipoLocalA.setHorizontalAlignment(SwingConstants.RIGHT);
    lblEquipoLocalA.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblEquipoLocalA = new GridBagConstraints();
    gbc_lblEquipoLocalA.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblEquipoLocalA.insets = new Insets(0, 0, 5, 5);
    gbc_lblEquipoLocalA.gridx = 2;
    gbc_lblEquipoLocalA.gridy = 2;
    panelPartido1.add(lblEquipoLocalA, gbc_lblEquipoLocalA);
    
    txtPuntajePartido1Local = new JTextField();
    txtPuntajePartido1Local.setColumns(3);
    GridBagConstraints gbc_txtPuntajePartido1Local = new GridBagConstraints();
    gbc_txtPuntajePartido1Local.anchor = GridBagConstraints.NORTHEAST;
    gbc_txtPuntajePartido1Local.insets = new Insets(0, 0, 5, 5);
    gbc_txtPuntajePartido1Local.gridx = 3;
    gbc_txtPuntajePartido1Local.gridy = 2;
    panelPartido1.add(txtPuntajePartido1Local, gbc_txtPuntajePartido1Local);
    
    txtUltimoSetPartido1Local = new JTextField();
    txtUltimoSetPartido1Local.setColumns(3);
    GridBagConstraints gbc_txtUltimoSetPartido1Local = new GridBagConstraints();
    gbc_txtUltimoSetPartido1Local.anchor = GridBagConstraints.NORTHWEST;
    gbc_txtUltimoSetPartido1Local.insets = new Insets(0, 0, 5, 0);
    gbc_txtUltimoSetPartido1Local.gridx = 5;
    gbc_txtUltimoSetPartido1Local.gridy = 2;
    panelPartido1.add(txtUltimoSetPartido1Local, gbc_txtUltimoSetPartido1Local);
    
    lblVisitanteB_1 = new JLabel("Visitante");
    lblVisitanteB_1.setHorizontalAlignment(SwingConstants.RIGHT);
    lblVisitanteB_1.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblVisitanteB_1 = new GridBagConstraints();
    gbc_lblVisitanteB_1.anchor = GridBagConstraints.WEST;
    gbc_lblVisitanteB_1.insets = new Insets(0, 0, 0, 5);
    gbc_lblVisitanteB_1.gridx = 1;
    gbc_lblVisitanteB_1.gridy = 3;
    panelPartido1.add(lblVisitanteB_1, gbc_lblVisitanteB_1);
    
    lblEquipoVisitanteA = new JLabel(AlgoritmoJornadasFixture.listPartidos.get(idPartido).getNombreEquipoVisitante());
    lblEquipoVisitanteA.setHorizontalAlignment(SwingConstants.RIGHT);
    lblEquipoVisitanteA.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblEquipoVisitanteA = new GridBagConstraints();
    gbc_lblEquipoVisitanteA.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblEquipoVisitanteA.insets = new Insets(0, 0, 0, 5);
    gbc_lblEquipoVisitanteA.gridx = 2;
    gbc_lblEquipoVisitanteA.gridy = 3;
    panelPartido1.add(lblEquipoVisitanteA, gbc_lblEquipoVisitanteA);
    
    txtPuntajePartido1Visitante = new JTextField();
    txtPuntajePartido1Visitante.setColumns(3);
    GridBagConstraints gbc_txtPuntajePartido1Visitante = new GridBagConstraints();
    gbc_txtPuntajePartido1Visitante.anchor = GridBagConstraints.NORTHEAST;
    gbc_txtPuntajePartido1Visitante.insets = new Insets(0, 0, 0, 5);
    gbc_txtPuntajePartido1Visitante.gridx = 3;
    gbc_txtPuntajePartido1Visitante.gridy = 3;
    panelPartido1.add(txtPuntajePartido1Visitante, gbc_txtPuntajePartido1Visitante);
    
    txtUltimoSetPartido1Visitante = new JTextField();
    txtUltimoSetPartido1Visitante.setColumns(3);
    GridBagConstraints gbc_txtUltimoSetPartido1Visitante = new GridBagConstraints();
    gbc_txtUltimoSetPartido1Visitante.anchor = GridBagConstraints.NORTHWEST;
    gbc_txtUltimoSetPartido1Visitante.gridx = 5;
    gbc_txtUltimoSetPartido1Visitante.gridy = 3;
    panelPartido1.add(txtUltimoSetPartido1Visitante, gbc_txtUltimoSetPartido1Visitante);

    panel_6 = new JPanel();
    panel_5.add(panel_6);
    panel_6.setLayout(new BorderLayout(0, 0));
    
    lblNewLabel_9 = new JLabel(" ");
    panel_6.add(lblNewLabel_9, BorderLayout.NORTH);
    
    lblNewLabel_10 = new JLabel(" ");
    panel_6.add(lblNewLabel_10, BorderLayout.SOUTH);
    
    panelPartido2 = new JPanel();
    panel_6.add(panelPartido2, BorderLayout.CENTER);
    GridBagLayout gbl_panelPartido2 = new GridBagLayout();
    gbl_panelPartido2.columnWidths = new int[]{54, 43, 108, 40, 25, 52, 0};
    gbl_panelPartido2.rowHeights = new int[]{13, 13, 19, 19, 0};
    gbl_panelPartido2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    gbl_panelPartido2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    panelPartido2.setLayout(gbl_panelPartido2);
    
    lblPartido2B = new JLabel("Partido 2");
    lblPartido2B.setHorizontalAlignment(SwingConstants.CENTER);
    GridBagConstraints gbc_lblPartido2B = new GridBagConstraints();
    gbc_lblPartido2B.anchor = GridBagConstraints.NORTH;
    gbc_lblPartido2B.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblPartido2B.insets = new Insets(0, 0, 5, 5);
    gbc_lblPartido2B.gridwidth = 3;
    gbc_lblPartido2B.gridx = 2;
    gbc_lblPartido2B.gridy = 0;
    panelPartido2.add(lblPartido2B, gbc_lblPartido2B);
    
    lblEquipoB = new JLabel("Equipos");
    GridBagConstraints gbc_lblEquipoB = new GridBagConstraints();
    gbc_lblEquipoB.anchor = GridBagConstraints.NORTH;
    gbc_lblEquipoB.insets = new Insets(0, 0, 5, 5);
    gbc_lblEquipoB.gridx = 2;
    gbc_lblEquipoB.gridy = 1;
    panelPartido2.add(lblEquipoB, gbc_lblEquipoB);
    
    lblTotalPuntosSetsB = new JLabel("Puntaje");
    lblTotalPuntosSetsB.setHorizontalAlignment(SwingConstants.RIGHT);
    GridBagConstraints gbc_lblTotalPuntosSetsB = new GridBagConstraints();
    gbc_lblTotalPuntosSetsB.anchor = GridBagConstraints.NORTH;
    gbc_lblTotalPuntosSetsB.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblTotalPuntosSetsB.insets = new Insets(0, 0, 5, 5);
    gbc_lblTotalPuntosSetsB.gridx = 3;
    gbc_lblTotalPuntosSetsB.gridy = 1;
    panelPartido2.add(lblTotalPuntosSetsB, gbc_lblTotalPuntosSetsB);
    
    lblPuntajeUltimoSetB = new JLabel("Ultimo Set");
    lblPuntajeUltimoSetB.setHorizontalAlignment(SwingConstants.CENTER);
    GridBagConstraints gbc_lblPuntajeUltimoSetB = new GridBagConstraints();
    gbc_lblPuntajeUltimoSetB.anchor = GridBagConstraints.NORTH;
    gbc_lblPuntajeUltimoSetB.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblPuntajeUltimoSetB.insets = new Insets(0, 0, 5, 0);
    gbc_lblPuntajeUltimoSetB.gridwidth = 2;
    gbc_lblPuntajeUltimoSetB.gridx = 4;
    gbc_lblPuntajeUltimoSetB.gridy = 1;
    panelPartido2.add(lblPuntajeUltimoSetB, gbc_lblPuntajeUltimoSetB);
    
    lblLocalB = new JLabel("Local");
    lblLocalB.setFont(new Font("Arial", Font.PLAIN, 11));
    lblLocalB.setHorizontalAlignment(SwingConstants.RIGHT);
    GridBagConstraints gbc_lblLocalB = new GridBagConstraints();
    gbc_lblLocalB.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblLocalB.insets = new Insets(0, 0, 5, 5);
    gbc_lblLocalB.gridx = 1;
    gbc_lblLocalB.gridy = 2;
    panelPartido2.add(lblLocalB, gbc_lblLocalB);
    
    lblEquipoLocalB = new JLabel(AlgoritmoJornadasFixture.listPartidos.get(idPartido+1).getNombreEquipoLocal());
    lblEquipoLocalB.setHorizontalAlignment(SwingConstants.RIGHT);
    lblEquipoLocalB.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblEquipoLocalB = new GridBagConstraints();
    gbc_lblEquipoLocalB.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblEquipoLocalB.insets = new Insets(0, 0, 5, 5);
    gbc_lblEquipoLocalB.gridx = 2;
    gbc_lblEquipoLocalB.gridy = 2;
    panelPartido2.add(lblEquipoLocalB, gbc_lblEquipoLocalB);
    
    txtPuntajePartido2Local = new JTextField();
    txtPuntajePartido2Local.setColumns(3);
    GridBagConstraints gbc_txtPuntajePartido2Local = new GridBagConstraints();
    gbc_txtPuntajePartido2Local.anchor = GridBagConstraints.NORTHEAST;
    gbc_txtPuntajePartido2Local.insets = new Insets(0, 0, 5, 5);
    gbc_txtPuntajePartido2Local.gridx = 3;
    gbc_txtPuntajePartido2Local.gridy = 2;
    panelPartido2.add(txtPuntajePartido2Local, gbc_txtPuntajePartido2Local);
    
    txtUltimoSetPartido2Local = new JTextField();
    txtUltimoSetPartido2Local.setColumns(3);
    GridBagConstraints gbc_txtUltimoSetPartido2Local = new GridBagConstraints();
    gbc_txtUltimoSetPartido2Local.anchor = GridBagConstraints.NORTHWEST;
    gbc_txtUltimoSetPartido2Local.insets = new Insets(0, 0, 5, 0);
    gbc_txtUltimoSetPartido2Local.gridx = 5;
    gbc_txtUltimoSetPartido2Local.gridy = 2;
    panelPartido2.add(txtUltimoSetPartido2Local, gbc_txtUltimoSetPartido2Local);
    
    lblVisitanteB = new JLabel("Visitante");
    lblVisitanteB.setFont(new Font("Arial", Font.PLAIN, 11));
    lblVisitanteB.setHorizontalAlignment(SwingConstants.RIGHT);
    GridBagConstraints gbc_lblVisitanteB = new GridBagConstraints();
    gbc_lblVisitanteB.anchor = GridBagConstraints.WEST;
    gbc_lblVisitanteB.insets = new Insets(0, 0, 0, 5);
    gbc_lblVisitanteB.gridx = 1;
    gbc_lblVisitanteB.gridy = 3;
    panelPartido2.add(lblVisitanteB, gbc_lblVisitanteB);
    
    lblEquipoVisitanteB = new JLabel(AlgoritmoJornadasFixture.listPartidos.get(idPartido+1).getNombreEquipoVisitante());
    lblEquipoVisitanteB.setHorizontalAlignment(SwingConstants.RIGHT);
    lblEquipoVisitanteB.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblEquipoVisitanteB = new GridBagConstraints();
    gbc_lblEquipoVisitanteB.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblEquipoVisitanteB.insets = new Insets(0, 0, 0, 5);
    gbc_lblEquipoVisitanteB.gridx = 2;
    gbc_lblEquipoVisitanteB.gridy = 3;
    panelPartido2.add(lblEquipoVisitanteB, gbc_lblEquipoVisitanteB);
    
    txtPuntajePartido2Visitante = new JTextField();
    txtPuntajePartido2Visitante.setColumns(3);
    GridBagConstraints gbc_txtPuntajePartido2Visitante = new GridBagConstraints();
    gbc_txtPuntajePartido2Visitante.anchor = GridBagConstraints.NORTHEAST;
    gbc_txtPuntajePartido2Visitante.insets = new Insets(0, 0, 0, 5);
    gbc_txtPuntajePartido2Visitante.gridx = 3;
    gbc_txtPuntajePartido2Visitante.gridy = 3;
    panelPartido2.add(txtPuntajePartido2Visitante, gbc_txtPuntajePartido2Visitante);
    
    txtUltimoSetPartido2Visitante = new JTextField();
    txtUltimoSetPartido2Visitante.setColumns(3);
    GridBagConstraints gbc_txtUltimoSetPartido2Visitante = new GridBagConstraints();
    gbc_txtUltimoSetPartido2Visitante.anchor = GridBagConstraints.NORTHWEST;
    gbc_txtUltimoSetPartido2Visitante.gridx = 5;
    gbc_txtUltimoSetPartido2Visitante.gridy = 3;
    panelPartido2.add(txtUltimoSetPartido2Visitante, gbc_txtUltimoSetPartido2Visitante);

    panel_7 = new JPanel();
    panel_5.add(panel_7);
    panel_7.setLayout(new BorderLayout(0, 0));
    
    lblNewLabel_2 = new JLabel(" ");
    panel_7.add(lblNewLabel_2, BorderLayout.NORTH);
    
    lblNewLabel_6 = new JLabel(" ");
    panel_7.add(lblNewLabel_6, BorderLayout.SOUTH);
    
    panelPartido3 = new JPanel();
    panel_7.add(panelPartido3, BorderLayout.CENTER);
    GridBagLayout gbl_panelPartido3 = new GridBagLayout();
    gbl_panelPartido3.columnWidths = new int[]{54, 43, 103, 35, 25, 52, 0};
    gbl_panelPartido3.rowHeights = new int[]{13, 13, 19, 19, 0};
    gbl_panelPartido3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    gbl_panelPartido3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    panelPartido3.setLayout(gbl_panelPartido3);
    
    lblPartido2B_2 = new JLabel("Partido 3");
    lblPartido2B_2.setHorizontalAlignment(SwingConstants.CENTER);
    GridBagConstraints gbc_lblPartido2B_2 = new GridBagConstraints();
    gbc_lblPartido2B_2.anchor = GridBagConstraints.NORTH;
    gbc_lblPartido2B_2.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblPartido2B_2.insets = new Insets(0, 0, 5, 5);
    gbc_lblPartido2B_2.gridwidth = 3;
    gbc_lblPartido2B_2.gridx = 2;
    gbc_lblPartido2B_2.gridy = 0;
    panelPartido3.add(lblPartido2B_2, gbc_lblPartido2B_2);
    
    lblEquipoB_2 = new JLabel("Equipos");
    GridBagConstraints gbc_lblEquipoB_2 = new GridBagConstraints();
    gbc_lblEquipoB_2.anchor = GridBagConstraints.NORTH;
    gbc_lblEquipoB_2.insets = new Insets(0, 0, 5, 5);
    gbc_lblEquipoB_2.gridx = 2;
    gbc_lblEquipoB_2.gridy = 1;
    panelPartido3.add(lblEquipoB_2, gbc_lblEquipoB_2);
    
    lblTotalPuntosSetsB_2 = new JLabel("Puntaje");
    lblTotalPuntosSetsB_2.setHorizontalAlignment(SwingConstants.RIGHT);
    GridBagConstraints gbc_lblTotalPuntosSetsB_2 = new GridBagConstraints();
    gbc_lblTotalPuntosSetsB_2.anchor = GridBagConstraints.NORTH;
    gbc_lblTotalPuntosSetsB_2.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblTotalPuntosSetsB_2.insets = new Insets(0, 0, 5, 5);
    gbc_lblTotalPuntosSetsB_2.gridx = 3;
    gbc_lblTotalPuntosSetsB_2.gridy = 1;
    panelPartido3.add(lblTotalPuntosSetsB_2, gbc_lblTotalPuntosSetsB_2);
    
    lblPuntajeUltimoSetB_2 = new JLabel("Ultimo Set");
    lblPuntajeUltimoSetB_2.setHorizontalAlignment(SwingConstants.CENTER);
    GridBagConstraints gbc_lblPuntajeUltimoSetB_2 = new GridBagConstraints();
    gbc_lblPuntajeUltimoSetB_2.anchor = GridBagConstraints.NORTH;
    gbc_lblPuntajeUltimoSetB_2.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblPuntajeUltimoSetB_2.insets = new Insets(0, 0, 5, 0);
    gbc_lblPuntajeUltimoSetB_2.gridwidth = 2;
    gbc_lblPuntajeUltimoSetB_2.gridx = 4;
    gbc_lblPuntajeUltimoSetB_2.gridy = 1;
    panelPartido3.add(lblPuntajeUltimoSetB_2, gbc_lblPuntajeUltimoSetB_2);
    
    lblLocalB_2 = new JLabel("Local");
    lblLocalB_2.setHorizontalAlignment(SwingConstants.RIGHT);
    lblLocalB_2.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblLocalB_2 = new GridBagConstraints();
    gbc_lblLocalB_2.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblLocalB_2.insets = new Insets(0, 0, 5, 5);
    gbc_lblLocalB_2.gridx = 1;
    gbc_lblLocalB_2.gridy = 2;
    panelPartido3.add(lblLocalB_2, gbc_lblLocalB_2);
    
    lblEquipoLocalC = new JLabel(AlgoritmoJornadasFixture.listPartidos.get(idPartido+2).getNombreEquipoLocal());
    lblEquipoLocalC.setHorizontalAlignment(SwingConstants.RIGHT);
    lblEquipoLocalC.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblEquipoLocalC = new GridBagConstraints();
    gbc_lblEquipoLocalC.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblEquipoLocalC.insets = new Insets(0, 0, 5, 5);
    gbc_lblEquipoLocalC.gridx = 2;
    gbc_lblEquipoLocalC.gridy = 2;
    panelPartido3.add(lblEquipoLocalC, gbc_lblEquipoLocalC);
    
    txtPuntajePartido3Local = new JTextField();
    txtPuntajePartido3Local.setColumns(3);
    GridBagConstraints gbc_txtPuntajePartido3Local = new GridBagConstraints();
    gbc_txtPuntajePartido3Local.anchor = GridBagConstraints.NORTHEAST;
    gbc_txtPuntajePartido3Local.insets = new Insets(0, 0, 5, 5);
    gbc_txtPuntajePartido3Local.gridx = 3;
    gbc_txtPuntajePartido3Local.gridy = 2;
    panelPartido3.add(txtPuntajePartido3Local, gbc_txtPuntajePartido3Local);
    
    txtUltimoSetPartido3Local = new JTextField();
    txtUltimoSetPartido3Local.setColumns(3);
    GridBagConstraints gbc_txtUltimoSetPartido3Local = new GridBagConstraints();
    gbc_txtUltimoSetPartido3Local.anchor = GridBagConstraints.NORTHWEST;
    gbc_txtUltimoSetPartido3Local.insets = new Insets(0, 0, 5, 0);
    gbc_txtUltimoSetPartido3Local.gridx = 5;
    gbc_txtUltimoSetPartido3Local.gridy = 2;
    panelPartido3.add(txtUltimoSetPartido3Local, gbc_txtUltimoSetPartido3Local);
    
    lblVisitanteB_2 = new JLabel("Visitante");
    lblVisitanteB_2.setHorizontalAlignment(SwingConstants.RIGHT);
    lblVisitanteB_2.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblVisitanteB_2 = new GridBagConstraints();
    gbc_lblVisitanteB_2.anchor = GridBagConstraints.WEST;
    gbc_lblVisitanteB_2.insets = new Insets(0, 0, 0, 5);
    gbc_lblVisitanteB_2.gridx = 1;
    gbc_lblVisitanteB_2.gridy = 3;
    panelPartido3.add(lblVisitanteB_2, gbc_lblVisitanteB_2);
    
    lblEquipoVisitanteC = new JLabel(AlgoritmoJornadasFixture.listPartidos.get(idPartido+2).getNombreEquipoVisitante());
    lblEquipoVisitanteC.setHorizontalAlignment(SwingConstants.RIGHT);
    lblEquipoVisitanteC.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblEquipoVisitanteC = new GridBagConstraints();
    gbc_lblEquipoVisitanteC.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblEquipoVisitanteC.insets = new Insets(0, 0, 0, 5);
    gbc_lblEquipoVisitanteC.gridx = 2;
    gbc_lblEquipoVisitanteC.gridy = 3;
    panelPartido3.add(lblEquipoVisitanteC, gbc_lblEquipoVisitanteC);
    
    txtPuntajePartido3Visitante = new JTextField();
    txtPuntajePartido3Visitante.setColumns(3);
    GridBagConstraints gbc_txtPuntajePartido3Visitante = new GridBagConstraints();
    gbc_txtPuntajePartido3Visitante.anchor = GridBagConstraints.NORTHEAST;
    gbc_txtPuntajePartido3Visitante.insets = new Insets(0, 0, 0, 5);
    gbc_txtPuntajePartido3Visitante.gridx = 3;
    gbc_txtPuntajePartido3Visitante.gridy = 3;
    panelPartido3.add(txtPuntajePartido3Visitante, gbc_txtPuntajePartido3Visitante);
    
    txtUltimoSetPartido3Visitante = new JTextField();
    txtUltimoSetPartido3Visitante.setColumns(3);
    GridBagConstraints gbc_txtUltimoSetPartido3Visitante = new GridBagConstraints();
    gbc_txtUltimoSetPartido3Visitante.anchor = GridBagConstraints.NORTHWEST;
    gbc_txtUltimoSetPartido3Visitante.gridx = 5;
    gbc_txtUltimoSetPartido3Visitante.gridy = 3;
    panelPartido3.add(txtUltimoSetPartido3Visitante, gbc_txtUltimoSetPartido3Visitante);

    PantallaClasificacion = new JPanel();
    contentPane.add(PantallaClasificacion);
    PantallaClasificacion.setLayout(new BorderLayout(0, 0));

    panel = new JPanel();
    PantallaClasificacion.add(panel, BorderLayout.NORTH);

    lblNewLabel = new JLabel("Tabla de Clasificicación");
    panel.add(lblNewLabel);

    panel_1 = new JPanel();
    PantallaClasificacion.add(panel_1, BorderLayout.SOUTH);

//    JButton btnNewButton = new JButton("New button");
//    btnNewButton.addActionListener(new ActionListener() {
//    	public void actionPerformed(ActionEvent e) {
//    	}
//    });
//    panel_1.add(btnNewButton);
    // Configuración inicial de la tabla
    scrollPane = new JScrollPane();
    PantallaClasificacion.add(scrollPane, BorderLayout.CENTER);

    tablaClasificacion = new JTable();
    // Configuración inicial de la tabla con columnas específicas
    modeloTabla = new DefaultTableModel(new String[]{"POSICIÓN", "EQUIPO", "PJ", "PG", "PP", "PSTT", "FUNDACIÓN", "PTS"}, 0);
    tablaClasificacion.setModel(modeloTabla);

    // Configuración de propiedades de la tabla
    tablaClasificacion.setDefaultRenderer(Object.class, renderer);
	//Para que al iniciar la ventana no se pueda cambiar de posiciones los titulos de la cabecera
	tablaClasificacion.getTableHeader().setReorderingAllowed(false);
	//Para que al iniciar la ventana no se pueda acortar o alargar una columna
	tablaClasificacion.getTableHeader().setResizingAllowed(false);
    		

    scrollPane.setViewportView(tablaClasificacion);
    
    // Configurar tamaños de las columnas
    tablaClasificacion.getColumnModel().getColumn(0).setPreferredWidth(50);
    tablaClasificacion.getColumnModel().getColumn(0).setMinWidth(17);
    tablaClasificacion.getColumnModel().getColumn(1).setPreferredWidth(160);
    tablaClasificacion.getColumnModel().getColumn(2).setPreferredWidth(55);
    tablaClasificacion.getColumnModel().getColumn(3).setPreferredWidth(55);
    tablaClasificacion.getColumnModel().getColumn(4).setPreferredWidth(55);
    tablaClasificacion.getColumnModel().getColumn(5).setPreferredWidth(55);	
    tablaClasificacion.getColumnModel().getColumn(6).setPreferredWidth(55);
    tablaClasificacion.getColumnModel().getColumn(7).setPreferredWidth(55);
    scrollPane.setViewportView(tablaClasificacion);
    
    // Llamar al método inicializarTabla después de configurar la tabla
    inicializarTabla();
  }
  private void inicializarTabla() {
	    DefaultTableModel modeloTabla = (DefaultTableModel) tablaClasificacion.getModel();
	    modeloTabla.setRowCount(0); // Limpiar cualquier dato existente

	    for (EQUIPOS equipo : AlgoritmoJornadasFixture.listEquipos) {
	        modeloTabla.addRow(new Object[]{
	            equipo.getPosicion_Temporada(),    // POSICIÓN inicial
	            equipo.getNombreEquipo(),          // EQUIPO
	            equipo.getPartidosGanados() + equipo.getPartidosPerdidos(), // PJ (Partidos Jugados)
	            equipo.getPartidosGanados(),       // PG (Partidos Ganados)
	            equipo.getPartidosPerdidos(),      // PP (Partidos Perdidos)
	            equipo.getPuntosSetsTotal(),       // PSTT (Puntos Totales de Sets)
	            equipo.getFundacion(),             // FUNDACIÓN
	            equipo.getPuntajeTotal()           // PTS (Puntaje Total)
	        });
	    }
	}
  
//Método para actualizar la tabla con datos actualizados
private void actualizarTabla() {
   if (modeloTabla == null) {
       System.out.println("Error: modeloTabla no está inicializado.");
       return;
   }
   // Ordenar la lista por Posicion_Temporada en orden ascendente
   listaPosicionDeEquipos.sort((equipo1, equipo2) -> 
       Integer.compare(equipo1.getPosicion_Temporada(), equipo2.getPosicion_Temporada())
   );
   
   modeloTabla.setRowCount(0); // Limpiar datos anteriores

   // Usar la lista ya ordenada (listaPosicionDeEquipos) para llenar la tabla
   for (EQUIPOS equipo : listaPosicionDeEquipos) {
       Object[] fila = {
           equipo.getPosicion_Temporada(),  // POSICIÓN calculada
           equipo.getNombreEquipo(),        // EQUIPO
           equipo.getPartidosGanados() + equipo.getPartidosPerdidos(), // PJ
           equipo.getPartidosGanados(),     // PG
           equipo.getPartidosPerdidos(),    // PP
           equipo.getPuntosSetsTotal(),     // PSTT
           equipo.getFundacion(),           // FUNDACIÓN
           equipo.getPuntajeTotal()         // PTS
       };
       modeloTabla.addRow(fila);
   }
}

	
	public void calcularGanadordelPartido(int id_partido, int puntaje_local, int puntaje_visitante, int ultimo_set_local, int ultimo_set_visitante) {
	    PARTIDO partido = AlgoritmoJornadasFixture.listPartidos.get(id_partido);

	    // Verificar si el resultado ya fue calculado
	    if (partido.isResultadoCalculado()) {
	        System.out.println("Resultado ya calculado para el partido: " + id_partido);
	        return; // Salir si el resultado ya fue calculado
	    }

	    int idEquipoLocal = partido.getId_equipo_local();
	    int idEquipoVisitante = partido.getId_equipo_visitante();
	    EQUIPOS equipoLocal = AlgoritmoJornadasFixture.listEquipos.get(idEquipoLocal);
	    EQUIPOS equipoVisitante = AlgoritmoJornadasFixture.listEquipos.get(idEquipoVisitante);

	    // Comparar puntajes y actualizar estadísticas
	    if (puntaje_local > puntaje_visitante) {
	        // Equipo local gana
	        equipoLocal.incrementarPartidosGanados();
	        equipoLocal.agregarPuntajeTotal(3);  // 3 puntos por ganar
	        equipoVisitante.incrementarPartidosPerdidos();
	        equipoVisitante.agregarPuntajeTotal(1);  // 1 punto por perder
	    } else if (puntaje_visitante > puntaje_local) {
	        // Equipo visitante gana
	        equipoVisitante.incrementarPartidosGanados();
	        equipoVisitante.agregarPuntajeTotal(3);  // 3 puntos por ganar
	        equipoLocal.incrementarPartidosPerdidos();
	        equipoLocal.agregarPuntajeTotal(1);  // 1 punto por perder
	    }

	    equipoLocal.agregarPuntosSetsTotal(ultimo_set_local);
	    equipoVisitante.agregarPuntosSetsTotal(ultimo_set_visitante);

	    // Marcar el partido como calculado
	    partido.setResultadoCalculado(true);
	}

	public static void CalcularYMostrarPosicionesEquipos() {
	    if (AlgoritmoJornadasFixture.listEquipos.isEmpty()) {
	        System.out.println("La lista de equipos está vacía. No se puede calcular la clasificación.");
	        return;
	    }

	    // Crear una lista auxiliar con el mismo contenido para calcular las posiciones
	    List<EQUIPOS> listaPosicionDeEquipos = new ArrayList<>(AlgoritmoJornadasFixture.listEquipos);
	    
	    
	    //ORDENAMINETO CLASICO
//	    for (int i = 0; i < listaPosicionDeEquipos.size(); i++) {
//	        for (int j = i + 1; j < listaPosicionDeEquipos.size(); j++) {
//	            if (listaPosicionDeEquipos.get(j).getPuntajeTotal() > listaPosicionDeEquipos.get(i).getPuntajeTotal()) {
//	                // Intercambiar elementos
//	                EQUIPOS temp = listaPosicionDeEquipos.get(i);
//	                listaPosicionDeEquipos.set(i, listaPosicionDeEquipos.get(j));
//	                listaPosicionDeEquipos.set(j, temp);
//	            }
//	        }
//	    }
	    
	    //NUEVO METODO ORDENAMIENTO
	    // Ordenar la lista auxiliar por puntaje total en orden descendente
	    // CON EL MEOTODO SORT EXLUCISVO PARA LIST
	    listaPosicionDeEquipos.sort((equipo1, equipo2) -> {
	        // Compara primero por PuntajeTotal en orden descendente
	        int comparacion = Integer.compare(equipo2.getPuntajeTotal(), equipo1.getPuntajeTotal());
	        
	        if (comparacion == 0) {
	        	// Si el PuntajeTotal son iguales, compara por PuntosSetsTotal en orden descendente
	            comparacion = Integer.compare(equipo2.getPuntosSetsTotal(), equipo1.getPuntosSetsTotal());
	        }

	        if (comparacion == 0) {
	            // Si también los PuntosSetsTotal son iguales, compara por Fundacion en orden ascendente (más antiguo primero)
	            comparacion = Integer.compare(equipo1.getFundacion(), equipo2.getFundacion());
	        }
	        
	        if (comparacion == 0) {
	            // Si tambien el Anio de Fundacion son iguales ,Comparar por NombreEquipo (ascendente) como último recurso
	            comparacion = equipo1.getNombreEquipo().compareTo(equipo2.getNombreEquipo());
	        }

	        return comparacion;
	    });
	    

	    //METODO COMPARATOR  IMPORT.UTIL.COMPARATOR
//	    listaPosicionDeEquipos.sort(
//	    	    Comparator.comparingInt(EQUIPOS::getPuntajeTotal).reversed() // Orden descendente por PuntajeTotal
//	    	        .thenComparingInt(EQUIPOS::getPuntosSetsTotal).reversed() // Luego por PuntosSetsTotal en descendente
//	    	        .thenComparingInt(EQUIPOS::getFundacion) // Finalmente por Fundacion en ascendente
//	    	);
	    
	    // Asignar las posiciones dentro de la lista auxiliar
	    for (int i = 0; i < listaPosicionDeEquipos.size(); i++) {
	        EQUIPOS equipoOrdenado = listaPosicionDeEquipos.get(i);
	        equipoOrdenado.setPosicion_Temporada(i + 1); // Asignar la posición (i+1 porque comienza en 1)
	    }
	    
//	 // Asignar las posiciones en función del orden en la lista auxiliar
//	    for (int i = 0; i < listaPosicionDeEquipos.size(); i++) {
//	        EQUIPOS PosicionDeEquipos = listaPosicionDeEquipos.get(i);
//	        final int posicion = i + 1; // Variable final para usar dentro del stream
//
//	        // Buscar el equipo correspondiente en la lista original y actualizar su posición
//	        for (EQUIPOS listaEquiposoriginal : AlgoritmoJornadasFixture.listEquipos) {
//	            if (listaEquiposoriginal.getid_equipo() == PosicionDeEquipos.getid_equipo()) {
//	            	listaEquiposoriginal.setPosicion_Temporada(posicion);
//	                break; // Salir del bucle una vez actualizado
//	            }
//	        }
//	    }
	    
	    // Mostrar la nueva lista con posiciones, nombres y puntajes
	    System.out.println("╔════════════════════════════════════════════════════════════════════════════════════╗");
	    System.out.println("                                    CLASIFICACIÓN                                    ");
	    System.out.println("╚════════════════════════════════════════════════════════════════════════════════════╝");
	    System.out.printf("%-10s %-25s %-10s %-10s %-10s %-15s%n", 
	        "Posición", "Nombre del Equipo", "PG", "PP", "PTS Total", "Puntos de Sets");
	    System.out.println("--------------------------------------------------------------------------------------");

	    for (EQUIPOS equipo : listaPosicionDeEquipos) {
	        System.out.printf("%-10d %-25s %-10d %-10d %-10d %-15d%n", 
	                equipo.getPosicion_Temporada(),
	                equipo.getNombreEquipo(),
	                equipo.getPartidosGanados(),
	                equipo.getPartidosPerdidos(),
	                equipo.getPuntajeTotal(),
	                equipo.getPuntosSetsTotal());
	        }
	    
	    // Mostrar la lista original sin ordenar
//	    System.out.println("\n╔════════════════════════════════════════════════════╗");
//	    System.out.println("         CLASIFICACIÓN SEGÚN EL ORDEN ORIGINAL        ");
//	    System.out.println("╚════════════════════════════════════════════════════╝");
//	    System.out.printf("%-10s %-25s %-10s%n", "Índice", "Nombre del Equipo", "Puntaje Total");
//	    System.out.println("-----------------------------------------------------");
//	    for (int i = 0; i < AlgoritmoJornadasFixture.listEquipos.size(); i++) {
//	        EQUIPOS equipo = AlgoritmoJornadasFixture.listEquipos.get(i);
//	        System.out.printf("%-10d %-25s %-10d%n", 
//	            i,
//	            equipo.getNombreEquipo(),
//	            equipo.getPuntajeTotal());
//	    }
	}

	
    // Método para calcular la posición de los equipos
    public static void CalcularPosicionEquipos() {
    	
        // Verificar si listEquipos tiene datos
        if (listEquipos.isEmpty()) {
            System.out.println("La lista de equipos está vacía. No se puede calcular la clasificación.");
            return;
        }

        // Copiar los equipos a la lista global
        ListOrdenClasificacion = new ArrayList<>(listEquipos);

        // Ordenar por puntaje total en orden descendente
        ListOrdenClasificacion.sort((equipo1, equipo2) -> 
            Integer.compare(equipo2.getPuntajeTotal(), equipo1.getPuntajeTotal())
        );

        // Asignar posición según el orden
        for (int i = 0; i < ListOrdenClasificacion.size(); i++) {
            ListOrdenClasificacion.get(i).setPosicion_Temporada(i + 1); // Asignar posición empezando desde 1
        }
        
        // Mostrar la clasificación
        if (ListOrdenClasificacion.isEmpty()) {
            System.out.println("No hay datos en la lista de clasificación para mostrar.");
            return;
        }

        System.out.println("Posición | Nombre del Equipo           | Puntaje Total");
        System.out.println("-----------------------------------------------------");
        for (EQUIPOS equipo : ListOrdenClasificacion) {
            System.out.printf("%-8d | %-25s | %-13d%n", 
                equipo.getPosicion_Temporada(), 
                equipo.getNombreEquipo(), 
                equipo.getPuntajeTotal());
        }
    }

private void guardarDatosPartidos(int id_jornada) {
	
	//ARREGLOS PARA OBTENER EL JTEXFILED DE MANERA DINAMICA Y OBTENER LOS CAMPOS DE TEXTO, PARA USARLO EN EL BUCLE
    puntajeLocalFields = new JTextField[] { txtPuntajePartido1Local, txtPuntajePartido2Local, txtPuntajePartido3Local };
    puntajeVisitanteFields = new JTextField[] { txtPuntajePartido1Visitante, txtPuntajePartido2Visitante, txtPuntajePartido3Visitante };
    ultimoSetLocalFields = new JTextField[] { txtUltimoSetPartido1Local, txtUltimoSetPartido2Local, txtUltimoSetPartido3Local };
    ultimoSetVisitanteFields = new JTextField[] { txtUltimoSetPartido1Visitante, txtUltimoSetPartido2Visitante, txtUltimoSetPartido3Visitante };

    //System.out.println("Guardando datos de partidos para la jornada: " + id_jornada);

    try {
        // Obtener la jornada correspondiente por id_jornada
        JORNADAS jornada = AlgoritmoJornadasFixture.listJornadas.get(id_jornada);
        List<Integer> equiposEnJornada = jornada.getIDequiposporJornada();

        // Iterar sobre los 3 partidos de la jornada
        for (int i = 0; i < 3; i++) {
            int id_partido = id_jornada * 3 + i; // Calcula el id_partido usando id_jornada y el índice del partido en la jornada

            // Obtener el partido existente en listPartidos
            PARTIDO partido = AlgoritmoJornadasFixture.listPartidos.get(id_partido);

            // Obtener los IDs de los equipos local y visitante en el ArrayList de EquiposEnJornadas de 0 a 5
            int idEquipoLocal = equiposEnJornada.get(i * 2);
            int idEquipoVisitante = equiposEnJornada.get(i * 2 + 1);

            // Obtener los objetos EQUIPOS correspondientes a los equipos local y visitante
            EQUIPOS equipoLocal = AlgoritmoJornadasFixture.listEquipos.get(idEquipoLocal);
            EQUIPOS equipoVisitante = AlgoritmoJornadasFixture.listEquipos.get(idEquipoVisitante);

            // Obtener los valores directamente desde los arreglos de campos de texto
            int puntajeLocal = Integer.parseInt(puntajeLocalFields[i].getText());
            int puntajeVisitante = Integer.parseInt(puntajeVisitanteFields[i].getText());
            int ultimoSetLocal = Integer.parseInt(ultimoSetLocalFields[i].getText());
            int ultimoSetVisitante = Integer.parseInt(ultimoSetVisitanteFields[i].getText());

            // Actualizar el objeto PARTIDO
            partido.setSetsGanadosEquipoLocal(puntajeLocal);
            partido.setPuntajeUltimoSetLocal(ultimoSetLocal);
            partido.setSetsGanadosEquipoVisitante(puntajeVisitante);
            partido.setPuntajeUltimoSetVisitante(ultimoSetVisitante);

            // Asegurarse de calcular el resultado solo una vez por partido
            if (!partido.isResultadoCalculado()) {
                calcularGanadordelPartido(id_partido, puntajeLocal, puntajeVisitante, ultimoSetLocal, ultimoSetVisitante);
                partido.setResultadoCalculado(true); // Marcar como calculado
            }
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa valores numéricos válidos para los puntajes.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

// Método para mostrar que los datos de los partidos se hayan guardado correctamente en la consola
 private void mostrarDatosPartidos(int id_partido) {  //PARA LA LINEA 317
		// Obtener el partido correspondiente por id_partido
	    PARTIDO partido = AlgoritmoJornadasFixture.listPartidos.get(id_partido);
	    // Obtener los IDs de los equipos local y visitante
	    int idEquipoLocal = partido.getId_equipo_local();
	    int idEquipoVisitante = partido.getId_equipo_visitante();
	    // Obtener los objetos EQUIPOS correspondientes a los equipos local y visitante
	    EQUIPOS equipoLocal = AlgoritmoJornadasFixture.listEquipos.get(idEquipoLocal);
	    EQUIPOS equipoVisitante = AlgoritmoJornadasFixture.listEquipos.get(idEquipoVisitante);

	    System.out.println("╔════════════════════════════════════════════════════╗");
	    System.out.println("                JORNADA "+jornadaActual +" -  PARTIDO "+(id_partido) +"                     ");
	    System.out.println("     "+equipoLocal.getNombreEquipo() + " (" + partido.getSetsGanadosEquipoLocal() +
	    ") vs (" + partido.getSetsGanadosEquipoVisitante()+ ") " + equipoVisitante.getNombreEquipo());
	    System.out.println("╚════════════════════════════════════════════════════╝");
	    System.out.println("/======= DATOS GUARDADOS EN LA CLASE PARTIDOS: ======/");
//	    System.out.println("Partido " + id_partido + ": ("+ equipoLocal.getid_equipo() + ") " + equipoLocal.getNombreEquipo() + " vs " + equipoVisitante.getNombreEquipo()
//	    + " ("  + equipoVisitante.getid_equipo() + ")");
	    System.out.println("Puntaje local: " + partido.getSetsGanadosEquipoLocal());
	    System.out.println("Puntaje visitante: " + partido.getSetsGanadosEquipoVisitante());
	    System.out.println("Ultimo set local: " + partido.getPuntajeUltimoSetLocal());
	    System.out.println("Ultimo set visitante: " + partido.getPuntajeUltimoSetVisitante());

		 
	    System.out.println("/======= DATOS GUARDADOS EN LA CLASE EQUIPO: ======/");
	    System.out.println(equipoLocal.getNombreEquipo());
	    System.out.println("Partidos ganados: "  + equipoLocal.getPartidosGanados());
	    System.out.println("Partidos perdidos: "  + equipoLocal.getPartidosPerdidos());
	    System.out.println("Puntos total de los SETS: " + equipoLocal.getPuntosSetsTotal());
	    System.out.println("Puntos totales de Temporada: " + equipoLocal.getPuntajeTotal());
	    System.out.println("---------------------------------");
	    System.out.println(equipoVisitante.getNombreEquipo());
	    System.out.println("Partidos ganados: "  + equipoVisitante.getPartidosGanados());
	    System.out.println("Partidos perdidos: "  + equipoVisitante.getPartidosPerdidos());
	    System.out.println("Puntos total de los SETS: " + equipoVisitante.getPuntosSetsTotal());
	    System.out.println("Puntos totales de Temporada: " + equipoVisitante.getPuntajeTotal());
	    //System.out.println("/=======================================================/");
	    
 }
 
//Método para mostrar todos los valores de cada equipo en listEquipos
private void mostrarTodosLosEquipos() {
  if (AlgoritmoJornadasFixture.listEquipos.isEmpty()) {
      System.out.println("La lista de equipos está vacía.");
      return;
  }

  System.out.println("╔════════════════════════════════════════════════════════════════════════════╗");
  System.out.println("                                  LISTA DE EQUIPOS                            ");
  System.out.println("╚════════════════════════════════════════════════════════════════════════════╝");
  for (EQUIPOS equipo : AlgoritmoJornadasFixture.listEquipos) {
      System.out.println("╔════════════════════════════════════════════════════════════╗");
      System.out.println("ID del Equipo: " + equipo.getid_equipo());
      System.out.println("Nombre del Equipo: " + equipo.getNombreEquipo());
      System.out.println("Entrenador: " + equipo.getEntrenador());
      System.out.println("Partidos Ganados: " + equipo.getPartidosGanados());
      System.out.println("Partidos Perdidos: " + equipo.getPartidosPerdidos());
      System.out.println("Puntaje Total: " + equipo.getPuntajeTotal());
      System.out.println("Puntos Totales de Sets: " + equipo.getPuntosSetsTotal());
      System.out.println("Posición en la Temporada: " + equipo.getPosicion_Temporada());
      System.out.println("╚════════════════════════════════════════════════════════════╝");
  }
}
}