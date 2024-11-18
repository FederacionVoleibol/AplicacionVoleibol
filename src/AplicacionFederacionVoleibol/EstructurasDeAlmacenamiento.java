
package AplicacionFederacionVoleibol;

import java.util.ArrayList;
import java.util.List;

public class EstructurasDeAlmacenamiento {
	/**
	 * PEQUEÑA BASE DE DATOS
	 */
	private static String usernames[] = { "Anthony", "Admin", "Clara", "Alain", "Asier" }; // Declaracion de usuarios
	private static String passwords[] = { "admin", "admin", "admin", "user", "admin" }; // Declaracion de contraseñas
	// Admin -> introduce partidos.
	// Usuario -> Visualiza clasificación. (solo lectura)
	// Desarrollador -> Acceso total.
	private static String Cargo[] = { "Admin", "Admin", "Desarrollador", "Usuario", "Desarrollador" };
	public static String TipodeUsuario = "";
	private static String Usuario = "";

	/**
	 * Algoritmo para verificar si el usuario y contraseña son correctos
	 */
	public static boolean VerificacionDeLogin(String user, String password) {
		int i = 0;
		TipodeUsuario = "";
		for (String usuario : usernames) { // Declaro una variable usuario dentro del FOR para recorrer los datos
			if (usuario.equals(user)) {
				if (passwords[i].equals(password)) {
					TipodeUsuario = Cargo[i];
					Usuario = usernames[i];
					return true; // Devuelve true si es correcto
				}
			}
			i++; // Recorre el arreglo y ayuda a reconocer el Tipo de usuario
		}
		return false;
	}

	// hacemos el get para que la variable sea accesible desde otras clases
	public static String getUsuario() {
		return Usuario;
	}

	public static String getTipodeUsuario() {
		return TipodeUsuario;
	}
}

class TEMPORADAS {

	// --------Metodo de Guardar--------//
	private static int id_temporada = 0;
	private static int fecha_inicio = 0;
	private static int fecha_final = 0;
	private static int CantidadEquipos = 6;
	private static int NumeroJornadas = 10;
	private static int CantidadPartidosPorJornada = 3;

	// --------Metodo de Guardar--------//

	public static void GuardarTemporada() {

	}

	// --------Metodo de Mostrar--------//

	public static int getid_temporada() {
		return id_temporada;
	}

	public static int getCantidadEquipos() {
		return CantidadEquipos;

	}

	public static int getNumeroJornadas() {
		return NumeroJornadas;

	}

	public static int getCantidadPartidosPorJornada() {
		return CantidadPartidosPorJornada;
	}

	public static void MostrarTemporada() {

	}

}

class JORNADAS {

	// ----Definición de Variables---//
	private int id_jornada = 0;
	private int fecha_inicio = 0;
	private int fecha_final = 0;
	private int[] EquiposporPartidos = new int[5];
	private List<Integer> IDequiposporJornada = new ArrayList();

	// --------Metodo de Guardar--------//

	public void GuardarJornada() {

	}

	// --------Metodo de Mostrar--------//

	public int getid_jornada() {
		return id_jornada;
	}

	public int getfecha_inicio() {
		return fecha_inicio;
	}

	public int getfecha_final() {
		return fecha_final;
	}

	public void MostrarJornada() {

	}

	// Método para agregar un equipo a la jornada
	public void addListaEquiposPorJornada(int idEquipo) {
		if (IDequiposporJornada.size() < 6) { // Asegurar que solo se agreguen 6 equipos
			IDequiposporJornada.add(idEquipo);
		} else {
			System.out.println("Ya se han agregado 6 equipos para esta jornada.");
		}
	}

	// Método para obtener la lista de equipos en la jornada
	public List<Integer> getIDequiposporJornada() {
		return IDequiposporJornada;
	}

}

class PARTIDO {

	// ----Definición de Variables---//

