package AplicacionFederacionVoleibol;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
		setTitle("Clasificación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Clasificación");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(175, 10, 99, 13);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 38, 416, 215);
		contentPane.add(scrollPane);
		
		//TABLA DE LA CLASIFICACION
		tablaClasificacion = new JTable();
		tablaClasificacion.setModel(new DefaultTableModel(
			new Object[][] {
				{1, "CD Avila Voleibol", null, null, null, null, null, null},
				{2, "CD Zaragoza", null, null, null, null, null, null},
				{3, "CV Alcobendas", null, null, null, null, null, null},
				{4, "CV Bar\u00E7a", null, null, null, null, null, null},
				{5, "CV Madrid Chamber\u00ED", null, null, null, null, null, null},
				{6, "CV Sayre Mayser", null, null, null, null, null, null},
			},
			new String[] {
				"POSICI\u00D3N", "EQUIPO", "PJ", "PG", "PP", "GF", "GC", "PTS"
			}
		));
		tablaClasificacion.getColumnModel().getColumn(0).setPreferredWidth(50);
		tablaClasificacion.getColumnModel().getColumn(0).setMinWidth(17);
		tablaClasificacion.getColumnModel().getColumn(1).setPreferredWidth(130);
		tablaClasificacion.getColumnModel().getColumn(2).setPreferredWidth(55);
		tablaClasificacion.getColumnModel().getColumn(3).setPreferredWidth(55);
		tablaClasificacion.getColumnModel().getColumn(4).setPreferredWidth(55);
		tablaClasificacion.getColumnModel().getColumn(5).setPreferredWidth(55);
		tablaClasificacion.getColumnModel().getColumn(6).setPreferredWidth(55);
		tablaClasificacion.getColumnModel().getColumn(7).setPreferredWidth(55);
		scrollPane.setViewportView(tablaClasificacion);
	}
}
