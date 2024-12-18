package AplicacionFederacionVoleibol;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaMenuPrincipal extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPanel panelContenedor; // Cambié el nombre para mantener el estilo camelCase
    private JButton btnClasificacion;
    private JButton btnArbitros;
    private JPanel panel;
    private JButton btnCerrarSesion;
    private JButton btnEquipo;
    private JButton btnJornadas;
    private JButton btnDesarrollador;

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
    	
    	// Establecemos un tamaño para la ventana
        setSize(850, 570);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);
        // Establecemos que la ventana no se pueda redimensionar
		setResizable(false);
        
		
		//TITULO DE LA VENTANA
		setTitle(" APLICACIÓN FEDERACIÓN VOLEIBOL - Menú (Sesión Iniciada con: "+EstructurasDeAlmacenamiento.getUsuario()+" - "+EstructurasDeAlmacenamiento.getTipodeUsuario()+")");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        // Panel contenedor que usará un BorderLayout para cambiar entre diferentes vistas
        panelContenedor = new JPanel();
        contentPane.add(panelContenedor, BorderLayout.CENTER);
        panelContenedor.setLayout(new BorderLayout());
        
        JPanel panelParteSuperior = new JPanel();
        contentPane.add(panelParteSuperior, BorderLayout.NORTH);
        panelParteSuperior.setLayout(new BorderLayout(0, 0));
                
                JPanel panelListadeOpciones = new JPanel();
                panelParteSuperior.add(panelListadeOpciones, BorderLayout.CENTER);
                
                        btnArbitros = new JButton("Arbitros");
                       if (EstructurasDeAlmacenamiento.getTipodeUsuario().equals("Desarrollador") || EstructurasDeAlmacenamiento.getTipodeUsuario().equals("Admin")) {
                        	 panelListadeOpciones.add(btnArbitros);
                        }
                        
                                btnClasificacion = new JButton("Tabla de Clasificación");
                                 
                                	panelListadeOpciones.add(btnClasificacion);
                                
                                btnClasificacion.setBackground(new Color(240, 240, 240));
                                 
                                        btnEquipo = new JButton("Equipos");
                                        btnEquipo.addActionListener(new ActionListener() {
                                        	public void actionPerformed(ActionEvent e) {  
                                        		
                                        	}
                                        });
                                     
                                        panelListadeOpciones.add(btnEquipo);
                                        
                                        
                                        btnJornadas = new JButton("Jornadas");
                                         
                                        //El admin no tiene sentido que vea el boton jornadas
                                        if(EstructurasDeAlmacenamiento.getTipodeUsuario().equals("Usuario"))
                                        	panelListadeOpciones.add(btnJornadas);
                                        
                                        
                                        btnDesarrollador = new JButton("Crear Usuario");
                                       if(EstructurasDeAlmacenamiento.getTipodeUsuario().equals("Desarrollador" )) {
                                    	   panelListadeOpciones.add(btnDesarrollador);
                                       }
                                        panel = new JPanel();
                                        contentPane.add(panel, BorderLayout.SOUTH);
                                        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
                                        
                                        btnCerrarSesion = new JButton("Cerrar Sesión");
                                        panel.add(btnCerrarSesion);
                                    
                        btnClasificacion.addActionListener(this);
                        btnArbitros.addActionListener(this);
                        btnEquipo.addActionListener(this);
                        btnCerrarSesion.addActionListener(this);
                        
        // Cargar la ventana de clasificación por defecto (u otro panel que quieras mostrar primero)
       EstructurasDeAlmacenamiento login = new EstructurasDeAlmacenamiento();
       if (login.TipodeUsuario.equals("Desarrollador") || login.TipodeUsuario.equals("Admin")) {
    	   cargarVentanaClasificacion();
    	   }
       else {
		  cargarVentanaClasificacionUsuarios();
	   }
       
    }

    public void actionPerformed(ActionEvent variableGuardarAccionBoton) {
        Object botonAccionado = variableGuardarAccionBoton.getSource();
        String tipoUsuario = EstructurasDeAlmacenamiento.getTipodeUsuario();

        if (botonAccionado == btnClasificacion) {
            if (tipoUsuario.equals("Admin")) {
                cargarVentanaClasificacion();
            } else if (tipoUsuario.equals("Desarrollador")) {
                cargarVentanaClasificacionUsuarios();
            }
            
            else if (tipoUsuario.equals("Usuario")) {
                cargarVentanaClasificacionUsuarios();
            }
        } else if (botonAccionado == btnArbitros && (tipoUsuario.equals("Desarrollador") || tipoUsuario.equals("Admin"))) {
            cargarVentanaArbitros();
        } else if (botonAccionado == btnEquipo) {
            if (tipoUsuario.equals("Desarrollador") || tipoUsuario.equals("Admin")) {
                cargarVentanaEquipos();
            } else if (tipoUsuario.equals("Usuario")) {
                cargarVentanaEquiposUsuarios();
            }
        } else if (botonAccionado == btnCerrarSesion) {
            cerrarSesion();
        }
    }

    
    private void cerrarSesion() {
        // Confirmación para cerrar sesión
        int confirm = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            dispose(); // Cierra la ventana actual (VentanaMenuPrincipal)
            
            // Crear y mostrar la ventana de login
            VentanaPrincipal ventanaLogin = new VentanaPrincipal();
            ventanaLogin.setVisible(true);
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

    //CARGA LOS DATOS DEL CONTENEDOR DE VentanaArbitros
    private void cargarVentanaArbitros() {
        // Remover todos los componentes previos y cargar la ventana de arbitros
        panelContenedor.removeAll();
        VentanaIntroducirArbitros VentanaIntroducirArbitros = new VentanaIntroducirArbitros();
        VentanaIntroducirArbitros.setSize(517, 229);  // Ajusta el tamaño si es necesario
        panelContenedor.add(VentanaIntroducirArbitros.getContentPane(), BorderLayout.CENTER);
        panelContenedor.revalidate();
        panelContenedor.repaint();
    }
    //CARGA LOS DATOS DEL CONTENEDOR DE VentanaClasificacion
private void cargarVentanaEquipos() {
    // Remover todos los componentes previos y cargar la ventana de clasificación
    panelContenedor.removeAll();
    VentanaIntroducirEquipos VentanaIntroducirEquipos = new VentanaIntroducirEquipos();
    VentanaIntroducirEquipos.setSize(517, 229);
    panelContenedor.add(VentanaIntroducirEquipos.getContentPane(), BorderLayout.CENTER);
    panelContenedor.revalidate();
    panelContenedor.repaint();
}
private void cargarVentanaClasificacionUsuarios() {
    // Remover todos los componentes previos y cargar la ventana de clasificación
    panelContenedor.removeAll();
    VentanaClasificacionUsuarios VentanaClasificacionUsuarios = new VentanaClasificacionUsuarios();
    VentanaClasificacionUsuarios.setSize(517, 229);
    panelContenedor.add(VentanaClasificacionUsuarios.getContentPane(), BorderLayout.CENTER);
    panelContenedor.revalidate();
    panelContenedor.repaint();
}
private void cargarVentanaEquiposUsuarios() {
    // Remover todos los componentes previos y cargar la ventana de clasificación
    panelContenedor.removeAll();
    VentanaEquiposUsuarios VentanaEquiposUsuarios = new VentanaEquiposUsuarios();
    VentanaEquiposUsuarios.setSize(517, 229);
    panelContenedor.add(VentanaEquiposUsuarios.getContentPane(), BorderLayout.CENTER);
    panelContenedor.revalidate();
    panelContenedor.repaint();
}

}




