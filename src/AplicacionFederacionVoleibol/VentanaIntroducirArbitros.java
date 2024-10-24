package AplicacionFederacionVoleibol;

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
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class VentanaIntroducirArbitros extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable tablaArbitros;

    // Definimos los arreglos para almacenar los datos de los árbitros
    private String[] nombres;
    private String[] apellidos;
    private int[] dnis;
    private String[] nacionalidades;
    
    

    // Número máximo de filas en la tabla
    private static final int MAX_ARBITROS = 3;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VentanaIntroducirArbitros frame = new VentanaIntroducirArbitros();
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
    public VentanaIntroducirArbitros() {

    	// Establecemos un tamaño para la ventana
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);
        // Establecemos que la ventana no se pueda redimensionar
		setResizable(false);
        
		
		//TITULO DE LA VENTANA
        setTitle("Titulo");
        // Eliminamos el layout nulo y usamos un BorderLayout para que todo se acomode automáticamente
        contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);

        // Creamos el JScrollPane que contendrá la tabla
        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);  // Hacemos que ocupe todo el espacio disponible

        // Configuramos la tabla con un modelo vacío
        tablaArbitros = new JTable();
        tablaArbitros.setModel(new DefaultTableModel(
                new Object[][] {
                        {"", "", "", ""},
                        {"", "", "", ""},
                        {"", "", "", ""},
                },
                new String[] {
                        "Nombre", "Apellido", "DNI", "Nacionalidad"
                }
        ));
        scrollPane.setViewportView(tablaArbitros);

        // Panel de botones en la parte inferior
        JPanel panelBotones = new JPanel();
        contentPane.add(panelBotones, BorderLayout.SOUTH);

        // Botones para guardar datos y mostrar lista
        JButton btnGuardarDatos = new JButton("Guardar Datos");
        panelBotones.add(btnGuardarDatos);

        JButton btnMostrarLista = new JButton("Mostrar Lista");
        panelBotones.add(btnMostrarLista);

        // Inicializar los arreglos para almacenar los datos
        nombres = new String[MAX_ARBITROS];
        apellidos = new String[MAX_ARBITROS];
        dnis = new int[MAX_ARBITROS];
        nacionalidades = new String[MAX_ARBITROS];

        btnGuardarDatos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarDatos();
            }
        });

        // Acción para mostrar la lista de árbitros
        btnMostrarLista.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarListaArbitros();
            }
        });
    }

    // Método para guardar los datos de la tabla en los arrays
    private void guardarDatos() {
        DefaultTableModel model = (DefaultTableModel) tablaArbitros.getModel();

        // Verificar si hay más filas de las que soportamos
        if (model.getRowCount() > MAX_ARBITROS) {
            JOptionPane.showMessageDialog(this, "Solo se pueden guardar hasta " + MAX_ARBITROS + " árbitros.");
            return;
        }

        // Recorrer todas las filas de la tabla
        for (int i = 0; i < model.getRowCount(); i++) {
            try {
                // Guardar nombre
                nombres[i] = (String) model.getValueAt(i, 0);

                // Guardar apellido
                apellidos[i] = (String) model.getValueAt(i, 1);

                // Guardar y validar DNI
                String dniString = (String) model.getValueAt(i, 2);
                if (dniString == null || dniString.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "El DNI no puede estar vacío en la fila " + (i + 1));
                    return;
                }
                dnis[i] = Integer.parseInt(dniString); // Convierte a int

                // Guardar nacionalidad
                nacionalidades[i] = (String) model.getValueAt(i, 3);

            } catch (NumberFormatException ex) {
                // Si el DNI no es un número válido, mostrar un mensaje de error
                JOptionPane.showMessageDialog(this, "El DNI en la fila " + (i + 1) + " debe ser un número entero.");
                return;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Ocurrió un error en la fila " + (i + 1) + ": " + ex.getMessage());
                return;
            }
        }

        // Mostrar un mensaje indicando que los datos fueron guardados correctamente
        JOptionPane.showMessageDialog(this, "Datos guardados correctamente.");

        // Imprimir los datos guardados en consola para verificar
        for (int i = 0; i < model.getRowCount(); i++) {
            System.out.println("Nombre: " + nombres[i] + ", Apellido: " + apellidos[i] + ", DNI: " + dnis[i] + ", Nacionalidad: " + nacionalidades[i]);
        }
    }

    // Método para mostrar la lista de árbitros
    private void mostrarListaArbitros() {
        VentanaListaArbitros listaArbitros = new VentanaListaArbitros(nombres, apellidos, dnis, nacionalidades);
        listaArbitros.setVisible(true);
    }
}