	private int id_partido = 0;
	private int Fecha = 0;
	private boolean estado = false;
	private String NombreEstadio = "";
	private int id_equipo_local = 0;
	private int id_equipo_visitante = 0;
	private int SetsGanadosEquipoLocal = 0;
	private int PuntajeUltimoSetLocal = 0;
	private int SetsGanadosEquipoVisitante = 0;
	private int PuntajeUltimoSetVisitante = 0;
	private String NombreEquipoLocal = "";
	private String NombreEquipoVisitante = "";
	private boolean resultadoCalculado = false;

	// -------Constructor--------//
//	 public ENFRENTAMIENTO(String NombreEquipoLocal) {
//		this.NombreEquipoLocal = NombreEquipoLocal; 
//	 }
//	 
	public void CrearPartido(int id_partido, int id_equipo_local, int id_equipo_visitante, String NombreEquipoLocal,
			String NombreEquipoVisitante) {

		this.id_partido = id_partido;
		this.id_equipo_local = id_equipo_local;
		this.id_equipo_visitante = id_equipo_visitante;
		this.NombreEquipoLocal = NombreEquipoLocal;
		this.NombreEquipoVisitante = NombreEquipoVisitante;
	}
	// --------Metodo de Guardar--------//

	public int getId_partido() {
		return id_partido;
	}

	public void setId_partido(int id_partido) {
		this.id_partido = id_partido;
	}

	public void GuardarEnfrentamiento() {

	}

	public void setSetsGanadosEquipoLocal(int setsGanadosEquipoLocal) {
		SetsGanadosEquipoLocal = setsGanadosEquipoLocal;
	}

	public void setPuntajeUltimoSetLocal(int puntajeUltimoSetLocal) {
		PuntajeUltimoSetLocal = puntajeUltimoSetLocal;
	}

	public void setSetsGanadosEquipoVisitante(int setsGanadosEquipoVisitante) {
		SetsGanadosEquipoVisitante = setsGanadosEquipoVisitante;
	}

	public void setPuntajeUltimoSetVisitante(int puntajeUltimoSetVisitante) {
		PuntajeUltimoSetVisitante = puntajeUltimoSetVisitante;
	}

	public void GuardarNombreEquipoLocal(String NombreEquipoLocal) {
		this.NombreEquipoLocal = NombreEquipoLocal;
	}
	// --------Metodo de Mostrar--------//

	public int getId_equipo_local() {
		return id_equipo_local;
	}

	public int getId_equipo_visitante() {
		return id_equipo_visitante;
	}

	public int getSetsGanadosEquipoLocal() {
		return SetsGanadosEquipoLocal;
	}

	public int getSetsGanadosEquipoVisitante() {
		return SetsGanadosEquipoVisitante;
	}

	public int getPuntajeUltimoSetLocal() {
		return PuntajeUltimoSetLocal;
	}

	public int getPuntajeUltimoSetVisitante() {
		return PuntajeUltimoSetVisitante;
	}

	public int getFecha() {
		return Fecha;
	}

	public void MostrarPartido() {
		System.out.println("PartidoID: " + id_partido + " " + NombreEquipoLocal + " - " + NombreEquipoVisitante);
	}

	public String getNombreEquipoLocal() {
		return NombreEquipoLocal;
	}

	public String getNombreEquipoVisitante() {
		return NombreEquipoVisitante;
	}

	public boolean isResultadoCalculado() {
		return resultadoCalculado;
	}

	public void setResultadoCalculado(boolean resultadoCalculado) {
		this.resultadoCalculado = resultadoCalculado;
	}

}

class EQUIPOS {

	// ----Definición de Variables---//
	private int id_equipo = 0;
	private String NombreEquipo = "";
	private String Entrenador = "";
	private int PartidosGanados = 0;
	private int PartidosPerdidos = 0;
	private int PuntajeTotal = 0;
	private int PuntosSetsTotal = 0;
	private int Posicion_Temporada = 0;
	private int Fundacion = 0;

