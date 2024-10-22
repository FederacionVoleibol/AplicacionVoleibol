package AplicacionFederacionVoleibol;
import java.util.Scanner;

public class AlgoritmoJornadasFixture {
	static Scanner scan = new Scanner(System.in);
	public static int NUMEQUIPOS = 6; // MODIFICABLE SOLO NUMEROS PARES
	public static int NUMRONDAS; // NOesMODIFICABLE
	public static int NUMPARTIDOSPORRONDA; // NOesMODIFICABLE
	 VentanaIntroducirEquipos EstructutraEquipo = new VentanaIntroducirEquipos(); // Herencia de la clase VentanaIntroducirEquipos para extraer la información de los equipos
		
	public static class DefiniciondeTemporada {
	}
    // Clase estática para representar un Partido con equipo local y visitante
    static public class Partido
    {
    	// Inicialmente se asignan valores por defecto de -1 NOesMODIFICABLE
        public int equipolocal = -1, equipovisitante = -1;
		// Inicialmente se asignan valores por defecto de 0
        public static int SetGanadosLocal = 0, SetGanadosVisitante = 0;
        public static int Cantidad_Equipos = NUMEQUIPOS;
        public static int[] id_equipo = new int[Cantidad_Equipos];
        public static String[] NombreEquipo = new String[Cantidad_Equipos];
        public static int[] PuntajeSetLocal = new int[5];
        public static int[] PuntajeSetVisitante = new int[5];
    }
    private static void InformacionEquipos(int NumerodeEquipos) {
		NumerodeEquipos = NUMEQUIPOS;
    	System.out.println("====================================");
    	System.out.println("Informacion de los equipos: ");
    	for (int i=0;i<NumerodeEquipos;i++) {
	    	System.out.print("Nombre del Equipo "+(i+1)+": ");
	    	Partido.id_equipo[i] = i;
	    	Partido.NombreEquipo[i] = scan.nextLine();
    	}
		System.out.println("====================================");
		for (int i=0;i<NumerodeEquipos;i++) {
	    	System.out.println("Nombre del Equipo "+(Partido.id_equipo[i]+1)+": "+Partido.NombreEquipo[i]);
	    
    	}
    };
    

    // Método para calcular el fixture de la liga si el número de equipos es par
    private static Partido[][] calcularLigaNumEquiposPar(int numEquipos)
    {
        NUMRONDAS = numEquipos - 1;  // Número de rondas es el número de equipos - 1
        NUMPARTIDOSPORRONDA = numEquipos / 2;  // En cada ronda se juegan numEquipos / 2 partidos
        
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
        } /**	Fecha 1:    1-   2-   3-
				Fecha 2:    4-   5-   1-
				Fecha 3:    2-   3-   4-
				Fecha 4:    5-   1-   2-
				Fecha 5:    3-   4-   5-
         	*/

        // Asignar los equipos visitantes para la primera columna (primer partido en cada ronda)
        for (int i = 0; i < NUMRONDAS; i++)
        {
            if (i % 2 == 0)  // En rondas pares
            {
                partido[i][0].equipovisitante = numEquipos - 1;  // Asignar el equipo más alto como visitante
            }
            else  // En rondas impares
            {
                partido[i][0].equipovisitante = partido[i][0].equipolocal;  // PASO EL LOCAL A VISITANTE DE ESTE PRIMER PARTIDO
                partido[i][0].equipolocal = numEquipos - 1; //ASIGNO EL EQUIPO MAS ALTO COMO LOCAL
            }
        }
        int equipoMasAlto = numEquipos - 1;  // Equipo con el número más alto
        int equipoImparMasAlto = equipoMasAlto - 1;  // Segundo equipo más alto

        /**		Fecha 1:    1-6   2-   3-
				Fecha 2:    6-4   5-   1-
				Fecha 3:    2-6   3-   4-
				Fecha 4:    6-5   1-   2-
				Fecha 5:    3-6   4-   5-
         */

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
        /**					l-v   l-v   l-v
         * 		Fecha 1:    1-6   2-5   3-4
				Fecha 2:    6-4   5-3   1-2
				Fecha 3:    2-6   3-1   4-5
				Fecha 4:    6-5   1-4   2-3
				Fecha 5:    3-6   4-2   5-1
         */

        return partido;  // Devolver la matriz con el fixture
    }



    // Método para mostrar los partidos de todas las rondas
    static public void mostrarPartidos(Partido[][] partido)
    {
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
    static public void main(String[] x)
    {
        // Calcular y mostrar la liga con 6 equipos
    	InformacionEquipos(6);
        System.out.println("Liga con 6 equipos:");
        calcularLigaNumEquiposPar(NUMEQUIPOS);
        //Prueba de commit github
        mostrarPartidos(calcularLigaNumEquiposPar(NUMEQUIPOS));
    }
	
	
}
