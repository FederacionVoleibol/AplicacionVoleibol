package AplicacionFederacionVoleibol;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
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
import java.util.List;
import java.awt.event.ActionEvent;

public class VentanaClasificacion extends JFrame {

  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  private JTable tablaClasificacion;
  private JTextField tf_eqlb_p;
  private JTextField tf_eqlb_ls;
  private JTextField tf_eqvb_p;
  private JTextField tf_eqvb_ls;
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
  private List<Jornada> jornadas;
  private int jornadaActual = 1;
  private JPanel panelPartido1;
  private JLabel lblPartido1A;
  private JLabel lblEquipoB_1;
  private JLabel lblTotalPuntosSetsB_1;
  private JLabel lblPuntajeUltimoSetB_1;
  private JLabel lblLocalB_1;
  private JLabel lblEquipoLocalA;
  private JTextField tf_eqla_p;
  private JTextField tf_eqla_ls;
  private JLabel lblVisitanteB_1;
  private JLabel lblEquipoVisitanteA;
  private JTextField tf_eqva_p;
  private JTextField tf_eqva_ls;
  private JPanel panelPartido3;
  private JLabel lblPartido2B_2;
  private JLabel lblEquipoB_2;
  private JLabel lblTotalPuntosSetsB_2;
  private JLabel lblPuntajeUltimoSetB_2;
  private JLabel lblLocalB_2;
  private JLabel lblEquipoLocalC;
  private JTextField tf_eqlc_p;
  private JTextField tf_eqlc_c;
  private JLabel lblVisitanteB_2;
  private JLabel lblEquipoVisitanteC;
  private JTextField tf_eqvc_p;
  private JTextField tf_eqvc_ls;
  
  String[] equipos = {"CV Sayre Mayser", "CV Barça", "CD Zaragoza", "CV Alcobendas", "CD Avila Voleibol", "CV Madrid Chamberí"};

