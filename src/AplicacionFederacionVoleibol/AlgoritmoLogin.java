package AplicacionFederacionVoleibol;

public class AlgoritmoLogin {
	/**
	 * PEQUEÑA BASE DE DATOS
	 * */
	private static String usernames[] = {"Anthony","Admin","Clara","Alain","Asier"}; //Declaracion de usuarios
	private static String passwords[] = {"admin","admin","admin","user","admin"}; //Declaracion de contraseñas
	// Admin -> introduce partidos.
	// Usuario -> Visualiza clasificación. (solo lectura)
	// Desarrollador -> Acceso total.
	private static String Cargo[] = {"Admin", "Admin","Desarrollador","Usuario","Desarrollador"};
	public static String TipodeUsuario = "";
	private static String Usuario = "";

	
	
	/**
	 * Algoritmo para verificar si el usuario y contraseña son correctos
	 * */
	public static boolean VerificacionDeLogin(String user, String password) {
		int i = 0;
		TipodeUsuario = "";
		for (String usuario : usernames) { //Declaro una variable usuario dentro del FOR para recorrer los datos
			if (usuario.equals(user)) {
				if (passwords[i].equals(password)) {
					TipodeUsuario = Cargo[i];
					Usuario = usernames[i];
					return true; //Devuelve true si es correcto
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
 class EQUIPOS{

	//----Definición de Variables---//
	 private static int id_equipo =0;
	 private static String NombreEquipo = "";
	 private static String Entrenador = "";
	 private static int Puntaje =0;
	 
	 
	//--------Metodo de Guardar--------// 
	 
	public static String NombreEquipoVisitante = "Barcelona";

	public static void GuardarEquipo(String nombre) {
			NombreEquipoVisitante = nombre;
	}
	 
	//--------Metodo de Mostrar--------//
	 
	public static int getid_equipo() {
		 return id_equipo;
	 }
	
	public static String getNombreEquipo() {
		 return NombreEquipo;
	 }
	
	public static String getEntrenador() {
		 return Entrenador;
	 }
	
	public static int getPuntaje() {
		 return Puntaje;
	 }
	
	 public static void MostrarEquipo() {
		 System.out.println(NombreEquipoVisitante);
	 }

}
 
 class ARBITROS{

	//----Definición de Variables---//
	 private static int dni_arbitro =0;
	 private static String NombreArbitro = "";
	 private static String Nacionalidad = "";
	 
	 
	//--------Metodo de Guardar--------// 
	 
	 public static void GuardarDatosDelArbitro() {
		 
	 }
	 
	//--------Metodo de Mostrar--------//
	 
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
 
 class JUGADORES{

	//----Definición de Variables---//
	 private static int dni_jugador =0;
	 private static String NombreJugador = "";
	 private static int FechaNacimiento =0;
	 private static int Numero_camiseta =0;
	 private static String Posicion = "";
	 private static int Peso =0;
	 private static int Altura =0;
	 
	 
	//--------Metodo de Guardar--------// 
	 
	 public static void GuardarJugador() {
		 
	 }
	 
	//--------Metodo de Mostrar--------//
	 
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
 
 class JORNADAS{

	//----Definición de Variables---//
	 private static int id_jornada =0;
	 private static int fecha_inicio =0;
	 private static int fecha_final =0;
	 
	 
	//--------Metodo de Guardar--------// 
	 
	 public static void GuardarJornada() {
		 
	 }
	 
	//--------Metodo de Mostrar--------//
	 
	 public static int getid_jornada() {
		 return id_jornada;
	 }
	 
	 public static int getfecha_inicio() {
		 return fecha_inicio;
	 }
	 
	 public static int getfecha_final() {
		 return fecha_final;
	 }
	 
	 public static void MostrarJornada() {
		 
	 }
	 
 }
 
 class PARTIDOS{

	//----Definición de Variables---//
	 private static int id_partido =0;
	 private static boolean estado =false;
	 private static String NombreEstadio = "";
	 
	 
	//--------Metodo de Guardar--------// 
	 
	 public static void GuardarPartido() {
		 
	 }
	 
	//--------Metodo de Mostrar--------//
	 
	 public static int getid_partido() {
		 return id_partido;
	 }
	 
	 public static boolean getestado() {
		 return estado;
	 }
	 
	 public static String getNombreEstadio() {
		 return NombreEstadio;
	 }
	 
	 public static void MostrarPartido() {
		 
	 }
	 
 }
 
 class CLUBES{

	//----Definición de Variables---//
	 private static int id_club =0;
	 private static String NombreClub = "";
	 private static String Ciudad = "";
	 private static String Presidente = "";
	 private static int Fundacion =0;
	 
	 
	//--------Metodo de Guardar--------// 

	 public static void GuardarClub() {
		 
	 }
	 
	//--------Metodo de Mostrar--------//
	 
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

 
 class TEMPORADAS{

	//--------Metodo de Guardar--------// 
	 private static int id_temporada =0;
	 private static int fecha_inicio =0;
	 private static int fecha_final =0;
	 private static int CantidadEquipos =6;
	 private static int NumeroJornadas =10;
	 private static int CantidadPartidosPorJornada =3;
	 
	 
	//--------Metodo de Guardar--------// 

	 public static void GuardarTemporada() {
		 
	 }
	 
	//--------Metodo de Mostrar--------//
	 
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
 
 class ENFRENTAMIENTO{

	//----Definición de Variables---//
	 private static int SetGanadosEquipoLocal =0;
	 private static int SetsGanadosEquipoVisitante =0;
	 private static int PuntajeUltimoSetLocal =0;
	 private static int PuntajeUltimoSetVisitante =0;
	 private static int Fecha =0;
	 
	 
	//--------Metodo de Guardar--------// 
	 
	 public static void GuardarEnfrentamiento() {
		 
	 }
	 
	//--------Metodo de Mostrar--------//
	 
	 public static int getSetGanadosEquipoLocal() {
			return SetGanadosEquipoLocal;
	 }
	 
	 public static int getSetsGanadosEquipoVisitante() {
			return SetsGanadosEquipoVisitante;
	 }
	 
	 public static int getPuntajeUltimoSetLocal() {
			return PuntajeUltimoSetLocal;
	 }
	 
	 public static int getPuntajeUltimoSetVisitante() {
			return PuntajeUltimoSetVisitante;
	 }
	 
	 public static int getFecha() {
			return Fecha;
	 }
	 
	 public static void MostrarEnfrentamiento() {
		 
	 }	
 }
 
 
 