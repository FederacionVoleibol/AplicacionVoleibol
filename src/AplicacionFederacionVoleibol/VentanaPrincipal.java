package AplicacionFederacionVoleibol;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JTextField txtUsuario;
    private JPasswordField passwordField;
    private JLabel lblMensajeUsuario;
    private JLabel lblTituloInicio;
    private JLabel lblUsuario;
    private JLabel lblIcono;
    private JLabel lblContrasena;
    private AlgoritmoLogin login = new AlgoritmoLogin();
    private JLabel lblMensajeContra;

    public static void main(String[] args) {

  	   
        AlgoritmoJornadasFixture.InicializarTemporada();//Llamar al metodo main de la clase AlgoritmoJornadasFixture
    
   	
        EventQueue.invokeLater(() -> {
            try {
                VentanaPrincipal frame = new VentanaPrincipal();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        }
    
    public VentanaPrincipal() {
        setSize(850, 570);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Inicio de Sesión");

        JPanel contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);

        // Panel izquierdo (color azul)
        JPanel panelIzquierdo = new JPanel();
        panelIzquierdo.setBackground(new Color(0, 128, 255));
        panelIzquierdo.setPreferredSize(new Dimension(200, 0));
        panelIzquierdo.setLayout(new GridBagLayout());

        lblIcono = new JLabel(new ImageIcon("img/login.png"));
        panelIzquierdo.add(lblIcono);
        contentPane.add(panelIzquierdo, BorderLayout.WEST);

        // Panel central (formulario de inicio de sesión)
        JPanel panelCentro = new JPanel(new GridBagLayout());
        panelCentro.setBackground(new Color(192, 192, 192));

        // Título
        GridBagConstraints gbcTitulo = new GridBagConstraints();
        gbcTitulo.fill = GridBagConstraints.HORIZONTAL;
        gbcTitulo.insets = new Insets(10, 10, 10, 10);
        gbcTitulo.gridwidth = 2;
        gbcTitulo.gridx = 0;
        gbcTitulo.gridy = 0;

        lblTituloInicio = new JLabel("PANEL ADMINISTRATIVO");
        lblTituloInicio.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblTituloInicio.setForeground(new Color(0, 128, 255));
        lblTituloInicio.setHorizontalAlignment(SwingConstants.CENTER);
        panelCentro.add(lblTituloInicio, gbcTitulo);

        // Etiqueta Usuario
        GridBagConstraints gbcUsuario = new GridBagConstraints();
        gbcUsuario.insets = new Insets(10, 10, 10, 10);
        gbcUsuario.gridx = 0;
        gbcUsuario.gridy = 1;

        lblUsuario = new JLabel("Usuario:");
        lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panelCentro.add(lblUsuario, gbcUsuario);

        // Campo de texto Usuario
        GridBagConstraints gbcTxtUsuario = new GridBagConstraints();
        gbcTxtUsuario.insets = new Insets(10, 10, 10, 10);
        gbcTxtUsuario.gridx = 1;
        gbcTxtUsuario.gridy = 1;
        txtUsuario = new JTextField("Usuario...", 15);
        txtUsuario.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtUsuario.setText("");
            }
        });

        // Hacer que el campo de texto responda al Enter
        txtUsuario.addActionListener(this);
        panelCentro.add(txtUsuario, gbcTxtUsuario);

        // Mensaje de usuario
        GridBagConstraints gbc_lblMensajeUsuario = new GridBagConstraints();
        gbc_lblMensajeUsuario.insets = new Insets(10, 10, 10, 10);
        gbc_lblMensajeUsuario.gridx = 2;
        gbc_lblMensajeUsuario.gridy = 1;
        gbc_lblMensajeUsuario.gridwidth = 3;

        lblMensajeUsuario = new JLabel("");
        lblMensajeUsuario.setForeground(new Color(255, 0, 0));
        lblMensajeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        lblMensajeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panelCentro.add(lblMensajeUsuario, gbc_lblMensajeUsuario);

        // Etiqueta Contraseña
        GridBagConstraints gbcLblContrasena = new GridBagConstraints();
        gbcLblContrasena.insets = new Insets(10, 10, 10, 10);
        gbcLblContrasena.gridx = 0;
        gbcLblContrasena.gridy = 2;

        lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panelCentro.add(lblContrasena, gbcLblContrasena);

        // Campo de contraseña
        GridBagConstraints gbcPasswordField = new GridBagConstraints();
        gbcPasswordField.insets = new Insets(10, 10, 10, 10);
        gbcPasswordField.gridx = 1;
        gbcPasswordField.gridy = 2;
        passwordField = new JPasswordField("Password...", 15);
        passwordField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                passwordField.setText("");
            }
        });

        // Hacer que el campo de contraseña responda al Enter
        passwordField.addActionListener(this);
        panelCentro.add(passwordField, gbcPasswordField);

        // Mensaje de contraseña
        lblMensajeContra = new JLabel("");
        lblMensajeContra.setHorizontalAlignment(SwingConstants.CENTER);
        lblMensajeContra.setForeground(Color.RED);
        lblMensajeContra.setFont(new Font("Tahoma", Font.PLAIN, 14));
        GridBagConstraints gbc_lblMensajeContra = new GridBagConstraints();
        gbc_lblMensajeContra.insets = new Insets(0, 0, 5, 5);
        gbc_lblMensajeContra.gridx = 3;
        gbc_lblMensajeContra.gridy = 2;
        panelCentro.add(lblMensajeContra, gbc_lblMensajeContra);

        // Botón Ingresar
        GridBagConstraints gbcBtnIngresar = new GridBagConstraints();
        gbcBtnIngresar.insets = new Insets(10, 10, 10, 10);
        gbcBtnIngresar.gridx = 0;
        gbcBtnIngresar.gridy = 3;
        gbcBtnIngresar.gridwidth = 2;

        JButton btnIngresar = new JButton("Ingresar");
        btnIngresar.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnIngresar.addActionListener(this);
        
        // Hacer que el botón Ingresar sea el predeterminado
        getRootPane().setDefaultButton(btnIngresar);
        
        panelCentro.add(btnIngresar, gbcBtnIngresar);
        contentPane.add(panelCentro, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = txtUsuario.getText().trim();
        String password = new String(passwordField.getPassword()).trim();
        
        // Verificación si el campo de usuario está vacío
        if (nombre.isEmpty()) {
            lblMensajeUsuario.setText("Falta introducir usuario.");
        } else {
            lblMensajeUsuario.setText("");  // Limpiar mensaje si no está vacío
        }

        // Verificación si el campo de contraseña está vacío
        if (password.isEmpty()) {
            lblMensajeContra.setText("Falta introducir contraseña.");
        } else {
            lblMensajeContra.setText("");  // Limpiar mensaje si no está vacío
        }

        // Solo proceder si ambos campos están llenos
        if (!nombre.isEmpty() && !password.isEmpty()) {
            if (login.VerificacionDeLogin(nombre, password)) {
                lblMensajeUsuario.setText("Accedido al sistema correctamente, Sr. " + nombre);
                VentanaMenuPrincipal menuPrincipal = new VentanaMenuPrincipal();
                menuPrincipal.setVisible(true);
                this.dispose();
            } else {
                lblMensajeUsuario.setText("Usuario incorrecto.");
                lblMensajeContra.setText("Contraseña incorrecta.");
            }
        }
    }
}
