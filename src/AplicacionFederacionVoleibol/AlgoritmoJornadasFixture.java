package AplicacionFederacionVoleibol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlgoritmoJornadasFixture {
	
	//--------------VARIABLES PRINCIPALES
	static Scanner scan = new Scanner(System.in);
	private static final int NUMEQUIPOS = TEMPORADAS.getCantidadEquipos(); // MODIFICABLE SOLO NUMEROS PARES
	private static final int NUMRONDAS = NUMEQUIPOS -1; // NOesMODIFICABLE
	private static final int NUMPARTIDOSPORRONDA = TEMPORADAS.getCantidadPartidosPorJornada(); // NOesMODIFICABLE
	//VentanaIntroducirEquipos EstructutraEquipo = new VentanaIntroducirEquipos(); // Herencia de la clase VentanaIntroducirEquipos para extraer la información de los equipos
 
    // Clase estática para representar un Partido con equipo local y visitante
		static public class Partido{
    	// Inicialmente se asignan valores por defecto de -1 NOesMODIFICABLE
        private int equipolocal = 0, equipovisitante = 0;
		// Inicialmente se asignan valores por defecto de 0
        //public static int SetGanadosLocal = 0, SetGanadosVisitante = 0;
        //public static int Cantidad_Equipos = NUMEQUIPOS;
        private static int[] id_equipo = new int[NUMEQUIPOS];
        private static String[] NombreEquipo = new String[NUMEQUIPOS];
        //public static int[] PuntajeSetLocal = new int[5];
        //public static int[] PuntajeSetVisitante = new int[5];
    }
	// Método para introducir los nombres de los equipos
    private static void InformacionEquipos() {
    	List <EQUIPOS> listEquipos = new ArrayList <>();

    	System.out.println("====================================");
    	System.out.println("Informacion de los equipos: ");
    	for (int i=0;i<NUMEQUIPOS;i++) {
        	EQUIPOS equipo = new EQUIPOS();
	    	System.out.print("Nombre del Equipo "+(i+1)+": ");
	    	Partido.id_equipo[i] = i;
	    	equipo.setId_equipo(i);
	    	Partido.NombreEquipo[i] = scan.nextLine();
	    	equipo.setNombreEquipo(Partido.NombreEquipo[i]);
	    	listEquipos.add(equipo);
	    	
    	}
		System.out.println("====================================");
		for (EQUIPOS ordenEquipo : listEquipos) {
			System.out.println("Nombre del Equipo: "+ ordenEquipo.getid_equipo()+" - "+ordenEquipo.getNombreEquipo());
		}

    };
    
    // Método para calcular el fixture de la liga si el número de equipos es par
    private static Partido[][] calcularLigaNumEquiposPar(){  
    	
        Partido[][] partido = new Partido[NUMRONDAS][NUMPARTIDOSPORRONDA];  // Matriz para almacenar las rondas y partidos
        
        // Primera fase: Asignar los equipos locales a todas las fechas
        for (int i = 0, id_equipo = 0; i < NUMRONDAS; i++)
        {
            for (int j = 0; j < NUMPARTIDOSPORRONDA; j++)
            {	
                partido[i][j] = new Partido();  // Crear un objeto Partido dentro de posicion (i, j) para guardar el valor equipolocal y equipovisitante
                partido[i][j].equipolocal = id_equipo;  // Asignar el equipo local a la posicion de la matriz
                id_equipo++;  // Incrementar el índice del equipo local
                if (id_equipo == NUMRONDAS)
                    id_equipo = 0;  // Reiniciar si llegamos al equipo final
            }
        }

        // Asignar los equipos visitantes para la primera columna (primer partido en cada ronda)
        for (int i = 0; i < NUMRONDAS; i++)
        {
            if (i % 2 == 0)  // En rondas pares
            {
                partido[i][0].equipovisitante = NUMEQUIPOS - 1;  // Asignar el equipo más alto como visitante
            }
            else  // En rondas impares
            {
                partido[i][0].equipovisitante = partido[i][0].equipolocal;  // PASO EL LOCAL A VISITANTE DE ESTE PRIMER PARTIDO
                partido[i][0].equipolocal = NUMEQUIPOS - 1; //ASIGNO EL EQUIPO MAS ALTO COMO LOCAL
            }
        }
        int equipoMasAlto = NUMEQUIPOS - 1;  // Equipo con el número más alto
        int equipoImparMasAlto = equipoMasAlto - 1;  // Segundo equipo más alto
        
        // Segunda fase: Asignar los equipos visitantes para los otros partidos de cada ronda
        for (int i = 0, id_equipo = equipoImparMasAlto; i < NUMRONDAS; i++)
        {
            for (int j = 1; j < NUMPARTIDOSPORRONDA; j++)  // Empezamos desde el segundo partido
            {
                partido[i][j].equipovisitante = id_equipo;  // Asignar equipo visitante
                id_equipo--;  // Decrementar el índice del equipo visitante
                if (id_equipo == -1)
                    id_equipo = equipoImparMasAlto;  // Reiniciar el índice si llegamos al final
            }
        }

        return partido;  // Devolver la matriz con el fixture
    }
    //Metodo para guardar los partidos por jornada en la clase PARTIDO
    public void GuardarPartidosenJornada(Partido[][] partido) {
    	int id_partido =0;
    	List <PARTIDO> listPartidos = new ArrayList<>();
    	
    	for (int i = 0; i < partido.length; i++){
            PARTIDO partidos = new PARTIDO();
            partidos.setId_partido(i+1);
            System.out.print("Ronda " + (i + 1) + ": ");
            for (int j = 0; j < partido[i].length; j++)
            {
                System.out.print("   " + (Partido.NombreEquipo[(partido[i][j].equipolocal)]) + "-" + (Partido.NombreEquipo[(partido[i][j].equipovisitante)]));
            }
            System.out.println();
        }
    }
    // Método para mostrar los partidos de todas las rondas
    static public void mostrarPartidos()
    {	

    	Partido[][] partido = calcularLigaNumEquiposPar();
        // Mostrar la fase de "IDA" (partidos con los equipos tal como están)
        System.out.println("IDA");

        for (int i = 0; i < partido.length; i++)
        {
            System.out.print("Ronda " + (i + 1) + ": ");
            for (int j = 0; j < partido[i].length; j++)
            {
                System.out.print("   " + (Partido.NombreEquipo[(partido[i][j].equipolocal)]) + "-" + (Partido.NombreEquipo[(partido[i][j].equipovisitante)]));
            }
            System.out.println();
        }
        // Mostrar la fase de "VUELTA" (intercambiar local y visitante)
        System.out.println("VUELTA");

        for (int i = 0; i < partido.length; i++)
        {
            System.out.print("Ronda " + (i + 1) + ": ");
            for (int j = 0; j < partido[i].length; j++)
            {
                System.out.print("   " + (1 + partido[i][j].equipovisitante) + "-" + (1 + partido[i][j].equipolocal));
            }
            System.out.println();
        }
    }
    // Método principal para probar el cálculo del fixture
    static public void main(String[] args)
    {
        // Calcular y mostrar la liga con 6 equipos
    	InformacionEquipos();
        calcularLigaNumEquiposPar();
        mostrarPartidos();
    }
	
	
}