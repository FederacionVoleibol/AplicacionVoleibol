package AplicacionFederacionVoleibol;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class VentanaClasificacionUsuarios extends JFrame {

  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  private JTable tablaClasificacion;
  private JPanel PantallaClasificacion;
  private JPanel panel;
  private JLabel lblNewLabel;
  private JPanel panel_1;
  private JScrollPane scrollPane;
  private List<Jornada> jornadas;
  private int jornadaActual = 1;
  
  String[] equipos = {"CV Sayre Mayser", "CV Barça", "CD Zaragoza", "CV Alcobendas", "CD Avila Voleibol", "CV Madrid Chamberí"};

  int indiceEquipo = 1;
  /**
	 * Launch the application.
	 */
  public static void main(String[] args) {
	  
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          VentanaClasificacionUsuarios frame = new VentanaClasificacionUsuarios();
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
  public VentanaClasificacionUsuarios() {
	  
	  
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
    contentPane.setLayout(new GridLayout(0, 1, 0, 0));

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
    		//Para que al iniciar la ventana no se pueda cambiar de posiciones los titulos de la cabecera
    		tablaClasificacion.getTableHeader().setReorderingAllowed(false);
    		//Para que al iniciar la ventana no se pueda acortar o alargar una columna
    		tablaClasificacion.getTableHeader().setResizingAllowed(false);
    		

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
	    
	 
	}
  
  
}