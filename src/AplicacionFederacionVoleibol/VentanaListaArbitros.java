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

public class VentanaListaArbitros extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable tablaArbitros;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VentanaListaArbitros frame = new VentanaListaArbitros(new String[]{}, new String[]{}, new int[]{}, new String[]{});
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
    public VentanaListaArbitros(String[] nombres, String[] apellidos, int[] dnis, String[] nacionalidades) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Lista de Árbitros");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel.setBounds(250, 10, 165, 13);
        contentPane.add(lblNewLabel);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 43, 560, 299);
        contentPane.add(scrollPane);

        tablaArbitros = new JTable();
        scrollPane.setViewportView(tablaArbitros);

        // Cargar los datos en la tabla
        cargarDatos(nombres, apellidos, dnis, nacionalidades);
    }

    //CARGA LOS DATOS DE LA VENTANA INTRODUCIRARBITROS
    
    private void cargarDatos(String[] nombres, String[] apellidos, int[] dnis, String[] nacionalidades) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("DNI");
        model.addColumn("Nacionalidad");

        // Agregar filas con los datos de los árbitros
       
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] != null && !nombres[i].isEmpty()) {
                model.addRow(new Object[]{
                        nombres[i],
                        apellidos[i],
                        dnis[i],
                        nacionalidades[i]
                });
            }
        }
        tablaArbitros.setModel(model);
    }
}
