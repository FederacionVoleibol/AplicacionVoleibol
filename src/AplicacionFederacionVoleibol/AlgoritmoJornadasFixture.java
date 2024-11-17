package AplicacionFederacionVoleibol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AlgoritmoJornadasFixture {

    public static List<EQUIPOS> listEquipos = new ArrayList<>();
    public static List<PARTIDO> listPartidos = new ArrayList<>();
    public static List<JORNADAS> listJornadas = new ArrayList<>();
	//--------------VARIABLES PRINCIPALES
	static Scanner scan = new Scanner(System.in);
	
	private static final int NUMEQUIPOS = TEMPORADAS.getCantidadEquipos(); // MODIFICABLE SOLO NUMEROS PARES
	private static final int NUMRONDAS = NUMEQUIPOS -1; // NOesMODIFICABLE
	private static final int NUMPARTIDOSPORRONDA = TEMPORADAS.getCantidadPartidosPorJornada(); // NOesMODIFICABLE
	
	
	// Clase estática para representar un Partido con equipo local y visitante
		static public class Partido{
        private int equipolocal = 0, equipovisitante = 0;
        private static String[] NombreEquipo = new String[NUMEQUIPOS];
    }
		
		
	// Método para introducir los nombres de los equipos y CREAR LOS OBJETOS EQUIPOS VERSION DINAMICA PARA RETO 2 POR TRABAJAR
//    private static void InformacionEquipos() {
//
//    	System.out.println("====================================");
//    	System.out.println("Informacion de los equipos: ");
//    	for (int i=0;i<NUMEQUIPOS;i++) {
//        	EQUIPOS equipo = new EQUIPOS();
//	    	System.out.print("Nombre del Equipo "+(i+1)+": ");
//	    	//Partido.id_equipo[i] = i;
//	    	//equipo.setId_equipo(i);
//	    	Partido.NombreEquipo[i] = scan.nextLine();
//	    	equipo.setNombreEquipo(Partido.NombreEquipo[i]);
//	    	listEquipos.add(equipo);
//	    	
//    	}
//    };
    // Método para instanciar los equipos y agregarlos a la lista
    public static void MetodoInstanciarEquipos() {
    EQUIPOS equipo1 = new EQUIPOS(); // Crear objeto del equipo1 y agregarlo a la lista
    equipo1.CrearEquipo(0, "CV Sayre Mayser", 2000);
    Partido.NombreEquipo[0] = "CV Sayre Mayser";
    listEquipos.add(equipo1);
    EQUIPOS equipo2 = new EQUIPOS();
	equipo2.CrearEquipo(1, "CV Zaragoza", 2001);
	Partido.NombreEquipo[1] = "CV Zaragoza";
    listEquipos.add(equipo2);
    EQUIPOS equipo3 = new EQUIPOS();
	equipo3.CrearEquipo(2, "CV Barça", 2002);
	Partido.NombreEquipo[2] = "CV Barça";
    listEquipos.add(equipo3);
    EQUIPOS equipo4 = new EQUIPOS();
    equipo4.CrearEquipo(3, "CV Alcobendas", 2003);
	Partido.NombreEquipo[3] = "CV Alcobendas";
    listEquipos.add(equipo4);
    EQUIPOS equipo5 = new EQUIPOS();
    equipo5.CrearEquipo(4, "CD Avila Voleibol", 2004);
	Partido.NombreEquipo[4] = "CD Avila Voleibol";
    listEquipos.add(equipo5);
    EQUIPOS equipo6 = new EQUIPOS();
    equipo6.CrearEquipo(5, "CV Madrid Chamberí", 2005);
	Partido.NombreEquipo[5] = "CV Madrid Chamberí";
    listEquipos.add(equipo6);
    	
    }
    
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
    public static void GuardarPartidosenJornada() {
        Partido[][] partido = calcularLigaNumEquiposPar();
        int id_partido = 0;

        // Primera mitad de las jornadas
        for (int i = 0; i < partido.length; i++) {
            JORNADAS jornadas = new JORNADAS();
            for (int j = 0; j < partido[i].length; j++) {
                PARTIDO partidos = new PARTIDO();
                partidos.CrearPartido(id_partido, partido[i][j].equipolocal, partido[i][j].equipovisitante,
                        Partido.NombreEquipo[partido[i][j].equipolocal], Partido.NombreEquipo[partido[i][j].equipovisitante]);
                listPartidos.add(partidos);
                jornadas.addListaEquiposPorJornada(partido[i][j].equipolocal);  // Agregar el equipo local
                jornadas.addListaEquiposPorJornada(partido[i][j].equipovisitante);  // Agregar el equipo visitante
                id_partido++;
            }
            // Agregar la jornada completa a listJornadas
            listJornadas.add(jornadas);
   //         System.out.println("Equipos en la jornada " + i + ": " + jornadas.getIDequiposporJornada());
        }

        // Segunda mitad de las jornadas
        id_partido = 15;  // Reiniciar el ID para la segunda mitad
        for (int i = 0; i < partido.length; i++) {
            JORNADAS jornadas = new JORNADAS();
            for (int j = 0; j < partido[i].length; j++) {
                PARTIDO partidos = new PARTIDO();
                partidos.CrearPartido(id_partido, partido[i][j].equipovisitante, partido[i][j].equipolocal,
                        Partido.NombreEquipo[partido[i][j].equipovisitante], Partido.NombreEquipo[partido[i][j].equipolocal]);
                listPartidos.add(partidos);
                jornadas.addListaEquiposPorJornada(partido[i][j].equipovisitante);  // Agregar el equipo visitante
                jornadas.addListaEquiposPorJornada(partido[i][j].equipolocal);  // Agregar el equipo local
                id_partido++;
            }
            // Agregar la jornada completa a listJornadas
            listJornadas.add(jornadas);
 //           System.out.println("Equipos en la jornada " + (i + 5) + ": " + jornadas.getIDequiposporJornada());
        }
    }

    // Método para mostrar los partidos de todas las rondas
    public static void mostrarPartidos()	{	

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
        
        for (PARTIDO partidos : listPartidos) {
            partidos.MostrarPartido(); // Llamar al método MostrarPartido() de cada instancia de PARTIDO
        }
        System.out.println("Tamanio de jorndas: " + listJornadas.size());
        System.out.println("Tamanio de partidos: " + listPartidos.size());
        System.out.println("Tamanio de equipos: " + listEquipos.size());
//        // Comprobación de contenido
//        System.out.println("Contenido de listPartidos: " + listPartidos);
//        System.out.println("Tamaño de listPartidos: " + listPartidos.size());
        
        
        System.out.println("Equipos por jornada:");
        for (int i = 0; i < listJornadas.size(); i++) {
            JORNADAS jornada = listJornadas.get(i); // Obtener la jornada actual
            System.out.println("Jornada " + (i ) + ": " + jornada.getIDequiposporJornada());
        }

        System.out.println("Lista de partidos:");
        for (int i = 0; i < listPartidos.size(); i++) {
            System.out.print("Partido " + (i + 1) + ": ");
            listPartidos.get(i).MostrarPartido(); // Usar el método MostrarPartido para imprimir los detalles
        }

        System.out.println("Lista detallada de equipos:");
        for (int i = 0; i < listEquipos.size(); i++) {
            EQUIPOS equipo = listEquipos.get(i);
            System.out.println("Equipo " + (i + 1) + ": ID=" + equipo.getid_equipo() + ", Nombre=" + equipo.getNombreEquipo() +
                               ", Puntos Totales=" + equipo.getPuntajeTotal());
        }
        
        System.out.println("Lista de equipos:");
        for (int i = 0; i < listEquipos.size(); i++) {
            EQUIPOS equipo = listEquipos.get(i); // Obtener el equipo actual
            System.out.println("Equipo " + (i + 1) + ": " + equipo.getNombreEquipo());
        }
    }
    
    public static void InicializarTemporada() {
        // Llama a tus métodos necesarios para inicializar datos
        MetodoInstanciarEquipos();
        calcularLigaNumEquiposPar();
        GuardarPartidosenJornada();
        //mostrarPartidos();
    }
    
    
    
    
    // Método principal para probar el cálculo del fixture
    public static void main(String[] args)
    {
    	
        // Calcular y mostrar la liga con 6 equipos
    	//InformacionEquipos();
    	InicializarTemporada();
    	
    	
    }
	
	
}