  int indiceEquipo = 1;
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
  /**
	 * Launch the application.
	 */
  public static void main(String[] args) {
	  
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

    btnSiguiente = new JButton("▶");
    btnSiguiente.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	
        	// hay que editarlo para extarer los partidos del array Jornadas.
            if (jornadaActual < 10) {
                jornadaActual++;
                lblTituloNumeroJornada.setText("JORNADA " + jornadaActual);

                // Reiniciar el índice si se llega al final del arreglo
                if (indiceEquipo >= equipos.length) {
                    indiceEquipo = 0;
                }

                // Actualizar los labels de los equipos
                lblEquipoLocalA.setText(equipos[indiceEquipo]);
                lblEquipoVisitanteA.setText(equipos[(indiceEquipo + 1) % equipos.length]);
                
                lblEquipoLocalB.setText(equipos[(indiceEquipo + 2) % equipos.length]);
                lblEquipoVisitanteB.setText(equipos[(indiceEquipo + 3) % equipos.length]);
                
                lblEquipoLocalC.setText(equipos[(indiceEquipo + 4) % equipos.length]);
                lblEquipoVisitanteC.setText(equipos[(indiceEquipo + 5) % equipos.length]);

                // Incrementar el índice de los equipos
                indiceEquipo++;

                if (jornadaActual == 10) {
                	btnSiguiente.setVisible(false);
                }
            	if (jornadaActual > 1) {
            		btnAnterior.setVisible(true);
            	}
            }
        }

    });

    

    lblTituloNumeroJornada = new JLabel("JORNADA 1");
    lblTituloNumeroJornada.setHorizontalAlignment(SwingConstants.CENTER);

    btnAnterior = new JButton("◀");
    btnAnterior.setVisible(false);
    btnAnterior.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	// hay que editarlo para extarer los partidos del array Jornadas.
            if (jornadaActual > 1) {

                jornadaActual--;
                lblTituloNumeroJornada.setText("JORNADA " + jornadaActual);

                // Reiniciar el índice si se llega al principio del arreglo
                if (indiceEquipo <= 0) {
                    indiceEquipo = equipos.length - 1;
                }

                // Actualizar los labels de los equipos
                
                lblEquipoLocalA.setText(equipos[(indiceEquipo - 1 + equipos.length) % equipos.length]);
                lblEquipoVisitanteA.setText(equipos[(indiceEquipo) % equipos.length]);
                lblEquipoLocalB.setText(equipos[(indiceEquipo + 1) % equipos.length]);
                lblEquipoVisitanteB.setText(equipos[(indiceEquipo + 2) % equipos.length]);
                lblEquipoLocalC.setText(equipos[(indiceEquipo + 3) % equipos.length]);
                lblEquipoVisitanteC.setText(equipos[(indiceEquipo + 4) % equipos.length]);

                // Decrementar el índice de los equipos
                indiceEquipo--;
                
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
    		// ------------------------------------------- EJ: eql_a = equipo local "a", eqv_b -> equipo visitante "b"
    		String eql_a = lblEquipoLocalA.getText();
    		String eqv_a = lblEquipoVisitanteA.getText();
    		String eql_b = lblEquipoLocalB.getText();
    		String eqv_b = lblEquipoVisitanteB.getText();
    		String eql_c = lblEquipoLocalC.getText();
    		String eqv_c = lblEquipoVisitanteC.getText();
    		
    		// 1.2 Obtencion del Puntaje (falta modificarlo para que sea int parse int noseque)
    		String eql_a_p = tf_eqla_p.getText();
    		//int eqv_a_p = tf_eqva_p.getText();;
    		//int eql_b_p = tf_eqlb_p.getText();
    		//int eqv_b_p = tf_eqvb_p.getText();
    		//int eql_c_p = tf_eqlc_p.getText();
    		//int eqv_c_p = tf_eqvc_p.getText();
    		// 2. Almacenamiento en el array de objetos
    		
    		// 3. Ordenamiento
    	}
    });
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
    
    lblEquipoLocalA = new JLabel("Avila Voleibol");
    lblEquipoLocalA.setHorizontalAlignment(SwingConstants.RIGHT);
    lblEquipoLocalA.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblEquipoLocalA = new GridBagConstraints();
    gbc_lblEquipoLocalA.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblEquipoLocalA.insets = new Insets(0, 0, 5, 5);
    gbc_lblEquipoLocalA.gridx = 2;
    gbc_lblEquipoLocalA.gridy = 2;
    panelPartido1.add(lblEquipoLocalA, gbc_lblEquipoLocalA);
    
    tf_eqla_p = new JTextField();
    tf_eqla_p.setColumns(3);
    GridBagConstraints gbc_tf_eqla_p = new GridBagConstraints();
    gbc_tf_eqla_p.anchor = GridBagConstraints.NORTHEAST;
    gbc_tf_eqla_p.insets = new Insets(0, 0, 5, 5);
    gbc_tf_eqla_p.gridx = 3;
    gbc_tf_eqla_p.gridy = 2;
    panelPartido1.add(tf_eqla_p, gbc_tf_eqla_p);
    
    tf_eqla_ls = new JTextField();
    tf_eqla_ls.setColumns(3);
    GridBagConstraints gbc_tf_eqla_ls = new GridBagConstraints();
    gbc_tf_eqla_ls.anchor = GridBagConstraints.NORTHWEST;
    gbc_tf_eqla_ls.insets = new Insets(0, 0, 5, 0);
    gbc_tf_eqla_ls.gridx = 5;
    gbc_tf_eqla_ls.gridy = 2;
    panelPartido1.add(tf_eqla_ls, gbc_tf_eqla_ls);
    
    lblVisitanteB_1 = new JLabel("Visitante");
    lblVisitanteB_1.setHorizontalAlignment(SwingConstants.RIGHT);
    lblVisitanteB_1.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblVisitanteB_1 = new GridBagConstraints();
    gbc_lblVisitanteB_1.anchor = GridBagConstraints.WEST;
    gbc_lblVisitanteB_1.insets = new Insets(0, 0, 0, 5);
    gbc_lblVisitanteB_1.gridx = 1;
    gbc_lblVisitanteB_1.gridy = 3;
    panelPartido1.add(lblVisitanteB_1, gbc_lblVisitanteB_1);
    
    lblEquipoVisitanteA = new JLabel("Sayre Mayser");
    lblEquipoVisitanteA.setHorizontalAlignment(SwingConstants.RIGHT);
    lblEquipoVisitanteA.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblEquipoVisitanteA = new GridBagConstraints();
    gbc_lblEquipoVisitanteA.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblEquipoVisitanteA.insets = new Insets(0, 0, 0, 5);
    gbc_lblEquipoVisitanteA.gridx = 2;
    gbc_lblEquipoVisitanteA.gridy = 3;
    panelPartido1.add(lblEquipoVisitanteA, gbc_lblEquipoVisitanteA);
    
    tf_eqva_p = new JTextField();
    tf_eqva_p.setColumns(3);
    GridBagConstraints gbc_tf_eqva_p = new GridBagConstraints();
    gbc_tf_eqva_p.anchor = GridBagConstraints.NORTHEAST;
    gbc_tf_eqva_p.insets = new Insets(0, 0, 0, 5);
    gbc_tf_eqva_p.gridx = 3;
    gbc_tf_eqva_p.gridy = 3;
    panelPartido1.add(tf_eqva_p, gbc_tf_eqva_p);
    
    tf_eqva_ls = new JTextField();
    tf_eqva_ls.setColumns(3);
    GridBagConstraints gbc_tf_eqva_ls = new GridBagConstraints();
    gbc_tf_eqva_ls.anchor = GridBagConstraints.NORTHWEST;
    gbc_tf_eqva_ls.gridx = 5;
    gbc_tf_eqva_ls.gridy = 3;
    panelPartido1.add(tf_eqva_ls, gbc_tf_eqva_ls);

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
    
    lblEquipoLocalB = new JLabel("Avila Voleibol");
    lblEquipoLocalB.setHorizontalAlignment(SwingConstants.RIGHT);
    lblEquipoLocalB.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblEquipoLocalB = new GridBagConstraints();
    gbc_lblEquipoLocalB.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblEquipoLocalB.insets = new Insets(0, 0, 5, 5);
    gbc_lblEquipoLocalB.gridx = 2;
    gbc_lblEquipoLocalB.gridy = 2;
    panelPartido2.add(lblEquipoLocalB, gbc_lblEquipoLocalB);
    
    tf_eqlb_p = new JTextField();
    tf_eqlb_p.setColumns(3);
    GridBagConstraints gbc_tf_eqlb_p = new GridBagConstraints();
    gbc_tf_eqlb_p.anchor = GridBagConstraints.NORTHEAST;
    gbc_tf_eqlb_p.insets = new Insets(0, 0, 5, 5);
    gbc_tf_eqlb_p.gridx = 3;
    gbc_tf_eqlb_p.gridy = 2;
    panelPartido2.add(tf_eqlb_p, gbc_tf_eqlb_p);
    
    tf_eqlb_ls = new JTextField();
    tf_eqlb_ls.setColumns(3);
    GridBagConstraints gbc_tf_eqlb_ls = new GridBagConstraints();
    gbc_tf_eqlb_ls.anchor = GridBagConstraints.NORTHWEST;
    gbc_tf_eqlb_ls.insets = new Insets(0, 0, 5, 0);
    gbc_tf_eqlb_ls.gridx = 5;
    gbc_tf_eqlb_ls.gridy = 2;
    panelPartido2.add(tf_eqlb_ls, gbc_tf_eqlb_ls);
    
    lblVisitanteB = new JLabel("Visitante");
    lblVisitanteB.setFont(new Font("Arial", Font.PLAIN, 11));
    lblVisitanteB.setHorizontalAlignment(SwingConstants.RIGHT);
    GridBagConstraints gbc_lblVisitanteB = new GridBagConstraints();
    gbc_lblVisitanteB.anchor = GridBagConstraints.WEST;
    gbc_lblVisitanteB.insets = new Insets(0, 0, 0, 5);
    gbc_lblVisitanteB.gridx = 1;
    gbc_lblVisitanteB.gridy = 3;
    panelPartido2.add(lblVisitanteB, gbc_lblVisitanteB);
    
    lblEquipoVisitanteB = new JLabel("Sayre Mayser");
    lblEquipoVisitanteB.setHorizontalAlignment(SwingConstants.RIGHT);
    lblEquipoVisitanteB.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblEquipoVisitanteB = new GridBagConstraints();
    gbc_lblEquipoVisitanteB.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblEquipoVisitanteB.insets = new Insets(0, 0, 0, 5);
    gbc_lblEquipoVisitanteB.gridx = 2;
    gbc_lblEquipoVisitanteB.gridy = 3;
    panelPartido2.add(lblEquipoVisitanteB, gbc_lblEquipoVisitanteB);
    
    tf_eqvb_p = new JTextField();
    tf_eqvb_p.setColumns(3);
    GridBagConstraints gbc_tf_eqvb_p = new GridBagConstraints();
    gbc_tf_eqvb_p.anchor = GridBagConstraints.NORTHEAST;
    gbc_tf_eqvb_p.insets = new Insets(0, 0, 0, 5);
    gbc_tf_eqvb_p.gridx = 3;
    gbc_tf_eqvb_p.gridy = 3;
    panelPartido2.add(tf_eqvb_p, gbc_tf_eqvb_p);
    
    tf_eqvb_ls = new JTextField();
    tf_eqvb_ls.setColumns(3);
    GridBagConstraints gbc_tf_eqvb_ls = new GridBagConstraints();
    gbc_tf_eqvb_ls.anchor = GridBagConstraints.NORTHWEST;
    gbc_tf_eqvb_ls.gridx = 5;
    gbc_tf_eqvb_ls.gridy = 3;
    panelPartido2.add(tf_eqvb_ls, gbc_tf_eqvb_ls);

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
    gbl_panelPartido3.columnWidths = new int[]{54, 43, 108, 40, 25, 52, 0};
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
    
    lblEquipoLocalC = new JLabel("Avila Voleibol");
    lblEquipoLocalC.setHorizontalAlignment(SwingConstants.RIGHT);
    lblEquipoLocalC.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblEquipoLocalC = new GridBagConstraints();
    gbc_lblEquipoLocalC.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblEquipoLocalC.insets = new Insets(0, 0, 5, 5);
    gbc_lblEquipoLocalC.gridx = 2;
    gbc_lblEquipoLocalC.gridy = 2;
    panelPartido3.add(lblEquipoLocalC, gbc_lblEquipoLocalC);
    
    tf_eqlc_p = new JTextField();
    tf_eqlc_p.setColumns(3);
    GridBagConstraints gbc_tf_eqlc_p = new GridBagConstraints();
    gbc_tf_eqlc_p.anchor = GridBagConstraints.NORTHEAST;
    gbc_tf_eqlc_p.insets = new Insets(0, 0, 5, 5);
    gbc_tf_eqlc_p.gridx = 3;
    gbc_tf_eqlc_p.gridy = 2;
    panelPartido3.add(tf_eqlc_p, gbc_tf_eqlc_p);
    
    tf_eqlc_c = new JTextField();
    tf_eqlc_c.setColumns(3);
    GridBagConstraints gbc_tf_eqlc_c = new GridBagConstraints();
    gbc_tf_eqlc_c.anchor = GridBagConstraints.NORTHWEST;
    gbc_tf_eqlc_c.insets = new Insets(0, 0, 5, 0);
    gbc_tf_eqlc_c.gridx = 5;
    gbc_tf_eqlc_c.gridy = 2;
    panelPartido3.add(tf_eqlc_c, gbc_tf_eqlc_c);
    
    lblVisitanteB_2 = new JLabel("Visitante");
    lblVisitanteB_2.setHorizontalAlignment(SwingConstants.RIGHT);
    lblVisitanteB_2.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblVisitanteB_2 = new GridBagConstraints();
    gbc_lblVisitanteB_2.anchor = GridBagConstraints.WEST;
    gbc_lblVisitanteB_2.insets = new Insets(0, 0, 0, 5);
    gbc_lblVisitanteB_2.gridx = 1;
    gbc_lblVisitanteB_2.gridy = 3;
    panelPartido3.add(lblVisitanteB_2, gbc_lblVisitanteB_2);
    
    lblEquipoVisitanteC = new JLabel("Sayre Mayser");
    lblEquipoVisitanteC.setHorizontalAlignment(SwingConstants.RIGHT);
    lblEquipoVisitanteC.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblEquipoVisitanteC = new GridBagConstraints();
    gbc_lblEquipoVisitanteC.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblEquipoVisitanteC.insets = new Insets(0, 0, 0, 5);
    gbc_lblEquipoVisitanteC.gridx = 2;
    gbc_lblEquipoVisitanteC.gridy = 3;
    panelPartido3.add(lblEquipoVisitanteC, gbc_lblEquipoVisitanteC);
    
    tf_eqvc_p = new JTextField();
    tf_eqvc_p.setColumns(3);
    GridBagConstraints gbc_tf_eqvc_p = new GridBagConstraints();
    gbc_tf_eqvc_p.fill = GridBagConstraints.HORIZONTAL;
    gbc_tf_eqvc_p.anchor = GridBagConstraints.NORTH;
    gbc_tf_eqvc_p.insets = new Insets(0, 0, 0, 5);
    gbc_tf_eqvc_p.gridx = 3;
    gbc_tf_eqvc_p.gridy = 3;
    panelPartido3.add(tf_eqvc_p, gbc_tf_eqvc_p);
    
    tf_eqvc_ls = new JTextField();
    tf_eqvc_ls.setColumns(3);
    GridBagConstraints gbc_tf_eqvc_ls = new GridBagConstraints();
    gbc_tf_eqvc_ls.anchor = GridBagConstraints.NORTHWEST;
    gbc_tf_eqvc_ls.gridx = 5;
    gbc_tf_eqvc_ls.gridy = 3;
    panelPartido3.add(tf_eqvc_ls, gbc_tf_eqvc_ls);

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

    scrollPane = new JScrollPane();
    PantallaClasificacion.add(scrollPane, BorderLayout.CENTER);

    tablaClasificacion = new JTable();
    tablaClasificacion.setModel(new DefaultTableModel(
    		new Object[][] {
    		    {1, "CD Avila Voleibol", 10, 6, 4, 15, 3, 18},
    		    {2, "CD Zaragoza", 10, 5, 5, 12, 5, 15},
    		    {3, "CV Alcobendas", 10, 4, 6, 9, 9, 12},
    		    {4, "CV Bar\u00E7a", 10, 3, 7, 6,12 , 9},
    		    {5, "CV Madrid Chamber\u00ED", 10, 2, 8, 4, 15, 6},
    		    {6, "CV Sayre Mayser", 10, 1, 9, 3, 21, 3},
    		},
    		new String[] {
    			"POSICI\u00D3N", "EQUIPO", "PJ", "PG", "PP", "SETFF", "SETFC", "PTS"
    		}
    		));
    		tablaClasificacion.setDefaultRenderer(Object.class, renderer);
    		//Para que al iniciar la ventana no se pueda cambiar de posiciones los titulos de la cabecera
    		tablaClasificacion.getTableHeader().setReorderingAllowed(false);
    		//Para que al iniciar la ventana no se pueda acortar o alargar una columna
    		tablaClasificacion.getTableHeader().setResizingAllowed(false);
    		

    scrollPane.setViewportView(tablaClasificacion);

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
  }
  
  class Jornada {
	    private String nombre;
	    private List<Partido> partidos;

	    public Jornada(String nombre, List<Partido> partidos) {
	        this.nombre = nombre;
	        this.partidos = partidos;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public List<Partido> getPartidos() {
	        return partidos;
	    }
	}

	class Partido {
	    private String equipoLocal;
	    private String equipoVisitante;

	    public Partido(String equipoLocal, String equipoVisitante) {
	        this.equipoLocal = equipoLocal;
	        this.equipoVisitante = equipoVisitante;
	    }

	    public String getEquipoLocal() {
	        return equipoLocal;
	    }

	    public String getEquipoVisitante() {
	        return equipoVisitante;
	    }
	    
	    private void actualizarJornada() {
	        lblTituloNumeroJornada.setText(jornadas.get(jornadaActual).getNombre());
	        Jornada jornada = jornadas.get(jornadaActual);
	        
	        // Aquí debes actualizar la UI para mostrar los partidos de la jornada
	        // Por ejemplo, actualizar los labels y text fields para los partidos
	        List<Partido> partidos = jornada.getPartidos();
	        // Suponiendo que tienes métodos para actualizar los labels y text fields
	        actualizarPartido(panelPartido1, partidos.get(0));
	        actualizarPartido(panelPartido2, partidos.get(1));
	        actualizarPartido(panelPartido3, partidos.get(2));
	    }

	    private void actualizarPartido(JPanel panel, Partido partido) {
	        // Actualiza los labels y text fields en el panel correspondiente
	        // Ejemplo:
	        lblEquipoLocalA.setText(partido.getEquipoLocal());
	        lblEquipoVisitanteA.setText(partido.getEquipoVisitante());
	        // Y así sucesivamente para los otros partidos
	    }
	}
  
  
}