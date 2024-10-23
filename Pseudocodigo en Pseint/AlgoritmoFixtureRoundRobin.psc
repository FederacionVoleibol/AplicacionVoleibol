Algoritmo FixtureRoundRobin
	
	Definir CantidadEquipos, NumeroRondas, NumerodePartidosPorRonda Como Entero
	Definir id_local, id_visitante Como Entero
	
	CantidadEquipos = 6
	NumeroRondas = CantidadEquipos -1 // devuelve 5 fechas de ida
	NumerodePartidosPorRonda = (CantidadEquipos/2) // devuelve 3 partidos por FechaActual()
	
	Definir PartidoEquipoLocal Como Entero
	Dimension PartidoEquipoLocal[NumeroRondas,NumerodePartidosporRonda]
	
	Definir PartidoEquipoVisitante Como Entero
	Dimension PartidoEquipoVisitante[NumeroRondas,NumerodePartidosporRonda]
	Definir inicializador Como Entero
	inicializador = 1
	

	//Asignar partidos local para las jornadas
	Para i=1 Hasta NumeroRondas Con Paso 1 Hacer
		
		Para j=1 Hasta NumerodePartidosporRonda Con Paso 1 Hacer
			PartidoEquipoLocal[i,j] = inicializador
			inicializador = inicializador + 1
			Si inicializador = 6 Entonces
				inicializador = 1
			FinSi
		FinPara
	FinPara
	
	
	//Asignar los equipos visitantes Parte 1 para la primera columna
	
	Para i=1 Hasta NumeroRondas Con Paso 1 Hacer
		
		
		Si (i mod 2 = 0) Entonces // Para rondas pares
			PartidoEquipoVisitante[i,1] = PartidoEquipoLocal[i,1]
			PartidoEquipoLocal[i,1] = CantidadEquipos
		SiNo // Para rondas impares
			PartidoEquipoVisitante[i,1] = CantidadEquipos
		Fin Si
	FinPara
	
	//Asignar los equipos visitantes Parte 2 para las siguientes columnas
	Definir EquipoMasAlto, EquipoImparMasAlto, id_Equipo Como Entero
	
	
	EquipoMasAlto = CantidadEquipos
	EquipoImparMasAlto = EquipoMasAlto -1
	id_Equipo = EquipoImparMasAlto
	
	Para i=1 Hasta NumeroRondas Con Paso 1 Hacer
		
		Para j=2 Hasta NumerodePartidosporRonda Con Paso 1 Hacer
			PartidoEquipoVisitante[i,j] = id_Equipo
			id_Equipo = id_Equipo - 1
			Si id_Equipo = 0 Entonces
				id_Equipo = EquipoImparMasAlto
			FinSi
		FinPara
	FinPara
	
	
	//Mostrar PartidoEquipoLocal
	Para i=1 Hasta NumeroRondas Con Paso 1 Hacer
		
		Para j=1 Hasta NumerodePartidosporRonda Con Paso 1 Hacer
			Mostrar PartidoEquipoLocal[i,j] " " Sin Saltar
		FinPara
		Mostrar ""
	FinPara
	//Mostrar PartidoEquipoVisitante
	Para i=1 Hasta NumeroRondas Con Paso 1 Hacer
		
		Para j=1 Hasta NumerodePartidosporRonda Con Paso 1 Hacer
			Mostrar PartidoEquipoVisitante[i,j] " " Sin Saltar
		FinPara
		Mostrar ""
	FinPara
	
	
	//Mostrar Temporada IDA
	Mostrar "Temporada IDA"
	
	Para i = 1 Hasta NumeroRondas Con Paso 1 Hacer
		Escribir "Fecha ", i, ":   " Sin Saltar
		Para j = 1 Hasta NumerodePartidosporRonda Con Paso 1 Hacer
			Escribir PartidoEquipoLocal[i,j] "vs" PartidoEquipoVisitante[i,j] "   " Sin Saltar
		FinPara
		Escribir ""; // Salto de línea después de cada fecha
	FinPara
	Mostrar "Temporada VUELTA"
	
	Para i = 1 Hasta NumeroRondas Con Paso 1 Hacer
		Escribir "Fecha ", i+5, ":   " Sin Saltar
		Para j = 1 Hasta NumerodePartidosporRonda Con Paso 1 Hacer
			Escribir PartidoEquipoVisitante[i,j] "vs" PartidoEquipoLocal[i,j] "   " Sin Saltar
		FinPara
		Escribir ""; // Salto de línea después de cada fecha
	FinPara
FinAlgoritmo




