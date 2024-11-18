package AplicacionFederacionVoleibol;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GestorPrimos extends JFrame implements ActionListener{

	private static final long serialVersionUID = 20241114L;
	private JPanel contentPane;
	private JTextField txtNumero;
	private JPanel panelCabecera;
	private JLabel lblNumero;
	private JButton btnInsertar;
	private JButton btnBorrar;
	private JButton btnLimpiar;

	private JPanel panelPie;
	private JLabel lblTotalNumeros;
	private JLabel lblTotalNumerosValor;
	private JLabel lblMedia;
	private JLabel lblMediaValor;

	private JPanel panelCentral;
	private JPanel panelPrimos;
	private JLabel lblPrimos;
	private JList<Integer> lstPrimos;
	private DefaultListModel<Integer> dlmPrimos;
	private JPanel panelNoPrimos;
	private JLabel lblNoPrimos;
	private JList<Integer> lstNoPrimos;
	private DefaultListModel<Integer> dlmNoPrimos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestorPrimos frame = new GestorPrimos();
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
	public GestorPrimos() {
		setTitle("Examen1 - Jhon Anthony Quiliche Calderon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		panelCabecera = new JPanel();
		contentPane.add(panelCabecera, BorderLayout.NORTH);

		lblNumero = new JLabel("Número");
		panelCabecera.add(lblNumero);

		txtNumero = new JTextField();
		txtNumero.addMouseListener(new MouseAdapter() {
		    @Override//ESTABLECE FOCO
		    public void mouseClicked(MouseEvent e) {
		        txtNumero.requestFocus();
		        txtNumero.selectAll();     
		    }
			@Override//DESMARCA
			public void mouseExited(MouseEvent e) {
				txtNumero.select(0, 0); 
			}
		});
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setText("0");
		panelCabecera.add(txtNumero);
		txtNumero.setColumns(10);
		

		btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(this);
		panelCabecera.add(btnInsertar);

		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		panelCabecera.add(btnBorrar);

		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(this);
		panelCabecera.add(btnLimpiar);

		panelCentral = new JPanel();
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new BorderLayout(0, 0));

		panelPrimos = new JPanel();
		panelCentral.add(panelPrimos, BorderLayout.WEST);
		panelPrimos.setLayout(new BorderLayout(0, 0));

		// creo el modelo de datos de la lista lstPrimos
		dlmPrimos = new DefaultListModel<Integer>();
			
		// creo la lista
		lstPrimos = new JList<Integer>();
		// asocio el modelo de datos a la lista
		lstPrimos.setModel(dlmPrimos);
		panelPrimos.add(lstPrimos, BorderLayout.CENTER);

		lblPrimos = new JLabel("Numeros Primos");
		lblPrimos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrimos.setHorizontalAlignment(SwingConstants.CENTER);
		panelPrimos.add(lblPrimos, BorderLayout.NORTH);

		panelNoPrimos = new JPanel();
		panelCentral.add(panelNoPrimos, BorderLayout.EAST);
		panelNoPrimos.setLayout(new BorderLayout(0, 0));

		lblNoPrimos = new JLabel("Números Impares No Primos");
		lblNoPrimos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNoPrimos.setHorizontalAlignment(SwingConstants.CENTER);
		panelNoPrimos.add(lblNoPrimos, BorderLayout.NORTH);

		// creo el modelo de datos de la lista lstNoPrimos
		dlmNoPrimos = new DefaultListModel<Integer>();

		// creo la lista
		lstNoPrimos = new JList<Integer>();
		// asocio el modelo de datos a la lista
		lstNoPrimos.setModel(dlmNoPrimos);
		panelNoPrimos.add(lstNoPrimos, BorderLayout.CENTER);

		panelPie = new JPanel();
		contentPane.add(panelPie, BorderLayout.SOUTH);

		lblTotalNumeros = new JLabel("Total Numeros:");
		panelPie.add(lblTotalNumeros);

		lblTotalNumerosValor = new JLabel("0");
		lblTotalNumerosValor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotalNumerosValor.setHorizontalAlignment(SwingConstants.RIGHT);
		panelPie.add(lblTotalNumerosValor);

		lblMedia = new JLabel("Media Total Números:");
		panelPie.add(lblMedia);

		lblMediaValor = new JLabel("0.0");
		lblMediaValor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMediaValor.setHorizontalAlignment(SwingConstants.RIGHT);
		panelPie.add(lblMediaValor);
		//DatosdePrueba();
		
	}
	
	public int calcularTotalNumeros() {
	    int total = dlmPrimos.size() + dlmNoPrimos.size(); 
	    return total;
	}
	
	
	private double CalcularmediaAritmetica() {
	    int TOTALNUMEROS = dlmPrimos.size() + dlmNoPrimos.size(); 
	    if (TOTALNUMEROS == 0) {return 0;}
	    int sumatoria = 0;
	    for (int i = 0; i < dlmPrimos.size(); i++) {
	        sumatoria += dlmPrimos.get(i);
	    }
	    for (int i = 0; i < dlmNoPrimos.size(); i++) {
	        sumatoria += dlmNoPrimos.get(i);
	    }
	    return (double) sumatoria / TOTALNUMEROS; 
	}

	
	public boolean esImpar(int numero) {
	    return numero % 2 == 0;
	}
	public boolean numeroprimo(int numero) {
		if (numero < 2) {
			return false; 
		} 
		else {
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					return false; 
				}
			}
			return true; 
		}
	}
	
	public void DatosdePrueba() { //USARLO EN LINEA 172
		//txtNumero.setText(String.valueOf(valor)); por si el arreglo seria tipo int
		
	    // Valores de prueba que deseas agregar
	    String[] valoresDePrueba = {"19", "13", "7", "5", "2", "1", "9"};
	    
	    for (String valor : valoresDePrueba) {
	        // Establecer el valor en el campo de texto de la ventana
	        txtNumero.setText(valor);
	        
	        // Simular un clic en el botón insertar
	        btnInsertar.doClick();
	    }
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		Object botonseleccionado = evento.getSource();
		if (botonseleccionado == btnInsertar || botonseleccionado == txtNumero) {

			//dlmPrimos y dlmNoPrimos   y lstPrimos   y lstNoPrimos
			//MENSAJE SI NO HAY TEXTO EN EL CAMPO
			if (txtNumero.getText().trim().isEmpty()) {
				JOptionPane.showMessageDialog(this, "Error al Insertar. El campo Numero no puede estar vacio.", "Error", JOptionPane.ERROR_MESSAGE);
				return;//salir del bloque
			}
			
			String texto = txtNumero.getText();
			int numero = Integer.parseInt(texto);
			
			//MENSAJE SI ES MENOR QUE 0
			if (numero < 0) {
				JOptionPane.showMessageDialog(this, "Error al Insertar. El numero no puede ser negativo", "Error", JOptionPane.ERROR_MESSAGE);
				return;//salir del bloque
				
			}

			// VERIFICAR SI ESTA EN LA LISTA
			if (dlmPrimos.contains(numero) ||dlmNoPrimos.contains(numero)) {
				JOptionPane.showMessageDialog(this, "Error al Insertar. El Número " + numero + " ya esta en una de las listas.", "Error", JOptionPane.ERROR_MESSAGE);
				return;//salir del bloque
				
			}
		
			//SI ES PRIMO INSERTAR EN LA LISTA DE PRIMOS
			if (numeroprimo(numero)){
				int indice = 0;
				boolean ordenAscendente = false; //MANERA DE INDICAR TIPO DE ORDEN
				while (indice < dlmPrimos.size() && 
						((ordenAscendente && numero > dlmPrimos.get(indice)) || 
						(!ordenAscendente && numero < dlmPrimos.get(indice)))) {
					indice++;
					
				} 
				//INGRESAR NUMERO
				this.dlmPrimos.add(indice, numero);
				
			}
			else if(esImpar(numero)) {
				JOptionPane.showMessageDialog(this, "Error al Insertar. El Número " + numero + " no es Primo ni Impar.", "Error", JOptionPane.ERROR_MESSAGE);
				return;//salir del bloque
			}
			//INSERTAR EN LA LISTA DE NOPRIMOS
			else{
				int indice = 0;
				boolean ordenAscendente = true; //MANERA DE INDICAR TIPO DE ORDEN
				while (indice < dlmNoPrimos.size() && 
						((ordenAscendente && numero > dlmNoPrimos.get(indice)) || 
						(!ordenAscendente && numero < dlmNoPrimos.get(indice)))) {
					indice++;
					
				} 
				//INGRESAR NUMERO
				this.dlmNoPrimos.add(indice, numero);
			}
			lblTotalNumerosValor.setText(Integer.toString(calcularTotalNumeros())); // MUESTRA EL TOTAL DE NUMEROS ACTUALIZADO
			lblMediaValor.setText(Double.toString(CalcularmediaAritmetica())); // MUESTRA EL TOTAL DE LA MEDIA ACTUALIZADO
		}
		
		
		/*-----------BOTON BORRAR---------*/
		else if (botonseleccionado == btnBorrar) {
			// Obtener los índices de los elementos seleccionados en laS 2 LISTAS
	        int[] ArregloSelectListaPrimos = lstPrimos.getSelectedIndices();
	        int[] ArregloSelectListaNOPrimos = lstNoPrimos.getSelectedIndices();
	        
	        //SI NO HAY ELEMENTOS SELECCIONADOS
	        if (ArregloSelectListaPrimos.length == 0 && ArregloSelectListaNOPrimos.length ==0) {
	        	JOptionPane.showMessageDialog(this, "Error al Borrar. NO hay elementos seleccionados en las listas.", "Error", JOptionPane.ERROR_MESSAGE);
				return;//salir del bloque
	        }
//	        //COMPROBRAR POR CONSOLA LOS ELEMENTOS SELECCIONADOS POR SU INDICE
//			for (int i = 0; i < ArregloSeleccionados.length; i++) {
//				System.out.println(ArregloSeleccionados[i]);
//			}

	        //BORRAR LOS ELEMENTOS SELECCIONADOS (SE BORRAN DE MAYOR A MENOR INDICE)
	        for (int i = ArregloSelectListaPrimos.length - 1; i >= 0; i--) {
	        	dlmPrimos.remove(ArregloSelectListaPrimos[i]);
	        }
	        for (int i = ArregloSelectListaNOPrimos.length - 1; i >= 0; i--) {
	        	dlmNoPrimos.remove(ArregloSelectListaNOPrimos[i]);
	        }
	        JOptionPane.showMessageDialog(this, "Elementos eliminados con éxito", "Información", JOptionPane.INFORMATION_MESSAGE);

			txtNumero.setText("0");
	        lblTotalNumerosValor.setText(Integer.toString(calcularTotalNumeros())); // MUESTRA EL TOTAL ACTUALIZADO
	        lblMediaValor.setText(Double.toString(CalcularmediaAritmetica())); // MUESTRA EL TOTAL DE LA MEDIA ACTUALIZADO
		
		}
		/*-----------BOTON LIMPIAR---------*/
		else if (botonseleccionado == btnLimpiar) {
			if (dlmPrimos.isEmpty() && dlmNoPrimos.isEmpty()) {
				JOptionPane.showMessageDialog(this, "La Lista no tiene elementos por borrar", "Error", JOptionPane.ERROR_MESSAGE);
			}else {
				dlmPrimos.clear();
				dlmNoPrimos.clear();
				txtNumero.setText("0");
		        JOptionPane.showMessageDialog(this, "Error al vaciar las listas. Las listas ya están vacías.", "Información", JOptionPane.INFORMATION_MESSAGE);
		        lblTotalNumerosValor.setText("0"); //  MUESTRA EL TOTAL LIMPIO
		        lblMediaValor.setText("0,0"); // MUESTRA EL TOTAL DE LA MEDIA LIMPIO
			}
		}
		
	}

	
}