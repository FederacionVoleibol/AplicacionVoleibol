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

public class VentanaClasificacion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tablaClasificacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaClasificacion frame = new VentanaClasificacion();
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
	public VentanaClasificacion() {
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

		    // Centramos los textos en la tabla
		    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
		    renderer.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel PantallaClasificacion = new JPanel();
		PantallaClasificacion.setBounds(0, 59, 786, 404);
		contentPane.add(PantallaClasificacion);
		PantallaClasificacion.setLayout(null);
		
				    JScrollPane scrollPane = new JScrollPane();
				    scrollPane.setBounds(10, 10, 766, 270);
				    PantallaClasificacion.add(scrollPane);
				    
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