	// -------- Metodo Constructor --------//

	public void CrearEquipo(int id, String nombre, int fundacion) {

		this.id_equipo = id;
		this.NombreEquipo = nombre;
		this.Fundacion = fundacion;
	}

	// --------Metodo de Guardar--------//

	public void setId_equipo(int ID_equipo) {
		this.id_equipo = ID_equipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.NombreEquipo = nombreEquipo;
	}

	public void setPosicion_Temporada(int posicion) {
		this.Posicion_Temporada = posicion;
	}

	public void incrementarPartidosGanados() {
		PartidosGanados += 1;
	}

	public void incrementarPartidosPerdidos() {
		PartidosPerdidos += 1;
	}

	public void agregarPuntosSetsTotal(int puntos) {
		PuntosSetsTotal += puntos;
	}

	public void agregarPuntajeTotal(int puntos) {
		PuntajeTotal += puntos;
	}

	// --------Metodo de Mostrar--------//

	public int getid_equipo() {
		return id_equipo;
	}

	public String getNombreEquipo() {
		return NombreEquipo;
	}

	public String getEntrenador() {
		return Entrenador;
	}

	public int getPartidosGanados() {
		return PartidosGanados;
	}

	public int getFundacion() {
		return Fundacion;
	}

	public int getPartidosPerdidos() {
		return PartidosPerdidos;
	}

	public int getPuntajeTotal() {
		return PuntajeTotal;
	}

	public int getPuntosSetsTotal() {
		return PuntosSetsTotal;
	}

	public int getPosicion_Temporada() {
		return Posicion_Temporada;
	}

}

class ARBITROS {

	// ----Definición de Variables---//
	private static int dni_arbitro = 0;
	private static String NombreArbitro = "";
	private static String Nacionalidad = "";

	// --------Metodo de Guardar--------//

	public static void GuardarDatosDelArbitro() {

	}

	// --------Metodo de Mostrar--------//

	public static int getdni_arbitro() {
		return dni_arbitro;
	}

	public static String getNombreArbitro() {
		return NombreArbitro;
	}

	public static String getNacionalidad() {
		return Nacionalidad;
	}

	public static void MostrarDatosDelArbitro() {

	}

}

class JUGADORES {

	// ----Definición de Variables---//
	private static int dni_jugador = 0;
	private static String NombreJugador = "";
	private static int FechaNacimiento = 0;
	private static int Numero_camiseta = 0;
	private static String Posicion = "";
	private static int Peso = 0;
	private static int Altura = 0;

	// --------Metodo de Guardar--------//

	public static void GuardarJugador() {

	}

	// --------Metodo de Mostrar--------//

	public static int getdni_jugador() {
		return dni_jugador;
	}

	public static String getNombreJugador() {
		return NombreJugador;
	}

	public static int getFechaNacimiento() {
		return FechaNacimiento;
	}

	public static int getNumero_camiseta() {
		return Numero_camiseta;
	}

	public static String getPosicion() {
		return Posicion;
	}

	public static int getPeso() {
		return Peso;
	}

	public static int getAltura() {
		return Altura;
	}

	public static void MostrarJugador() {

	}

}

class CLUBES {

	// ----Definición de Variables---//
	private static int id_club = 0;
	private static String NombreClub = "";
	private static String Ciudad = "";
	private static String Presidente = "";
	private static int Fundacion = 0;

	// --------Metodo de Guardar--------//

	public static void GuardarClub() {

	}

	// --------Metodo de Mostrar--------//

	public static int getid_club() {
		return id_club;
	}

	public static String getCiudad() {
		return Ciudad;
	}

	public static String getNombreClub() {
		return NombreClub;
	}

	public static String getPresidente() {
		return Presidente;
	}

	public static int getFundacion() {
		return Fundacion;
	}

	public static void MostrarClub() {

	}

}
