Algoritmo IntroducirDatosPartido
	Definir id_equipo, id_Partido, CantidadEquipos, PuntajeSetLocal, PuntajeSetVisitante Como Entero
	Definir NombreEquipo, ArbitraPartido, opcion Como Caracter
	CantidadEquipos = 6 // valor por default
	Dimension NombreEquipo[CantidadEquipos]
	Dimension PuntajeSetLocal[5]
	Dimension PuntajeSetVisitante[5]
	
	Definir inicializador, inicialSets Como Entero
	inicializador = 1
	inicialSets = 1
	Repetir 
		Mostrar "======== INTRODUCIR DATO DEL PARTIDO ========"
		Mostrar "Introduce el ID del Partido: " Sin Saltar
		Leer id_Partido
		Mostrar "Introduce el Equipo Local: " Sin Saltar
		Leer NombreEquipo[inicializador]
		Para inicialSets = 1 Hasta 5 Con Paso 1 Hacer
			Mostrar "Introduce el puntaje del Set" inicialSets ": " Sin Saltar
			Leer PuntajeSetLocal[inicialSets]
		FinPara
		
		Mostrar "Introduce el Equipo Visitante: " Sin Saltar
		Leer NombreEquipo[inicializador+1]
		Para inicialSets = 1 Hasta 5 Con Paso 1 Hacer
			Mostrar "Introduce el puntaje del Set" inicialSets ": " Sin Saltar
			Leer PuntajeSetVisitante[inicialSets]
		FinPara
		
		Mostrar "¿Desea introducir Datos de otro Partido? (y/n): " Sin Saltar
		Leer opcion
		
	Hasta Que (opcion = 'n')
	Mostrar "Datos guardados con Exito!"
	
FinAlgoritmo
