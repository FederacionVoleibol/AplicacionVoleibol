package AplicacionFederacionVoleibol;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;

public class VentanaArbitros extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtDNI;
	private JTextField txtNacionalidad;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaArbitros frame = new VentanaArbitros();
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
	public VentanaArbitros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel IntroducirArbitros = new JPanel();
		contentPane.add(IntroducirArbitros);
		GridBagLayout gbl_IntroducirArbitros = new GridBagLayout();
		gbl_IntroducirArbitros.columnWidths = new int[]{35, 10, 25, 126, 0};
		gbl_IntroducirArbitros.rowHeights = new int[]{20, 23, 23, 23, 23, 25, 0};
		gbl_IntroducirArbitros.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_IntroducirArbitros.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		IntroducirArbitros.setLayout(gbl_IntroducirArbitros);
		
		JLabel lblIntroducirArbitros = new JLabel("IntroducirArbitros");
		lblIntroducirArbitros.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblIntroducirArbitros = new GridBagConstraints();
		gbc_lblIntroducirArbitros.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblIntroducirArbitros.insets = new Insets(0, 0, 5, 0);
		gbc_lblIntroducirArbitros.gridwidth = 3;
		gbc_lblIntroducirArbitros.gridx = 1;
		gbc_lblIntroducirArbitros.gridy = 0;
		IntroducirArbitros.add(lblIntroducirArbitros, gbc_lblIntroducirArbitros);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridwidth = 2;
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 1;
		IntroducirArbitros.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 0);
		gbc_txtNombre.gridx = 3;
		gbc_txtNombre.gridy = 1;
		IntroducirArbitros.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.fill = GridBagConstraints.BOTH;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridwidth = 3;
		gbc_lblApellidos.gridx = 0;
		gbc_lblApellidos.gridy = 2;
		IntroducirArbitros.add(lblApellidos, gbc_lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 0);
		gbc_txtApellidos.gridx = 3;
		gbc_txtApellidos.gridy = 2;
		IntroducirArbitros.add(txtApellidos, gbc_txtApellidos);
		txtApellidos.setColumns(10);
		
		JLabel lblDNI = new JLabel("DNI");
		lblDNI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblDNI = new GridBagConstraints();
		gbc_lblDNI.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDNI.insets = new Insets(0, 0, 5, 5);
		gbc_lblDNI.gridx = 0;
		gbc_lblDNI.gridy = 3;
		IntroducirArbitros.add(lblDNI, gbc_lblDNI);
		
		txtDNI = new JTextField();
		txtDNI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_txtDNI = new GridBagConstraints();
		gbc_txtDNI.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtDNI.insets = new Insets(0, 0, 5, 0);
		gbc_txtDNI.gridx = 3;
		gbc_txtDNI.gridy = 3;
		IntroducirArbitros.add(txtDNI, gbc_txtDNI);
		txtDNI.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNacionalidad = new GridBagConstraints();
		gbc_lblNacionalidad.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNacionalidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblNacionalidad.gridwidth = 3;
		gbc_lblNacionalidad.gridx = 0;
		gbc_lblNacionalidad.gridy = 4;
		IntroducirArbitros.add(lblNacionalidad, gbc_lblNacionalidad);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_txtNacionalidad = new GridBagConstraints();
		gbc_txtNacionalidad.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtNacionalidad.insets = new Insets(0, 0, 5, 0);
		gbc_txtNacionalidad.gridx = 3;
		gbc_txtNacionalidad.gridy = 4;
		IntroducirArbitros.add(txtNacionalidad, gbc_txtNacionalidad);
		txtNacionalidad.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnGuardar.gridwidth = 2;
		gbc_btnGuardar.gridx = 2;
		gbc_btnGuardar.gridy = 5;
		IntroducirArbitros.add(btnGuardar, gbc_btnGuardar);
		
		JPanel ListaArbitros = new JPanel();
		contentPane.add(ListaArbitros);
		ListaArbitros.setLayout(new BorderLayout(0, 0));
		
		JPanel InformacionArbitros = new JPanel();
		ListaArbitros.add(InformacionArbitros, BorderLayout.NORTH);
		
		JLabel lblListaArbitros = new JLabel("ListaArbitros");
		lblListaArbitros.setFont(new Font("Tahoma", Font.PLAIN, 14));
		InformacionArbitros.add(lblListaArbitros);
		
		JScrollPane scrollPane = new JScrollPane();
		ListaArbitros.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Nombre", "Apellidos", "DNI", "Nacionalidad"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Object.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
	}
}
