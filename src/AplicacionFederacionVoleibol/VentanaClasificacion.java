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

public class VentanaClasificacion extends JFrame {

  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  private JTable tablaClasificacion;
  private JTextField textField_10;
  private JTextField textField_11;
  private JTextField textField_13;
  private JTextField textField_17;
  private JTextField textField_18;
  private JTextField textField_19;
  private JTextField textField_12;
  private JTextField textField_14;
  private JTextField textField_15;
  private JTextField textField_16;
  private JTextField textField_20;
  private JTextField textField_21;
  private JTextField textField_22;
  private JTextField textField_23;
  private JTextField textField_24;
  private JTextField textField_25;
  private JTextField textField_26;
  private JTextField textField_27;
  private JTextField textField_28;
  private JTextField textField_29;
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
    setSize(800, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Centrar la ventana en la pantalla
    setLocationRelativeTo(null);
    // Establecemos que la ventana no se pueda redimensionar
    //setResizable(false);

    //TITULO DE LA VENTANA
    setTitle("Titulo");
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);

    // Centramos los textos en la tabla
    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
    renderer.setHorizontalAlignment(SwingConstants.CENTER);
    contentPane.setLayout(new GridLayout(0, 2, 0, 0));

    JPanel PantallaJornadas = new JPanel();
    contentPane.add(PantallaJornadas);
    PantallaJornadas.setLayout(new BorderLayout(0, 0));

    JPanel panel_3 = new JPanel();
    PantallaJornadas.add(panel_3, BorderLayout.NORTH);

