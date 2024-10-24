package AplicacionFederacionVoleibol;

import java.awt.BorderLayout;
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
        contentPane = new JPanel(new BorderLayout());  // Usamos BorderLayout para organizar los componentes
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblTitulo = new JLabel("Lista de Árbitros");
        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);
        contentPane.add(lblTitulo, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);  // Tabla en el centro del layout

        tablaArbitros = new JTable();
        scrollPane.setViewportView(tablaArbitros);

        // Cargar los datos en la tabla
        cargarDatos(nombres, apellidos, dnis, nacionalidades);

        pack();  // Ajustamos el tamaño automáticamente según los componentes
    }

    // Método para cargar los datos en la tabla
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
