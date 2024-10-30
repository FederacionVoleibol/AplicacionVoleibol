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
  private JTextField textField_20;
  private JTextField textField_21;
  private JTextField textField_25;
  private JTextField textField_26;
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
  private JTextField textField;
  private JTextField textField_1;
  private JLabel lblVisitanteB_1;
  private JLabel lblEquipoVisitanteA;
  private JTextField textField_2;
  private JTextField textField_3;
  private JPanel panelPartido3;
  private JLabel lblPartido2B_2;
  private JLabel lblEquipoB_2;
  private JLabel lblTotalPuntosSetsB_2;
  private JLabel lblPuntajeUltimoSetB_2;
  private JLabel lblLocalB_2;
  private JLabel lblEquipoLocalC;
  private JTextField textField_4;
  private JTextField textField_5;
  private JLabel lblVisitanteB_2;
  private JLabel lblEquipoVisitanteC;
  private JTextField textField_6;
  private JTextField textField_7;
  
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
    gbl_panelPartido1.columnWidths = new int[]{54, 50, 70, 33, 70, 0};
    gbl_panelPartido1.rowHeights = new int[]{13, 13, 19, 19, 0};
    gbl_panelPartido1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    gbl_panelPartido1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    panelPartido1.setLayout(gbl_panelPartido1);
    
    lblPartido1A = new JLabel("Partido 1");
    lblPartido1A.setHorizontalAlignment(SwingConstants.CENTER);
    GridBagConstraints gbc_lblPartido1A = new GridBagConstraints();
    gbc_lblPartido1A.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblPartido1A.anchor = GridBagConstraints.NORTH;
    gbc_lblPartido1A.gridwidth = 3;
    gbc_lblPartido1A.insets = new Insets(0, 0, 5, 0);
    gbc_lblPartido1A.gridx = 2;
    gbc_lblPartido1A.gridy = 0;
    panelPartido1.add(lblPartido1A, gbc_lblPartido1A);
    
    lblEquipoB_1 = new JLabel("Equipo");
    GridBagConstraints gbc_lblEquipoB_1 = new GridBagConstraints();
    gbc_lblEquipoB_1.anchor = GridBagConstraints.NORTH;
    gbc_lblEquipoB_1.insets = new Insets(0, 0, 5, 5);
    gbc_lblEquipoB_1.gridx = 2;
    gbc_lblEquipoB_1.gridy = 1;
    panelPartido1.add(lblEquipoB_1, gbc_lblEquipoB_1);
    
    lblTotalPuntosSetsB_1 = new JLabel("Set's");
    GridBagConstraints gbc_lblTotalPuntosSetsB_1 = new GridBagConstraints();
    gbc_lblTotalPuntosSetsB_1.anchor = GridBagConstraints.NORTH;
    gbc_lblTotalPuntosSetsB_1.insets = new Insets(0, 0, 5, 5);
    gbc_lblTotalPuntosSetsB_1.gridx = 3;
    gbc_lblTotalPuntosSetsB_1.gridy = 1;
    panelPartido1.add(lblTotalPuntosSetsB_1, gbc_lblTotalPuntosSetsB_1);
    
    lblPuntajeUltimoSetB_1 = new JLabel("Ultimo Set");
    GridBagConstraints gbc_lblPuntajeUltimoSetB_1 = new GridBagConstraints();
    gbc_lblPuntajeUltimoSetB_1.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblPuntajeUltimoSetB_1.anchor = GridBagConstraints.NORTH;
    gbc_lblPuntajeUltimoSetB_1.insets = new Insets(0, 0, 5, 0);
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
    lblEquipoLocalA.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblEquipoLocalA = new GridBagConstraints();
    gbc_lblEquipoLocalA.anchor = GridBagConstraints.EAST;
    gbc_lblEquipoLocalA.insets = new Insets(0, 0, 5, 5);
    gbc_lblEquipoLocalA.gridx = 2;
    gbc_lblEquipoLocalA.gridy = 2;
    panelPartido1.add(lblEquipoLocalA, gbc_lblEquipoLocalA);
    
    textField = new JTextField();
    textField.setColumns(3);
    GridBagConstraints gbc_textField = new GridBagConstraints();
    gbc_textField.anchor = GridBagConstraints.NORTHWEST;
    gbc_textField.insets = new Insets(0, 0, 5, 5);
    gbc_textField.gridx = 3;
    gbc_textField.gridy = 2;
    panelPartido1.add(textField, gbc_textField);
    
    textField_1 = new JTextField();
    textField_1.setColumns(3);
    GridBagConstraints gbc_textField_1 = new GridBagConstraints();
    gbc_textField_1.anchor = GridBagConstraints.NORTH;
    gbc_textField_1.insets = new Insets(0, 0, 5, 0);
    gbc_textField_1.gridx = 4;
    gbc_textField_1.gridy = 2;
    panelPartido1.add(textField_1, gbc_textField_1);
    
    lblVisitanteB_1 = new JLabel("Visitante");
    lblVisitanteB_1.setHorizontalAlignment(SwingConstants.RIGHT);
    lblVisitanteB_1.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblVisitanteB_1 = new GridBagConstraints();
    gbc_lblVisitanteB_1.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblVisitanteB_1.insets = new Insets(0, 0, 0, 5);
    gbc_lblVisitanteB_1.gridx = 1;
    gbc_lblVisitanteB_1.gridy = 3;
    panelPartido1.add(lblVisitanteB_1, gbc_lblVisitanteB_1);
    
    lblEquipoVisitanteA = new JLabel("Sayre Mayser");
    lblEquipoVisitanteA.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblEquipoVisitanteA = new GridBagConstraints();
    gbc_lblEquipoVisitanteA.anchor = GridBagConstraints.WEST;
    gbc_lblEquipoVisitanteA.insets = new Insets(0, 0, 0, 5);
    gbc_lblEquipoVisitanteA.gridx = 2;
    gbc_lblEquipoVisitanteA.gridy = 3;
    panelPartido1.add(lblEquipoVisitanteA, gbc_lblEquipoVisitanteA);
    
    textField_2 = new JTextField();
    textField_2.setColumns(3);
    GridBagConstraints gbc_textField_2 = new GridBagConstraints();
    gbc_textField_2.anchor = GridBagConstraints.NORTHWEST;
    gbc_textField_2.insets = new Insets(0, 0, 0, 5);
    gbc_textField_2.gridx = 3;
    gbc_textField_2.gridy = 3;
    panelPartido1.add(textField_2, gbc_textField_2);
    
    textField_3 = new JTextField();
    textField_3.setColumns(3);
    GridBagConstraints gbc_textField_3 = new GridBagConstraints();
    gbc_textField_3.anchor = GridBagConstraints.NORTH;
    gbc_textField_3.gridx = 4;
    gbc_textField_3.gridy = 3;
    panelPartido1.add(textField_3, gbc_textField_3);

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
    gbl_panelPartido2.columnWidths = new int[]{54, 50, 70, 33, 70, 0};
    gbl_panelPartido2.rowHeights = new int[]{13, 13, 19, 19, 0};
    gbl_panelPartido2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    gbl_panelPartido2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    panelPartido2.setLayout(gbl_panelPartido2);
    
    lblPartido2B = new JLabel("Partido 2");
    lblPartido2B.setHorizontalAlignment(SwingConstants.CENTER);
    GridBagConstraints gbc_lblPartido2B = new GridBagConstraints();
    gbc_lblPartido2B.anchor = GridBagConstraints.NORTH;
    gbc_lblPartido2B.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblPartido2B.insets = new Insets(0, 0, 5, 0);
    gbc_lblPartido2B.gridwidth = 3;
    gbc_lblPartido2B.gridx = 2;
    gbc_lblPartido2B.gridy = 0;
    panelPartido2.add(lblPartido2B, gbc_lblPartido2B);
    
    lblEquipoB = new JLabel("Equipo");
    GridBagConstraints gbc_lblEquipoB = new GridBagConstraints();
    gbc_lblEquipoB.anchor = GridBagConstraints.NORTH;
    gbc_lblEquipoB.insets = new Insets(0, 0, 5, 5);
    gbc_lblEquipoB.gridx = 2;
    gbc_lblEquipoB.gridy = 1;
    panelPartido2.add(lblEquipoB, gbc_lblEquipoB);
    
    lblTotalPuntosSetsB = new JLabel("Set's");
    GridBagConstraints gbc_lblTotalPuntosSetsB = new GridBagConstraints();
    gbc_lblTotalPuntosSetsB.anchor = GridBagConstraints.NORTH;
    gbc_lblTotalPuntosSetsB.insets = new Insets(0, 0, 5, 5);
    gbc_lblTotalPuntosSetsB.gridx = 3;
    gbc_lblTotalPuntosSetsB.gridy = 1;
    panelPartido2.add(lblTotalPuntosSetsB, gbc_lblTotalPuntosSetsB);
    
    lblPuntajeUltimoSetB = new JLabel("Ultimo Set");
    GridBagConstraints gbc_lblPuntajeUltimoSetB = new GridBagConstraints();
    gbc_lblPuntajeUltimoSetB.anchor = GridBagConstraints.NORTH;
    gbc_lblPuntajeUltimoSetB.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblPuntajeUltimoSetB.insets = new Insets(0, 0, 5, 0);
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
    lblEquipoLocalB.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblEquipoLocalB = new GridBagConstraints();
    gbc_lblEquipoLocalB.anchor = GridBagConstraints.EAST;
    gbc_lblEquipoLocalB.insets = new Insets(0, 0, 5, 5);
    gbc_lblEquipoLocalB.gridx = 2;
    gbc_lblEquipoLocalB.gridy = 2;
    panelPartido2.add(lblEquipoLocalB, gbc_lblEquipoLocalB);
    
    textField_20 = new JTextField();
    textField_20.setColumns(3);
    GridBagConstraints gbc_textField_20 = new GridBagConstraints();
    gbc_textField_20.anchor = GridBagConstraints.NORTHWEST;
    gbc_textField_20.insets = new Insets(0, 0, 5, 5);
    gbc_textField_20.gridx = 3;
    gbc_textField_20.gridy = 2;
    panelPartido2.add(textField_20, gbc_textField_20);
    
    textField_21 = new JTextField();
    textField_21.setColumns(3);
    GridBagConstraints gbc_textField_21 = new GridBagConstraints();
    gbc_textField_21.anchor = GridBagConstraints.NORTH;
    gbc_textField_21.insets = new Insets(0, 0, 5, 0);
    gbc_textField_21.gridx = 4;
    gbc_textField_21.gridy = 2;
    panelPartido2.add(textField_21, gbc_textField_21);
    
    lblVisitanteB = new JLabel("Visitante");
    lblVisitanteB.setFont(new Font("Arial", Font.PLAIN, 11));
    lblVisitanteB.setHorizontalAlignment(SwingConstants.RIGHT);
    GridBagConstraints gbc_lblVisitanteB = new GridBagConstraints();
    gbc_lblVisitanteB.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblVisitanteB.insets = new Insets(0, 0, 0, 5);
    gbc_lblVisitanteB.gridx = 1;
    gbc_lblVisitanteB.gridy = 3;
    panelPartido2.add(lblVisitanteB, gbc_lblVisitanteB);
    
    lblEquipoVisitanteB = new JLabel("Sayre Mayser");
    lblEquipoVisitanteB.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblEquipoVisitanteB = new GridBagConstraints();
    gbc_lblEquipoVisitanteB.anchor = GridBagConstraints.WEST;
    gbc_lblEquipoVisitanteB.insets = new Insets(0, 0, 0, 5);
    gbc_lblEquipoVisitanteB.gridx = 2;
    gbc_lblEquipoVisitanteB.gridy = 3;
    panelPartido2.add(lblEquipoVisitanteB, gbc_lblEquipoVisitanteB);
    
    textField_25 = new JTextField();
    textField_25.setColumns(3);
    GridBagConstraints gbc_textField_25 = new GridBagConstraints();
    gbc_textField_25.anchor = GridBagConstraints.NORTHWEST;
    gbc_textField_25.insets = new Insets(0, 0, 0, 5);
    gbc_textField_25.gridx = 3;
    gbc_textField_25.gridy = 3;
    panelPartido2.add(textField_25, gbc_textField_25);
    
    textField_26 = new JTextField();
    textField_26.setColumns(3);
    GridBagConstraints gbc_textField_26 = new GridBagConstraints();
    gbc_textField_26.anchor = GridBagConstraints.NORTH;
    gbc_textField_26.gridx = 4;
    gbc_textField_26.gridy = 3;
    panelPartido2.add(textField_26, gbc_textField_26);

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
    gbl_panelPartido3.columnWidths = new int[]{54, 50, 70, 33, 70, 0};
    gbl_panelPartido3.rowHeights = new int[]{13, 13, 19, 19, 0};
    gbl_panelPartido3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    gbl_panelPartido3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    panelPartido3.setLayout(gbl_panelPartido3);
    
    lblPartido2B_2 = new JLabel("Partido 3");
    lblPartido2B_2.setHorizontalAlignment(SwingConstants.CENTER);
    GridBagConstraints gbc_lblPartido2B_2 = new GridBagConstraints();
    gbc_lblPartido2B_2.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblPartido2B_2.anchor = GridBagConstraints.NORTH;
    gbc_lblPartido2B_2.gridwidth = 3;
    gbc_lblPartido2B_2.insets = new Insets(0, 0, 5, 0);
    gbc_lblPartido2B_2.gridx = 2;
    gbc_lblPartido2B_2.gridy = 0;
    panelPartido3.add(lblPartido2B_2, gbc_lblPartido2B_2);
    
    lblEquipoB_2 = new JLabel("Equipo");
    GridBagConstraints gbc_lblEquipoB_2 = new GridBagConstraints();
    gbc_lblEquipoB_2.anchor = GridBagConstraints.NORTH;
    gbc_lblEquipoB_2.insets = new Insets(0, 0, 5, 5);
    gbc_lblEquipoB_2.gridx = 2;
    gbc_lblEquipoB_2.gridy = 1;
    panelPartido3.add(lblEquipoB_2, gbc_lblEquipoB_2);
    
    lblTotalPuntosSetsB_2 = new JLabel("Set's");
    GridBagConstraints gbc_lblTotalPuntosSetsB_2 = new GridBagConstraints();
    gbc_lblTotalPuntosSetsB_2.anchor = GridBagConstraints.NORTH;
    gbc_lblTotalPuntosSetsB_2.insets = new Insets(0, 0, 5, 5);
    gbc_lblTotalPuntosSetsB_2.gridx = 3;
    gbc_lblTotalPuntosSetsB_2.gridy = 1;
    panelPartido3.add(lblTotalPuntosSetsB_2, gbc_lblTotalPuntosSetsB_2);
    
    lblPuntajeUltimoSetB_2 = new JLabel("Ultimo Set");
    GridBagConstraints gbc_lblPuntajeUltimoSetB_2 = new GridBagConstraints();
    gbc_lblPuntajeUltimoSetB_2.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblPuntajeUltimoSetB_2.anchor = GridBagConstraints.NORTH;
    gbc_lblPuntajeUltimoSetB_2.insets = new Insets(0, 0, 5, 0);
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
    lblEquipoLocalC.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblEquipoLocalC = new GridBagConstraints();
    gbc_lblEquipoLocalC.anchor = GridBagConstraints.EAST;
    gbc_lblEquipoLocalC.insets = new Insets(0, 0, 5, 5);
    gbc_lblEquipoLocalC.gridx = 2;
    gbc_lblEquipoLocalC.gridy = 2;
    panelPartido3.add(lblEquipoLocalC, gbc_lblEquipoLocalC);
    
    textField_4 = new JTextField();
    textField_4.setColumns(3);
    GridBagConstraints gbc_textField_4 = new GridBagConstraints();
    gbc_textField_4.anchor = GridBagConstraints.NORTHWEST;
    gbc_textField_4.insets = new Insets(0, 0, 5, 5);
    gbc_textField_4.gridx = 3;
    gbc_textField_4.gridy = 2;
    panelPartido3.add(textField_4, gbc_textField_4);
    
    textField_5 = new JTextField();
    textField_5.setColumns(3);
    GridBagConstraints gbc_textField_5 = new GridBagConstraints();
    gbc_textField_5.anchor = GridBagConstraints.NORTH;
    gbc_textField_5.insets = new Insets(0, 0, 5, 0);
    gbc_textField_5.gridx = 4;
    gbc_textField_5.gridy = 2;
    panelPartido3.add(textField_5, gbc_textField_5);
    
    lblVisitanteB_2 = new JLabel("Visitante");
    lblVisitanteB_2.setHorizontalAlignment(SwingConstants.RIGHT);
    lblVisitanteB_2.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblVisitanteB_2 = new GridBagConstraints();
    gbc_lblVisitanteB_2.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblVisitanteB_2.insets = new Insets(0, 0, 0, 5);
    gbc_lblVisitanteB_2.gridx = 1;
    gbc_lblVisitanteB_2.gridy = 3;
    panelPartido3.add(lblVisitanteB_2, gbc_lblVisitanteB_2);
    
    lblEquipoVisitanteC = new JLabel("Sayre Mayser");
    lblEquipoVisitanteC.setFont(new Font("Arial", Font.PLAIN, 11));
    GridBagConstraints gbc_lblEquipoVisitanteC = new GridBagConstraints();
    gbc_lblEquipoVisitanteC.anchor = GridBagConstraints.WEST;
    gbc_lblEquipoVisitanteC.insets = new Insets(0, 0, 0, 5);
    gbc_lblEquipoVisitanteC.gridx = 2;
    gbc_lblEquipoVisitanteC.gridy = 3;
    panelPartido3.add(lblEquipoVisitanteC, gbc_lblEquipoVisitanteC);
    
    textField_6 = new JTextField();
    textField_6.setColumns(3);
    GridBagConstraints gbc_textField_6 = new GridBagConstraints();
    gbc_textField_6.anchor = GridBagConstraints.NORTHWEST;
    gbc_textField_6.insets = new Insets(0, 0, 0, 5);
    gbc_textField_6.gridx = 3;
    gbc_textField_6.gridy = 3;
    panelPartido3.add(textField_6, gbc_textField_6);
    
    textField_7 = new JTextField();
    textField_7.setColumns(3);
    GridBagConstraints gbc_textField_7 = new GridBagConstraints();
    gbc_textField_7.anchor = GridBagConstraints.NORTH;
    gbc_textField_7.gridx = 4;
    gbc_textField_7.gridy = 3;
    panelPartido3.add(textField_7, gbc_textField_7);

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