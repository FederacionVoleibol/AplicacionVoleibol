Algoritmo IntroducirDatosEquipos
	Definir id_equipo, CantidadEquipos Como Entero
	Definir NombreEquipo Como Caracter
	CantidadEquipos = 6 // valor por default
	Dimension NombreEquipo[CantidadEquipos]
	
	Mostrar "=========== MENÚ ==========="
	Mostrar "Introduce la cantidad de Equipos: " Sin Saltar
	Leer CantidadEquipos
	Para id_equipo = 1 Hasta CantidadEquipos Con Paso 1 Hacer
		Mostrar "Nombre Equipo" id_equipo ": " Sin Saltar
		Leer NombreEquipo[id_equipo]
	Fin Para
FinAlgoritmo
