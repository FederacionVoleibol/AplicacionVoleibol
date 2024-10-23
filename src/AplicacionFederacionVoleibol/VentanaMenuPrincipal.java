package AplicacionFederacionVoleibol;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaMenuPrincipal extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPanel panelContenedor; // Cambié el nombre para mantener el estilo camelCase
    private JButton btnIntroDatos;
    private JButton btnClasificacion;
    private JButton btnArbitros;

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
        setTitle("Menú");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setBounds(100, 100, 800, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitulo = new JLabel("Menú");
        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblTitulo.setBounds(351, 10, 89, 13);
        contentPane.add(lblTitulo);

        btnClasificacion = new JButton("Clasificación");
        btnClasificacion.setBounds(122, 28, 89, 21);
        contentPane.add(btnClasificacion);
        btnClasificacion.setBackground(new Color(240, 240, 240));
        btnClasificacion.addActionListener(this);

        btnArbitros = new JButton("Introducir Árbitros");
        btnArbitros.setBounds(306, 28, 117, 21);
        contentPane.add(btnArbitros);
        btnArbitros.addActionListener(this);

        btnIntroDatos = new JButton("Introducción de datos de partido");
        btnIntroDatos.setBounds(544, 28, 181, 21);
        contentPane.add(btnIntroDatos);
        btnIntroDatos.addActionListener(this);

        // Panel contenedor que usará un BorderLayout para cambiar entre diferentes vistas
        panelContenedor = new JPanel();
        panelContenedor.setBounds(5, 55, 756, 400);
        contentPane.add(panelContenedor);
        panelContenedor.setLayout(new BorderLayout());  // Usamos BorderLayout

        // Cargar la ventana de clasificación por defecto (u otro panel que quieras mostrar primero)
        cargarVentanaClasificacion();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        
        if (o == btnClasificacion) {
            cargarVentanaClasificacion();
        } else if (o == btnArbitros) {
            cargarVentanaArbitros();
        } else if (o == btnIntroDatos) {
            // Puedes agregar otra ventana si es necesario
        }
    }

    //CARGA LOS DATOS DEL CONTENEDOR DE VentanaClasificacion
    private void cargarVentanaClasificacion() {
        // Remover todos los componentes previos y cargar la ventana de clasificación
        panelContenedor.removeAll();
        VentanaClasificacion vc = new VentanaClasificacion();
        vc.setSize(517, 229);
        panelContenedor.add(vc.getContentPane(), BorderLayout.CENTER);
        panelContenedor.revalidate();
        panelContenedor.repaint();
    }

    //CARGA LOS DATOS DEL CONTENEDOR DE VentanaIntroducirArbitros
    private void cargarVentanaArbitros() {
        // Remover todos los componentes previos y cargar la ventana de arbitros
        panelContenedor.removeAll();
        VentanaIntroducirArbitros va = new VentanaIntroducirArbitros();
        va.setSize(517, 229);  // Ajusta el tamaño si es necesario
        panelContenedor.add(va.getContentPane(), BorderLayout.CENTER);
        panelContenedor.revalidate();
        panelContenedor.repaint();
    }
}
