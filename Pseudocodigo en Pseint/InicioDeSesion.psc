Algoritmo InicioDeSesion
		Definir usuario, contrasena, usuarioIngresado, contrasenaIngresada Como Cadena
		
		// usuario predefinido
		usuario <- "admin"
		//contrase�a predefinida
		contrase�a <- "1234"
		
		// Inicia sesion
		Escribir "Por favor, ingrese su nombre de usuario:"
		Leer usuarioIngresado
		Escribir "Por favor, ingrese su contrase�a:"
		Leer contrasenaIngresada
		
		// Verificar si las credenciales son correctas
		Si usuarioIngresado = usuario Y contrasenaIngresada = contrasena Entonces
			Escribir "Hola ", usuario
		SiNo
			Escribir "Acceso denegado"
		FinSi	
FinAlgoritmo