    JButton btnNewButton_1 = new JButton("Siguiente");
    btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);

    JLabel lblNewLabel_1 = new JLabel("JORNADA 1");
    lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
    panel_3.setLayout(new BorderLayout(0, 0));

    JButton btnNewButton_2 = new JButton("Anterior");
    btnNewButton_2.setHorizontalAlignment(SwingConstants.RIGHT);
    panel_3.add(btnNewButton_2, BorderLayout.WEST);
    panel_3.add(lblNewLabel_1, BorderLayout.CENTER);
    panel_3.add(btnNewButton_1, BorderLayout.EAST);

    JPanel panel_4 = new JPanel();
    PantallaJornadas.add(panel_4, BorderLayout.SOUTH);

    JButton btnNewButton_3 = new JButton("Guardar Datos");
    panel_4.add(btnNewButton_3);

    JPanel panel_5 = new JPanel();
    PantallaJornadas.add(panel_5, BorderLayout.CENTER);
    panel_5.setLayout(new GridLayout(3, 0, 0, 0));

    JPanel panel_2 = new JPanel();
    panel_5.add(panel_2);
    panel_2.setLayout(new BorderLayout(0, 0));

    JLabel lblNewLabel_3 = new JLabel("New label");
    panel_2.add(lblNewLabel_3, BorderLayout.EAST);

    JPanel panel_8 = new JPanel();
    panel_2.add(panel_8, BorderLayout.CENTER);
    panel_8.setLayout(null);
    
    JLabel lblNewLabel_2_2 = new JLabel("Equipo");
    lblNewLabel_2_2.setBounds(72, 28, 30, 13);
    panel_8.add(lblNewLabel_2_2);
    
    JLabel lblNewLabel_6_4 = new JLabel("Set1");
    lblNewLabel_6_4.setBounds(151, 28, 21, 13);
    panel_8.add(lblNewLabel_6_4);
    
    JLabel lblNewLabel_6_1_3 = new JLabel("Set2");
    lblNewLabel_6_1_3.setBounds(189, 28, 21, 13);
    panel_8.add(lblNewLabel_6_1_3);
    
    JLabel lblNewLabel_6_2_2 = new JLabel("Set3");
    lblNewLabel_6_2_2.setBounds(233, 28, 21, 13);
    panel_8.add(lblNewLabel_6_2_2);
    
    JLabel lblNewLabel_6_1_1_3 = new JLabel("Set4");
    lblNewLabel_6_1_1_3.setBounds(265, 28, 21, 13);
    panel_8.add(lblNewLabel_6_1_1_3);
    
    JLabel lblNewLabel_6_1_1_1_2 = new JLabel("Set5");
    lblNewLabel_6_1_1_1_2.setBounds(309, 28, 21, 13);
    panel_8.add(lblNewLabel_6_1_1_1_2);
    
    JComboBox comboBox_2_4 = new JComboBox();
    comboBox_2_4.setBounds(35, 46, 105, 21);
    panel_8.add(comboBox_2_4);
    
    textField = new JTextField();
    textField.setColumns(3);
    textField.setBounds(145, 47, 33, 19);
    panel_8.add(textField);
    
    textField_1 = new JTextField();
    textField_1.setColumns(3);
    textField_1.setBounds(183, 47, 33, 19);
    panel_8.add(textField_1);
    
    textField_2 = new JTextField();
    textField_2.setColumns(3);
    textField_2.setBounds(221, 47, 33, 19);
    panel_8.add(textField_2);
    
    textField_3 = new JTextField();
    textField_3.setColumns(3);
    textField_3.setBounds(259, 47, 33, 19);
    panel_8.add(textField_3);
    
    textField_4 = new JTextField();
    textField_4.setColumns(3);
    textField_4.setBounds(297, 47, 33, 19);
    panel_8.add(textField_4);
    
    JComboBox comboBox_2_1_1 = new JComboBox();
    comboBox_2_1_1.setBounds(35, 72, 105, 21);
    panel_8.add(comboBox_2_1_1);
    
    textField_5 = new JTextField();
    textField_5.setColumns(3);
    textField_5.setBounds(145, 74, 33, 19);
    panel_8.add(textField_5);
    
    textField_6 = new JTextField();
    textField_6.setColumns(3);
    textField_6.setBounds(183, 74, 33, 19);
    panel_8.add(textField_6);
    
    textField_7 = new JTextField();
    textField_7.setColumns(3);
    textField_7.setBounds(221, 74, 33, 19);
    panel_8.add(textField_7);
    
    textField_8 = new JTextField();
    textField_8.setColumns(3);
    textField_8.setBounds(259, 74, 33, 19);
    panel_8.add(textField_8);
    
    textField_9 = new JTextField();
    textField_9.setColumns(3);
    textField_9.setBounds(297, 74, 33, 19);
    panel_8.add(textField_9);

    JLabel lblNewLabel_4 = new JLabel("New label");
    panel_2.add(lblNewLabel_4, BorderLayout.NORTH);

    JLabel lblNewLabel_5 = new JLabel("New label");
    panel_2.add(lblNewLabel_5, BorderLayout.SOUTH);
    
    JLabel lblNewLabel_7 = new JLabel("New label");
    panel_2.add(lblNewLabel_7, BorderLayout.WEST);

    JPanel panel_6 = new JPanel();
    panel_5.add(panel_6);
    panel_6.setLayout(new BorderLayout(0, 0));
    
    JLabel lblNewLabel_9 = new JLabel("New label");
    panel_6.add(lblNewLabel_9, BorderLayout.NORTH);
    
    JLabel lblNewLabel_10 = new JLabel("New label");
    panel_6.add(lblNewLabel_10, BorderLayout.SOUTH);
    
    JPanel panel_9 = new JPanel();
    panel_6.add(panel_9, BorderLayout.CENTER);
    panel_9.setLayout(new GridLayout(3, 0, 0, 0));
    
    JPanel panel_11 = new JPanel();
    panel_9.add(panel_11);
    panel_11.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
    
    JLabel lblNewLabel_2_1 = new JLabel("Equipo");
    panel_11.add(lblNewLabel_2_1);
    
    JLabel lblNewLabel_6_3 = new JLabel("Set1");
    panel_11.add(lblNewLabel_6_3);
    
    JLabel lblNewLabel_6_1_2 = new JLabel("Set2");
    panel_11.add(lblNewLabel_6_1_2);
    
    JLabel lblNewLabel_6_2_1 = new JLabel("Set3");
    panel_11.add(lblNewLabel_6_2_1);
    
    JLabel lblNewLabel_6_1_1_2 = new JLabel("Set4");
    panel_11.add(lblNewLabel_6_1_1_2);
    
    JLabel lblNewLabel_6_1_1_1_1 = new JLabel("Set5");
    panel_11.add(lblNewLabel_6_1_1_1_1);
    
    JPanel panel_12 = new JPanel();
    panel_9.add(panel_12);
    panel_12.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
    
    JComboBox comboBox_2_2 = new JComboBox();
    panel_12.add(comboBox_2_2);
    
    textField_20 = new JTextField();
    textField_20.setColumns(3);
    panel_12.add(textField_20);
    
    textField_21 = new JTextField();
    textField_21.setColumns(3);
    panel_12.add(textField_21);
    
    textField_22 = new JTextField();
    textField_22.setColumns(3);
    panel_12.add(textField_22);
    
    textField_23 = new JTextField();
    textField_23.setColumns(3);
    panel_12.add(textField_23);
    
    textField_24 = new JTextField();
    textField_24.setColumns(3);
    panel_12.add(textField_24);
    
    JPanel panel_13 = new JPanel();
    panel_9.add(panel_13);
    
    JComboBox comboBox_2_3 = new JComboBox();
    panel_13.add(comboBox_2_3);
    
    textField_25 = new JTextField();
    textField_25.setColumns(3);
    panel_13.add(textField_25);
    
    textField_26 = new JTextField();
    textField_26.setColumns(3);
    panel_13.add(textField_26);
    
    textField_27 = new JTextField();
    textField_27.setColumns(3);
    panel_13.add(textField_27);
    
    textField_28 = new JTextField();
    textField_28.setColumns(3);
    panel_13.add(textField_28);
    
    textField_29 = new JTextField();
    textField_29.setColumns(3);
    panel_13.add(textField_29);

    JPanel panel_7 = new JPanel();
    panel_5.add(panel_7);
    GridBagLayout gbl_panel_7 = new GridBagLayout();
    gbl_panel_7.columnWidths = new int[] {40, 80, 33, 33, 33, 33, 33, 0};
    gbl_panel_7.rowHeights = new int[]{41, 13, 21, 21, 0};
    gbl_panel_7.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    gbl_panel_7.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    panel_7.setLayout(gbl_panel_7);
    
    JLabel lblNewLabel_2 = new JLabel("Equipo");
    GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
    gbc_lblNewLabel_2.anchor = GridBagConstraints.NORTH;
    gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
    gbc_lblNewLabel_2.gridx = 1;
    gbc_lblNewLabel_2.gridy = 1;
    panel_7.add(lblNewLabel_2, gbc_lblNewLabel_2);
    
    JLabel lblNewLabel_6 = new JLabel("Set1");
    GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
    gbc_lblNewLabel_6.anchor = GridBagConstraints.NORTH;
    gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
    gbc_lblNewLabel_6.gridx = 2;
    gbc_lblNewLabel_6.gridy = 1;
    panel_7.add(lblNewLabel_6, gbc_lblNewLabel_6);
    
    JLabel lblNewLabel_6_1 = new JLabel("Set2");
    GridBagConstraints gbc_lblNewLabel_6_1 = new GridBagConstraints();
    gbc_lblNewLabel_6_1.anchor = GridBagConstraints.NORTH;
    gbc_lblNewLabel_6_1.insets = new Insets(0, 0, 5, 5);
    gbc_lblNewLabel_6_1.gridx = 3;
    gbc_lblNewLabel_6_1.gridy = 1;
    panel_7.add(lblNewLabel_6_1, gbc_lblNewLabel_6_1);
    
    JLabel lblNewLabel_6_2 = new JLabel("Set3");
    GridBagConstraints gbc_lblNewLabel_6_2 = new GridBagConstraints();
    gbc_lblNewLabel_6_2.anchor = GridBagConstraints.NORTHEAST;
    gbc_lblNewLabel_6_2.insets = new Insets(0, 0, 5, 5);
    gbc_lblNewLabel_6_2.gridx = 4;
    gbc_lblNewLabel_6_2.gridy = 1;
    panel_7.add(lblNewLabel_6_2, gbc_lblNewLabel_6_2);
    
    JLabel lblNewLabel_6_1_1 = new JLabel("Set4");
    GridBagConstraints gbc_lblNewLabel_6_1_1 = new GridBagConstraints();
    gbc_lblNewLabel_6_1_1.anchor = GridBagConstraints.NORTH;
    gbc_lblNewLabel_6_1_1.insets = new Insets(0, 0, 5, 5);
    gbc_lblNewLabel_6_1_1.gridx = 5;
    gbc_lblNewLabel_6_1_1.gridy = 1;
    panel_7.add(lblNewLabel_6_1_1, gbc_lblNewLabel_6_1_1);
    
    JLabel lblNewLabel_6_1_1_1 = new JLabel("Set5");
    GridBagConstraints gbc_lblNewLabel_6_1_1_1 = new GridBagConstraints();
    gbc_lblNewLabel_6_1_1_1.anchor = GridBagConstraints.NORTHEAST;
    gbc_lblNewLabel_6_1_1_1.insets = new Insets(0, 0, 5, 0);
    gbc_lblNewLabel_6_1_1_1.gridx = 6;
    gbc_lblNewLabel_6_1_1_1.gridy = 1;
    panel_7.add(lblNewLabel_6_1_1_1, gbc_lblNewLabel_6_1_1_1);
    
    JComboBox comboBox_2 = new JComboBox();
    GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
    gbc_comboBox_2.anchor = GridBagConstraints.NORTH;
    gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
    gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
    gbc_comboBox_2.gridx = 1;
    gbc_comboBox_2.gridy = 2;
    panel_7.add(comboBox_2, gbc_comboBox_2);
    
    textField_10 = new JTextField();
    GridBagConstraints gbc_textField_10 = new GridBagConstraints();
    gbc_textField_10.anchor = GridBagConstraints.WEST;
    gbc_textField_10.insets = new Insets(0, 0, 5, 5);
    gbc_textField_10.gridx = 2;
    gbc_textField_10.gridy = 2;
    panel_7.add(textField_10, gbc_textField_10);
    textField_10.setColumns(3);
    
    textField_11 = new JTextField();
    GridBagConstraints gbc_textField_11 = new GridBagConstraints();
    gbc_textField_11.anchor = GridBagConstraints.WEST;
    gbc_textField_11.insets = new Insets(0, 0, 5, 5);
    gbc_textField_11.gridx = 3;
    gbc_textField_11.gridy = 2;
    panel_7.add(textField_11, gbc_textField_11);
    textField_11.setColumns(3);
    
    textField_13 = new JTextField();
    GridBagConstraints gbc_textField_13 = new GridBagConstraints();
    gbc_textField_13.anchor = GridBagConstraints.WEST;
    gbc_textField_13.insets = new Insets(0, 0, 5, 5);
    gbc_textField_13.gridx = 4;
    gbc_textField_13.gridy = 2;
    panel_7.add(textField_13, gbc_textField_13);
    textField_13.setColumns(3);
    
    textField_12 = new JTextField();
    GridBagConstraints gbc_textField_12 = new GridBagConstraints();
    gbc_textField_12.anchor = GridBagConstraints.WEST;
    gbc_textField_12.insets = new Insets(0, 0, 5, 5);
    gbc_textField_12.gridx = 5;
    gbc_textField_12.gridy = 2;
    panel_7.add(textField_12, gbc_textField_12);
    textField_12.setColumns(3);
    
    textField_14 = new JTextField();
    GridBagConstraints gbc_textField_14 = new GridBagConstraints();
    gbc_textField_14.anchor = GridBagConstraints.WEST;
    gbc_textField_14.insets = new Insets(0, 0, 5, 0);
    gbc_textField_14.gridx = 6;
    gbc_textField_14.gridy = 2;
    panel_7.add(textField_14, gbc_textField_14);
    textField_14.setColumns(3);
    
    JComboBox comboBox_2_1 = new JComboBox();
    GridBagConstraints gbc_comboBox_2_1 = new GridBagConstraints();
    gbc_comboBox_2_1.anchor = GridBagConstraints.NORTH;
    gbc_comboBox_2_1.fill = GridBagConstraints.HORIZONTAL;
    gbc_comboBox_2_1.insets = new Insets(0, 0, 0, 5);
    gbc_comboBox_2_1.gridx = 1;
    gbc_comboBox_2_1.gridy = 3;
    panel_7.add(comboBox_2_1, gbc_comboBox_2_1);
    
    textField_19 = new JTextField();
    GridBagConstraints gbc_textField_19 = new GridBagConstraints();
    gbc_textField_19.anchor = GridBagConstraints.SOUTHWEST;
    gbc_textField_19.insets = new Insets(0, 0, 0, 5);
    gbc_textField_19.gridx = 2;
    gbc_textField_19.gridy = 3;
    panel_7.add(textField_19, gbc_textField_19);
    textField_19.setColumns(3);
    
    textField_18 = new JTextField();
    GridBagConstraints gbc_textField_18 = new GridBagConstraints();
    gbc_textField_18.anchor = GridBagConstraints.SOUTHWEST;
    gbc_textField_18.insets = new Insets(0, 0, 0, 5);
    gbc_textField_18.gridx = 3;
    gbc_textField_18.gridy = 3;
    panel_7.add(textField_18, gbc_textField_18);
    textField_18.setColumns(3);
    
    textField_17 = new JTextField();
    GridBagConstraints gbc_textField_17 = new GridBagConstraints();
    gbc_textField_17.anchor = GridBagConstraints.SOUTHWEST;
    gbc_textField_17.insets = new Insets(0, 0, 0, 5);
    gbc_textField_17.gridx = 4;
    gbc_textField_17.gridy = 3;
    panel_7.add(textField_17, gbc_textField_17);
    textField_17.setColumns(3);
    
    textField_16 = new JTextField();
    GridBagConstraints gbc_textField_16 = new GridBagConstraints();
    gbc_textField_16.anchor = GridBagConstraints.SOUTHWEST;
    gbc_textField_16.insets = new Insets(0, 0, 0, 5);
    gbc_textField_16.gridx = 5;
    gbc_textField_16.gridy = 3;
    panel_7.add(textField_16, gbc_textField_16);
    textField_16.setColumns(3);
    
    textField_15 = new JTextField();
    GridBagConstraints gbc_textField_15 = new GridBagConstraints();
    gbc_textField_15.anchor = GridBagConstraints.SOUTHWEST;
    gbc_textField_15.gridx = 6;
    gbc_textField_15.gridy = 3;
    panel_7.add(textField_15, gbc_textField_15);
    textField_15.setColumns(3);

    JPanel PantallaClasificacion = new JPanel();
    contentPane.add(PantallaClasificacion);
    PantallaClasificacion.setLayout(new BorderLayout(0, 0));

    JPanel panel = new JPanel();
    PantallaClasificacion.add(panel, BorderLayout.NORTH);

    JLabel lblNewLabel = new JLabel("New label");
    panel.add(lblNewLabel);

    JPanel panel_1 = new JPanel();
    PantallaClasificacion.add(panel_1, BorderLayout.SOUTH);

    JButton btnNewButton = new JButton("New button");
    panel_1.add(btnNewButton);

    JScrollPane scrollPane = new JScrollPane();
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
}