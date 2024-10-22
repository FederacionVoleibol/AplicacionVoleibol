package AplicacionFederacionVoleibol;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
/*import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;*/
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.SpringLayout;
import javax.swing.BoxLayout;

public class VentanaMenuPrincipal extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnIntroDatos;
	private JButton btnClasificacion;
	private JButton btnArbitros;
	private JPanel panel;
	private JLabel lblTitulo;
	private JPanel panelcontenedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMenuPrincipal frame = new VentanaMenuPrincipal();
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
	public VentanaMenuPrincipal() {
		setTitle("Hola");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(5, 284, 517, 0);
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		lblTitulo = new JLabel("Menú");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTitulo.setBounds(204, 10, 89, 13);
		contentPane.add(lblTitulo);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnClasificacion = new JButton("Clasificación");
		btnClasificacion.setBounds(5, 28, 89, 21);
		contentPane.add(btnClasificacion);
		btnClasificacion.setBackground(new Color(240, 240, 240));
		btnClasificacion.addActionListener(this);
		
		btnArbitros = new JButton("Listado de árbitros");
		btnArbitros.setBounds(199, 28, 117, 21);
		contentPane.add(btnArbitros);
		
		btnIntroDatos = new JButton("Introducción de datos de partido");
		btnIntroDatos.setBounds(341, 28, 181, 21);
		contentPane.add(btnIntroDatos);
		btnIntroDatos.addActionListener(this);
		
		panelcontenedor = new JPanel();
		panelcontenedor.setBounds(5, 55, 517, 229);
		contentPane.add(panelcontenedor);
		
		JButton btnIntroducirEquipos = new JButton("Introducir Equipos");
		btnIntroducirEquipos.setBounds(104, 28, 85, 21);
		contentPane.add(btnIntroducirEquipos);
		btnArbitros.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		
		
		// obtengo sobre que componente se ha realizado la accion
		Object o = ae.getSource();
		if (o == btnClasificacion){
			// si se pulsa en clasificacion
			// creo una nueva ventana
			VentanaClasificacion vh = new VentanaClasificacion();
			// la muestro
			vh.setVisible(true);
			// oculto la ventana de inicio
			this.setVisible(false);
		}
		else if (o == btnIntroDatos){
			// si se pulsa en introduccion de datos
			VentanaClasificacion vh = new VentanaClasificacion();
			// la muestro
			vh.setVisible(true);
			// oculto la ventana de inicio
			this.setVisible(false);
		}	else if (o == btnArbitros){
			// si se pulsa en introduccion de datos
			VentanaClasificacion vh = new VentanaClasificacion();
			// la muestro
			vh.setVisible(true);
			// oculto la ventana de inicio
			this.setVisible(false);
		}
			
			
		}
}


