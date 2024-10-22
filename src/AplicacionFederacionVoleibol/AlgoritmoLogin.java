package AplicacionFederacionVoleibol;

public class AlgoritmoLogin {
	/**
	 * PEQUEÑA BASE DE DATOS
	 * */
	private String usernames[] = {"Anthony","Admin","Clara","Alain","Asier"}; //Declaracion de usuarios
	private String passwords[] = {"1111","txurdinaga","3333","4444","5555"}; //Declaracion de contraseñas
	private String Cargo[] = {"Desarrollador","Admin","Desarrollador","Moderador","Usuario"};
	private String TipodeUsuario = "";
	
	
	/**
	 * Algoritmo para verificar si el usuario y contraseña son correctos
	 * */
	public boolean VerificacionDeLogin(String user, String password) {
		int i = 0;
		TipodeUsuario = "";
		for (String usuario : usernames) { //Declaro una variable usuario dentro del FOR para recorrer los datos
			if (usuario.equals(user)) {
				if (passwords[i].equals(password)) {
					TipodeUsuario = Cargo[i];
					return true; //Devuelve true si es correcto
				}
			}
			i++; // Recorre el arreglo y ayuda a reconocer el Tipo de usuario
		}
		return false;
	}
	

	public String TipodeUsuario() {
		return TipodeUsuario;
	}
	
	
	
}
